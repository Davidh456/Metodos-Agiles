
package Interfaz;

import Clases.*;
import Logica.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ListarClientesOPropietarios extends javax.swing.JPanel {
    
    List<Cliente> listaClientes;
    List<Propietario> listaPropietarios;
    String tabla;
    
    public ListarClientesOPropietarios() {
        initComponents();
        setSize(1000,425);
    }
    
    public ListarClientesOPropietarios(String tabla){
        initComponents();
        setSize(1000,425);
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), "Buscar "+tabla));
        spLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(153, 153, 153)), tabla+" encontrados"));
        tbLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
        
        this.tabla = tabla;
        switch (tabla){
            case "Clientes":
                setearTablaClientes();
                setearAccionesClientes();
                break;
            case "Propietarios":
                setearTablaPropietarios();
                setearAccionesPropietarios();
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spLista = new javax.swing.JScrollPane();
        tbLista = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVerInmuebles = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Buscar clientes"));

        spLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Clientes encontrados"));

        tbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Documento", "Provincia", "Localidad", "Domicilio", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spLista.setViewportView(tbLista);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        btnAgregar.setText("Agregar");

        btnModificar.setText("Modificar");

        btnVerInmuebles.setText("Ver Inmuebles");
        btnVerInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInmueblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spLista, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(125, 125, 125)
                        .addComponent(btnVerInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnVerInmuebles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inmobiliaria.getInstance().MenuPrincipal();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVerInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInmueblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerInmueblesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVerInmuebles;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane spLista;
    private javax.swing.JTable tbLista;
    // End of variables declaration//GEN-END:variables

    private void setearTablaClientes() {
        switch(tabla){
            case "Clientes":
                listaClientes = new ABMCliente().listarClientes();
                for(Cliente c: listaClientes){
                    DefaultTableModel model = (DefaultTableModel) tbLista.getModel();
                    String tipoDoc = "";
                    switch (c.getTipoDoc()){
                        case 0:
                            tipoDoc = "DNI";
                            break;
                        case 1:
                            tipoDoc = "PS";
                            break;
                        case 2:
                            tipoDoc = "LC";
                            break;
                        case 3:
                            tipoDoc = "LE";
                            break;
                    }
                    model.addRow(new Object[]{
                        c.getNombre(), 
                        c.getApellido(), 
                        tipoDoc +" "+c.getNumeroDoc(), 
                        c.getProvincia().getProvincia(), 
                        c.getLocalidad().getLocalidad(), 
                        c.getDomicilio()+" "+c.getAlturaDomicilio(), 
                        c.getTelefono(), 
                        c.getCorreo()});
                }
                break;
            
        }
    }
    private void setearTablaPropietarios(){
        listaPropietarios = new ABMPropietario().listarPropietarios();
                for(Propietario p: listaPropietarios){
                    DefaultTableModel model = (DefaultTableModel) tbLista.getModel();
                    String tipoDoc = "";
                    switch (p.getTipoDoc()){
                        case 0:
                            tipoDoc = "DNI";
                            break;
                        case 1:
                            tipoDoc = "PS";
                            break;
                        case 2:
                            tipoDoc = "LC";
                            break;
                        case 3:
                            tipoDoc = "LE";
                            break;
                    }
                    model.addRow(new Object[]{
                        p.getNombre(), 
                        p.getApellido(), 
                        tipoDoc +" "+p.getNumeroDoc(), 
                        p.getProvincia().getProvincia(), 
                        p.getLocalidad().getLocalidad(), 
                        p.getDomicilio()+" "+p.getAlturaDomicilio(), 
                        p.getTelefono(), 
                        p.getCorreo()});
                }
    }

    private void setearAccionesClientes() {
        btnVerInmuebles.setVisible(false);
        btnEliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
        btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
        
    }

    private void setearAccionesPropietarios() {
        btnVerInmuebles.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
        btnEliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
        btnModificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
        btnAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
            
        });
    }

}
