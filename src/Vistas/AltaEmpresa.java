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

public class AltaEmpresa extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JTextField txtNombreConvenio;
	private JTextField txtNombreEmpresa;
	private JTextField txtFechaFirma;
	private JTextField txtDireccion;
	private JTextField txtTutorEmpresa;
	private JTextField txtRepresentanteEmpresa;

	
	public AltaEmpresa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroConvenio = new JLabel("Numero de convenio:");
		lblNumeroConvenio.setBounds(37, 22, 195, 14);
		contentPane.add(lblNumeroConvenio);
		
		JLabel lblNombreEmpresa = new JLabel("Nombre de la empresa:");
		lblNombreEmpresa.setBounds(37, 58, 195, 14);
		contentPane.add(lblNombreEmpresa);
		
		JLabel lblFechaFirma = new JLabel("Fecha de la firma:");
		lblFechaFirma.setBounds(37, 94, 195, 14);
		contentPane.add(lblFechaFirma);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(37, 130, 195, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTutorEmpresa = new JLabel("Tutor de la empresa:");
		lblTutorEmpresa.setBounds(37, 166, 195, 14);
		contentPane.add(lblTutorEmpresa);
		
		JLabel lblRepresentanteEmpresa = new JLabel("Representante de la empresa:");
		lblRepresentanteEmpresa.setBounds(37, 202, 195, 14);
		contentPane.add(lblRepresentanteEmpresa);
		
		txtNombreConvenio = new JTextField();
		txtNombreConvenio.setBounds(242, 19, 166, 20);
		contentPane.add(txtNombreConvenio);
		txtNombreConvenio.setColumns(10);
		
		txtNombreEmpresa = new JTextField();
		txtNombreEmpresa.setBounds(242, 55, 166, 20);
		contentPane.add(txtNombreEmpresa);
		txtNombreEmpresa.setColumns(10);
		
		txtFechaFirma = new JTextField();
		txtFechaFirma.setBounds(242, 91, 166, 20);
		contentPane.add(txtFechaFirma);
		txtFechaFirma.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(242, 127, 166, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTutorEmpresa = new JTextField();
		txtTutorEmpresa.setBounds(242, 163, 166, 20);
		contentPane.add(txtTutorEmpresa);
		txtTutorEmpresa.setColumns(10);
		
		txtRepresentanteEmpresa = new JTextField();
		txtRepresentanteEmpresa.setBounds(242, 199, 166, 20);
		contentPane.add(txtRepresentanteEmpresa);
		txtRepresentanteEmpresa.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.AltaEmpresaAVentanaEmpresa();
			}
		});
		btnVolver.setBounds(52, 254, 124, 23);
		contentPane.add(btnVolver);
		
		JButton btnDarAlta = new JButton("Dar de Alta");
		btnDarAlta.setBounds(224, 254, 124, 23);
		contentPane.add(btnDarAlta);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}
}
