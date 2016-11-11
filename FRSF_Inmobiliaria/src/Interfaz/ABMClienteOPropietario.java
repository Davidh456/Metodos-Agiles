/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.*;
import Logica.ABMCliente;
import Logica.LogicaCargaInterfaz;
import Logica.Validaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ABMClienteOPropietario extends javax.swing.JPanel {
    Cliente cliente;
    Validaciones validaciones;
    JTextField[] camposObligatorios;
    JLabel[] lblCamposObligatorios;
    List<Provincia> provincias;
    Set<Localidad> localidades;
    
    public ABMClienteOPropietario() {
        initComponents();
        setSize(450, 260);
        camposObligatorios = new JTextField[]{tfNombre, tfApellido,tfNumeroDocumento,tfDomicilio,tfAlturaCalle,tfTelefono,tfCorreo};
        lblCamposObligatorios = new JLabel[]{lblNombre, lblApellido,lblNumDocumento,lblDomicilio,lblNumDomicilio,lblTelefono,lblCorreo};
        validaciones = new Validaciones();
        cargarCB();
        sintaxis();
    }
    public ABMClienteOPropietario(String tabla, String operacion, Cliente cliente){
        initComponents();
        setVisible(true);
        setSize(450, 260);
        camposObligatorios = new JTextField[]{tfNombre, tfApellido,tfNumeroDocumento,tfDomicilio,tfAlturaCalle,tfTelefono,tfCorreo};
        lblCamposObligatorios = new JLabel[]{lblNombre, lblApellido,lblNumDocumento,lblDomicilio,lblNumDomicilio,lblTelefono,lblCorreo};
        this.cliente = cliente;
        validaciones = new Validaciones();
        cargarCB();
        sintaxis();
        String opcion = tabla +" "+ operacion;
        btnCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(tabla){
                    case "cliente":
                        Inmobiliaria.getInstance().ListarClientes();
                        break;
                    case "propietario":
                        Inmobiliaria.getInstance().ListarPropietarios();
                        break;
                }
            }
            
        });
        switch (opcion){
            case "cliente alta":
                AltaCliente();
                break;
            case "cliente baja":
                BajaCliente();
                break;
            case "cliente modificacion":
                ModificacionCliente();
                break;
            case "propietario alta":
                AltaPropietario();
                break;
            case "propietario baja":
                BajaPropietario();
                break;
            case "propietario modificacion":
                ModificacionPropietario();
                break;
        }
    }
          


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        lblNumDocumento = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfNumeroDocumento = new javax.swing.JTextField();
        cbDocumento = new javax.swing.JComboBox<>();
        tfTelefono = new javax.swing.JTextField();
        tfCorreo = new javax.swing.JTextField();
        cbProvincia = new javax.swing.JComboBox<>();
        cbLocalidad = new javax.swing.JComboBox<>();
        lblDomicilio = new javax.swing.JLabel();
        tfDomicilio = new javax.swing.JTextField();
        lblNumDomicilio = new javax.swing.JLabel();
        tfAlturaCalle = new javax.swing.JTextField();
        lblCampos = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Modificar Vendedor"));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblDocumento.setText("Documento");

        lblNumDocumento.setText("N�");

        lblProvincia.setText("Provincia");

        lblLocalidad.setText("Localidad");

        lblTelefono.setText("Tel�fono");

        lblCorreo.setText("e-mail");

        tfNombre.setToolTipText("");
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfNumeroDocumento.setToolTipText("Ej: 12345678");
        tfNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroDocumentoActionPerformed(evt);
            }
        });

        cbDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte", "LC", "LE" }));
        cbDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDocumentoActionPerformed(evt);
            }
        });

        tfTelefono.setToolTipText("");
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        tfCorreo.setToolTipText("Ej: correo@electronico.com");

        cbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinciaActionPerformed(evt);
            }
        });

        cbLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLocalidadActionPerformed(evt);
            }
        });

        lblDomicilio.setText("Domicilio");

        lblNumDomicilio.setText("N�");

        lblCampos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCampos.setForeground(new java.awt.Color(255, 51, 51));
        lblCampos.setText("Todos los campos son obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDocumento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProvincia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNumDocumento))
                                    .addComponent(cbProvincia, 0, 100, Short.MAX_VALUE)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(tfDomicilio))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCorreo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfCorreo))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblLocalidad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbLocalidad, 0, 172, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblNumDomicilio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfAlturaCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfApellido))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCampos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblCampos)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDocumento)
                    .addComponent(lblNumDocumento))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfAlturaCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumDomicilio)
                    .addComponent(tfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDomicilio))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalidad)
                    .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProvincia))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(2, 2, 2))
        );

        tfNombre.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroDocumentoActionPerformed

    private void cbDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDocumentoActionPerformed

    private void cbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProvinciaActionPerformed

    private void cbLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLocalidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbDocumento;
    private javax.swing.JComboBox<String> cbLocalidad;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCampos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumDocumento;
    private javax.swing.JLabel lblNumDomicilio;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField tfAlturaCalle;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDomicilio;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumeroDocumento;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables



    private void AltaCliente() {
        setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Cliente"));
        btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(camposValidos()){
                    if (ABMCliente.clienteExistente(Integer.valueOf(tfNumeroDocumento.getText()),cbDocumento.getSelectedIndex())){
                        JOptionPane.showMessageDialog(null, "El cliente ya existe","�CUIDADO!",JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        Localidad localidad = null;
                        int i = 0;
                        for (Localidad l : localidades){
                            if (i == cbLocalidad.getSelectedIndex()){
                                localidad = l;
                            }
                            i++;
                        }

                        ABMCliente.altaCliente(tfNombre.getText(),
                                tfApellido.getText(),
                                cbDocumento.getSelectedIndex(),
                                Integer.valueOf(tfNumeroDocumento.getText()),
                                provincias.get(cbProvincia.getSelectedIndex()), 
                                localidad,
                                tfDomicilio.getText(),
                                Integer.valueOf(tfAlturaCalle.getText()),
                                Integer.valueOf(tfTelefono.getText()),
                                tfCorreo.getText()
                        );
                        JOptionPane.showMessageDialog(null, "El cliente fue cargado correctamente","��XITO!",JOptionPane.DEFAULT_OPTION);
                        Inmobiliaria.getInstance().ListarClientes();
                    }
                }
            }
        });
    }

    private void BajaCliente() {
        setBorder(javax.swing.BorderFactory.createTitledBorder("Baja Cliente"));
        tfNumeroDocumento.setToolTipText("");
        BloquearCampos();
        cargarDatos();
        lblCampos.setVisible(false);
        btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showOptionDialog(null, 
                                        "�Seguro que quiere eliminar al cliente "+cliente.getNombre()+"?", "Cerrar", JOptionPane.YES_NO_OPTION, 2, null, new String[]{"Si","No"}, null);
                if (opcion == 0){
                    ABMCliente.bajaCliente(cliente);
                    JOptionPane.showMessageDialog(null, "El cliente "+cliente.getNombre()+" fue eliminado","��XITO!",JOptionPane.DEFAULT_OPTION);
                    Inmobiliaria.getInstance().ListarClientes();
                }
            }
        });
    }

    private void ModificacionCliente() {
        setBorder(javax.swing.BorderFactory.createTitledBorder("Modificacion Cliente"));
        cargarDatos();
        btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(camposValidos()){
                    Localidad localidad = null;
                    int i = 0;
                    for (Localidad l : localidades){
                        if (i == cbLocalidad.getSelectedIndex()){
                            localidad = l;
                        }
                        i++;
                    }
                    cliente.setNombre(tfNombre.getText());
                    cliente.setApellido(tfApellido.getText());
                    cliente.setTipoDoc(cbDocumento.getSelectedIndex());
                    cliente.setNumeroDoc(Integer.valueOf(tfNumeroDocumento.getText()));
                    cliente.setProvincia(provincias.get(cbProvincia.getSelectedIndex()));
                    cliente.setLocalidad(localidad);
                    cliente.setDomicilio(tfDomicilio.getText());
                    cliente.setAlturaDomicilio(Integer.valueOf(tfAlturaCalle.getText()));
                    cliente.setTelefono(Integer.valueOf(tfTelefono.getText()));
                    cliente.setCorreo(tfCorreo.getText());

                    ABMCliente.modificarCliente(cliente);
                    JOptionPane.showMessageDialog(null, "El cliente fue modificado correctamente","��XITO!",JOptionPane.DEFAULT_OPTION);
                    Inmobiliaria.getInstance().ListarClientes();

                }
            }
        });
    }

    private void AltaPropietario() {
        setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Propietario"));
        BloquearCampos();
        cargarDatos();
        lblCampos.setVisible(false);
        btnCancelar.setText("Volver");
        btnCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showOptionDialog(null, 
                                        "�Cancelar la operaci�n?", "Cancelar", JOptionPane.YES_NO_OPTION, 2, null, new String[]{"Si","No"}, null);
                if (opcion == 0){
                    Inmobiliaria.getInstance().ListarNoPropietarios();
                } 
            }
            
        });
        btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    ABMCliente.hacerPropietario(cliente);
                    JOptionPane.showMessageDialog(null, "El propietario fue cargado correctamente","��XITO!",JOptionPane.DEFAULT_OPTION);
                    Inmobiliaria.getInstance().ListarPropietarios();
            }
        });
    }
    private void BajaPropietario() {
        setBorder(javax.swing.BorderFactory.createTitledBorder("Baja Propietario"));
        BloquearCampos();    
        cargarDatos();
        lblCampos.setVisible(false);
        btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showOptionDialog(null, 
                                        "�Seguro que quiere eliminar al propietario "+cliente.getNombre()+"?", "Cerrar", JOptionPane.YES_NO_OPTION, 2, null, new String[]{"Si","No"}, null);
                if (opcion == 0){
                    ABMCliente.noEsMasPropietario(cliente);
                    JOptionPane.showMessageDialog(null, "El propietario "+cliente.getNombre()+" fue eliminado correctamente y reasignado como `Cliente�","��XITO!",JOptionPane.DEFAULT_OPTION);
                    Inmobiliaria.getInstance().ListarPropietarios();
                }
            }
        });
    }
    
    private void ModificacionPropietario() {
        setBorder(javax.swing.BorderFactory.createTitledBorder("Modificacion Propietario"));
        tfNumeroDocumento.setToolTipText("");
        cargarDatos();
        btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(camposValidos()){
                    Localidad localidad = null;
                    int i = 0;
                    for (Localidad l : localidades){
                        if (i == cbLocalidad.getSelectedIndex()){
                            localidad = l;
                        }
                        i++;
                    }
                    cliente.setNombre(tfNombre.getText());
                    cliente.setApellido(tfApellido.getText());
                    cliente.setTipoDoc(cbDocumento.getSelectedIndex());
                    cliente.setNumeroDoc(Integer.valueOf(tfNumeroDocumento.getText()));
                    cliente.setProvincia(provincias.get(cbProvincia.getSelectedIndex()));
                    cliente.setLocalidad(localidad);
                    cliente.setDomicilio(tfDomicilio.getText());
                    cliente.setAlturaDomicilio(Integer.valueOf(tfAlturaCalle.getText()));
                    cliente.setTelefono(Integer.valueOf(tfTelefono.getText()));
                    cliente.setCorreo(tfCorreo.getText());

                    ABMCliente.modificarCliente(cliente);
                    JOptionPane.showMessageDialog(null, "El propietario "+cliente.getNombre()+ " fue modificado correctamente","��XITO!",JOptionPane.DEFAULT_OPTION);
                    Inmobiliaria.getInstance().ListarPropietarios();
                }
            }
        });
        
    }

    private void BloquearCampos() {
        tfNombre.setEnabled(false);
        tfApellido.setEnabled(false);
        tfNumeroDocumento.setEnabled(false);
        tfDomicilio.setEnabled(false);
        tfAlturaCalle.setEnabled(false);
        tfTelefono.setEnabled(false);
        tfCorreo.setEnabled(false);
        cbDocumento.setEnabled(false);
        cbLocalidad.setEnabled(false);
        cbProvincia.setEnabled(false);
    }
    private void sintaxis(){
        validaciones.CaracteresMaximos(tfNombre, 100, "alfabetico");
        validaciones.CaracteresMaximos(tfApellido, 100, "alfabetico");
        validaciones.CaracteresMaximos(tfNumeroDocumento,8,"numerico");
        validaciones.CaracteresMaximos(tfDomicilio, 100, "alfanumerico");
        validaciones.CaracteresMaximos(tfAlturaCalle, 5, "numerico");
        validaciones.CaracteresMaximos(tfTelefono, 50, "numerico");
        validaciones.CaracteresMaximos(tfCorreo, 50, "alfanumerico");   

    }
    private void cargarCB() {
       LogicaCargaInterfaz carga = new LogicaCargaInterfaz();
       provincias = carga.buscarProvincias();
       for(Provincia p: provincias){
           cbProvincia.addItem(p.getProvincia());
       }
       localidades = provincias.get(0).getLocalidads();
       for(Localidad l: localidades){
            cbLocalidad.addItem(l.getLocalidad());
       }
       cbProvincia.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               cbLocalidad.removeAllItems();
               Provincia provincia = provincias.get(cbProvincia.getSelectedIndex());
               localidades = provincia.getLocalidads();
               for(Localidad l: localidades ){
                   cbLocalidad.addItem(l.getLocalidad());
               }
           }
       });
    }
    private boolean camposValidos() {
                if(validaciones.CamposVacios(camposObligatorios, null)){
                    JOptionPane.showMessageDialog(null, "Hay campos obligatorios que deben ser completados","�CUIDADO!",JOptionPane.ERROR_MESSAGE);
                    validaciones.Pintar(camposObligatorios, lblCamposObligatorios);
                    return false;
                }
                else if(!validaciones.ValidarEmail(tfCorreo)){
                    JOptionPane.showMessageDialog(null, "El correo electr�nico est� mal ingresado","�CUIDADO!",JOptionPane.ERROR_MESSAGE);
                    tfCorreo.setText("");
                    validaciones.Pintar(new JTextField[]{tfCorreo},new JLabel[]{lblCorreo});
                    return false;
                }
                else return true;
            }

    private void cargarDatos() {
        tfNombre.setText(cliente.getNombre());
        tfApellido.setText(cliente.getApellido());
        tfNumeroDocumento.setText(String.valueOf(cliente.getNumeroDoc()));
        tfDomicilio.setText(cliente.getDomicilio());
        tfAlturaCalle.setText(String.valueOf(cliente.getAlturaDomicilio()));
        tfTelefono.setText(String.valueOf(cliente.getTelefono()));
        tfCorreo.setText(cliente.getCorreo());
        cbDocumento.setSelectedIndex(cliente.getTipoDoc());
        cbProvincia.setSelectedItem(cliente.getProvincia().getProvincia());
        cbLocalidad.setSelectedItem(cliente.getLocalidad().getLocalidad());
    }
}
