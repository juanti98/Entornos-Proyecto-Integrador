import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passLogin;
	public Controlador controlador;

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

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(84, 61, 46, 14);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(84, 102, 60, 14);
		contentPane.add(lblContrasea);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(154, 58, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		passLogin = new JPasswordField();
		passLogin.setBounds(154, 99, 86, 20);
		contentPane.add(passLogin);

		JComboBox comboProfesion = new JComboBox();
		comboProfesion.setModel(new DefaultComboBoxModel(new String[] { "Tutor", "Director" }));
		comboProfesion.setBounds(154, 152, 86, 20);
		contentPane.add(comboProfesion);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnEntrar.setBounds(151, 192, 89, 23);
		contentPane.add(btnEntrar);

		JButton btnSimulacionTutor = new JButton("Simulacion Tutor");
		btnSimulacionTutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.loginMenuATutor();
			}
		});
		btnSimulacionTutor.setBounds(281, 129, 123, 23);
		contentPane.add(btnSimulacionTutor);

		JButton btnSimulacionDirector = new JButton("Simulacion Director");
		btnSimulacionDirector.setBounds(281, 163, 123, 23);
		contentPane.add(btnSimulacionDirector);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}
}
