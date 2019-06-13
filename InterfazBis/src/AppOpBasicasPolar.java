import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import mundo.NumeroComplejo;
import mundo.Operacion;

import java.awt.SystemColor;

public class AppOpBasicasPolar {

	private JFrame frame;
	private JTextField resultadoModulo;
	private JTextField modulo_2;
	private JTextField modulo_1;
	private JTextField fase_1;
	private JTextField fase_2;
	private JTextField resultadoFase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppOpBasicasPolar window = new AppOpBasicasPolar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppOpBasicasPolar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 784, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCociente = new JButton("Cociente");
		btnCociente.setBackground(SystemColor.menu);
		btnCociente.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCociente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numMod_1,numFase_1,numMod_2,numFase_2,ansMod,ansFase;
				try {
					numMod_1=Float.parseFloat(modulo_1.getText());
					numFase_1=Float.parseFloat(fase_1.getText());
					numMod_2=Float.parseFloat(modulo_2.getText());
					numFase_2=Float.parseFloat(fase_2.getText());
					
					numero1.setModulo(numMod_1);
					numero1.setFase(numFase_1);
					
					numero2.setModulo(numMod_2);
					numero2.setFase(numFase_2);
					
					numero1.ObtenerParteImaginariayReal();
					numero2.ObtenerParteImaginariayReal();
					
					NumeroComplejo numeroResultado = operacionBasica.cociente(numero1, numero2);
					
					
					ansMod = numeroResultado.obtenerModulo();
					ansFase = numeroResultado.obtenerFase();
					
					resultadoModulo.setText(Float.toString(ansMod));
					resultadoFase.setText(Double.toString(ansFase));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}		
				
			}
		});
		
		JLabel label_14 = new JLabel("]");
		label_14.setFont(new Font("Arial", Font.PLAIN, 11));
		label_14.setBounds(360, 286, 19, 32);
		panel.add(label_14);
		
		resultadoFase = new JTextField();
		resultadoFase.setFont(new Font("Arial", Font.PLAIN, 11));
		resultadoFase.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoFase.setColumns(10);
		resultadoFase.setBackground(SystemColor.menu);
		resultadoFase.setBounds(320, 293, 32, 20);
		panel.add(resultadoFase);
		
		JLabel label_13 = new JLabel(";");
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		label_13.setBounds(307, 287, 12, 32);
		panel.add(label_13);
		
		JLabel label_12 = new JLabel("[");
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(259, 287, 19, 32);
		panel.add(label_12);
		btnCociente.setBounds(505, 252, 89, 23);
		panel.add(btnCociente);
		
		JButton btnMultiplicacin = new JButton("Multiplicaci\u00F3n");
		btnMultiplicacin.setBackground(SystemColor.menu);
		btnMultiplicacin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnMultiplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numMod_1,numFase_1,numMod_2,numFase_2,ansMod,ansFase;
				try {
					numMod_1=Float.parseFloat(modulo_1.getText());
					numFase_1=Float.parseFloat(fase_1.getText());
					numMod_2=Float.parseFloat(modulo_2.getText());
					numFase_2=Float.parseFloat(fase_2.getText());
					
					numero1.setModulo(numMod_1);
					numero1.setFase(numFase_1);
					
					numero2.setModulo(numMod_2);
					numero2.setFase(numFase_2);
					
					numero1.ObtenerParteImaginariayReal();
					numero2.ObtenerParteImaginariayReal();
					
					NumeroComplejo numeroResultado= operacionBasica.multiplicacion(numero1, numero2);
					
					
					ansMod = numeroResultado.obtenerModulo();
					ansFase = numeroResultado.obtenerFase();
					
					resultadoModulo.setText(Float.toString(ansMod));
					resultadoFase.setText(Double.toString(ansFase));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}		
				
			}
		});
		btnMultiplicacin.setBounds(395, 252, 100, 23);
		panel.add(btnMultiplicacin);
		
		JButton btnResta = new JButton("Resta");
		btnResta.setBackground(SystemColor.menu);
		btnResta.setFont(new Font("Arial", Font.PLAIN, 11));
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numMod_1,numFase_1,numMod_2,numFase_2,ansMod,ansFase;
				try {
					numMod_1=Float.parseFloat(modulo_1.getText());
					numFase_1=Float.parseFloat(fase_1.getText());
					numMod_2=Float.parseFloat(modulo_2.getText());
					numFase_2=Float.parseFloat(fase_2.getText());
					
					numero1.setModulo(numMod_1);
					numero1.setFase(numFase_1);
					
					numero2.setModulo(numMod_2);
					numero2.setFase(numFase_2);
					
					numero1.ObtenerParteImaginariayReal();
					numero2.ObtenerParteImaginariayReal();
					
					NumeroComplejo numeroResultado= operacionBasica.resta(numero1, numero2);
					
					
					ansMod = numeroResultado.obtenerModulo();
					ansFase = numeroResultado.obtenerFase();
					
					resultadoModulo.setText(Float.toString(ansMod));
					resultadoFase.setText(Double.toString(ansFase));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}		
				
			}
		});
		btnResta.setBounds(297, 252, 89, 23);
		panel.add(btnResta);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.setBackground(SystemColor.menu);
		btnSuma.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numMod_1,numFase_1,numMod_2,numFase_2,ansMod,ansFase;
				try {
					numMod_1=Float.parseFloat(modulo_1.getText());
					numFase_1=Float.parseFloat(fase_1.getText());
					numMod_2=Float.parseFloat(modulo_2.getText());
					numFase_2=Float.parseFloat(fase_2.getText());
					
					numero1.setModulo(numMod_1);
					numero1.setFase(numFase_1);
					
					numero2.setModulo(numMod_2);
					numero2.setFase(numFase_2);
					
					numero1.ObtenerParteImaginariayReal();
					numero2.ObtenerParteImaginariayReal();
					
					
					NumeroComplejo numeroResultado = operacionBasica.suma(numero1, numero2);
					
					//ansMod= numeroResultado.parteReal;
					//ansFase= numeroResultado.parteImaginaria;
					
					ansMod = numeroResultado.obtenerModulo();
					ansFase = numeroResultado.obtenerFase();
					
					resultadoModulo.setText(Float.toString(ansMod));
					resultadoFase.setText(Double.toString(ansFase));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}		
				
			}
		});
		btnSuma.setBounds(198, 253, 89, 23);
		panel.add(btnSuma);
		
		JLabel label_9 = new JLabel(";");
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(430, 135, 12, 32);
		panel.add(label_9);
		
		JLabel label_4 = new JLabel("Insertar un n\u00FAmero complejo:");
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setBounds(198, 136, 168, 32);
		panel.add(label_4);
		
		modulo_1 = new JTextField();
		modulo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		modulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		modulo_1.setColumns(10);
		modulo_1.setBounds(395, 142, 32, 20);
		panel.add(modulo_1);
		
		JLabel label_5 = new JLabel("Realizar Operaciones B\u00E1sicas");
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setFont(new Font("Arial", Font.PLAIN, 15));
		label_5.setBounds(198, 100, 214, 32);
		panel.add(label_5);
		
		JButton button = new JButton(" Volver al Inicio");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		button.setBackground(SystemColor.menu);
		button.setFont(new Font("Arial", Font.PLAIN, 11));
		button.setBounds(198, 330, 154, 32);
		panel.add(button);
		
		JLabel label_2 = new JLabel("Seleccionar Operaci\u00F3n:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(198, 210, 140, 32);
		panel.add(label_2);
		
		fase_1 = new JTextField();
		fase_1.setFont(new Font("Arial", Font.PLAIN, 11));
		fase_1.setHorizontalAlignment(SwingConstants.CENTER);
		fase_1.setColumns(10);
		fase_1.setBounds(437, 142, 32, 20);
		panel.add(fase_1);
		
		JLabel label_7 = new JLabel("[");
		label_7.setFont(new Font("Arial", Font.PLAIN, 11));
		label_7.setBounds(387, 173, 19, 32);
		panel.add(label_7);
		
		resultadoModulo = new JTextField();
		resultadoModulo.setFont(new Font("Arial", Font.PLAIN, 11));
		resultadoModulo.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoModulo.setBackground(SystemColor.menu);
		resultadoModulo.setColumns(10);
		resultadoModulo.setBounds(269, 293, 32, 20);
		panel.add(resultadoModulo);
		
		JLabel label_10 = new JLabel("]");
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(473, 172, 19, 32);
		panel.add(label_10);
		
		JLabel label_1 = new JLabel("Resultado:");
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(198, 286, 140, 32);
		panel.add(label_1);
		
		modulo_2 = new JTextField();
		modulo_2.setFont(new Font("Arial", Font.PLAIN, 11));
		modulo_2.setHorizontalAlignment(SwingConstants.CENTER);
		modulo_2.setColumns(10);
		modulo_2.setBounds(395, 179, 32, 20);
		panel.add(modulo_2);
		
		JLabel label_11 = new JLabel("]");
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(473, 135, 19, 32);
		panel.add(label_11);
		
		JLabel label_3 = new JLabel("Inserte otro numero complejo:");
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(198, 173, 182, 32);
		panel.add(label_3);
		
		fase_2 = new JTextField();
		fase_2.setFont(new Font("Arial", Font.PLAIN, 11));
		fase_2.setHorizontalAlignment(SwingConstants.CENTER);
		fase_2.setColumns(10);
		fase_2.setBounds(437, 179, 32, 20);
		panel.add(fase_2);
		
		JLabel label_8 = new JLabel(";");
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(430, 172, 12, 32);
		panel.add(label_8);
		
		JLabel label_6 = new JLabel("[");
		label_6.setFont(new Font("Arial", Font.PLAIN, 11));
		label_6.setBounds(387, 136, 19, 32);
		panel.add(label_6);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppOpBasicasPolar.class.getResource("/images/VentanaPrincipal2.png")));
		label.setBounds(0, 0, 784, 461);
		panel.add(label);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
