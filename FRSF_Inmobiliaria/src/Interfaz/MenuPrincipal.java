
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
        btninmueble = new javax.swing.JButton();

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

        btninmueble.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btninmueble.setText("Gestionar Inmueble");
        btninmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninmuebleActionPerformed(evt);
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
                    .addComponent(btninmueble, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btninmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Inmobiliaria.getInstance().ListarClientes();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropietarioActionPerformed
        Inmobiliaria.getInstance().ListarPropietarios();
    }//GEN-LAST:event_btnPropietarioActionPerformed

    private void btninmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninmuebleActionPerformed
        Inmobiliaria.getInstance().AltaInmueble();
    }//GEN-LAST:event_btninmuebleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPropietario;
    private javax.swing.JButton btninmueble;
    // End of variables declaration//GEN-END:variables
}
