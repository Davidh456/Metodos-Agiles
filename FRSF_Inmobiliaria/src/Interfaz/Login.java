package Interfaz;

import Clases.Vendedor;
import Logica.Validaciones;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends javax.swing.JPanel {

    public Login() {
        initComponents();
        setSize(319, 215);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCorreo = new javax.swing.JTextField();
        pfContrasenia = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Iniciar sesión"));
        setFocusCycleRoot(true);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing in.png"))); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing in selected.png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manager small.png"))); // NOI18N
        btnAdmin.setText("Ingresar como administrador");
        btnAdmin.setBorder(null);
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setFocusPainted(false);
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAdmin.setInheritsPopupMenu(true);
        btnAdmin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manager small selected.png"))); // NOI18N
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N

        lblCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCorreo.setText("Email");

        lblContrasenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContrasenia.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContrasenia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pfContrasenia)
                            .addComponent(tfCorreo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasenia))
                .addGap(10, 10, 10)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        Inmobiliaria.getInstance().IniciarSesionAdministrador();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Vendedor vendedor;
        Logica.Login L=new Logica.Login();
        Validaciones validaciones = new Validaciones();
        validaciones.reiniciarCampos(new JTextField[]{tfCorreo,pfContrasenia},new JLabel[]{lblCorreo,lblContrasenia});
        if(tfCorreo.getText().length()>0 && pfContrasenia.getPassword().length>0){
            if(L.login(tfCorreo.getText(),String.valueOf(pfContrasenia.getPassword()))){
                Inmobiliaria.getInstance().MenuPrincipal();
                vendedor=L.getVendedorLogeado(tfCorreo.getText(),String.valueOf(pfContrasenia.getPassword()));
                Inmobiliaria.getInstance().setVendedorLogeado(vendedor);
            }
            else{
                JOptionPane.showMessageDialog(null, "Los datos no son correctos","¡CUIDADO!",JOptionPane.ERROR_MESSAGE);
                pfContrasenia.setText(null);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Faltan completar campos","¡CUIDADO!",JOptionPane.ERROR_MESSAGE);
            pfContrasenia.setText(null);
            validaciones.Pintar(new JTextField[]{tfCorreo,pfContrasenia}, new JLabel[]{lblCorreo,lblContrasenia});
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JPasswordField pfContrasenia;
    private javax.swing.JTextField tfCorreo;
    // End of variables declaration//GEN-END:variables

}
