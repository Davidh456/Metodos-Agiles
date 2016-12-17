/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Localidad;
import Clases.Provincia;
import Clases.Vendedor;
import Logica.ABMCliente;
import Logica.ABMVendedor;
import Logica.LogicaCargaInterfaz;
import Logica.Validaciones;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author lucas
 */
public class ABMVendedorInterfaz extends javax.swing.JPanel {

    Vendedor vendedor;
    Validaciones validaciones;
    JTextField[] camposObligatorios;
    JLabel[] lblCamposObligatorios;
    List<Provincia> provincias;
    Set<Localidad> localidades;

    /**
     * Creates new form ABMVendedor
     */
    public ABMVendedorInterfaz() {
        initComponents();
    }

    public ABMVendedorInterfaz(String operacion, Vendedor seleccionado) {
        initComponents();
        setSize(566, 364);
        setVisible(true);
        camposObligatorios = new JTextField[]{nombreTF, apellidoTF, numDocTF, domicilioTF, alturaTF, telefonoTF, emailTF};
        lblCamposObligatorios = new JLabel[]{nombreLBL, apellidoLBL, lblNumDocumento, domicilioLBL, lblNumDomicilio, telefonoLBL, emailLBL};
        validaciones = new Validaciones();

        cargarCB();
        sintaxis();

        switch (operacion) {
            case "alta":
                AltaVendedor();
                break;
            case "baja":
                EliminarVendedor(seleccionado);
                break;
            case "modificacion":
                ModificarVendedor(seleccionado);
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDocumento = new javax.swing.JLabel();
        cbDocumento = new javax.swing.JComboBox<>();
        lblNumDocumento = new javax.swing.JLabel();
        tfNumeroDocumento = new javax.swing.JTextField();
        lblProvincia = new javax.swing.JLabel();
        cbProvincia = new javax.swing.JComboBox<>();
        lblLocalidad = new javax.swing.JLabel();
        cbLocalidad = new javax.swing.JComboBox<>();
        lblTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        lblDocumento1 = new javax.swing.JLabel();
        lblNumDocumento1 = new javax.swing.JLabel();
        lblNumDomicilio = new javax.swing.JLabel();
        lblCampos = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        contrasenia = new javax.swing.JPasswordField();
        contrasenia2 = new javax.swing.JPasswordField();
        lblContrasenia2 = new javax.swing.JLabel();
        lblFormatoContrasenia = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nombreLBL = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        apellidoTF = new javax.swing.JTextField();
        apellidoLBL = new javax.swing.JLabel();
        numDocTF = new javax.swing.JTextField();
        domicilioLBL = new javax.swing.JLabel();
        domicilioTF = new javax.swing.JTextField();
        alturaTF = new javax.swing.JTextField();
        provinciaLBL = new javax.swing.JLabel();
        provinciaCB = new javax.swing.JComboBox<>();
        localidadLBL = new javax.swing.JLabel();
        localidadCB = new javax.swing.JComboBox<>();
        telefonoLBL = new javax.swing.JLabel();
        telefonoTF = new javax.swing.JTextField();
        emailLBL = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        tipoDocCB = new javax.swing.JComboBox<>();

        lblDocumento.setText("Documento");

        cbDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte", "LC", "LE" }));
        cbDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDocumentoActionPerformed(evt);
            }
        });

        lblNumDocumento.setText("N�");

        tfNumeroDocumento.setToolTipText("Ej: 12345678");
        tfNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroDocumentoActionPerformed(evt);
            }
        });

        lblProvincia.setText("Provincia");

        cbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinciaActionPerformed(evt);
            }
        });

        lblLocalidad.setText("Localidad");

        cbLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLocalidadActionPerformed(evt);
            }
        });

        lblTelefono.setText("Tel�fono");

        tfTelefono.setToolTipText("");
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Gesti�n Vendedores"));
        setPreferredSize(new java.awt.Dimension(630, 400));

        contenedor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Datos del venedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblDocumento1.setText("Documento");

        lblNumDocumento1.setText("N�");

        lblNumDomicilio.setText("N�");

        lblCampos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCampos.setForeground(new java.awt.Color(255, 51, 51));
        lblCampos.setText("Todos los campos son obligatorios");

        lblContrasenia.setText("Contrase�a");

        contrasenia.setText("jPasswordField1");
        contrasenia.setMinimumSize(new java.awt.Dimension(100, 20));
        contrasenia.setPreferredSize(new java.awt.Dimension(80, 20));

        contrasenia2.setText("jPasswordField1");
        contrasenia2.setMinimumSize(new java.awt.Dimension(100, 20));
        contrasenia2.setPreferredSize(new java.awt.Dimension(80, 20));
        contrasenia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenia2ActionPerformed(evt);
            }
        });

        lblContrasenia2.setText("Repetir Contrase�a");

        lblFormatoContrasenia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblFormatoContrasenia.setText("La contrase�a debe contener de 8-20 caracteres alfanum�ricos");

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept small2.png"))); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.setBorderPainted(false);
        aceptar.setContentAreaFilled(false);
        aceptar.setFocusPainted(false);
        aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept small2 selected.png"))); // NOI18N
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel selected.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        nombreLBL.setText("Nombre");
        nombreLBL.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });

        apellidoLBL.setText("Apellido");

        numDocTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDocTFActionPerformed(evt);
            }
        });

        domicilioLBL.setText("Domicilio");

        alturaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTFActionPerformed(evt);
            }
        });

        provinciaLBL.setText("Provincia");

        provinciaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaCBActionPerformed(evt);
            }
        });

        localidadLBL.setText("Localidad");

        telefonoLBL.setText("Tel�fono");

        emailLBL.setText("Email");

        tipoDocCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte", "LC", "LE" }));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelar)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFormatoContrasenia)
                                .addGroup(contenedorLayout.createSequentialGroup()
                                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(domicilioLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(provinciaLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(nombreLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(apellidoLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDocumento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(4, 4, 4)
                                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(contenedorLayout.createSequentialGroup()
                                            .addComponent(provinciaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(localidadLBL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(localidadCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(nombreTF)
                                        .addComponent(apellidoTF)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                                            .addComponent(tipoDocCB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)
                                            .addComponent(lblNumDocumento1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(numDocTF))
                                        .addGroup(contenedorLayout.createSequentialGroup()
                                            .addComponent(domicilioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(lblNumDomicilio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(alturaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contenedorLayout.createSequentialGroup()
                                            .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(emailLBL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(aceptar))
                            .addComponent(telefonoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(lblContrasenia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contrasenia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(58, 58, 58)))
                        .addGap(5, 10, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(lblContrasenia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(lblCampos)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDocumento1)
                    .addComponent(lblNumDocumento1)
                    .addComponent(numDocTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoDocCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNumDomicilio)
                    .addComponent(domicilioLBL)
                    .addComponent(domicilioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(provinciaLBL)
                    .addComponent(provinciaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localidadLBL)
                    .addComponent(localidadCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLBL)
                    .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLBL)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasenia2))
                .addGap(7, 7, 7)
                .addComponent(lblFormatoContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void cbDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDocumentoActionPerformed
    private void tfNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroDocumentoActionPerformed
    private void cbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProvinciaActionPerformed
    private void cbLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLocalidadActionPerformed
    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed

    }//GEN-LAST:event_tfTelefonoActionPerformed
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

    }//GEN-LAST:event_btnAceptarActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed
    private void contrasenia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenia2ActionPerformed
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarActionPerformed
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Inmobiliaria.getInstance().ConsultaVendedor();
    }//GEN-LAST:event_cancelarActionPerformed
    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFActionPerformed
    private void provinciaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciaCBActionPerformed
    private void numDocTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDocTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDocTFActionPerformed
    private void alturaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField alturaTF;
    private javax.swing.JLabel apellidoLBL;
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> cbDocumento;
    private javax.swing.JComboBox<String> cbLocalidad;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPasswordField contrasenia;
    private javax.swing.JPasswordField contrasenia2;
    private javax.swing.JLabel domicilioLBL;
    private javax.swing.JTextField domicilioTF;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel lblCampos;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblContrasenia2;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblDocumento1;
    private javax.swing.JLabel lblFormatoContrasenia;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNumDocumento;
    private javax.swing.JLabel lblNumDocumento1;
    private javax.swing.JLabel lblNumDomicilio;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JComboBox<String> localidadCB;
    private javax.swing.JLabel localidadLBL;
    private javax.swing.JLabel nombreLBL;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField numDocTF;
    private javax.swing.JComboBox<String> provinciaCB;
    private javax.swing.JLabel provinciaLBL;
    private javax.swing.JLabel telefonoLBL;
    private javax.swing.JTextField telefonoTF;
    private javax.swing.JTextField tfNumeroDocumento;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JComboBox<String> tipoDocCB;
    // End of variables declaration//GEN-END:variables

    private void cargarCB() {
        LogicaCargaInterfaz carga = new LogicaCargaInterfaz();
        provincias = carga.buscarProvincias();
        for (Provincia p : provincias) {
            provinciaCB.addItem(p.getProvincia());
        }
        localidades = provincias.get(0).getLocalidads();
        for (Localidad l : localidades) {
            localidadCB.addItem(l.getLocalidad());
        }
        provinciaCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                localidadCB.removeAllItems();
                Provincia provincia = provincias.get(provinciaCB.getSelectedIndex());
                localidades = provincia.getLocalidads();
                for (Localidad l : localidades) {
                    localidadCB.addItem(l.getLocalidad());
                }
            }
        });
    }

    private void sintaxis() {
        validaciones.CaracteresMaximos(nombreTF, 30, "alfabetico");
        validaciones.CaracteresMaximos(apellidoTF, 30, "alfabetico");
        validaciones.CaracteresMaximos(numDocTF, 11, "numerico");
        validaciones.CaracteresMaximos(domicilioTF, 100, "alfanumerico");
        validaciones.CaracteresMaximos(alturaTF, 5, "numerico");
        validaciones.CaracteresMaximos(telefonoTF, 30, "numerico");
        
        validaciones.CaracteresMaximos(emailTF, 45, "correo");
        
        validaciones.CaracteresMaximos(contrasenia, 20, "alfanumerico");
        validaciones.CaracteresMaximos(contrasenia2, 20, "alfanumerico");
    }

    private boolean camposValidos() {
        String contra1 = new String(contrasenia.getPassword());
        String contra2 = new String(contrasenia2.getPassword());
        if (validaciones.CamposVacios(camposObligatorios, null) || contra1.equals("") || contra2.equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos obligatorios que deben ser completados", "�CUIDADO!", JOptionPane.ERROR_MESSAGE);
            validaciones.Pintar(camposObligatorios, lblCamposObligatorios);
            if (contra1.equals("")) {
                lblContrasenia.setForeground(new Color(255, 0, 10));
                contrasenia.setBackground(new Color(250, 180, 180));
                contrasenia.setBorder(new LineBorder(new Color(255, 0, 20)));
            }
            if (contra2.equals("")) {
                lblContrasenia2.setForeground(new Color(255, 0, 10));
                contrasenia2.setBackground(new Color(250, 180, 180));
                contrasenia2.setBorder(new LineBorder(new Color(255, 0, 20)));
            }
            return false;
        } else if (!validaciones.ValidarEmail(emailTF)) {
            JOptionPane.showMessageDialog(null, "El correo electr�nico est� mal ingresado", "�CUIDADO!", JOptionPane.ERROR_MESSAGE);
            emailTF.setText("");
            validaciones.Pintar(new JTextField[]{emailTF}, new JLabel[]{emailLBL});
            return false;
        } else if (!validaciones.ContraseniaValida(contrasenia)) {
            JOptionPane.showMessageDialog(null, "La contrase�a ingresada no es v�lida. Debe tener entre 8 y 20 caracteres alfanum�ricos.", "�CUIDADO!", JOptionPane.ERROR_MESSAGE);
            contrasenia.setText("");
            contrasenia2.setText("");
            lblFormatoContrasenia.setForeground(Color.red);
            return false;
        } else if (!validaciones.ContraseniasIguales(contrasenia, contrasenia2)) {
            JOptionPane.showMessageDialog(null, "Las contrase�as ingresadas no coinciden.", "Ingreselas nuevamente.", JOptionPane.ERROR_MESSAGE);
            contrasenia.setText("");
            contrasenia2.setText("");
            return false;
        }
        return true;
    }

    private void cargarDatos(Vendedor vend) {
        nombreTF.setText(vend.getNombre());
        apellidoTF.setText(vend.getApellido());
        numDocTF.setText(vend.getNumDoc().toString());
        domicilioTF.setText(vend.getDomicilio());
        alturaTF.setText(vend.getAlturaDomicilio());
        telefonoTF.setText(vend.getTelefono());
        emailTF.setText(vend.getEmail());
        tipoDocCB.setSelectedIndex(vend.getTipoDoc());
        provinciaCB.setSelectedItem(vend.getProvincia().getProvincia());
        localidadCB.setSelectedItem(vend.getLocalidad().getLocalidad());
        contrasenia.setText(vend.getContrasenia());
        contrasenia2.setText(vend.getContrasenia());
    }

    private void AltaVendedor() {

        contenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo vendedor"));
        contrasenia.setText("");
        contrasenia2.setText("");

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (camposValidos()) {
                    if (ABMVendedor.getInstance().existeVendedor(Integer.valueOf(numDocTF.getText()), tipoDocCB.getSelectedIndex())) {
                        JOptionPane.showMessageDialog(null, "El vendedor ya existe", "�CUIDADO!", JOptionPane.ERROR_MESSAGE);
                    } 
                    else {
                        Provincia p = provincias.get(provinciaCB.getSelectedIndex());
                        
                        Localidad localidad = null;
                        int j = 0;
                        for (Localidad l : localidades) {
                                if (j == localidadCB.getSelectedIndex()) {
                                localidad = l;
                                }
                            j++;
                            }
                        
                        String contra = new String(contrasenia.getPassword());

                        ABMVendedor.getInstance().altaVendedor(tipoDocCB.getSelectedIndex(),
                                Integer.valueOf(numDocTF.getText()), nombreTF.getText(),
                                apellidoTF.getText(), p,
                                localidad, domicilioTF.getText(), alturaTF.getText(),
                                telefonoTF.getText(), emailTF.getText(), contra
                        );

                        int resp = JOptionPane.showConfirmDialog(null, "�Desea cargar un nuevo vendedor?", "El vendedor se carg� correctamente", JOptionPane.YES_NO_OPTION);
                        if (resp == 0) {
                            Inmobiliaria.getInstance().altaVendedor();
                        } else {
                            Inmobiliaria.getInstance().ConsultaVendedor();
                        }
                    }
                }
            }

        });

    }

    private void EliminarVendedor(Vendedor vend) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ModificarVendedor(Vendedor vend) {
        contenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Vendedor"));
        cargarDatos(vend);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (camposValidos()) {
                    if (ABMVendedor.getInstance().existeMismoDNI(Integer.valueOf(numDocTF.getText()), tipoDocCB.getSelectedIndex(), vend.getIdVendedor())) {
                        JOptionPane.showMessageDialog(null, "El Documento seleccionado ya existe para otro vendedor.", "�CUIDADO!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        Localidad localidad = null;
                        int i = 0;
                        for (Localidad l : localidades) {
                            if (i == localidadCB.getSelectedIndex()) {
                                localidad = l;
                            }
                            i++;
                        }

                        String contra = new String(contrasenia.getPassword());

                        vend.setTipoDoc(tipoDocCB.getSelectedIndex());
                        vend.setNumDoc(Integer.valueOf(numDocTF.getText()));
                        vend.setNombre(nombreTF.getText());
                        vend.setApellido(apellidoTF.getText());
                        vend.setEmail(emailTF.getText());
                        vend.setDomicilio(domicilioTF.getText());
                        vend.setAlturaDomicilio(alturaTF.getText());
                        vend.setTelefono(telefonoTF.getText());
                        vend.setContrasenia(contra);
                        vend.setProvincia(provincias.get(provinciaCB.getSelectedIndex()));
                        vend.setLocalidad(localidad);

                        ABMVendedor.getInstance().modificarVendedor(vend);
                        JOptionPane.showMessageDialog(null, "El Vendedor ha sido modificado correctamente.",
                                "��xito!", JOptionPane.INFORMATION_MESSAGE);
                        Inmobiliaria.getInstance().ConsultaVendedor();
                    }

                }
            }
        });

    }

}
