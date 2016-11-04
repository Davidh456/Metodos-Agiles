
package Interfaz;



public class MenuPrincipal extends javax.swing.JPanel {
    
    
    
    public MenuPrincipal() {
        initComponents();
        setSize(620,440);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientes = new javax.swing.JButton();
        btnPropietario = new javax.swing.JButton();
        btnAltaInmueble = new javax.swing.JButton();
        btnGestionarInmueble = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Menu Principal"));

        btnClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClientes.setText("Gestionar Clientes");
        btnClientes.setToolTipText("");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnPropietario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPropietario.setText("Gestionar Propietario");
        btnPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropietarioActionPerformed(evt);
            }
        });

        btnAltaInmueble.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAltaInmueble.setText("Alta Inmueble");
        btnAltaInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaInmuebleActionPerformed(evt);
            }
        });

        btnGestionarInmueble.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGestionarInmueble.setText("Gestionar Inmueble");
        btnGestionarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarInmuebleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionarInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAltaInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaInmueble;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGestionarInmueble;
    private javax.swing.JButton btnPropietario;
    // End of variables declaration//GEN-END:variables
}
