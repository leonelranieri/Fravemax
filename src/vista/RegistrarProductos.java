
package vista;

import accesoADatos.ClienteData;
import accesoADatos.ProductoData;
import entidades.Cliente;
import entidades.Producto;
import javax.swing.JOptionPane;
import menu.main;

public class RegistrarProductos extends javax.swing.JPanel {

    public RegistrarProductos() {
        initComponents();
        tareaConstructor();
    }

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTNombreProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTPrecioActual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTStock = new javax.swing.JTextField();
        jLIdProducto = new javax.swing.JLabel();
        jTIdProd = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRActivo = new javax.swing.JRadioButton();
        jRInactivo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(157, 196, 162));
        setPreferredSize(new java.awt.Dimension(734, 564));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("Nombre del Producto");

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel4.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel5.setText("Precio Actual");

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel7.setText("Stock");

        jLIdProducto.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLIdProducto.setText("ID Producto");

        jBAgregar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_24.png"))); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.setContentAreaFilled(false);
        jBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_24.png"))); // NOI18N
        jBAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_32.png"))); // NOI18N
        jBAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setContentAreaFilled(false);
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
        jBGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_32.png"))); // NOI18N
        jBGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar_24.png"))); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setContentAreaFilled(false);
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar_24.png"))); // NOI18N
        jBModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar_32.png"))); // NOI18N
        jBModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setContentAreaFilled(false);
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
        jBEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_32.png"))); // NOI18N
        jBEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setContentAreaFilled(false);
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        jBSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_32.png"))); // NOI18N
        jBSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBuscar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.setContentAreaFilled(false);
        jBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
        jBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_32.png"))); // NOI18N
        jBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel2.setText("Registrar Productos");

        jRActivo.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jRActivo.setText("Producto activo");
        jRActivo.setContentAreaFilled(false);
        jRActivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRActivo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRActivoMouseClicked(evt);
            }
        });

        jRInactivo.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jRInactivo.setText("Producto inactivo");
        jRInactivo.setContentAreaFilled(false);
        jRInactivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRInactivo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRInactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRInactivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBSalir)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(79, 79, 79)
                                                .addComponent(jBuscar)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jBAgregar)
                                            .addGap(40, 40, 40)
                                            .addComponent(jBGuardar))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jTNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(jBModificar)
                                            .addGap(35, 35, 35)
                                            .addComponent(jBEliminar)))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLIdProducto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jRInactivo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdProducto)
                    .addComponent(jTIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBEliminar)
                        .addComponent(jBAgregar))
                    .addComponent(jBSalir))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
       tareaAgregar();
   }//GEN-LAST:event_jBAgregarActionPerformed

   private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       if (jTNombreProd.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecioActual.getText().isEmpty() || jTStock.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "No deje campos en blanco");
           jTIdProd.setEditable(true);
           return;
       }

       String nombreProd = jTNombreProd.getText();
       String descripcion = jTDescripcion.getText();

       if (!validarCamposString(nombreProd)) {
           JOptionPane.showMessageDialog(this, "El nombre no debe contener números ni caracteres especiales");
           return;
       }

       if (!validarCampoNumericoDouble(jTPrecioActual.getText())) {
           JOptionPane.showMessageDialog(this, "El campo precio actul solo debe contener números");
           return;
       }

       if (!validarCampoNumericoInt(jTStock.getText())) {
           JOptionPane.showMessageDialog(this, "El campo stock solo debe contener números");
           return;
       }
       double precioActual = Double.parseDouble(jTPrecioActual.getText());
       int stock = Integer.parseInt(jTStock.getText());

       Producto prod = new Producto(nombreProd, descripcion, precioActual, stock, true);
       ProductoData prodData = new ProductoData();
       prodData.registrarProducto(prod);

       limpiar();
       jTIdProd.setEditable(true);
   }//GEN-LAST:event_jBGuardarActionPerformed

   private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
       if (jTNombreProd.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecioActual.getText().isEmpty()
               || jTStock.getText().isEmpty() || jTIdProd.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "No deje campos en blanco");
           return;
       }
       if (!validarCamposString(jTNombreProd.getText())) {
           JOptionPane.showMessageDialog(this, "El nombre no debe contener números ni caracteres especiales");
           return;
       }

       if (!validarCampoNumericoDouble(jTPrecioActual.getText())) {
           JOptionPane.showMessageDialog(this, "El campo precio actul solo debe contener números");
           return;
       }

       if (!validarCampoNumericoInt(jTStock.getText())) {
           JOptionPane.showMessageDialog(this, "El campo stock solo debe contener números");
           return;
       }       
       String nombreProd = jTNombreProd.getText();
       String descripcion = jTDescripcion.getText();
       try {
           double precioActual = Double.parseDouble(jTPrecioActual.getText());
           int stock = Integer.parseInt(jTStock.getText());
           boolean estado = jRActivo.isSelected();

           ProductoData prodData = new ProductoData();
           Producto prod = prodData.buscarProducto(Integer.parseInt(jTIdProd.getText()));
           prod.setNombreProducto(nombreProd);
           prod.setDescripcion(descripcion);
           prod.setPrecioActual(precioActual);
           prod.setStock(stock);
           prod.setEstado(estado);
           prodData.modificarProducto(prod);

           tareaFinalModificar();
       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(this, "Debe ingresar números en el campo 'Precio Actual'");
       }catch (NullPointerException np) {
           JOptionPane.showMessageDialog(this, "No puede modificar el id");
           return;
       }
   }//GEN-LAST:event_jBModificarActionPerformed

   private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
      try {
         int idProducto = Integer.parseInt(jTIdProd.getText());
         ProductoData pd = new ProductoData();
         pd.eliminarProducto(idProducto);
         jRActivo.setSelected(false);
         jRInactivo.setSelected(false);
      } catch (NullPointerException ex) {
         JOptionPane.showMessageDialog(this, "Ingrese un ID válido");
      } catch (NumberFormatException ex){
          return;
      }
      limpiar();
   }//GEN-LAST:event_jBEliminarActionPerformed
                                           
    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        tareaInicialBuscar();
        String idProductoText = jTIdProd.getText();
        try {
            int idProducto = Integer.parseInt(jTIdProd.getText());
            ProductoData pd = new ProductoData();
            Producto producto = pd.buscarProducto(idProducto);
            System.out.println(producto);
            
            jTNombreProd.setText(producto.getNombreProducto());
            jTDescripcion.setText(producto.getDescripcion());
            jTPrecioActual.setText(""+producto.getPrecioActual());
            jTStock.setText(""+producto.getStock());
           if (producto.isEstado()) {
                jRActivo.setSelected(true);
                jRInactivo.setSelected(false);
            } else {
                jRInactivo.setSelected(true);
                jRActivo.setSelected(false);
            }
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "No existe el producto con id :"+ idProductoText);
            tareaBuscar();
            return;
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error en el campo IDProducto. Datos ingresados incorrectos");
            tareaBuscar();
            return;
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRInactivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRInactivoMouseClicked
        jRActivo.setSelected(false);
    }//GEN-LAST:event_jRInactivoMouseClicked

    private void jRActivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRActivoMouseClicked
        jRInactivo.setSelected(false);
    }//GEN-LAST:event_jRActivoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLIdProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRActivo;
    private javax.swing.JRadioButton jRInactivo;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTIdProd;
    private javax.swing.JTextField jTNombreProd;
    private javax.swing.JTextField jTPrecioActual;
    private javax.swing.JTextField jTStock;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        jTNombreProd.setText("");
        jTDescripcion.setText("");
        jTPrecioActual.setText("");
        jTStock.setText("");
        jTIdProd.setText("");

    }

    private void activarCampos() {
        jTNombreProd.setEnabled(true);
        jTDescripcion.setEnabled(true);
        jTPrecioActual.setEnabled(true);
        jTStock.setEnabled(true);
    }

    private void desactivarCampos() {
        jTNombreProd.setEnabled(false);
        jTDescripcion.setEnabled(false);
        jTPrecioActual.setEnabled(false);
        jTStock.setEnabled(false);

    }
    
    private void desactivarRadioActivado() {
        if (jRActivo.isSelected()) {
            jRActivo.setSelected(false);
        } else if (jRInactivo.isSelected()) {
            jRInactivo.setSelected(false);
        }
    }

    private void tareaBuscar() {
        limpiar();
        desactivarCampos();
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        desactivarRadioActivado();
    }
    
    private void tareaConstructor() {
        desactivarCampos();
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        jBGuardar.setEnabled(false);
    }
    
    private void tareaAgregar(){
        jTIdProd.setEditable(false);
        limpiar();
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        activarCampos();
        jBGuardar.setEnabled(true);
        jRActivo.setEnabled(false);
        jRInactivo.setEnabled(false);
        desactivarRadioActivado();
    }
    
    private void tareaFinalModificar(){
        limpiar();
        jRActivo.setSelected(false);
        jRInactivo.setSelected(false);
    }

    private void tareaInicialBuscar() {
        activarCampos();
        jBEliminar.setEnabled(true);
        jBModificar.setEnabled(true);
        jBGuardar.setEnabled(false);
        if (!jRActivo.isEnabled()) {
            jRActivo.setEnabled(true);
        }
        if (!jRInactivo.isEnabled()) {
            jRInactivo.setEnabled(true);
        }
    }
    
    private boolean validarCamposString(String cadena) {
        // Validación para asegurarse de que el nombre y el apellido no contengan números
        if (cadena.matches(".*[^a-zA-Z\\s].*")) {
            return false;
        }
        return true;
    }

    private boolean validarCampoNumericoInt(String num) {
        // Validación para asegurarse de que el número de teléfono solo contenga números
        if (!num.matches("[0-9]+")) {
            return false;

        }
        return true;
    }
 
    private boolean validarCampoNumericoDouble(String num) {
        // Utiliza una expresión regular que permite números enteros o decimales
        if (!num.matches("^[0-9]+(\\.[0-9]+)?$")) {
            return false;
        }
        return true;
    }
}
