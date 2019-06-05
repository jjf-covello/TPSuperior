import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import mundo.NumeroComplejo;
import mundo.Operacion;
import mundo.OperacionesAvanzadas;

public class AppOpAvanzadasBin {

	private JFrame frame;
	private JTextField parteIm_1;
	private JTextField grado;
	private JTextField parteReal_1;
	private JTextField resultadoParteReal;
	private JTextField resultadoParteIm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppOpAvanzadasBin window = new AppOpAvanzadasBin();
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
	public AppOpAvanzadasBin() {
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
		
		JButton btnRadicacin = new JButton("Radicaci\u00F3n");
		btnRadicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				OperacionesAvanzadas operacionAvanzada= new OperacionesAvanzadas();
				
				float numReal_1,numIm_1,ansReal,ansIm;
				int numGrado;
				
				try {
					numReal_1=Float.parseFloat(parteReal_1.getText());
					numIm_1=Float.parseFloat(parteIm_1.getText());
					numGrado=Integer.parseInt(grado.getText());
					
					numero1.setParteReal(numReal_1);
					numero1.setParteImaginaria(numIm_1);
					numero1.setFase(numero1.obtenerFase());
					numero1.setModulo(numero1.obtenerModulo());
				
					
					NumeroComplejo numeroResultado= operacionAvanzada.radicacion(numero1, numGrado);
					
					ansReal = numeroResultado.getParteReal();
					ansIm = numeroResultado.getParteImaginaria();
					
					resultadoParteReal.setText(Float.toString(ansReal));
					resultadoParteIm.setText(Float.toString(ansIm));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		btnRadicacin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnRadicacin.setBackground(SystemColor.menu);
		btnRadicacin.setBounds(317, 245, 110, 23);
		panel.add(btnRadicacin);
		
		JButton btnPotenciacin = new JButton("Potenciaci\u00F3n");
		btnPotenciacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				OperacionesAvanzadas operacionAvanzada= new OperacionesAvanzadas();
				
				float numReal_1,numIm_1,ansReal,ansIm;
				int numGrado;
				
				try {
					numReal_1=Float.parseFloat(parteReal_1.getText());
					numIm_1=Float.parseFloat(parteIm_1.getText());
					numGrado=Integer.parseInt(grado.getText());
					
					numero1.setParteReal(numReal_1);
					numero1.setParteImaginaria(numIm_1);
					numero1.setFase(numero1.obtenerFase());
					numero1.setModulo(numero1.obtenerModulo());
				
					
					NumeroComplejo numeroResultado= operacionAvanzada.potenciacion(numero1, numGrado);
					
					ansReal = numeroResultado.getParteReal();
					ansIm = numeroResultado.getParteImaginaria();
					
					resultadoParteReal.setText(Float.toString(ansReal));
					resultadoParteIm.setText(Float.toString(ansIm));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		btnPotenciacin.setBackground(SystemColor.menu);
		btnPotenciacin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnPotenciacin.setBounds(194, 245, 110, 23);
		panel.add(btnPotenciacin);
		
		JLabel label_11 = new JLabel("j");
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(479, 284, 26, 32);
		panel.add(label_11);
		
		resultadoParteIm = new JTextField();
		resultadoParteIm.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoParteIm.setFont(new Font("Arial", Font.PLAIN, 11));
		resultadoParteIm.setEditable(false);
		resultadoParteIm.setColumns(10);
		resultadoParteIm.setBackground(SystemColor.menu);
		resultadoParteIm.setBounds(386, 287, 83, 23);
		panel.add(resultadoParteIm);
		
		JLabel label_10 = new JLabel("+");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(344, 284, 44, 26);
		panel.add(label_10);
		
		JLabel label_2 = new JLabel("j");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(545, 141, 26, 23);
		panel.add(label_2);
		
		JLabel label_6 = new JLabel("Realizar Operaciones Avanzadas");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		label_6.setBounds(194, 98, 244, 32);
		panel.add(label_6);
		
		JLabel label_5 = new JLabel("Insertar un n\u00FAmero complejo:");
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(194, 134, 182, 32);
		panel.add(label_5);
		
		JLabel lblIngresarGrado = new JLabel("Ingresar grado:");
		lblIngresarGrado.setFont(new Font("Arial", Font.PLAIN, 11));
		lblIngresarGrado.setBounds(194, 171, 110, 32);
		panel.add(lblIngresarGrado);
		
		resultadoParteReal = new JTextField();
		resultadoParteReal.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoParteReal.setBackground(SystemColor.menu);
		resultadoParteReal.setFont(new Font("Arial", Font.PLAIN, 11));
		resultadoParteReal.setEditable(false);
		resultadoParteReal.setColumns(10);
		resultadoParteReal.setBounds(267, 287, 83, 23);
		panel.add(resultadoParteReal);
		
		parteReal_1 = new JTextField();
		parteReal_1.setHorizontalAlignment(SwingConstants.CENTER);
		parteReal_1.setFont(new Font("Arial", Font.PLAIN, 11));
		parteReal_1.setColumns(10);
		parteReal_1.setBounds(344, 141, 83, 23);
		panel.add(parteReal_1);
		
		JLabel label_8 = new JLabel("Seleccionar Operaci\u00F3n:");
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(194, 208, 140, 32);
		panel.add(label_8);
		
		grado = new JTextField();
		grado.setHorizontalAlignment(SwingConstants.CENTER);
		grado.setFont(new Font("Arial", Font.PLAIN, 11));
		grado.setColumns(10);
		grado.setBounds(279, 176, 83, 23);
		panel.add(grado);
		
		parteIm_1 = new JTextField();
		parteIm_1.setHorizontalAlignment(SwingConstants.CENTER);
		parteIm_1.setFont(new Font("Arial", Font.PLAIN, 11));
		parteIm_1.setColumns(10);
		parteIm_1.setBounds(457, 141, 83, 23);
		panel.add(parteIm_1);
		
		JLabel label_3 = new JLabel("+");
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(419, 141, 44, 23);
		panel.add(label_3);
		
		JLabel label_9 = new JLabel("Resultado:");
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(194, 284, 140, 32);
		panel.add(label_9);
		
		JButton button = new JButton(" Volver al Inicio");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		button.setBackground(SystemColor.menu);
		button.setFont(new Font("Arial", Font.PLAIN, 11));
		button.setBounds(194, 328, 154, 23);
		panel.add(button);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppOpAvanzadasBin.class.getResource("/images/VentanaPrincipal2.png")));
		label.setBounds(0, 0, 784, 461);
		panel.add(label);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
