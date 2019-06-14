package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;


public class AppPrincipal {

	private JFrame frmTpMatemticaSuperior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppPrincipal window = new AppPrincipal();
					window.frmTpMatemticaSuperior.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTpMatemticaSuperior = new JFrame();
		frmTpMatemticaSuperior.setTitle("TP Matem\u00E1tica Superior");
		frmTpMatemticaSuperior.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Juan\\Documents\\Juan\\Edits\\utn3.png"));
		frmTpMatemticaSuperior.setResizable(false);
		//frame.setUndecorated(true);
		frmTpMatemticaSuperior.getContentPane().setBackground(Color.WHITE);
		frmTpMatemticaSuperior.setBounds(100, 100, 800, 500);
		frmTpMatemticaSuperior.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpMatemticaSuperior.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 794, 487);
		frmTpMatemticaSuperior.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSeleccioneUnCampo = new JLabel("SELECCIONE UN CAMPO");
		lblSeleccioneUnCampo.setForeground(Color.DARK_GRAY);
		lblSeleccioneUnCampo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneUnCampo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSeleccioneUnCampo.setBounds(298, 229, 197, 14);
		panel.add(lblSeleccioneUnCampo);
		
		JButton btnOperacionesBasicas = new JButton("OPERACIONES BASICAS");
		btnOperacionesBasicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTpMatemticaSuperior.dispose();
				AppBinomPolar appBP = new AppBinomPolar();
				appBP.setVisible(true);
			}
		});
		btnOperacionesBasicas.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOperacionesBasicas.setBackground(SystemColor.menu);
		btnOperacionesBasicas.setBounds(298, 265, 197, 23);
		panel.add(btnOperacionesBasicas);
		
		JButton btnOperacionesAvanzadas_1 = new JButton("OPERACIONES AVANZADAS");
		btnOperacionesAvanzadas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTpMatemticaSuperior.dispose();
				AppBinomPolar2 appBP = new AppBinomPolar2();
				appBP.setVisible(true);
			}
		});
		btnOperacionesAvanzadas_1.setBackground(SystemColor.menu);
		btnOperacionesAvanzadas_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOperacionesAvanzadas_1.setBounds(298, 301, 197, 23);
		panel.add(btnOperacionesAvanzadas_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(-41, 211, 0, 0);
		panel.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(108, 423, 0, 0);
		panel.add(label);
		
		JButton btnXzgvds = new JButton("SUMA DE FASORES");
		btnXzgvds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTpMatemticaSuperior.dispose();
				AppSumaFasores appSF = new AppSumaFasores();
				appSF.setVisible(true);
			}
		});
		btnXzgvds.setBackground(SystemColor.menu);
		btnXzgvds.setFont(new Font("Arial", Font.PLAIN, 11));
		btnXzgvds.setBounds(298, 335, 197, 23);
		panel.add(btnXzgvds);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(AppPrincipal.class.getResource("/images/VentanaPrincipal.png")));
		label_2.setBounds(0, 0, 806, 476);
		panel.add(label_2);
	}

	public void setVisible(boolean b) {
		frmTpMatemticaSuperior.setVisible(true);
	}
}
