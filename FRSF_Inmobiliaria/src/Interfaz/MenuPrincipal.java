
package Interfaz;

import java.awt.Color;



public class MenuPrincipal extends javax.swing.JPanel {
    
    
    
    public MenuPrincipal() {
        initComponents();
        setSize(596, 348);
        setBackground(new Color(245,245,245));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientes = new javax.swing.JButton();
        btnPropietario = new javax.swing.JButton();
        btnAltaInmueble = new javax.swing.JButton();
        btnGestionarInmueble = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 160, 120));

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
        add(btnPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, 120));

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
        add(btnAltaInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 120));

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
        add(btnGestionarInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 150, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo 33.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 710, 400));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));
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
        Inmobiliaria.getInstance().consultaVendedor();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaInmueble;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGestionarInmueble;
    private javax.swing.JButton btnPropietario;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
