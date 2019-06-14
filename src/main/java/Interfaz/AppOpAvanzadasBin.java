package Interfaz;
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
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import mundo.NumeroComplejo;
import mundo.Operacion;
import mundo.OperacionesAvanzadas;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;




import java.text.DecimalFormat;

public class AppOpAvanzadasBin {

	private JFrame frame;
	private JTextField parteIm_1;
	private JTextField grado;
	private JTextField parteReal_1;

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
		JList list = new JList();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 784, 461);
		frame.getContentPane().add(panel);
		JButton btnRadicacin = new JButton("Radicaci\u00F3n");
		btnRadicacin.setBounds(441, 213, 110, 23);
		btnRadicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				OperacionesAvanzadas operacionAvanzada= new OperacionesAvanzadas();
				
				float numReal_1,numIm_1;
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
					
					DefaultListModel DLM = new DefaultListModel();
					List<String> resultadoFinal = numeroResultado.mostrarSoluciones();
					
					DLM.addElement("Los resultados son: ");
					list.setModel(DLM);
					
					for(int i=0;i<resultadoFinal.size();i++) {
						DLM.addElement(resultadoFinal.get(i));
						list.setModel(DLM);
					}
					
					List<String> resultadoPrimitivas = numeroResultado.mostrarRaicesPrimitivas();
					
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
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(194, 250, 384, 67);
		panel.add(scrollPane);
		
		scrollPane.setViewportView(list);
		list.setFont(new Font("Arial", Font.PLAIN, 11));
		btnRadicacin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnRadicacin.setBackground(SystemColor.menu);
		panel.add(btnRadicacin);
		
		JButton btnPotenciacin = new JButton("Potenciaci\u00F3n");
		btnPotenciacin.setBounds(321, 213, 110, 23);
		btnPotenciacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				OperacionesAvanzadas operacionAvanzada= new OperacionesAvanzadas();
				
				float numReal_1,numIm_1,ansMod,ansReal,ansIm,ansFase;
				int numGrado;
				
				try {
					numReal_1=Float.parseFloat(parteReal_1.getText());
					numIm_1=Float.parseFloat(parteIm_1.getText());
					numGrado=Integer.parseInt(grado.getText());
					
					numero1.setParteReal(numReal_1);
					numero1.setParteImaginaria(numIm_1);
					numero1.setFase(numero1.obtenerFase());
					numero1.setModulo(numero1.obtenerModulo());
				
					NumeroComplejo numeroResultado = new NumeroComplejo();
					numeroResultado= operacionAvanzada.potenciacion(numero1, numGrado);
					
					ansMod = numeroResultado.obtenerModulo();
					ansFase = numeroResultado.obtenerFase();
					
					ansReal = numeroResultado.getParteReal();
					ansIm= numeroResultado.getParteImaginaria();
					
					
					//DecimalFormat df = new DecimalFormat("#.###");
					//String x = df.format(ansFase);
					//ansFase = Double.valueOf(x);
					
					DecimalFormat df = new DecimalFormat("#.###");
					DefaultListModel DLM = new DefaultListModel();
					//DLM.addElement("Forma Polar : [ " + ansMod + " , " + ansFase + " ]");
					DLM.addElement("Resultado: "+df.format(ansReal)+" + "+df.format(ansIm)+" j");
					list.setModel(DLM);
					//List<String> resultadoFinal = numeroResultado.mostrarSoluciones();
					
					//for(int i=0;i<resultadoFinal.size();i++) {
						//DLM.addElement(resultadoFinal.get(i));
						//list.setModel(DLM);
					//}
					
				
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		btnPotenciacin.setBackground(SystemColor.menu);
		btnPotenciacin.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(btnPotenciacin);
		
		JLabel label_2 = new JLabel("j");
		label_2.setBounds(545, 141, 26, 23);
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(label_2);
		
		JLabel label_6 = new JLabel("Realizar Operaciones Avanzadas");
		label_6.setBounds(194, 98, 244, 32);
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(label_6);
		
		JLabel label_5 = new JLabel("Insertar un n\u00FAmero complejo:");
		label_5.setBounds(194, 134, 182, 32);
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(label_5);
		
		JLabel lblIngresarGrado = new JLabel("Ingresar grado:");
		lblIngresarGrado.setBounds(194, 171, 110, 32);
		lblIngresarGrado.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(lblIngresarGrado);
		
		parteReal_1 = new JTextField();
		parteReal_1.setBounds(344, 141, 83, 23);
		parteReal_1.setHorizontalAlignment(SwingConstants.CENTER);
		parteReal_1.setFont(new Font("Arial", Font.PLAIN, 11));
		parteReal_1.setColumns(10);
		panel.add(parteReal_1);
		
		JLabel label_8 = new JLabel("Seleccionar Operaci\u00F3n:");
		label_8.setBounds(194, 208, 140, 32);
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(label_8);
		
		grado = new JTextField();
		grado.setBounds(279, 176, 83, 23);
		grado.setHorizontalAlignment(SwingConstants.CENTER);
		grado.setFont(new Font("Arial", Font.PLAIN, 11));
		grado.setColumns(10);
		panel.add(grado);
		
		parteIm_1 = new JTextField();
		parteIm_1.setBounds(457, 141, 83, 23);
		parteIm_1.setHorizontalAlignment(SwingConstants.CENTER);
		parteIm_1.setFont(new Font("Arial", Font.PLAIN, 11));
		parteIm_1.setColumns(10);
		panel.add(parteIm_1);
		
		JLabel label_3 = new JLabel("+");
		label_3.setBounds(419, 141, 44, 23);
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_3);
		
		JButton button = new JButton(" Volver al Inicio");
		button.setBounds(194, 328, 154, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		button.setBackground(SystemColor.menu);
		button.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(button);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 784, 461);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppOpAvanzadasBin.class.getResource("/images/VentanaPrincipal2.png")));
		panel.add(label);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
