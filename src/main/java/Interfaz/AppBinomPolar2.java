package Interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class AppBinomPolar2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppBinomPolar2 window = new AppBinomPolar2();
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
	public AppBinomPolar2() {
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
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 787, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblcmoQuiereRealizar = new JLabel("\u00BFC\u00F3mo quiere realizar la operaci\u00F3n?");
		lblcmoQuiereRealizar.setBounds(263, 138, 272, 17);
		panel.add(lblcmoQuiereRealizar);
		lblcmoQuiereRealizar.setFont(new Font("Arial", Font.PLAIN, 15));
		lblcmoQuiereRealizar.setForeground(Color.DARK_GRAY);
		lblcmoQuiereRealizar.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnFormaPolar = new JButton("FORMA POLAR");
		btnFormaPolar.setBackground(SystemColor.menu);
		btnFormaPolar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFormaPolar.setBounds(263, 232, 272, 23);
		panel.add(btnFormaPolar);
		btnFormaPolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppOpAvanzadasPolar appOAP = new AppOpAvanzadasPolar();
				appOAP.setVisible(true);
			}
		});
		
		JButton btnVolverAlInicio = new JButton("VOLVER AL INICIO");
		btnVolverAlInicio.setBackground(SystemColor.menu);
		btnVolverAlInicio.setFont(new Font("Arial", Font.PLAIN, 11));
		btnVolverAlInicio.setBounds(263, 266, 272, 23);
		panel.add(btnVolverAlInicio);
		btnVolverAlInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		
		JButton btnFormaBinmica = new JButton("FORMA BINOMICA");
		btnFormaBinmica.setBackground(SystemColor.menu);
		btnFormaBinmica.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFormaBinmica.setBounds(263, 198, 272, 23);
		panel.add(btnFormaBinmica);
		btnFormaBinmica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				AppOpAvanzadasBin appOAB = new AppOpAvanzadasBin();
				appOAB.setVisible(true);
			}
		});
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppBinomPolar2.class.getResource("/images/VentanaPrincipal2.png")));
		label.setBounds(0, 0, 789, 461);
		panel.add(label);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}

}
