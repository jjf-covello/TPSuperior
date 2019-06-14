import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import mundo.NumeroComplejo;
import mundo.Operacion;

public class AppOpBasicasBin {

	private JFrame frame;
	private JTextField resultadoParteReal;
	private JTextField parteReal_2;
	private JTextField parteIm_2;
	private JTextField parteIm_1;
	private JTextField parteReal_1;
	private JTextField resultadoParteIm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppOpBasicasBin window = new AppOpBasicasBin();
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
	public AppOpBasicasBin() {
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
		panel.setBounds(0, 0, 783, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numReal_1,numIm_1,numReal_2,numIm_2;
				String ansReal,ansIm;
				try {
					numReal_1=Float.parseFloat(parteReal_1.getText());
					numIm_1=Float.parseFloat(parteIm_1.getText());
					numReal_2=Float.parseFloat(parteReal_2.getText());
					numIm_2=Float.parseFloat(parteIm_2.getText());
					
					numero1.setParteReal(numReal_1);
					numero1.setParteImaginaria(numIm_1);
					
					numero2.setParteReal(numReal_2);
					numero2.setParteImaginaria(numIm_2);
					
					
					NumeroComplejo numeroResultado= operacionBasica.suma(numero1, numero2);
					
					DecimalFormat df = new DecimalFormat("#.###");
					
					ansReal = df.format(numeroResultado.getParteReal());
					ansIm = df.format(numeroResultado.getParteImaginaria());
					
					resultadoParteReal.setText(ansReal);
					resultadoParteIm.setText(ansIm);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		
		JButton btnCociente = new JButton("Cociente");
		btnCociente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numReal_1,numIm_1,numReal_2,numIm_2;
				String ansReal,ansIm;
				try {
					numReal_1=Float.parseFloat(parteReal_1.getText());
					numIm_1=Float.parseFloat(parteIm_1.getText());
					numReal_2=Float.parseFloat(parteReal_2.getText());
					numIm_2=Float.parseFloat(parteIm_2.getText());
					
					numero1.setParteReal(numReal_1);
					numero1.setParteImaginaria(numIm_1);
					
					numero2.setParteReal(numReal_2);
					numero2.setParteImaginaria(numIm_2);
					
					
					NumeroComplejo numeroResultado= operacionBasica.cociente(numero1, numero2);
					
					DecimalFormat df = new DecimalFormat("#.###");
					
					ansReal = df.format(numeroResultado.getParteReal());
					ansIm = df.format(numeroResultado.getParteImaginaria());
					
					resultadoParteReal.setText(ansReal);
					resultadoParteIm.setText(ansIm);
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		
		JLabel label_10 = new JLabel("j");
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(479, 284, 26, 32);
		panel.add(label_10);
		
		JLabel label_3 = new JLabel("+");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(345, 284, 44, 23);
		panel.add(label_3);
		
		resultadoParteIm = new JTextField();
		resultadoParteIm.setEditable(false);
		resultadoParteIm.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoParteIm.setColumns(10);
		resultadoParteIm.setBackground(SystemColor.menu);
		resultadoParteIm.setBounds(381, 284, 89, 26);
		panel.add(resultadoParteIm);
		btnCociente.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCociente.setBackground(SystemColor.menu);
		btnCociente.setBounds(504, 250, 89, 23);
		panel.add(btnCociente);
		
		JButton btnMultiplicacin = new JButton("Multiplicaci\u00F3n");
		btnMultiplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numReal_1,numIm_1,numReal_2,numIm_2;
				String ansReal,ansIm;
				try {
					numReal_1=Float.parseFloat(parteReal_1.getText());
					numIm_1=Float.parseFloat(parteIm_1.getText());
					numReal_2=Float.parseFloat(parteReal_2.getText());
					numIm_2=Float.parseFloat(parteIm_2.getText());
					
					numero1.setParteReal(numReal_1);
					numero1.setParteImaginaria(numIm_1);
					
					numero2.setParteReal(numReal_2);
					numero2.setParteImaginaria(numIm_2);
					
					
					NumeroComplejo numeroResultado= operacionBasica.multiplicacion(numero1, numero2);
					
					DecimalFormat df = new DecimalFormat("#.###");
					
					ansReal = df.format(numeroResultado.getParteReal());
					ansIm = df.format(numeroResultado.getParteImaginaria());
					
					resultadoParteReal.setText(ansReal);
					resultadoParteIm.setText(ansIm);
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		btnMultiplicacin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnMultiplicacin.setBackground(SystemColor.menu);
		btnMultiplicacin.setBounds(393, 250, 101, 23);
		panel.add(btnMultiplicacin);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumeroComplejo numero1= new NumeroComplejo();
				NumeroComplejo numero2= new NumeroComplejo();
				Operacion operacionBasica= new Operacion();
				
				float numReal_1,numIm_1,numReal_2,numIm_2;
				String ansReal,ansIm;
				try {
					numReal_1=Float.parseFloat(parteReal_1.getText());
					numIm_1=Float.parseFloat(parteIm_1.getText());
					numReal_2=Float.parseFloat(parteReal_2.getText());
					numIm_2=Float.parseFloat(parteIm_2.getText());
					
					numero1.setParteReal(numReal_1);
					numero1.setParteImaginaria(numIm_1);
					
					numero2.setParteReal(numReal_2);
					numero2.setParteImaginaria(numIm_2);
					
					
					NumeroComplejo numeroResultado= operacionBasica.resta(numero1, numero2);
					
					DecimalFormat df = new DecimalFormat("#.###");
					
					ansReal = df.format(numeroResultado.getParteReal());
					ansIm = df.format(numeroResultado.getParteImaginaria());
					
					resultadoParteReal.setText(ansReal);
					resultadoParteIm.setText(ansIm);
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros validos");
				}
			}
		});
		btnResta.setFont(new Font("Arial", Font.PLAIN, 11));
		btnResta.setBackground(SystemColor.menu);
		btnResta.setBounds(294, 250, 89, 23);
		panel.add(btnResta);
		btnSuma.setBackground(SystemColor.menu);
		btnSuma.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSuma.setBounds(195, 250, 89, 23);
		panel.add(btnSuma);
		
		JLabel label_1 = new JLabel("Resultado:");
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(195, 284, 140, 32);
		panel.add(label_1);
		
		JLabel lblInserteOtroNmero = new JLabel("Inserte otro n\u00FAmero complejo:");
		lblInserteOtroNmero.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInserteOtroNmero.setBounds(195, 171, 182, 32);
		panel.add(lblInserteOtroNmero);
		
		resultadoParteReal = new JTextField();
		resultadoParteReal.setEditable(false);
		resultadoParteReal.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoParteReal.setBackground(SystemColor.menu);
		resultadoParteReal.setColumns(10);
		resultadoParteReal.setBounds(268, 284, 89, 26);
		panel.add(resultadoParteReal);
		
		parteReal_2 = new JTextField();
		parteReal_2.setHorizontalAlignment(SwingConstants.CENTER);
		parteReal_2.setColumns(10);
		parteReal_2.setBounds(351, 171, 83, 32);
		panel.add(parteReal_2);
		
		JLabel label_8 = new JLabel("Insertar un n\u00FAmero complejo:");
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(195, 134, 182, 32);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Realizar Operaciones B\u00E1sicas");
		label_9.setForeground(Color.DARK_GRAY);
		label_9.setFont(new Font("Arial", Font.PLAIN, 15));
		label_9.setBounds(195, 98, 222, 32);
		panel.add(label_9);
		
		JLabel label_5 = new JLabel("j");
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(552, 171, 26, 32);
		panel.add(label_5);
		
		JLabel label_2 = new JLabel("Seleccionar Operaci\u00F3n:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(195, 208, 140, 32);
		panel.add(label_2);
		
		parteIm_2 = new JTextField();
		parteIm_2.setHorizontalAlignment(SwingConstants.CENTER);
		parteIm_2.setColumns(10);
		parteIm_2.setBounds(464, 171, 83, 32);
		panel.add(parteIm_2);
		
		parteReal_1 = new JTextField();
		parteReal_1.setHorizontalAlignment(SwingConstants.CENTER);
		parteReal_1.setColumns(10);
		parteReal_1.setBounds(351, 134, 83, 32);
		panel.add(parteReal_1);
		
		JButton btnVolverAlInicio = new JButton("Volver al Inicio");
		btnVolverAlInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		btnVolverAlInicio.setFont(new Font("Arial", Font.PLAIN, 11));
		btnVolverAlInicio.setBackground(SystemColor.menu);
		btnVolverAlInicio.setBounds(195, 328, 154, 32);
		panel.add(btnVolverAlInicio);
		
		parteIm_1 = new JTextField();
		parteIm_1.setHorizontalAlignment(SwingConstants.CENTER);
		parteIm_1.setColumns(10);
		parteIm_1.setBounds(464, 134, 83, 32);
		panel.add(parteIm_1);
		
		JLabel label_6 = new JLabel("j");
		label_6.setFont(new Font("Arial", Font.PLAIN, 11));
		label_6.setBounds(552, 134, 26, 32);
		panel.add(label_6);
		
		JLabel label_4 = new JLabel("+");
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(426, 171, 44, 32);
		panel.add(label_4);
		
		JLabel label_7 = new JLabel("+");
		label_7.setFont(new Font("Arial", Font.PLAIN, 11));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(426, 134, 44, 32);
		panel.add(label_7);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppOpBasicasBin.class.getResource("/images/VentanaPrincipal2.png")));
		label.setBounds(0, 0, 783, 461);
		panel.add(label);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
