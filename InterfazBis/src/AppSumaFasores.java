import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import mundo.SumaDeFasores;
import mundo.TienenDistintoFrecuenciaException;
import mundo.Fasores;

public class AppSumaFasores {

	private JFrame frame;
	private JTextField resultadoAmplitud;
	private JTextField amplitud_1;
	private JTextField amplitud_2;
	private JTextField frecuencia_1;
	private JTextField frecuencia_2;
	private JTextField fase_1;
	private JTextField fase_2;
	private JTextField itDepends;
	private JTextField resultadoFrecuencia;
	private JTextField resultadoFase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppSumaFasores window = new AppSumaFasores();
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
	public AppSumaFasores() {
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
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppSumaFasores appSF = new AppSumaFasores();
				appSF.setVisible(true);
			}
		});
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLimpiar.setBackground(SystemColor.menu);
		btnLimpiar.setBounds(306, 240, 84, 23);
		panel.add(btnLimpiar);
		
		JButton buttonCos_1 = new JButton("cos");
		buttonCos_1.setFont(new Font("Arial", Font.PLAIN, 11));
		buttonCos_1.setBackground(SystemColor.menu);
		buttonCos_1.setBounds(359, 217, 62, 14);
		panel.add(buttonCos_1);
		
		JButton buttonSen_1 = new JButton("sen");
		buttonSen_1.setFont(new Font("Arial", Font.PLAIN, 11));
		buttonSen_1.setBackground(SystemColor.menu);
		buttonSen_1.setBounds(359, 200, 62, 14);
		panel.add(buttonSen_1);
		
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCos.setBackground(SystemColor.menu);
		btnCos.setBounds(349, 175, 62, 14);
		panel.add(btnCos);
		
		JButton btnSen = new JButton("sen");
		btnSen.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSen.setBackground(SystemColor.menu);
		btnSen.setBounds(349, 157, 62, 14);
		panel.add(btnSen);
		
		Fasores fasor1 = new Fasores();
		
		btnSen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCos.setEnabled(false);
				fasor1.setEsCoseno(false);
			}
		});
		
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSen.setEnabled(false);
				fasor1.setEsCoseno(true);
			}
		});
		
		Fasores fasor2 = new Fasores();
		
		buttonSen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonCos_1.setEnabled(false);
				fasor2.setEsCoseno(false);
			}
		});
		
		buttonCos_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonSen_1.setEnabled(false);
				fasor2.setEsCoseno(true);
			}
		});
		
		
		//comboBox = new JComboBox();
		//comboBox.addItem("sen");
		//comboBox.addItem("cos");
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"sen", "cos"}));
		//comboBox.setMaximumRowCount(2);
		
		//comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		//comboBox.setBounds(354, 166, 57, 20);
		//panel.add(box);
		
		//comboBox_1 = new JComboBox();
		//comboBox_1.addItem("sen");
		//comboBox_1.addItem("cos");
		//comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"sen", "cos"}));
		//comboBox_1.setMaximumRowCount(2);
		//comboBox_1.setFont(new Font("Arial", Font.PLAIN, 11));
		//comboBox_1.setBounds(359, 205, 57, 20);

		
		//panel.add(box_1);
				
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fasores fasor1= new Fasores();
				//Fasores fasor2= new Fasores();
				SumaDeFasores sumadorFasores= new SumaDeFasores();
				
				//JComboBox comboBox = new JComboBox();
				//JComboBox comboBox_1 = new JComboBox();
				JButton btnSen = new JButton("sen");
				JButton btnCos = new JButton("cos");
				JButton buttonSen_1 = new JButton("sen");
				JButton buttonCos_2 = new JButton("cos");
				
				float numAmp_1,numFrec_1,numFase_1,numAmp_2,numFrec_2,numFase_2;
				//float ansFase,ansAmp,ansFrec;
				String ansFase,ansAmp,ansFrec;
				
				try {
					numAmp_1=Float.parseFloat(amplitud_1.getText());
					numFrec_1=Float.parseFloat(frecuencia_1.getText());
					numFase_1=Float.parseFloat(fase_1.getText());
					numAmp_2=Float.parseFloat(amplitud_2.getText());
					numFrec_2=Float.parseFloat(frecuencia_2.getText());
					numFase_2=Float.parseFloat(fase_2.getText());
					
					//Object obj = comboBox.getSelectedItem(); 
					//if(obj.equals("sen")) {
					//	fasor1.setEsCoseno(false);
					//}else {
					//	fasor1.setEsCoseno(true);
					//}
					
					if(btnSen.getModel().isPressed()) {
						fasor1.setEsCoseno(true);
					}
					
					if(btnCos.getModel().isPressed()) {
						fasor1.setEsCoseno(true);
					}
					
					fasor1.setAmplitud(numAmp_1);
					fasor1.setFrecuencia(numFrec_1);
					fasor1.setFase(numFase_1);
					
					
					
					//Object obj1 = comboBox.getSelectedItem(); 
					//if(obj1.equals("sen")) {
					//	fasor2.setEsCoseno(false);
					//}else {
					//	fasor2.setEsCoseno(true);
					//}
					
					if(buttonSen_1.getModel().isPressed()) {
						fasor2.setEsCoseno(true);
					}
					
					if(buttonCos_2.getModel().isPressed()) {
						fasor2.setEsCoseno(true);
					}
					
					
					
					fasor2.setAmplitud(numAmp_2);
					fasor2.setFrecuencia(numFrec_2);
					fasor2.setFase(numFase_2);
					
					
					
					
					Fasores fasorResultado= sumadorFasores.realizarOperacion(fasor1, fasor2);
					
					DecimalFormat df = new DecimalFormat("#.###");
					
					ansAmp=df.format(fasorResultado.getAmplitud());
					ansFrec=df.format(fasorResultado.getFrecuencia());
					ansFase=df.format(fasorResultado.getFase());
					
					
					
					
					
					resultadoAmplitud.setText(ansAmp);
					resultadoFrecuencia.setText(ansFrec);
					resultadoFase.setText(ansFase);
					itDepends.setText("cos");
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese solo números válidos");
				}
			}
		});
		
		
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCalcular.setBackground(SystemColor.menu);
		btnCalcular.setBounds(212, 240, 84, 23);
		panel.add(btnCalcular);
		
		
		JLabel label_13 = new JLabel(")");
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		label_13.setBounds(477, 276, 28, 17);
		panel.add(label_13);
		
		resultadoFase = new JTextField();
		resultadoFase.setEditable(false);
		resultadoFase.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoFase.setFont(new Font("Arial", Font.PLAIN, 11));
		resultadoFase.setColumns(10);
		resultadoFase.setBackground(SystemColor.menu);
		resultadoFase.setBounds(436, 274, 36, 20);
		panel.add(resultadoFase);
		
		JLabel label_12 = new JLabel("t +");
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(416, 277, 17, 14);
		panel.add(label_12);
		
		resultadoFrecuencia = new JTextField();
		resultadoFrecuencia.setEditable(false);
		resultadoFrecuencia.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoFrecuencia.setFont(new Font("Arial", Font.PLAIN, 11));
		resultadoFrecuencia.setColumns(10);
		resultadoFrecuencia.setBackground(SystemColor.menu);
		resultadoFrecuencia.setBounds(375, 274, 36, 20);
		panel.add(resultadoFrecuencia);
		
		JLabel label_11 = new JLabel("(");
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(367, 277, 13, 14);
		panel.add(label_11);
		
		itDepends = new JTextField();
		itDepends.setEditable(false);
		itDepends.setHorizontalAlignment(SwingConstants.CENTER);
		itDepends.setFont(new Font("Arial", Font.PLAIN, 11));
		itDepends.setColumns(10);
		itDepends.setBackground(SystemColor.menu);
		itDepends.setBounds(325, 274, 36, 20);
		panel.add(itDepends);
		
		resultadoAmplitud = new JTextField();
		resultadoAmplitud.setEditable(false);
		resultadoAmplitud.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoAmplitud.setBackground(SystemColor.menu);
		resultadoAmplitud.setFont(new Font("Arial", Font.PLAIN, 11));
		resultadoAmplitud.setColumns(10);
		resultadoAmplitud.setBounds(279, 274, 36, 20);
		panel.add(resultadoAmplitud);
		
		amplitud_1 = new JTextField();
		amplitud_1.setHorizontalAlignment(SwingConstants.CENTER);
		amplitud_1.setFont(new Font("Arial", Font.PLAIN, 11));
		amplitud_1.setColumns(10);
		amplitud_1.setBounds(308, 166, 36, 20);
		panel.add(amplitud_1);
		
		JLabel label_2 = new JLabel("Insertar otro fasor:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(212, 208, 120, 14);
		panel.add(label_2);
		
		amplitud_2 = new JTextField();
		amplitud_2.setHorizontalAlignment(SwingConstants.CENTER);
		amplitud_2.setFont(new Font("Arial", Font.PLAIN, 11));
		amplitud_2.setColumns(10);
		amplitud_2.setBounds(318, 206, 36, 20);
		panel.add(amplitud_2);
		
		JLabel label_3 = new JLabel("Insertar un fasor:");
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(212, 168, 100, 14);
		panel.add(label_3);
		
		JLabel label_6 = new JLabel("(");
		label_6.setFont(new Font("Arial", Font.PLAIN, 11));
		label_6.setBounds(416, 169, 13, 14);
		panel.add(label_6);
		
		JLabel label_9 = new JLabel(")");
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(545, 207, 28, 17);
		panel.add(label_9);
		
		JLabel label_4 = new JLabel("Suma de Fasores");
		label_4.setForeground(Color.DARK_GRAY);
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(212, 127, 130, 17);
		panel.add(label_4);
		
		JLabel label_8 = new JLabel("t +");
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(467, 169, 28, 14);
		panel.add(label_8);
		
		fase_1 = new JTextField();
		fase_1.setHorizontalAlignment(SwingConstants.CENTER);
		fase_1.setFont(new Font("Arial", Font.PLAIN, 11));
		fase_1.setColumns(10);
		fase_1.setBounds(489, 166, 43, 20);
		panel.add(fase_1);
		
		JButton button = new JButton("Volver al Inicio");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		button.setBackground(SystemColor.menu);
		button.setFont(new Font("Arial", Font.PLAIN, 11));
		button.setBounds(212, 313, 132, 23);
		panel.add(button);
		
		frecuencia_1 = new JTextField();
		frecuencia_1.setHorizontalAlignment(SwingConstants.CENTER);
		frecuencia_1.setFont(new Font("Arial", Font.PLAIN, 11));
		frecuencia_1.setColumns(10);
		frecuencia_1.setBounds(426, 166, 36, 20);
		panel.add(frecuencia_1);
		
		JLabel label_10 = new JLabel(")");
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(535, 167, 28, 17);
		panel.add(label_10);
		
		JLabel label_5 = new JLabel("(");
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(426, 208, 13, 14);
		panel.add(label_5);
		
		JLabel label_7 = new JLabel("t +");
		label_7.setFont(new Font("Arial", Font.PLAIN, 11));
		label_7.setBounds(478, 208, 17, 14);
		panel.add(label_7);
		
		
		frecuencia_2 = new JTextField();
		frecuencia_2.setHorizontalAlignment(SwingConstants.CENTER);
		frecuencia_2.setFont(new Font("Arial", Font.PLAIN, 11));
		frecuencia_2.setColumns(10);
		frecuencia_2.setBounds(436, 206, 36, 20);
		panel.add(frecuencia_2);
		
		JLabel label_1 = new JLabel("Resultado:");
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(212, 276, 72, 14);
		panel.add(label_1);
		
		fase_2 = new JTextField();
		fase_2.setHorizontalAlignment(SwingConstants.CENTER);
		fase_2.setFont(new Font("Arial", Font.PLAIN, 11));
		fase_2.setColumns(10);
		fase_2.setBounds(499, 206, 43, 20);
		panel.add(fase_2);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppSumaFasores.class.getResource("/images/VentanaPrincipal2.png")));
		label.setBounds(0, 0, 784, 461);
		panel.add(label);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
	
	private JComboBox comboBox;
	private JComboBox comboBox_1;
}
