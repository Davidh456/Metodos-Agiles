/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Inmueble;
import Clases.Localidad;
import Clases.Provincia;
import Logica.Validaciones;
import Logica.ABMInmueble;
import Logica.LogicaCargaInterfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author maria
 */
public class ABMInmuebleInterfaz extends javax.swing.JPanel {
    List<Provincia> provincias;
    Set<Localidad> localidades;

    Validaciones validaciones = new Validaciones();
    private int iDModif;
    // Creates new form ABMInmuebleInterfaz   
    public ABMInmuebleInterfaz() {
        initComponents();
        cargarCB();
        setSize(getPreferredSize());
        sintaxis();
        setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Inmueble"));
    }
    public  ABMInmuebleInterfaz(Inmueble inmSeleccionado) {
        initComponents();
        
        cargarCB();
        setSize(getPreferredSize());
        sintaxis();
        setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Inmueble"));
        
        setId(inmSeleccionado.getId());
        setSupInmueble(inmSeleccionado.getSupInmueble());
        setSupTerreno(inmSeleccionado.getSupTerreno());
        setAc(inmSeleccionado.getAc());
        setAntiguedad(inmSeleccionado.getAntiguedad());
        setBano(inmSeleccionado.getBano());
        setBarrio(inmSeleccionado.getBarrio());
        setCP(inmSeleccionado.getCp());
        setCalle(inmSeleccionado.getCalle());
        setDepto(inmSeleccionado.getDepto());
        setDormitorio(inmSeleccionado.getDormitorio());
        setFondo(inmSeleccionado.getFondo());
        setFrente(inmSeleccionado.getFrente());
        setGarage(inmSeleccionado.getGarage());
        setGn(inmSeleccionado.getGn());
        setLavadero(inmSeleccionado.getLavadero());
        setNumero(inmSeleccionado.getNumero());
        setObservaciones(inmSeleccionado.getObservaciones());
        setOrientacion(inmSeleccionado.getOrientacion());
        setOtraLoc();
        setPatio(inmSeleccionado.getPatio());
        setPavimento(inmSeleccionado.getPavimento());
        setPiso(inmSeleccionado.getPiso());
        setPrecio(inmSeleccionado.getPrecio());
        //TODO formar string que recibe:
        //setPropietario( string )
        setTelefono(inmSeleccionado.getTelefono());
        setTipoInmueble(inmSeleccionado.getTipoInmueble());
        setCbLocalidad(inmSeleccionado.getLocalidadIndice());
        setCbProvincia(inmSeleccionado.getProvinciaIndice());
        setSupInmueble(inmSeleccionado.getSupInmueble());
        setSupTerreno(inmSeleccionado.getSupTerreno());
        
    }

    public float getSupInmueble() {
        return Float.parseFloat(supInmueble.getText());
    }
    public float getSupTerreno() {
        return Float.parseFloat(supTerreno.getText());
    }
    public boolean getAc() {
        return Ac.isSelected();
    }
    public int getAntiguedad() {
        return Integer.parseInt(Antiguedad.getText());
    }
    public int getBano() {
        return ((Integer) Bano.getValue());
    }
    public String getBarrio() {
        return Barrio.getText();
    }
    public int getCP() {
        return Integer.parseInt(CP.getText());
    }
    public String getCalle() {
        return Calle.getText();
    }
    public String getDepto() {
        return Depto.getText();
    }
    public int getDormitorio() {
        return ((Integer) Dormitorio.getValue());
    }
    public float getFondo() {
        return Float.parseFloat(Fondo.getText());
    }
    public float getFrente() {
        return Float.parseFloat(Frente.getText());
    }
    public boolean getGarage() {
        return Garage.isSelected();
    }
    public boolean getGn() {
        return Gn.isSelected();
    }
    public boolean getLavadero() {
        return Lavadero.isSelected();
    }
    public int getListaFotos() { //falta determinar esto
        return 1;
    }
    public String getLocalidadNombre() {
        return ((String) cbLocalidad.getSelectedItem());
    }
    public int getLocalidadIndice() {
        return  cbLocalidad.getSelectedIndex();
    }
    public int getNumero() {
        return Integer.parseInt(Numero.getText());
    }
    public String getObservaciones() {
        return Observaciones.getText();
    }
    public int getOrientacion() {
        return Orientacion.getSelectedIndex();
    }
    public String getOtraLoc() {
        return OtraLoc.getText();
    }
    public boolean getPatio() {
        return Patio.isSelected();
    }
    public boolean getPavimento() {
        return Pavimento.isSelected();
    }
    public String getPiso() {
        return Piso.getText();
    }
    public float getPrecio() {
        return Float.parseFloat(Precio.getText());
    }
    public int getPropietario() {
        return 1;
    }
    public String getProvinciaNombre() {
        return ((String) cbProvincia.getSelectedItem());
    }
    public int getProvinciaIndice() {
        return  cbProvincia.getSelectedIndex();
    }
    public boolean getTelefono() {
        return Telefono.isSelected();
    }
    public int getTipoInmueble() {
        return TipoInmueble.getSelectedIndex();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Calle = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        Piso = new javax.swing.JTextField();
        Depto = new javax.swing.JTextField();
        Barrio = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Orientacion = new javax.swing.JComboBox<>();
        Frente = new javax.swing.JTextField();
        Fondo = new javax.swing.JTextField();
        supInmueble = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        jLabel7 = new javax.swing.JLabel();
        supTerreno = new javax.swing.JTextField();
        label11 = new java.awt.Label();
        jLabel31 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Dormitorio = new javax.swing.JSpinner();
        Bano = new javax.swing.JSpinner();
        Garage = new javax.swing.JCheckBox();
        Patio = new javax.swing.JCheckBox();
        Gn = new javax.swing.JCheckBox();
        Ac = new javax.swing.JCheckBox();
        Telefono = new javax.swing.JCheckBox();
        Lavadero = new javax.swing.JCheckBox();
        Pavimento = new javax.swing.JCheckBox();
        Observaciones = new javax.swing.JTextField();
        BAdjFotos = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        BAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaFotos = new javax.swing.JList<>();
        cbProvincia = new javax.swing.JComboBox<>();
        cbLocalidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        OtraLoc = new javax.swing.JTextField();
        CP = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        TipoInmueble = new javax.swing.JComboBox<>();
        BSelecProp = new javax.swing.JToggleButton();
        Propietario = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label10 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        Antiguedad = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Cargar Inmueble"));

        jLabel2.setText("Provincia");

        jLabel3.setText("Localidad");

        jLabel15.setText("Antiguedad (a�os)");

        jLabel13.setText("Precio de vta (dolares)");

        jLabel4.setText("C.P.");

        jLabel14.setText("Tipo de inmueble");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Domicilio"));
        jPanel1.setToolTipText("");

        jLabel6.setText("Calle");

        jLabel8.setText("N�");

        jLabel9.setText("Piso");

        jLabel10.setText("Depto");

        jLabel12.setText("Barrio");

        Piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PisoActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 0, 102));
        label5.setName(""); // NOI18N
        label5.setText("*");

        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 0, 102));
        label6.setName(""); // NOI18N
        label6.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Piso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Depto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Calle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Numero, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(Barrio))
                .addGap(1, 1, 1)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(Calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(Piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Depto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Datos del terreno"));

        jLabel16.setText("Orientacion");

        jLabel19.setText("Fondo");

        jLabel18.setText("Frente");

        jLabel20.setText("Sup. Inmueble");

        jLabel11.setText("m");

        jLabel17.setText("m");

        jLabel30.setText("m^2");

        Orientacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Este", "Norte", "Noreste", "Noroeste", "Oeste", "Sur", "Sureste", "Suroeste" }));

        label7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 0, 102));
        label7.setName(""); // NOI18N
        label7.setText("*");

        label8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 0, 102));
        label8.setName(""); // NOI18N
        label8.setText("*");

        label9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 0, 102));
        label9.setName(""); // NOI18N
        label9.setText("*");

        jLabel7.setText("Sup. Terreno");

        label11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 0, 102));
        label11.setName(""); // NOI18N
        label11.setText("*");

        jLabel31.setText("m^2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addComponent(supTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Frente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(18, 21, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(Orientacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel17)
                        .addComponent(Frente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel11)
                        .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel30)
                        .addComponent(supInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(supTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Orientacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Otros datos"));

        jLabel21.setText("Dormitorios");

        jLabel22.setText("Ba�os");

        jLabel23.setText("Garage");

        jLabel24.setText("Patio");

        jLabel25.setText("GN");

        jLabel27.setText("AC");

        jLabel26.setText("Tel�fono");

        jLabel29.setText("Lavadero");

        jLabel28.setText("Pavimento");

        Garage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarageActionPerformed(evt);
            }
        });

        Patio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatioActionPerformed(evt);
            }
        });

        Gn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GnActionPerformed(evt);
            }
        });

        Ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcActionPerformed(evt);
            }
        });

        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        Lavadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LavaderoActionPerformed(evt);
            }
        });

        Pavimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PavimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telefono)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lavadero)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pavimento)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Garage)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Patio)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dormitorio)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Gn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ac)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bano, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(Dormitorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25))
                    .addComponent(Garage)
                    .addComponent(Patio)
                    .addComponent(Gn)
                    .addComponent(jLabel27)
                    .addComponent(Ac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Telefono)
                        .addComponent(Lavadero)
                        .addComponent(jLabel26)
                        .addComponent(jLabel29))
                    .addComponent(Pavimento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)))
        );

        Observaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Observaciones"));

        BAdjFotos.setText("Adjuntar fotos");
        BAdjFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAdjFotosActionPerformed(evt);
            }
        });

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListaFotos);

        cbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinciaActionPerformed(evt);
            }
        });

        jLabel1.setText("Otra");

        Precio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PrecioPropertyChange(evt);
            }
        });
        Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioKeyTyped(evt);
            }
        });

        TipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Departamento", "Galp�n", "Local-Oficina", "Quinta", "Terreno" }));
        TipoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoInmuebleActionPerformed(evt);
            }
        });

        BSelecProp.setText("Seleccionar Propietario");
        BSelecProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecPropActionPerformed(evt);
            }
        });

        Propietario.setText("Ninguno");

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 0, 102));
        label1.setName(""); // NOI18N
        label1.setText("*");

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 0, 102));
        label2.setName(""); // NOI18N
        label2.setText("*");

        label10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 0, 102));
        label10.setName(""); // NOI18N
        label10.setText("*");

        jLabel5.setText("(*) Campos Obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BSelecProp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(OtraLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)
                                .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Observaciones, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(BCancelar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BAdjFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(10, 10, 10)
                                            .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(BAceptar)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSelecProp)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Propietario)
                            .addComponent(jLabel13)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(OtraLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(BAdjFotos)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BAceptar)
                            .addComponent(BCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BAdjFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAdjFotosActionPerformed
        
    }//GEN-LAST:event_BAdjFotosActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        Inmobiliaria.getInstance().MenuPrincipal();
    }//GEN-LAST:event_BCancelarActionPerformed

    private void cbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinciaActionPerformed
        
    }//GEN-LAST:event_cbProvinciaActionPerformed

    private void GarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarageActionPerformed
        
    }//GEN-LAST:event_GarageActionPerformed

    private void PatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatioActionPerformed
        
    }//GEN-LAST:event_PatioActionPerformed

    private void GnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GnActionPerformed
        
    }//GEN-LAST:event_GnActionPerformed

    private void AcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcActionPerformed
        
    }//GEN-LAST:event_AcActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
       
    }//GEN-LAST:event_TelefonoActionPerformed

    private void LavaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LavaderoActionPerformed
        
    }//GEN-LAST:event_LavaderoActionPerformed

    private void PavimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PavimentoActionPerformed
        
    }//GEN-LAST:event_PavimentoActionPerformed

    private void PisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PisoActionPerformed
        
    }//GEN-LAST:event_PisoActionPerformed

    private void BSelecPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecPropActionPerformed
        
    }//GEN-LAST:event_BSelecPropActionPerformed

    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
       
    }//GEN-LAST:event_PrecioKeyTyped

    private void PrecioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PrecioPropertyChange
      
    }//GEN-LAST:event_PrecioPropertyChange

    private void TipoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoInmuebleActionPerformed
       
    }//GEN-LAST:event_TipoInmuebleActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        String titulo = ((javax.swing.border.TitledBorder) getBorder()).getTitle();
        boolean resultado;
        ABMInmueble operador = Inmobiliaria.getinstanciaOperadorInmueble(); // definir donde y cuando se creara el operador
        if (titulo.equals("Alta Inmueble"))
        {
            resultado = operador.AltaInmueble(getSupInmueble(), getSupTerreno(), getAc(), getAntiguedad(), getBano(), getBarrio(), getCP(), getCalle(), getDepto(), getDormitorio(), getFondo(), getFrente(), getGarage(), getGn(), getLavadero(), getListaFotos(), getLocalidadIndice(), getLocalidadNombre(), getNumero(), getObservaciones(), getOrientacion(), getOtraLoc(), getPatio(), getPavimento(), getPiso(), getPrecio(), getPropietario(), getProvinciaNombre(), getProvinciaIndice(), getTelefono(), getTipoInmueble());
            //resultado = operador.ABMInmuebleInterfaz( (float)1.1, (float) 1.11, true, 22, 1, "barrio", 3000, "calle", "1a", 3, (float)125.3, (float)223.3, true, true, true, 1, 1, "localidad2", 325, "observaciones", 1, "otraloca", true, true,"segundo", (float)163.2, 1, "provincianombre", 1, true, 1);
            if(resultado){
            JOptionPane.showMessageDialog(null, "El inmueble ha sido correctamente cargado","Felicidades",JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO diferenciar los distintos tipos de errores posibles
        else {
            JOptionPane.showMessageDialog(null, "El inmueble no se ha podido cargar, verifique que no exista uno con los mismos datos","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        if (titulo.equals("Modificar Inmueble")){
            resultado=operador.ModificarInmueble(iDModif, getSupInmueble(), getSupTerreno(), getAc(), getAntiguedad(), getBano(), getBarrio(), getCP(), getCalle(), getDepto(), getDormitorio(), getFondo(), getFrente(), getGarage(), getGn(), getLavadero(), getListaFotos(), getLocalidadIndice(), getLocalidadNombre(), getNumero(), getObservaciones(), getOrientacion(), getOtraLoc(), getPatio(), getPavimento(), getPiso(), getPrecio(), getPropietario(), getProvinciaNombre(), getProvinciaIndice(), getTelefono(), getTipoInmueble());
            if(resultado){
                JOptionPane.showMessageDialog(null, "El inmueble ha sido correctamente modificado","Felicidades",JOptionPane.INFORMATION_MESSAGE);
            }
            // TODO diferenciar los distintos tipos de errores posibles
            else {
                JOptionPane.showMessageDialog(null, "El inmueble no se ha podido modificar, verifique que no exista uno con los mismos datos","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BAceptarActionPerformed

    private void sintaxis(){
        //TODO sintaxis del precio, frente, fondo y superficie por ser float
        validaciones.CaracteresMaximos(OtraLoc, 30, "alfanumerico");
        validaciones.CaracteresMaximos(CP,5,"numerico");
        validaciones.CaracteresMaximos(Calle, 30, "alfanumerico");
        validaciones.CaracteresMaximos(Numero, 5, "numerico");
        validaciones.CaracteresMaximos(Piso, 3, "alfanumerico");
        validaciones.CaracteresMaximos(Depto, 4, "alfanumerico");
        validaciones.CaracteresMaximos(Barrio, 40, "alfanumerico");
        validaciones.CaracteresMaximos(Observaciones,200,"alfanumerico");
        validaciones.CaracteresMaximos(Precio, 10, "float");
        validaciones.CaracteresMaximos(Frente, 8, "float");
        validaciones.CaracteresMaximos(Fondo, 8, "float");
        validaciones.CaracteresMaximos(supInmueble, 10, "float");
        validaciones.CaracteresMaximos(supTerreno, 10, "float");
        validaciones.CaracteresMaximos(Antiguedad, 5, "numerico");
        
    }
    private void camposObligatorios(){
        validaciones.CampoObligatorio(new JTextField[]{CP, Precio,Numero,Barrio,Frente,Fondo,supInmueble}, this);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ac;
    private javax.swing.JTextField Antiguedad;
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BAdjFotos;
    private javax.swing.JButton BCancelar;
    private javax.swing.JToggleButton BSelecProp;
    private javax.swing.JSpinner Bano;
    private javax.swing.JTextField Barrio;
    private javax.swing.JTextField CP;
    private javax.swing.JTextField Calle;
    private javax.swing.JTextField Depto;
    private javax.swing.JSpinner Dormitorio;
    private javax.swing.JTextField Fondo;
    private javax.swing.JTextField Frente;
    private javax.swing.JCheckBox Garage;
    private javax.swing.JCheckBox Gn;
    private javax.swing.JCheckBox Lavadero;
    private javax.swing.JList<String> ListaFotos;
    private javax.swing.JTextField Numero;
    private javax.swing.JTextField Observaciones;
    private javax.swing.JComboBox<String> Orientacion;
    private javax.swing.JTextField OtraLoc;
    private javax.swing.JCheckBox Patio;
    private javax.swing.JCheckBox Pavimento;
    private javax.swing.JTextField Piso;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel Propietario;
    private javax.swing.JCheckBox Telefono;
    private javax.swing.JComboBox<String> TipoInmueble;
    private javax.swing.JComboBox<String> cbLocalidad;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label2;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField supInmueble;
    private javax.swing.JTextField supTerreno;
    // End of variables declaration//GEN-END:variables

    private void setId(int id)
    {
        this.iDModif = id;
    }
    private void setAc(boolean Ac) {
        this.Ac.setSelected(Ac);
    }
    
    private void setAntiguedad(int Antiguedad) {
        this.Antiguedad.setText(String.valueOf(Antiguedad));
    }

    private void setBano(int Bano) {
        this.Bano.setValue(Bano);
    }

    private void setBarrio(String Barrio) {
        this.Barrio.setText(Barrio);
    }

    private void setCP(int CP) {
        this.CP.setText(String.valueOf(CP));
    }

    private void setCalle(String Calle) {
        this.Calle.setText(Calle);
    }

    private void setDepto(String Depto) {
        this.Depto.setText(Depto);
    }

    private void setDormitorio(int Dormitorio) {
        this.Dormitorio.setValue(Dormitorio);
    }

    private void setFondo(float Fondo) {
        this.Fondo.setText(String.valueOf(Fondo));
    }

    private void setFrente(float Frente) {
        this.Frente.setText(String.valueOf(Frente));
    }

    private void setGarage(boolean Garage) {
        this.Garage.setSelected(Garage);
    }

    private void setGn(boolean Gn) {
        this.Gn.setSelected(Gn);
    }

    private void setLavadero(boolean Lavadero) {
        this.Lavadero.setSelected(Lavadero);
    }

//    private void setListaFotos(int ListaFotos) {
//        this.ListaFotos.setText(String.valueOf(ListaFotos));
//    }

    private void setNumero(int Numero) {
        this.Numero.setText(String.valueOf(Numero));
    }

    private void setObservaciones(String Observaciones) {
        this.Observaciones.setText(String.valueOf(Observaciones));
    }

    private void setOrientacion(int Orientacion) {
        this.Orientacion.setSelectedIndex(Orientacion);
    }

    private void setOtraLoc() {
        this.OtraLoc.setText("");
    }

    private void setPatio(boolean Patio) {
        this.Patio.setSelected(Patio);
    }

    private void setPavimento(boolean Pavimento) {
        this.Pavimento.setSelected(Pavimento);
    }

    private void setPiso(String Piso) {
        this.Piso.setText(Piso);
    }

    private void setPrecio(float Precio) {
        this.Precio.setText(String.valueOf(Precio));
    }

    private void setPropietario(String Propietario) {
        this.Propietario.setText(Propietario);
    }

    private void setTelefono(boolean Telefono) {
        this.Telefono.setSelected(Telefono);
    }

    private void setTipoInmueble(int TipoInmueble) {
        this.TipoInmueble.setSelectedIndex(TipoInmueble);
    }

    private void setCbLocalidad(int cbLocalidad) {
        this.cbLocalidad.setSelectedIndex(cbLocalidad);
    }

    private void setCbProvincia(int cbProvincia) {
        this.cbProvincia.setSelectedIndex(cbProvincia);
    }

    private void setSupInmueble(float supInmueble) {
        this.supInmueble.setText(String.valueOf(supInmueble));
    }

    private void setSupTerreno(float supTerreno) {
        this.supTerreno.setText(String.valueOf(supTerreno));
    }

    
}
