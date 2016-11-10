/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Cliente;
import Clases.Inmueble;
import Clases.Localidad;
import Clases.Provincia;
import Logica.ABMInmueble;
import Logica.LogicaCargaInterfaz;
import Logica.LogicaReserva;
import Logica.Validaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class ConsultaInmueble extends javax.swing.JPanel {
    
    List<Provincia> provincias;
    Set<Localidad> localidades;
    Validaciones validaciones = new Validaciones();
    List<Inmueble> resultado;
    private String getApellido() {
        return Apellido.getText();
    }
    private String getBarrioNombre() {
        return BarrioText.getText();
    }
    private int getCantDormitorios() {
        return ((Integer) CantDormitorios.getValue());
    }
    private String getCorreo() {
        return Correo.getText();
    }
    private String getLocalidadNombre() {
        return ((String) cbLocalidad.getSelectedItem());
    }
    private String getNombre() {
        return Nombre.getText();
    }
    private int getNroDoc() {
        if(NroDoc.getText().equals("")){
            return -1;
        }
        return Integer.parseInt(NroDoc.getText());
    }
    private double getPrecioDesde() {
        if(PrecioDesde.getText().equals("")){
            return 0;
        }
        return Double.parseDouble(PrecioDesde.getText());
    }
    private double getPrecioHasta() {
        double a=999999999999d;
        if(PrecioHasta.getText().equals("")){
            return (a);
        }
        return Double.parseDouble(PrecioHasta.getText());
    }
    private int getTipoDoc() {
        return TipoDoc.getSelectedIndex();
    }
    private int getTipoInmueble() {
        return TipoInmueble.getSelectedIndex();
    }
    private int getProvinciaIndice() {
        return cbProvincia.getSelectedIndex();
    }

    private void setScrollResultados(JScrollPane ScrollResultados) {
        this.ScrollResultados = ScrollResultados;
    }
    private void setTablaResultados(JTable TablaResultados) {
        this.TablaResultados = TablaResultados;
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
    
    private void sintaxis(){
        validaciones.CaracteresMaximos(PrecioDesde, 12, "double");
        validaciones.CaracteresMaximos(PrecioHasta,12,"double");
        validaciones.CaracteresMaximos(Apellido, 100, "alfabetico");
        validaciones.CaracteresMaximos(Nombre, 100, "alfabetico");
        validaciones.CaracteresMaximos(NroDoc, 8, "numerico");
        validaciones.CaracteresMaximos(Correo, 50, "alfaNumerico");
    }

    public ConsultaInmueble() {
        initComponents();
        DeshabilitarBotonesInicio();
        setSize(getPreferredSize());
        cargarCB();
        sintaxis();
        setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Inmueble"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbLocalidad = new javax.swing.JComboBox<>();
        cbProvincia = new javax.swing.JComboBox<>();
        TipoInmueble = new javax.swing.JComboBox<>();
        CantDormitorios = new javax.swing.JSpinner();
        PrecioDesde = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PrecioHasta = new javax.swing.JTextField();
        BarrioText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        TipoDoc = new javax.swing.JComboBox<>();
        NroDoc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JButton();
        BotonVender = new javax.swing.JButton();
        BotonDetalles = new javax.swing.JButton();
        BotonReserva = new javax.swing.JButton();
        BotonPublicar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        ScrollResultados = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Consulta Inmueble"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Inmueble"));

        jLabel1.setText("Cantidad de Dormitorios");

        jLabel2.setText("Precio:   Desde");

        jLabel3.setText("Tipo Inmueble");

        jLabel4.setText("Barrio");

        jLabel5.setText("Localidad");

        jLabel6.setText("Provincia");

        cbLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLocalidadActionPerformed(evt);
            }
        });

        TipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Casa", "Departamento", "Galpón", "Local-Oficina", "Quinta", "Terreno" }));

        CantDormitorios.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        PrecioDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioDesdeActionPerformed(evt);
            }
        });

        jLabel7.setText("Hasta");

        PrecioHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioHastaActionPerformed(evt);
            }
        });

        jLabel13.setText("(0 para cualquier cantidad)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PrecioDesde))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BarrioText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CantDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrecioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BarrioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PrecioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        PrecioDesde.getAccessibleContext().setAccessibleName("");
        PrecioDesde.getAccessibleContext().setAccessibleDescription("sda");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Propietario"));

        jLabel8.setText("Tipo Documento");

        jLabel9.setText("Correo");

        jLabel10.setText("Nro. Documento");

        jLabel11.setText("Apellido");

        jLabel12.setText("Nombre");

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        TipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "DNI", "Pasaporte", "LC", "LE" }));

        NroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NroDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NroDoc)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(TipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Acciones"));

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonVender.setText("Vender");

        BotonDetalles.setText("Detalles");

        BotonReserva.setText("Reservar");
        BotonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReservaActionPerformed(evt);
            }
        });

        BotonPublicar.setText("Publicar");

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPublicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(BotonDetalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonPublicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonModificar)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminar)
                .addGap(29, 29, 29)
                .addComponent(BotonSalir))
        );

        ScrollResultados.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollResultados.setMinimumSize(new java.awt.Dimension(230, 50));

        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Código", "Tipo", "Provincia", "Localidad", "Dirección", "Cant Dorm.", "Garaje", "Patio", "Sup. Edificada", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaResultados.setSurrendersFocusOnKeystroke(true);
        TablaResultados.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablaResultadosPropertyChange(evt);
            }
        });
        ScrollResultados.setViewportView(TablaResultados);
        if (TablaResultados.getColumnModel().getColumnCount() > 0) {
            TablaResultados.getColumnModel().getColumn(0).setPreferredWidth(10);
            TablaResultados.getColumnModel().getColumn(1).setPreferredWidth(45);
            TablaResultados.getColumnModel().getColumn(2).setPreferredWidth(30);
            TablaResultados.getColumnModel().getColumn(3).setPreferredWidth(60);
            TablaResultados.getColumnModel().getColumn(4).setPreferredWidth(60);
            TablaResultados.getColumnModel().getColumn(5).setPreferredWidth(60);
            TablaResultados.getColumnModel().getColumn(6).setPreferredWidth(65);
            TablaResultados.getColumnModel().getColumn(7).setPreferredWidth(45);
            TablaResultados.getColumnModel().getColumn(8).setPreferredWidth(40);
            TablaResultados.getColumnModel().getColumn(9).setPreferredWidth(80);
            TablaResultados.getColumnModel().getColumn(10).setPreferredWidth(40);
        }

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ScrollResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
       Inmobiliaria.getInstance().MenuPrincipal();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void PrecioDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioDesdeActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void NroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NroDocActionPerformed

    private void PrecioHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioHastaActionPerformed
    int entro=0;    
    private void TablaResultadosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablaResultadosPropertyChange
        
        int seleccionados=0;
        for (int i = 0; i < TablaResultados.getRowCount(); i++) {
					if((boolean)TablaResultados.getValueAt(i, 0)){
                                            seleccionados++;
                                        }
				}
        System.out.println(seleccionados);
        if(seleccionados==1) {
            HabilitarBotones();	}
        if(seleccionados==0)
                {  DeshabilitarBotonesInicio();}
        if (seleccionados>1){
            DeshabilitarBotones();}
        
            
    }//GEN-LAST:event_TablaResultadosPropertyChange

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Garage, Patio;
        String resultadoPrecio;
        DefaultTableModel model = (DefaultTableModel) TablaResultados.getModel();
        model.setRowCount(0);
        resultado=null;
        ABMInmueble operador = Inmobiliaria.getinstanciaOperadorInmueble(); // definir donde y cuando se creara el operador
        resultado = operador.BuscarInmuebles(getApellido(), getBarrioNombre(), getCantDormitorios(), getCorreo(), getLocalidadNombre(), getNombre(), getNroDoc(), getPrecioDesde(), getPrecioHasta(), getTipoDoc(), getTipoInmueble(), getProvinciaIndice());
        if(!resultado.isEmpty()){
        for(Inmueble c: resultado){   
            if(c.getGarage())
                Garage ="Si";
            else
                Garage="No";
            if(c.getPatio())
                Patio ="Si";
            else
                Patio="No";
            
            if ((c.getPrecio() - (int)c.getPrecio())<0.00)
                resultadoPrecio=String.valueOf((int) c.getPrecio()).replace(',', '.');
            else{
                if(c.getPrecio()<=999999999){
                    resultadoPrecio = String.format("%.2f", c.getPrecio());
                    resultadoPrecio = resultadoPrecio.replace(',', '.');}
                else{
                    resultadoPrecio = String.format("%.1f", c.getPrecio());
                    resultadoPrecio = resultadoPrecio.replace(',', '.');}}
                             
                    model.addRow(new Object[]{
                        false, 
                        "codigo", 
                        c.getTipoInmueble(),
                        c.getProvinciaNombre(),
                        c.getLocalidadNombre(), 
                        c.getCalle(), 
                        c.getDormitorio(), Garage, 
                        Patio,
                        c.getSupInmueble(),
                        resultadoPrecio});
        }}
        else
            JOptionPane.showMessageDialog(null,"No se han encontrado inmuebles con las características deseadas","Atención",JOptionPane.INFORMATION_MESSAGE);       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLocalidadActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        Inmueble inmSeleccionado;
        inmSeleccionado=resultado.get(TablaResultados.getSelectedRow());
        Inmobiliaria.getInstance().EliminarInmueble(inmSeleccionado);
       
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        Inmueble inmSeleccionado;
        inmSeleccionado=resultado.get(TablaResultados.getSelectedRow());
        Inmobiliaria.getInstance().ModificarInmueble(inmSeleccionado);
        
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReservaActionPerformed
       
        boolean tieneReserva;
        Inmueble inmSeleccionado;
        inmSeleccionado=resultado.get(TablaResultados.getSelectedRow());
        LogicaReserva operador = new LogicaReserva();
        tieneReserva=operador.ExisteReserva(inmSeleccionado);
        if(!tieneReserva){
        Inmobiliaria.getInstance().GenerarReserva(inmSeleccionado);
        }
        else{
            JOptionPane.showMessageDialog(null, "El Inmueble ya se encuentra reservado","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonReservaActionPerformed

    private void HabilitarBotones(){
        BotonDetalles.setEnabled(true);
        BotonEliminar.setEnabled(true);
        BotonModificar.setEnabled(true);
        BotonReserva.setEnabled(true);
        BotonVender.setEnabled(true);
        BotonPublicar.setEnabled(true);
    }
    private void DeshabilitarBotones(){
        BotonDetalles.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonModificar.setEnabled(false);
        BotonReserva.setEnabled(false);
        BotonVender.setEnabled(false);
    }
    private void DeshabilitarBotonesInicio(){
        BotonDetalles.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonModificar.setEnabled(false);
        BotonReserva.setEnabled(false);
        BotonVender.setEnabled(false);
        BotonPublicar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField BarrioText;
    private javax.swing.JButton BotonDetalles;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonPublicar;
    private javax.swing.JButton BotonReserva;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVender;
    private javax.swing.JSpinner CantDormitorios;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NroDoc;
    private javax.swing.JTextField PrecioDesde;
    private javax.swing.JTextField PrecioHasta;
    private javax.swing.JScrollPane ScrollResultados;
    private javax.swing.JTable TablaResultados;
    private javax.swing.JComboBox<String> TipoDoc;
    private javax.swing.JComboBox<String> TipoInmueble;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbLocalidad;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
