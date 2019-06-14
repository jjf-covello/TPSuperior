package Interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import mundo.NumeroComplejo;
import mundo.OperacionesAvanzadas;

import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AppOpAvanzadasPolar {

	private JFrame frame;
	private JTextField modulo_1;
	private JTextField grado;
	private JTextField fase_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppOpAvanzadasPolar window = new AppOpAvanzadasPolar();
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
	public AppOpAvanzadasPolar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		JList list = new JList();
		list.setFont(new Font("Arial", Font.PLAIN, 11));
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
				
				float numMod,numFase,ansMod,ansFase;
				int numGrado;

				
				try {
					numMod=Float.parseFloat(modulo_1.getText());
					numFase=Float.parseFloat(fase_1.getText());
					numGrado=Integer.parseInt(grado.getText());
					
					//numero1.setParteReal(numReal_1);
					//numero1.setParteImaginaria(numIm_1);
					numero1.setFase(numFase);
					numero1.setModulo(numMod);
					numero1.ObtenerParteImaginariayReal();
				
					
					NumeroComplejo numeroResultado = operacionAvanzada.radicacion(numero1, numGrado);
					
					//ansMod = numeroResultado.obtenerModulo();
					//ansFase = numeroResultado.obtenerFase();
					
					DefaultListModel DLM = new DefaultListModel();
					List<String> resultadoFinal = numeroResultado.mostrarSolucionesPolar();
					
					DLM.addElement("Los resultados son: ");
					list.setModel(DLM);
					
					
					for(int i=0;i<resultadoFinal.size();i++) {
						DLM.addElement(resultadoFinal.get(i));
						list.setModel(DLM);
					}
					
					List<String> resultadoPrimitivas = numeroResultado.mostrarRaicesPrimitivasPolar();
					
					DLM.addElement("Las raices primitivas son: ");
					list.setModel(DLM);
					
					
					for(int i=0;i<resultadoPrimitivas.size();i++) {
						DLM.addElement(resultadoPrimitivas.get(i));
						list.setModel(DLM);
					}
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(203, 247, 355, 75);
		panel.add(scrollPane);
		
		scrollPane.setViewportView(list);
		btnRadicacin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnRadicacin.setBackground(SystemColor.menu);
		btnRadicacin.setBounds(445, 213, 113, 23);
		panel.add(btnRadicacin);
		
		JButton btnNewButton = new JButton("Potenciaci\u00F3n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NumeroComplejo numero1= new NumeroComplejo();
				OperacionesAvanzadas operacionAvanzada= new OperacionesAvanzadas();
				
				float numMod,numFase,ansMod,ansFase;
				int numGrado;
				
				try {
					numMod=Float.parseFloat(modulo_1.getText());
					numFase=Float.parseFloat(fase_1.getText());
					numGrado=Integer.parseInt(grado.getText());
					
					//numero1.setParteReal(numReal_1);
					//numero1.setParteImaginaria(numIm_1);
					numero1.setFase(numFase);
					numero1.setModulo(numMod);
					numero1.ObtenerParteImaginariayReal();
				
					NumeroComplejo numeroResultado = new NumeroComplejo();
					numeroResultado = operacionAvanzada.potenciacion(numero1, numGrado);
					
					ansMod = numeroResultado.obtenerModulo();
					ansFase = numeroResultado.obtenerFase();
					
					//ansReal = numeroResultado.getParteReal();
					//ansIm= numeroResultado.getParteImaginaria();
					
					
					//DecimalFormat df = new DecimalFormat("#.###");
					//String x = df.format(ansFase);
					//ansFase = Double.valueOf(x);
					
					DecimalFormat df = new DecimalFormat("#.###");
					DefaultListModel DLM = new DefaultListModel();
					DLM.addElement("Resultado: [ " + df.format(ansMod) + " , " + df.format(ansFase) + " ]");
					//DLM.addElement("Forma Binomica: "+Math.round(ansReal)+" + "+ansIm+" j");
					list.setModel(DLM);
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBounds(322, 213, 113, 23);
		panel.add(btnNewButton);
		
		JLabel label_11 = new JLabel("]");
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(439, 133, 19, 32);
		panel.add(label_11);
		
		JLabel label_1 = new JLabel("Realizar Operaciones Avanzadas");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("Arial", Font.PLAIN, 15));
		label_1.setBounds(203, 98, 262, 32);
		panel.add(label_1);
		
		modulo_1 = new JTextField();
		modulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		modulo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		modulo_1.setColumns(10);
		modulo_1.setBounds(361, 140, 32, 20);
		panel.add(modulo_1);
		
		fase_1 = new JTextField();
		fase_1.setHorizontalAlignment(SwingConstants.CENTER);
		fase_1.setFont(new Font("Arial", Font.PLAIN, 11));
		fase_1.setColumns(10);
		fase_1.setBounds(403, 140, 32, 20);
		panel.add(fase_1);
		
		grado = new JTextField();
		grado.setHorizontalAlignment(SwingConstants.CENTER);
		grado.setFont(new Font("Arial", Font.PLAIN, 11));
		grado.setColumns(10);
		grado.setBounds(284, 177, 113, 20);
		panel.add(grado);
		
		JLabel lblInserteGrado = new JLabel("Inserte grado:");
		lblInserteGrado.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInserteGrado.setBounds(203, 171, 182, 32);
		panel.add(lblInserteGrado);
		
		JLabel label_9 = new JLabel(";");
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(396, 133, 12, 32);
		panel.add(label_9);
		
		JButton button = new JButton(" Volver al Inicio");
		button.setBackground(SystemColor.menu);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		button.setFont(new Font("Arial", Font.PLAIN, 11));
		button.setBounds(203, 328, 154, 23);
		panel.add(button);
		
		JLabel label_2 = new JLabel("Insertar un n\u00FAmero complejo:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(203, 134, 159, 32);
		panel.add(label_2);
		
		JLabel label_7 = new JLabel("[");
		label_7.setFont(new Font("Arial", Font.PLAIN, 11));
		label_7.setBounds(353, 134, 19, 32);
		panel.add(label_7);
		
		JLabel label_4 = new JLabel("Seleccionar Operaci\u00F3n:");
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setBounds(203, 208, 140, 32);
		panel.add(label_4);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppOpAvanzadasPolar.class.getResource("/images/VentanaPrincipal2.png")));
		label.setBounds(0, 0, 784, 461);
		panel.add(label);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
