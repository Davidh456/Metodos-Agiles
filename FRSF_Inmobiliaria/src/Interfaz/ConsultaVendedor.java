/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Vendedor;
import Logica.ABMCliente;
import Logica.ABMVendedor;
import imagenes.IconoEliminar;
import imagenes.IconoVendedor;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ConsultaVendedor extends javax.swing.JPanel {

    List<Vendedor> vendedores;
    /**
     * Creates new form ConsultaVendedor
     */
    public ConsultaVendedor() {
        initComponents();
        setSize(608, 451);
        setVisible(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        setearTablaVendedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Gesti�n Vendedores"));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar vendedor"));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Tipo Documento", "Documento", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add selected.png"))); // NOI18N
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify selected.png"))); // NOI18N
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete selected.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back big.png"))); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back big selected.png"))); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(30, 30, 30)
                        .addComponent(btnModificar)
                        .addGap(30, 30, 30)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregar)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Inmobiliaria.getInstance().altaVendedor();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Inmobiliaria.getInstance().modificarVendedor(vendedores.get(tabla.getSelectedRow()));
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Inmobiliaria.getInstance().IniciarSesion();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Tomar el vendedor seleccionado de la tabla
        Vendedor seleccionado = vendedores.get(tabla.getSelectedRow());
        //Preguntar si quiere eliminar el vendedor seleccionado
        ABMCliente operador = new ABMCliente();
        if(!operador.TieneTransacciones(null, seleccionado,3)){
            IconoEliminar myIcon = new IconoEliminar();
            int resp = JOptionPane.showConfirmDialog(null, 
                    "�Desea eliminar el vendedor seleccionado? Si acepta, no podr� deshacer esta acci�n.", 
                    "Eliminar Vendedor - �Atenci�n!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, myIcon);
        
            if(resp == 0){
                ABMVendedor.getInstance().bajaVendedor(seleccionado);//Si acept� eliminar, lo elimina
                JOptionPane.showMessageDialog(null, "El vendedor se ha eliminado con �xito.",
                        "Eliminar Vendedor - �Atenci�n!", JOptionPane.DEFAULT_OPTION, myIcon);
                Inmobiliaria.getInstance().ConsultaVendedor();
            }else{
                JOptionPane.showMessageDialog(null, "El vendedor no ha sido eliminado.", 
                        "Eliminar Vendedor - �Atenci�n!", JOptionPane.DEFAULT_OPTION, myIcon);}}
        else
            JOptionPane.showMessageDialog(null, "No se puede eliminar el vendedor porque el mismo ya ha realizado ventas.","�Cuidado!",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void setearTablaVendedores() {
        vendedores = ABMVendedor.getInstance().listarVendedores();
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        
        for(Vendedor v: vendedores)
        {
            String tipoDoc = "";
             switch (v.getTipoDoc()){
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
                 v.getNombre(),
                 v.getApellido(),
                 tipoDoc,
                 v.getNumDoc(),
                 v.getEmail()});
         }
        
        //Habilitar botones cuando se seleccione un vendedor
        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tabla.getSelectedRow()>-1){
                    btnEliminar.setEnabled(true);
                    btnModificar.setEnabled(true);
                }
            }
        });
    }
    
    public Vendedor seleccionarVendedor(){
        List<Vendedor> listaVendedores = ABMVendedor.getInstance().listarVendedores();
        IconoVendedor myIcon = new IconoVendedor();
        String[] lista = new String[listaVendedores.size()];
        int i=0; 
        int indice=0;
        
        for(Vendedor v: listaVendedores){
             String tipoDoc = "";
             switch (v.getTipoDoc()){
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
            lista[i] = new String(tipoDoc + " " + v.getNumDoc() + " - " + v.getApellido() + " " + v.getNombre());
            i++;
        }
        String resp = (String) JOptionPane.showInputDialog(null,"Seleccione un vendedor: ", "Vendedores", JOptionPane.DEFAULT_OPTION, myIcon, lista, lista[0]);
        
        for(i=0; i<listaVendedores.size(); i++){
            if(lista[i].equals(resp)) indice=i;
        }
        
        return listaVendedores.get(indice);
    }

}
