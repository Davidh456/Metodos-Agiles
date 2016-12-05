/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Validaciones;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gonzo
 */
public class AdminLogin extends javax.swing.JPanel {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
        setSize(320, 185);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        pfContrasenia = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Iniciar sesión de administrador"));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin.png"))); // NOI18N

        lblCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCorreo.setText("Nombre");

        lblContrasenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContrasenia.setText("Contraseña");

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing in.png"))); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing in selected.png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back selected.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContrasenia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(tfCorreo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(pfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContrasenia))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnVolver))
                .addGap(1, 1, 1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Validaciones validaciones = new Validaciones();
        validaciones.reiniciarCampos(new JTextField[]{tfCorreo,pfContrasenia},new JLabel[]{lblCorreo,lblContrasenia});
        if(tfCorreo.getText().length()>0 && pfContrasenia.getPassword().length>0){
            if(new Logica.Login().AdminLogin(tfCorreo.getText(),String.valueOf(pfContrasenia.getPassword()))){
                Inmobiliaria.getInstance().ConsultaVendedor();
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inmobiliaria.getInstance().IniciarSesion();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JPasswordField pfContrasenia;
    private javax.swing.JTextField tfCorreo;
    // End of variables declaration//GEN-END:variables
}
