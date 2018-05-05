package Vistas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaCiclos extends JFrame {

	private JPanel contentPane;
	private JTextField txtClaveCiclo;
	private JTextField txtNombreCiclo;
	private JTextField txtFamiliaProfesional;
	private JTextField txtNombreFamiliaProfesional;
	private Controlador controlador;

	public AltaCiclos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClaveCiclo = new JLabel("Clave Ciclo: ");
		lblClaveCiclo.setBounds(50, 14, 77, 14);
		contentPane.add(lblClaveCiclo);
		
		JLabel lblNombreCiclo = new JLabel("Nombre Ciclo:");
		lblNombreCiclo.setBounds(50, 39, 95, 14);
		contentPane.add(lblNombreCiclo);
		
		JLabel lblFamPro = new JLabel("Familia Profesional: ");
		lblFamPro.setBounds(50, 64, 122, 14);
		contentPane.add(lblFamPro);
		
		JLabel lblNombreFamiliaProfesional = new JLabel("Nombre Familia Profesional:");
		lblNombreFamiliaProfesional.setBounds(50, 89, 159, 14);
		contentPane.add(lblNombreFamiliaProfesional);
		
		txtClaveCiclo = new JTextField();
		txtClaveCiclo.setBounds(218, 11, 159, 20);
		contentPane.add(txtClaveCiclo);
		txtClaveCiclo.setColumns(10);
		
		txtNombreCiclo = new JTextField();
		txtNombreCiclo.setBounds(218, 36, 159, 20);
		contentPane.add(txtNombreCiclo);
		txtNombreCiclo.setColumns(10);
		
		txtFamiliaProfesional = new JTextField();
		txtFamiliaProfesional.setBounds(218, 61, 159, 20);
		contentPane.add(txtFamiliaProfesional);
		txtFamiliaProfesional.setColumns(10);
		
		txtNombreFamiliaProfesional = new JTextField();
		txtNombreFamiliaProfesional.setBounds(218, 86, 159, 20);
		contentPane.add(txtNombreFamiliaProfesional);
		txtNombreFamiliaProfesional.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.botonVolverVentanaCiclos();
			}
		});
		btnVolver.setBounds(72, 128, 122, 23);
		contentPane.add(btnVolver);
		
		JButton btnDarDeAlta = new JButton("Dar de Alta");
		btnDarDeAlta.setBounds(242, 128, 109, 23);
		contentPane.add(btnDarDeAlta);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}
}
