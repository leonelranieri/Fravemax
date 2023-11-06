package accesoADatos;

import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaData {

    private Connection conexion = null;

    public VentaData() {
        conexion = Conexion.getConexion();
    }
    
    public void registrarVenta(Venta venta) {
        String sql = "INSERT INTO venta (idCliente, fechaVenta, estado) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(venta.getFechaVenta()));
            ps.setBoolean(3, true);
            ps.executeUpdate();
            String fechaArgentina = convertirFecha(venta.getFechaVenta());
            ResultSet resul = ps.getGeneratedKeys();
            if (resul.next()) {
                venta.setIdVenta(resul.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta registrada con éxito: \n" 
                        + "Cliente :"+venta.getCliente().getApellido()+" "+ venta.getCliente().getNombre()+"\n"
                        + "Fecha :"+fechaArgentina);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la venta en la base de datos.");
        }
    }
    
    public void modificarVenta(Venta venta) {
        String sql = "UPDATE venta SET idCliente = ?, fechaVenta = ? where idVenta = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(venta.getFechaVenta()));
            ps.setInt(3, venta.getIdVenta());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta modificada");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar la venta en la base de datos.");
        }
    }

    public void eliminarVenta(int id) {
        String sql = "UPDATE venta SET estado=0 WHERE idVenta=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
        }
    }
    
    public Venta buscarVenta(int idVenta) {
        String sql = "SELECT idCliente, fechaVenta FROM  venta "
                + "WHERE idVenta=?";
        Venta venta = new Venta();
        ClienteData cd = new ClienteData();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idVenta);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                venta.setIdVenta(idVenta);
                Cliente cli=cd.buscarCliente(result.getInt("idCliente"));
                venta.setCliente(cli);
                venta.setFechaVenta(result.getDate("fechaVenta").toLocalDate());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
        }
        return venta;
    }

    public List<Venta> listarVentaXFecha(LocalDate fecha){
        String sql = "SELECT idVenta, idCliente, estado FROM venta WHERE fechaVenta=?";
        List<Venta> ventas = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(result.getInt("idVenta"));
                ClienteData cd = new ClienteData();
                Cliente cli = cd.buscarCliente(result.getInt("idCliente"));
                venta.setCliente(cli);
                venta.setEstado(result.getBoolean("estado"));
                ventas.add(venta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
        }
        return ventas;
    }
    
    public List<Venta> listarVentaXCliente(Cliente cliente){
        String sql = "SELECT idVenta, fechaVenta, estado FROM venta WHERE idCliente=?";
        List<Venta> ventas = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(result.getInt("idVenta"));
                venta.setFechaVenta(result.getDate("fechaVenta").toLocalDate());
                venta.setEstado(result.getBoolean("estado"));
                ventas.add(venta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
        }
        return ventas;
    }
    
    public List<Venta> listarVentas(){
        String sql = "SELECT idVenta, idCliente, fechaVenta, estado FROM venta";
        List<Venta> ventas = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Venta venta = new Venta();
                ClienteData cd = new ClienteData();
                Cliente cliente = cd.buscarCliente(result.getInt("idCliente"));
                venta.setIdVenta(result.getInt("idVenta"));
                venta.setCliente(cliente);
                venta.setFechaVenta(result.getDate("fechaVenta").toLocalDate());
                venta.setEstado(result.getBoolean("estado"));
                ventas.add(venta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
        }
        return ventas;
    }
    
    private String convertirFecha(LocalDate fecha) {
        // Obtén la fecha de venta como un objeto LocalDate
        LocalDate fechaVenta = fecha;
        // Crea un formateador con el patrón deseado (dd/MM/yyyy)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Formatea la fecha en el formato argentino
        String fechaArgentina = fechaVenta.format(formatter);
        return fechaArgentina;
    }
}


