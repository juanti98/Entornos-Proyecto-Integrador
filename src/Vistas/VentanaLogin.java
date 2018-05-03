package Vistas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passLogin;
	private Controlador controlador;
	private JButton btnEntrar;
	private JComboBox comboProfesion;
	private JLabel lblContrasea;
	private JLabel lblUsuario;
	private JButton btnSimulacionTutor;
	private JButton btnSimulacionDirector;

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(187, 11, 53, 19);
		contentPane.add(lblLogin);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(84, 61, 46, 14);
		contentPane.add(lblUsuario);

		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(84, 102, 60, 14);
		contentPane.add(lblContrasea);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(154, 58, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		passLogin = new JPasswordField();
		passLogin.setBounds(154, 99, 86, 20);
		contentPane.add(passLogin);

		comboProfesion = new JComboBox();
		comboProfesion.setModel(new DefaultComboBoxModel(new String[] { "Tutor", "Director" }));
		comboProfesion.setBounds(154, 152, 86, 20);
		contentPane.add(comboProfesion);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnEntrar.setBounds(151, 192, 89, 23);
		contentPane.add(btnEntrar);

		btnSimulacionTutor = new JButton("Simulacion Tutor");
		btnSimulacionTutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnSimulacionTutor.isEnabled()) {
					controlador.log();
				}

			}

		});
		btnSimulacionTutor.setBounds(281, 129, 123, 23);
		contentPane.add(btnSimulacionTutor);

		btnSimulacionDirector = new JButton("Simulacion Director");
		btnSimulacionDirector.setBounds(281, 163, 123, 23);
		contentPane.add(btnSimulacionDirector);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}
}
