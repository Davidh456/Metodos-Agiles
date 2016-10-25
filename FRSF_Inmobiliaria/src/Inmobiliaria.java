/*Clase principal*/


import Clases.Cliente;
import Clases.Propietario;
import Interfaz.ABMClienteOPropietario;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inmobiliaria extends JFrame{
    //Aqu� vamos a declarar todas las sub-pantallas que vamos a usar
    private JPanel contentPane;
    private JPanel fondo;
    	
    JPanel AltaClienteOPropietario;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inmobiliaria frame = new Inmobiliaria();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
    Inmobiliaria(){
        setVisible(true);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Inmobiliaria.class.getResource("/javax/swing/plaf/metal/icons/ocean/menu.gif")));
        //Estas lineas son para crear el Frame Principal donde va a llamar a cada pantalla

        //Aqu� que dan las dimensiones segun la resoluci�n de pantalla
        Toolkit t = Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height-48);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cerrar();

        //Este contentPane es el JPanel que va a contener a toda la interfaz gr�fica
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBounds(0, 0, screenSize.width, screenSize.height-48);

        fondo = new JPanel();
        fondo.setBounds(0, (contentPane.getHeight()/2)-(contentPane.getHeight()/4), contentPane.getWidth(), contentPane.getHeight()/2);
        fondo.setBackground(new Color(190,190,250));
        
        // TODO 0 Aqu� vayan tirando los m�todos para ir probando las pantallas en la pantalla principal
        

    }
    public void cerrar(){
        this.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                        int opcion = JOptionPane.showOptionDialog(null, 
                                        "�Seguro que quiere salir?", "Cerrar", JOptionPane.YES_NO_OPTION, 2, null, new String[]{"Si","No"}, null);
                        if (opcion == 0){
					System.exit(0);
				}
				
			}
        });
    }

    private void AltaPropietario() {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "alta", null,null);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
    }
    private void ModificacionPropietario(Propietario propietario) {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "modificacion", null,propietario);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
    }
    private void BajaPropietario(Propietario propietario) {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("propietario", "baja", null,propietario);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
    }
    private void AltaCliente() {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "alta", null,null);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
    }
        private void ModificacionCliente(Cliente cliente) {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "modificacion", cliente,null);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
    }
    private void BajaCliente(Cliente cliente) {
        contentPane.removeAll();
        ABMClienteOPropietario pantallaABM = new ABMClienteOPropietario("cliente", "baja", cliente,null);
        pantallaABM.setBounds((contentPane.getWidth()/2)-(pantallaABM.getWidth()/2), 
							(contentPane.getHeight()/2)-(pantallaABM.getHeight()/2), 
							pantallaABM.getWidth(), 
							pantallaABM.getHeight());
        contentPane.add(pantallaABM);
        pantallaABM.setVisible(true);
        contentPane.repaint();
    }
    

}
