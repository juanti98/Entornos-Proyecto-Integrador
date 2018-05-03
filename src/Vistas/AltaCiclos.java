package Vistas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AltaCiclos extends JFrame {

	private JPanel contentPane;
	private JTextField txtClaveCiclo;
	private JTextField txtNombreCiclo;
	private JTextField txtFamiliaProfesional;
	private JTextField txtNombreFamiliaProfesional;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaCiclos frame = new AltaCiclos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AltaCiclos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClaveCiclo = new JLabel("Clave Ciclo: ");
		lblClaveCiclo.setBounds(48, 54, 77, 14);
		contentPane.add(lblClaveCiclo);
		
		JLabel lblNombreCiclo = new JLabel("Nombre Ciclo:");
		lblNombreCiclo.setBounds(48, 79, 95, 14);
		contentPane.add(lblNombreCiclo);
		
		JLabel lblFamPro = new JLabel("Familia Profesional: ");
		lblFamPro.setBounds(48, 104, 122, 14);
		contentPane.add(lblFamPro);
		
		JLabel lblNombreFamiliaProfesional = new JLabel("Nombre Familia Profesional:");
		lblNombreFamiliaProfesional.setBounds(48, 129, 159, 14);
		contentPane.add(lblNombreFamiliaProfesional);
		
		txtClaveCiclo = new JTextField();
		txtClaveCiclo.setBounds(216, 51, 159, 20);
		contentPane.add(txtClaveCiclo);
		txtClaveCiclo.setColumns(10);
		
		txtNombreCiclo = new JTextField();
		txtNombreCiclo.setBounds(216, 76, 159, 20);
		contentPane.add(txtNombreCiclo);
		txtNombreCiclo.setColumns(10);
		
		txtFamiliaProfesional = new JTextField();
		txtFamiliaProfesional.setBounds(216, 101, 159, 20);
		contentPane.add(txtFamiliaProfesional);
		txtFamiliaProfesional.setColumns(10);
		
		txtNombreFamiliaProfesional = new JTextField();
		txtNombreFamiliaProfesional.setBounds(216, 126, 159, 20);
		contentPane.add(txtNombreFamiliaProfesional);
		txtNombreFamiliaProfesional.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(48, 202, 122, 23);
		contentPane.add(btnVolver);
		
		JButton btnDarDeAlta = new JButton("Dar de Alta");
		btnDarDeAlta.setBounds(256, 202, 109, 23);
		contentPane.add(btnDarDeAlta);
	}
}
