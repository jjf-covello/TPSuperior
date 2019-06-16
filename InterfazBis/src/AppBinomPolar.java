

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

public class AppBinomPolar {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppBinomPolar window = new AppBinomPolar();
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
	public AppBinomPolar() {
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
		panel.setBounds(0, 0, 800, 500);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnFormaBinmica = new JButton("FORMA BINOMICA");
		btnFormaBinmica.setBackground(SystemColor.menu);
		btnFormaBinmica.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFormaBinmica.setBounds(263, 217, 272, 23);
		panel.add(btnFormaBinmica);
		btnFormaBinmica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				AppOpBasicasBin appOB = new AppOpBasicasBin();
				appOB.setVisible(true);
			}
		});
		
		JButton btnVolverAlInicio = new JButton("VOLVER AL INICIO");
		btnVolverAlInicio.setBackground(SystemColor.menu);
		btnVolverAlInicio.setFont(new Font("Arial", Font.PLAIN, 11));
		btnVolverAlInicio.setBounds(263, 285, 272, 23);
		panel.add(btnVolverAlInicio);
		btnVolverAlInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppPrincipal appP = new AppPrincipal();
				appP.setVisible(true);
			}
		});
		
		JLabel lblcmoQuiereRealizar = new JLabel("\u00BFC\u00F3mo quiere realizar la operaci\u00F3n?");
		lblcmoQuiereRealizar.setBounds(263, 160, 272, 17);
		panel.add(lblcmoQuiereRealizar);
		lblcmoQuiereRealizar.setFont(new Font("Arial", Font.PLAIN, 15));
		lblcmoQuiereRealizar.setForeground(Color.DARK_GRAY);
		lblcmoQuiereRealizar.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnFormaPolar = new JButton("FORMA POLAR");
		btnFormaPolar.setBackground(SystemColor.menu);
		btnFormaPolar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFormaPolar.setBounds(263, 251, 272, 23);
		panel.add(btnFormaPolar);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AppBinomPolar.class.getResource("/images/VentanaPrincipal2.png")));
		label.setBounds(0, 0, 800, 500);
		panel.add(label);
		btnFormaPolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppOpBasicasPolar appOBP = new AppOpBasicasPolar();
				appOBP.setVisible(true);
			}
		});
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
