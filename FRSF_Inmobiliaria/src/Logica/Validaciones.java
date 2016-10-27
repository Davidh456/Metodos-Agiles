package Logica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;

public class Validaciones {
	private int focus = 0;
	
	public Validaciones(){
		super();
	}
	/*
	private static Validaciones instancia = null;
	
	public static Validaciones getInstance(){
		if(instancia == null){
			instancia = new Validaciones();
		}
		return instancia;
	}*/

        public void CampoObligatorio(JTextField[] campos, JPanel panel){
	/* Esta clase es para comprobar los campos obligatorios, hay que mandar el jpanel que contiene los
        *  text fields y una lista con los que son obligatorios.
        *  Ej: JTextField[] campos = new JTextField{campo1, campo2, campo3}
        *      Validaciones.CampoObligatorio(campos, this);
        */ 
		final JLabel lblCampoObligatorio = new JLabel("Campo obligatorio");
		lblCampoObligatorio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCampoObligatorio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCampoObligatorio.setForeground(Color.RED);
		lblCampoObligatorio.setVisible(false);
		panel.add(lblCampoObligatorio);
		for(int i = 0; i<campos.length;i++){
			final JTextField auxTF = campos[i];					
			campos[i].addFocusListener(new FocusAdapter() {
				public void focusGained(FocusEvent arg0) {
					lblCampoObligatorio.setBounds(100, auxTF.getY()+auxTF.getHeight()-1, 
							auxTF.getX()+auxTF.getWidth()-100, 11);
					lblCampoObligatorio.setVisible(true);
					focus = 1;
				}
				public void focusLost(FocusEvent arg0){
					lblCampoObligatorio.setVisible(false);
					focus = 0;
				}
			});

			campos[i].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent arg0) {
					if(focus==0){
						lblCampoObligatorio.setBounds(100, auxTF.getY()+auxTF.getHeight()-1, 
													auxTF.getX()+auxTF.getWidth()-100, 11);
						lblCampoObligatorio.setVisible(true);
					}
				}
				public void mouseExited(MouseEvent arg0) {
					if(focus==0){
						lblCampoObligatorio.setVisible(false);
					}
				}
			});
		}
	}
	public void Pintar(JTextField[] field, JLabel[] label){
		for (int i=0; i<field.length;i++){
			if (field[i].getText().equals("")){
				label[i].setForeground(new Color(255,0,10));
				field[i].setBackground(new Color(250,180,180));
				field[i].setBorder(new LineBorder(new Color(255,0,20)));
			}
			else{
				label[i].setForeground((new JLabel()).getForeground());
				field[i].setBackground((new JTextField()).getBackground());
				field[i].setBorder((new JTextField()).getBorder());
			}
		}
	}
	public boolean ValidarEmail(JTextField tf){
		String email = tf.getText();
		String segundaParte = new String();
		int i = 0;
		char letra = 0;
		if(email.contains("@")){
			if(email.charAt(0)=='@'){
				return false;
			}
			else{
				while(letra!='@'){
					letra = email.charAt(i);
					i++;	
				}
				segundaParte = email.substring(i, email.length());
				if(segundaParte.contains("@")||!segundaParte.contains(".")||
						segundaParte.charAt(0)=='.'||segundaParte.charAt(segundaParte.length()-1)=='.'){
					return false;
				}
				else{
					return true;
				}
				
			}
		}
		return false;
		
	}
	public boolean CamposVacios(JTextField[] campos, JPasswordField[] contrasenia){
		if (campos!=null){
			for (int i = 0;i< campos.length;i++){
				if (campos[i].getText().equals("")){
					return true;
				}
			}
		}
		if (contrasenia!=null){
			for (int i = 0; i< contrasenia.length;i++){
				if (Arrays.equals(contrasenia[i].getPassword(),new char[]{})){
					return true;
				}
			}	
		}
		
		return false;
	}
	public void CaracteresMaximos(final JTextField tf, final int limite,final String tipo) { 
		tf.addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent e){
				if (tf.getText().length()== limite){
					e.consume();
				}
				char caracter = e.getKeyChar();

			    //que no sea letra 
			    if( !(((caracter >= 'A')&&(caracter <= 'z'))||caracter==127||caracter==8||caracter==32)&& tipo.equals("alfabetico")){
			    	JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras","¡CUIDADO!",JOptionPane.ERROR_MESSAGE);
			    	e.consume();
			    }
				
				//que no sea número
				if(!(((caracter >= '0')&&(caracter <= '9'))||caracter==127||caracter==8||caracter==32) && tipo.equals("numerico")){
					JOptionPane.showMessageDialog(null, "Solo se pueden ingresar números","¡CUIDADO!",JOptionPane.ERROR_MESSAGE);
			    	e.consume();
			    }
			}
			public void keyPressed(KeyEvent arg0) {
			}
			public void keyReleased(KeyEvent arg0) {
			}
		});
	}
	public boolean ContraseniasIguales(JPasswordField contrasenia1, JPasswordField contrasenia2){
		return (Arrays.equals(contrasenia1.getPassword(),contrasenia2.getPassword()));
	}
	public boolean CaracteresMinimos(final JTextField tf, final int limite){
		return (tf.getText().length() >= limite);
		// el campo TextField no puede ser menor al límite inferior
	}
	public void reiniciarCampos(JTextField[] field, JLabel[] label) {
		for (int i=0; i<field.length;i++){
			label[i].setForeground((new JLabel()).getForeground());
			field[i].setBackground((new JTextField()).getBackground());
			field[i].setBorder((new JTextField()).getBorder());
		}
	}
}
