/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Inmueble;
import Clases.Localidad;
import Clases.Cliente;
import Clases.Provincia;
import Logica.Validaciones;
import Logica.ABMInmueble;
import Logica.LogicaCargaInterfaz;
import Logica.LogicaReserva;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class ABMInmuebleInterfaz extends javax.swing.JPanel {
    List<Provincia> provincias;
    Set<Localidad> localidades;
    
    JTextField[] camposObligatorios;
    JLabel[] lblCamposObligatorios;
    
    JTextField[] camposFlotantes;
    JLabel[] labelFlotantes;

    Validaciones validaciones = new Validaciones();
    private int iDModif;
    private int qReserva;
    private Inmueble modificarInmueble;
    private Inmueble eliminarInmueble;
    private Cliente propietarioAux; //esto se debe perfeccionar
    // Creates new form ABMInmuebleInterfaz   
    public ABMInmuebleInterfaz() {
        initComponents();
        cargarCB();
        setSize(getPreferredSize());
        sintaxis();
        setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Inmueble"));
        setBtnQReserva(false);
    }
    public  ABMInmuebleInterfaz(Inmueble inmSeleccionado) {
        initComponents();
        
        cargarCB();
        setSize(getPreferredSize());
        sintaxis();
        setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Inmueble"));  
        modificarInmueble=inmSeleccionado;
        setId(inmSeleccionado.getId());
        //setPropietario(inmSeleccionado.getPropietario().getNombre()+" "+ inmSeleccionado.getPropietario().getApellido()+ " Nº Doc: " +inmSeleccionado.getPropietario().getNumeroDoc());
        setPropietario(inmSeleccionado.getCliente());
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
        setPatio(inmSeleccionado.getPatio());
        setPavimento(inmSeleccionado.getPavimento());
        setPiso(inmSeleccionado.getPiso());
        setPrecio(inmSeleccionado.getPrecio());
        setTelefono(inmSeleccionado.getTelefono());
        setTipoInmueble(inmSeleccionado.getTipoInmueble());
        setCbProvincia(inmSeleccionado.getProvinciaIndice());
        setCbLocalidad(inmSeleccionado.getLocalidadIndice());
        setSupInmueble(inmSeleccionado.getSupInmueble());
        setSupTerreno(inmSeleccionado.getSupTerreno());
        if(inmSeleccionado.getEstado()!= 1)
            setBtnQReserva(false);
        else
            setBtnQReserva(true);
    }

    public ABMInmuebleInterfaz(Inmueble inmSeleccionado, String baja) {
        initComponents();     
        cargarCB();
        setSize(getPreferredSize());
        sintaxis();
        setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Inmueble"));
        eliminarInmueble=inmSeleccionado;
        setId(inmSeleccionado.getId());
        //setPropietario(inmSeleccionado.getPropietario().getNombre()+inmSeleccionado.getPropietario().getApellido()+ " Nº Doc: " +inmSeleccionado.getPropietario().getNumeroDoc());
        setPropietario(inmSeleccionado.getCliente());
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
        setPatio(inmSeleccionado.getPatio());
        setPavimento(inmSeleccionado.getPavimento());
        setPiso(inmSeleccionado.getPiso());
        setPrecio(inmSeleccionado.getPrecio());
        setTelefono(inmSeleccionado.getTelefono());
        setTipoInmueble(inmSeleccionado.getTipoInmueble());
        setCbProvincia(inmSeleccionado.getProvinciaIndice());
        setCbLocalidad(inmSeleccionado.getLocalidadIndice());
        setSupInmueble(inmSeleccionado.getSupInmueble());
        setSupTerreno(inmSeleccionado.getSupTerreno());
        setBtnQReserva(false);
        deshabilitarCampos();
        
    }


    public double getSupInmueble() {
        return Double.parseDouble(supInmueble.getText());
    }
    public double getSupTerreno() {
        return Double.parseDouble(supTerreno.getText());
    }
    public boolean getAc() {
        return Ac.isSelected();
    }
    public int getAntiguedad() {
        if(Antiguedad.getText().equals("")){
            return -1;
        }
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
    public double getFondo() {
        return Double.parseDouble(Fondo.getText());
    }
    public double getFrente() {
        return Double.parseDouble(Frente.getText());
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
    public Vector<String> getListaFotos() {
       
        Vector<String> archivos= new Vector<String>();
        
        for(int i=0; i<ListaFotos.getRowCount();i++){
            archivos.add((String) ListaFotos.getValueAt(i, 0));//agrega el nombre de la imagen primero
            archivos.add( ((File) ListaFotos.getValueAt(i, 1)).getAbsolutePath());//agrega luego el nombre de la direccion
        }
        return archivos;
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

    public boolean getPatio() {
        return Patio.isSelected();
    }
    public boolean getPavimento() {
        return Pavimento.isSelected();
    }
    public String getPiso() {
        return Piso.getText();
    }
    public double getPrecio() {
        return Double.parseDouble(Precio.getText());
    }
    public Cliente getPropietario() {
        return propietarioAux;
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PrecioLbl = new javax.swing.JLabel();
        CPLbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CalleLbl = new javax.swing.JLabel();
        NumeroLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Calle = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        Piso = new javax.swing.JTextField();
        Depto = new javax.swing.JTextField();
        Barrio = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        FondoLbl = new javax.swing.JLabel();
        FrenteLbl = new javax.swing.JLabel();
        supInmuebleLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Orientacion = new javax.swing.JComboBox<>();
        Frente = new javax.swing.JTextField();
        Fondo = new javax.swing.JTextField();
        supInmueble = new javax.swing.JTextField();
        supTerrenoLbl = new javax.swing.JLabel();
        supTerreno = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
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
        cbProvincia = new javax.swing.JComboBox<>();
        cbLocalidad = new javax.swing.JComboBox<>();
        CP = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        TipoInmueble = new javax.swing.JComboBox<>();
        BSelecProp = new javax.swing.JToggleButton();
        PropietarioLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Antiguedad = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Propietario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaFotos = new javax.swing.JTable();
        BElimFotos = new javax.swing.JButton();
        btnQReserva = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Cargar Inmueble"));

        jLabel2.setText("Provincia");

        jLabel3.setText("Localidad");

        jLabel15.setText("Antiguedad (años)");

        PrecioLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PrecioLbl.setText("Precio de vta (dolares)");

        CPLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CPLbl.setText("C.P.");

        jLabel14.setText("Tipo de inmueble");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Domicilio"));
        jPanel1.setToolTipText("");

        CalleLbl.setText("Calle");

        NumeroLbl.setText("Nº");

        jLabel9.setText("Piso");

        jLabel10.setText("Depto");

        jLabel12.setText("Barrio");

        Piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PisoActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel36.setText("*");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel37.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(CalleLbl))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NumeroLbl)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Numero, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(Barrio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalleLbl)
                    .addComponent(NumeroLbl)
                    .addComponent(Calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
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

        FondoLbl.setText("Fondo");

        FrenteLbl.setText("Frente");

        supInmuebleLbl.setText("Sup. Inmueble");

        jLabel11.setText("m");

        jLabel17.setText("m");

        jLabel30.setText("m^2");

        Orientacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Este", "Norte", "Noreste", "Noroeste", "Oeste", "Sur", "Sureste", "Suroeste" }));

        supTerrenoLbl.setText("Sup. Terreno");

        jLabel31.setText("m^2");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel38.setText("*");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel39.setText("*");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel40.setText("*");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel32.setText("*");

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
                                .addComponent(FondoLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(supTerrenoLbl)
                                .addGap(2, 2, 2)
                                .addComponent(supTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(FrenteLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Frente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(18, 21, Short.MAX_VALUE)
                                .addComponent(supInmuebleLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addComponent(FrenteLbl)
                        .addComponent(jLabel17)
                        .addComponent(Frente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FondoLbl)
                        .addComponent(jLabel11)
                        .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(supInmuebleLbl)
                        .addComponent(jLabel30)
                        .addComponent(supInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(supTerrenoLbl)
                        .addComponent(jLabel32))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(supTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Orientacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Otros datos"));

        jLabel21.setText("Dormitorios");

        jLabel22.setText("Baños");

        jLabel23.setText("Garage");

        jLabel24.setText("Patio");

        jLabel25.setText("GN");

        jLabel27.setText("AC");

        jLabel26.setText("Teléfono");

        jLabel29.setText("Lavadero");

        jLabel28.setText("Pavimento");

        Dormitorio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        Bano.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

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

        BAdjFotos.setText("Adjuntar Foto");
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

        cbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinciaActionPerformed(evt);
            }
        });

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

        TipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Departamento", "Galpón", "Local-Oficina", "Quinta", "Terreno" }));
        TipoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoInmuebleActionPerformed(evt);
            }
        });

        BSelecProp.setText("Seleccionar");
        BSelecProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecPropActionPerformed(evt);
            }
        });

        PropietarioLbl.setText("Propietario:");

        jLabel5.setText("(*) Campos Obligatorios");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel33.setText("*");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel34.setText("*");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel35.setText("*");

        Propietario.setEditable(false);
        Propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropietarioActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        ListaFotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivo", "Directorio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ListaFotos);

        BElimFotos.setText("Quitar Foto");
        BElimFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BElimFotosActionPerformed(evt);
            }
        });

        btnQReserva.setText("Quitar Reserva");
        btnQReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(btnQReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrecioLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPLbl, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel14)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CP)
                    .addComponent(Precio))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BAceptar))
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(BAdjFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BElimFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BSelecProp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PropietarioLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(BCancelar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSelecProp)
                    .addComponent(jLabel33)
                    .addComponent(PropietarioLbl)
                    .addComponent(PrecioLbl)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(Propietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(cbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CPLbl)
                            .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BAdjFotos)
                            .addComponent(BElimFotos))
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQReserva)
                        .addComponent(BCancelar)
                        .addComponent(BAceptar))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BAdjFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAdjFotosActionPerformed
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
        DefaultTableModel model = (DefaultTableModel) ListaFotos.getModel();
        model.addRow(new Object[]{
                        chooser.getSelectedFile().getName(), 
                        chooser.getSelectedFile(),
                        });
        }
    
    }//GEN-LAST:event_BAdjFotosActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        String titulo = ((javax.swing.border.TitledBorder) getBorder()).getTitle();
        if (titulo.equals("Alta Inmueble"))
            Inmobiliaria.getInstance().MenuPrincipal();
        else
            Inmobiliaria.getInstance().ConsultaInmueble();
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
        Inmobiliaria.getInstance().ListarPropietarios(this);
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
        LogicaReserva operador2 = new LogicaReserva();
        if (titulo.equals("Alta Inmueble")){
            if(camposValidos()){
            resultado = operador.AltaInmueble(getSupInmueble(), getSupTerreno(), getAc(), getAntiguedad(), getBano(), getBarrio(), getCP(), getCalle(), getDepto(), getDormitorio(), getFondo(), getFrente(), getGarage(), getGn(), getLavadero(), getListaFotos(), getLocalidadIndice(), getLocalidadNombre(), getNumero(), getObservaciones(), getOrientacion(), getPatio(), getPavimento(), getPiso(), getPrecio(), getPropietario(), getProvinciaNombre(), getProvinciaIndice(), getTelefono(), getTipoInmueble());
            if(resultado){
                if (JOptionPane.showConfirmDialog(null, "El inmueble ha sido correctamente cargado\n¿Desea continuar cargando inmuebles?", "Felicidades", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
                    Inmobiliaria.getInstance().AltaInmueble();
                else
                    Inmobiliaria.getInstance().MenuPrincipal();
                }
        else {
            JOptionPane.showMessageDialog(null, "El inmueble no se ha podido cargar, verifique que no exista uno con los mismos datos","Error",JOptionPane.ERROR_MESSAGE);
        }}
        }
        if (titulo.equals("Modificar Inmueble")){
            if(camposValidos()){
            resultado=operador.ModificarInmueble(iDModif, getSupInmueble(), getSupTerreno(), getAc(), getAntiguedad(), getBano(), getBarrio(), getCP(), getCalle(), getDepto(), getDormitorio(), getFondo(), getFrente(), getGarage(), getGn(), getLavadero(), getListaFotos(), getLocalidadIndice(), getLocalidadNombre(), getNumero(), getObservaciones(), getOrientacion(), getPatio(), getPavimento(), getPiso(), getPrecio(), getPropietario(), getProvinciaNombre(), getProvinciaIndice(), getTelefono(), getTipoInmueble(),getEstado());
            if(resultado){
                if (JOptionPane.showConfirmDialog(null, "El inmueble ha sido correctamente modificado\n¿Desea volver a la consulta de inmuebles?", "Felicidades", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                {
                    if(getEstado()==0)
                    {
                        operador2.EliminarReserva(iDModif);
                    }
                    Inmobiliaria.getInstance().ConsultaInmueble();}
                else
                    Inmobiliaria.getInstance().MenuPrincipal();
            }
            else {
                JOptionPane.showMessageDialog(null, "El inmueble no se ha podido modificar, verifique que no exista uno con los mismos datos","Error",JOptionPane.ERROR_MESSAGE);
            }
        }}
        if (titulo.equals("Eliminar Inmueble")){
            resultado=operador.EliminarInmueble(eliminarInmueble);
                   if(resultado){
                        if (JOptionPane.showConfirmDialog(null, "El inmueble ha sido correctamente modificado\n¿Desea volver a la consulta de inmuebles?", "Felicidades", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                            Inmobiliaria.getInstance().ConsultaInmueble();
                        else
                            Inmobiliaria.getInstance().MenuPrincipal();
                    }
        }
    }//GEN-LAST:event_BAceptarActionPerformed

    private void PropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PropietarioActionPerformed

    private void BElimFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BElimFotosActionPerformed
        if(ListaFotos.getSelectedRow()!=-1){
        DefaultTableModel model = (DefaultTableModel) ListaFotos.getModel();
        model.setRowCount(ListaFotos.getSelectedRow());
    }
    }//GEN-LAST:event_BElimFotosActionPerformed

    private void btnQReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQReservaActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea quitar la reserva del inmueble?", "¡Atencion!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {            this.btnQReserva.setEnabled(false);
                     this.btnQReserva.setText("Reserva establecida para ser eliminada");
                     this.btnQReserva.setBackground(new Color(250,180,180));
                     this.btnQReserva.setBorder(new LineBorder(new Color(255,0,20)));
                     qReserva=1;
        }
    }//GEN-LAST:event_btnQReservaActionPerformed

    private void sintaxis(){
        validaciones.CaracteresMaximos(CP,5,"numerico");
        validaciones.CaracteresMaximos(Calle, 30, "alfaNumerico");
        validaciones.CaracteresMaximos(Numero, 5, "numerico");
        validaciones.CaracteresMaximos(Piso, 3, "alfaNumerico");
        validaciones.CaracteresMaximos(Depto, 4, "alfaNumerico");
        validaciones.CaracteresMaximos(Barrio, 40, "alfaNumerico");
        validaciones.CaracteresMaximos(Observaciones,200,"alfaNumerico");
        validaciones.CaracteresMaximos(Precio, 12, "double");
        validaciones.CaracteresMaximos(Frente, 8, "double");
        validaciones.CaracteresMaximos(Fondo, 8, "double");
        validaciones.CaracteresMaximos(supInmueble, 10, "double"); 
        validaciones.CaracteresMaximos(supTerreno, 10, "double");
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
    private boolean camposValidos() {
        camposFlotantes = new JTextField[]{Precio,Fondo,Frente,supTerreno,supInmueble};
        labelFlotantes = new JLabel[]{PrecioLbl,FondoLbl,FrenteLbl,supTerrenoLbl,supInmuebleLbl};
        camposObligatorios = new JTextField[]{Propietario,CP,Calle,Numero,Precio,Fondo,Frente,supTerreno,supInmueble};
        lblCamposObligatorios = new JLabel[]{PropietarioLbl,CPLbl,CalleLbl,NumeroLbl,PrecioLbl,FondoLbl,FrenteLbl,supTerrenoLbl,supInmuebleLbl};
                String mensaje="";
                if(validaciones.CamposVacios(camposObligatorios, null)){
                    mensaje = mensaje + "Hay campos obligatorios que deben ser completados";
                    validaciones.Pintar(camposObligatorios, lblCamposObligatorios);
                }
                if(validaciones.validarPintadorFlotantes(camposFlotantes, labelFlotantes))
                    mensaje = mensaje + "\n" + "Hay campos numericos invalidos";

                if(!mensaje.equals("")){
                    JOptionPane.showMessageDialog(null,mensaje,"¡CUIDADO!",JOptionPane.ERROR_MESSAGE);
                    return false;}
    return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ac;
    private javax.swing.JTextField Antiguedad;
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BAdjFotos;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BElimFotos;
    private javax.swing.JToggleButton BSelecProp;
    private javax.swing.JSpinner Bano;
    private javax.swing.JTextField Barrio;
    private javax.swing.JTextField CP;
    private javax.swing.JLabel CPLbl;
    private javax.swing.JTextField Calle;
    private javax.swing.JLabel CalleLbl;
    private javax.swing.JTextField Depto;
    private javax.swing.JSpinner Dormitorio;
    private javax.swing.JTextField Fondo;
    private javax.swing.JLabel FondoLbl;
    private javax.swing.JTextField Frente;
    private javax.swing.JLabel FrenteLbl;
    private javax.swing.JCheckBox Garage;
    private javax.swing.JCheckBox Gn;
    private javax.swing.JCheckBox Lavadero;
    private javax.swing.JTable ListaFotos;
    private javax.swing.JTextField Numero;
    private javax.swing.JLabel NumeroLbl;
    private javax.swing.JTextField Observaciones;
    private javax.swing.JComboBox<String> Orientacion;
    private javax.swing.JCheckBox Patio;
    private javax.swing.JCheckBox Pavimento;
    private javax.swing.JTextField Piso;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel PrecioLbl;
    private javax.swing.JTextField Propietario;
    private javax.swing.JLabel PropietarioLbl;
    private javax.swing.JCheckBox Telefono;
    private javax.swing.JComboBox<String> TipoInmueble;
    private javax.swing.JButton btnQReserva;
    private javax.swing.JComboBox<String> cbLocalidad;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField supInmueble;
    private javax.swing.JLabel supInmuebleLbl;
    private javax.swing.JTextField supTerreno;
    private javax.swing.JLabel supTerrenoLbl;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarCampos(){
    Ac.setEnabled(false);
    Antiguedad.setEnabled(false);
    BAdjFotos.setVisible(false);
    BSelecProp.setVisible(false);
    Bano.setEnabled(false);
    Barrio.setEnabled(false);
    CP.setEnabled(false);;
    Calle.setEnabled(false);
    Depto.setEnabled(false);
     Dormitorio.setEnabled(false);
    Fondo.setEnabled(false);
    Frente.setEnabled(false);
     Garage.setEnabled(false);
     Gn.setEnabled(false);
     Lavadero.setEnabled(false);
     ListaFotos.setEnabled(false);
    Numero.setEnabled(false);
    Observaciones.setEnabled(false);
     Orientacion.setEnabled(false);
     Patio.setEnabled(false);
     Pavimento.setEnabled(false);
    Piso.setEnabled(false);
    Precio.setEnabled(false);
     Propietario.setEnabled(false);
     Telefono.setEnabled(false);
     TipoInmueble.setEnabled(false);
     cbLocalidad.setEnabled(false);
     cbProvincia.setEnabled(false);
    supInmueble.setEnabled(false);
    supTerreno.setEnabled(false);
    }
    private void setId(int id)
    {
        this.iDModif = id;
    }
    private void setAc(boolean Ac) {
        this.Ac.setSelected(Ac);
    }
    
    private void setAntiguedad(int Antiguedad) {
        if(Antiguedad==-1)
            this.Antiguedad.setText("");
        else
            this.Antiguedad.setText(String.valueOf(2016 - Antiguedad));
    }
    public void setPropietario(Cliente propietario){
        this.propietarioAux=propietario;
        this.Propietario.setText((propietario.getNombre() +" "+propietario.getApellido()+" Nº Doc: " +propietario.getNumeroDoc()));
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

    private void setFondo(double Fondo) {
        this.Fondo.setText(String.valueOf(Fondo));
    }

    private void setFrente(double Frente) {
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


    private void setPatio(boolean Patio) {
        this.Patio.setSelected(Patio);
    }

    private void setPavimento(boolean Pavimento) {
        this.Pavimento.setSelected(Pavimento);
    }

    private void setPiso(String Piso) {
        this.Piso.setText(Piso);
    }

    private void setPrecio(double Precio) {
        String resultado = String.format("%.2f", Precio);
        if ((Precio - (int)Precio)<0.00)
            this.Precio.setText(String.valueOf((int) Precio).replace(',', '.'));
        else{
            if(Precio<=999999999)
                this.Precio.setText(resultado.replace(',', '.'));
            else{
                resultado = String.format("%.1f", Precio);
                this.Precio.setText(resultado.replace(',', '.'));}}
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

    private void setSupInmueble(double supInmueble) {
        this.supInmueble.setText(String.valueOf(supInmueble));
    }

    private void setSupTerreno(double supTerreno) {
        this.supTerreno.setText(String.valueOf(supTerreno));
    }

    private int getEstado() {
        if (qReserva==1)
            return 0;
        return modificarInmueble.getEstado();
    }

    private void setBtnQReserva(boolean b) {
        this.btnQReserva.setVisible(b);
    }
    
}
