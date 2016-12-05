
package Interfaz;

import java.awt.Color;



public class MenuPrincipal extends javax.swing.JPanel {
    
    
    
    public MenuPrincipal() {
        initComponents();
        setSize(1100, 555);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientes = new javax.swing.JButton();
        btnPropietario = new javax.swing.JButton();
        btnAltaInmueble = new javax.swing.JButton();
        btnGestionarInmueble = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        btnClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteM.png"))); // NOI18N
        btnClientes.setText("Gestionar Clientes");
        btnClientes.setToolTipText("");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setFocusPainted(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteC.png"))); // NOI18N
        btnClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteG.png"))); // NOI18N
        btnClientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnPropietario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/propietarioM.png"))); // NOI18N
        btnPropietario.setText("Gestionar Propietario");
        btnPropietario.setBorder(null);
        btnPropietario.setBorderPainted(false);
        btnPropietario.setContentAreaFilled(false);
        btnPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPropietario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPropietario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/propietarioC.png"))); // NOI18N
        btnPropietario.setRequestFocusEnabled(false);
        btnPropietario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/propietarioG.png"))); // NOI18N
        btnPropietario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPropietario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropietarioActionPerformed(evt);
            }
        });

        btnAltaInmueble.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAltaInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altaColorM.png"))); // NOI18N
        btnAltaInmueble.setText("Alta Inmueble");
        btnAltaInmueble.setBorder(null);
        btnAltaInmueble.setBorderPainted(false);
        btnAltaInmueble.setContentAreaFilled(false);
        btnAltaInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAltaInmueble.setFocusPainted(false);
        btnAltaInmueble.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAltaInmueble.setIconTextGap(3);
        btnAltaInmueble.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altaColorC.png"))); // NOI18N
        btnAltaInmueble.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altaColorG.png"))); // NOI18N
        btnAltaInmueble.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAltaInmueble.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAltaInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaInmuebleActionPerformed(evt);
            }
        });

        btnGestionarInmueble.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGestionarInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta InmuebleM.png"))); // NOI18N
        btnGestionarInmueble.setText("Consulta Inmueble");
        btnGestionarInmueble.setBorder(null);
        btnGestionarInmueble.setBorderPainted(false);
        btnGestionarInmueble.setContentAreaFilled(false);
        btnGestionarInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGestionarInmueble.setFocusPainted(false);
        btnGestionarInmueble.setFocusable(false);
        btnGestionarInmueble.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionarInmueble.setIconTextGap(3);
        btnGestionarInmueble.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta InmuebleC.png"))); // NOI18N
        btnGestionarInmueble.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta InmuebleG.png"))); // NOI18N
        btnGestionarInmueble.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGestionarInmueble.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGestionarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarInmuebleActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing out.png"))); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing out selected.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAltaInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGestionarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(371, 371, 371))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGestionarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAltaInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Inmobiliaria.getInstance().ListarClientes();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropietarioActionPerformed
        Inmobiliaria.getInstance().ListarPropietarios();
    }//GEN-LAST:event_btnPropietarioActionPerformed

    private void btnAltaInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaInmuebleActionPerformed
        Inmobiliaria.getInstance().AltaInmueble();  
    }//GEN-LAST:event_btnAltaInmuebleActionPerformed

    private void btnGestionarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarInmuebleActionPerformed
       Inmobiliaria.getInstance().ConsultaInmueble();
    }//GEN-LAST:event_btnGestionarInmuebleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Inmobiliaria.getInstance().IniciarSesion();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaInmueble;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGestionarInmueble;
    private javax.swing.JButton btnPropietario;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
