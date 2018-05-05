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

public class AltaCentro extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JTextField txtCodigoCentro;
	private JTextField txtDenominacionCentro;
	private JTextField txtDirectorCentro;
	private JTextField txtNIFDirectorCentro;
	private JTextField txtNombreRepresentante;
	private JTextField txtDNIRepresentante;
	private JTextField txtDireccion;
	private JTextField txtLocalidad;
	private JTextField txtCodigoPostal;
		
	public AltaCentro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoCentro = new JLabel("Codigo del Centro:");
		lblCodigoCentro.setBounds(33, 11, 118, 14);
		contentPane.add(lblCodigoCentro);
		
		JLabel lblDenominacionCentro = new JLabel("Denominacion Centro:");
		lblDenominacionCentro.setBounds(33, 36, 118, 14);
		contentPane.add(lblDenominacionCentro);
		
		JLabel lblDirectorCentro = new JLabel("Director Centro:");
		lblDirectorCentro.setBounds(33, 61, 118, 14);
		contentPane.add(lblDirectorCentro);
		
		JLabel lblNifDirectorCentro = new JLabel("NIF Director Centro: ");
		lblNifDirectorCentro.setBounds(33, 86, 118, 14);
		contentPane.add(lblNifDirectorCentro);
		
		JLabel lblNombreRepresentante = new JLabel("Nombre Representante:");
		lblNombreRepresentante.setBounds(33, 111, 118, 14);
		contentPane.add(lblNombreRepresentante);
		
		JLabel lblDniRepresentante = new JLabel("DNI Representante:");
		lblDniRepresentante.setBounds(33, 136, 118, 14);
		contentPane.add(lblDniRepresentante);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(33, 161, 118, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(33, 186, 118, 14);
		contentPane.add(lblLocalidad);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal:");
		lblCodigoPostal.setBounds(33, 211, 118, 14);
		contentPane.add(lblCodigoPostal);
		
		txtCodigoCentro = new JTextField();
		txtCodigoCentro.setBounds(228, 8, 171, 20);
		contentPane.add(txtCodigoCentro);
		txtCodigoCentro.setColumns(10);
		
		txtDenominacionCentro = new JTextField();
		txtDenominacionCentro.setBounds(228, 33, 171, 20);
		contentPane.add(txtDenominacionCentro);
		txtDenominacionCentro.setColumns(10);
		
		txtDirectorCentro = new JTextField();
		txtDirectorCentro.setBounds(228, 58, 171, 20);
		contentPane.add(txtDirectorCentro);
		txtDirectorCentro.setColumns(10);
		
		txtNIFDirectorCentro = new JTextField();
		txtNIFDirectorCentro.setBounds(228, 83, 171, 20);
		contentPane.add(txtNIFDirectorCentro);
		txtNIFDirectorCentro.setColumns(10);
		
		txtNombreRepresentante = new JTextField();
		txtNombreRepresentante.setBounds(228, 108, 171, 20);
		contentPane.add(txtNombreRepresentante);
		txtNombreRepresentante.setColumns(10);
		
		txtDNIRepresentante = new JTextField();
		txtDNIRepresentante.setBounds(228, 133, 171, 20);
		contentPane.add(txtDNIRepresentante);
		txtDNIRepresentante.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(228, 158, 171, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setBounds(228, 183, 171, 20);
		contentPane.add(txtLocalidad);
		txtLocalidad.setColumns(10);
		
		txtCodigoPostal = new JTextField();
		txtCodigoPostal.setBounds(228, 208, 171, 20);
		contentPane.add(txtCodigoPostal);
		txtCodigoPostal.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.botonVolverVentanaCentro();
			}
		});
		btnVolver.setBounds(77, 262, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnDarAlta = new JButton("Dar de Alta");
		btnDarAlta.setBounds(247, 262, 89, 23);
		contentPane.add(btnDarAlta);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}

}
