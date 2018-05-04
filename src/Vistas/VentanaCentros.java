package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCentros extends JFrame {
	private JTable table;
	private JTextField txtDATVentanaCentro;
	private JTextField txtCodigoCentroVentanaCentro;
	private JTextField txtDenominacionCentroVentanaCentro;
	private JTextField txtDireccionVentanaCentro;
	private JTextField txtNIFVentanaCentro;
	private JTextField txtNombreRepresentanteVentanaCentro;
	private JLabel lblNombreRepresentanteVentanaCentro;
	private JLabel lblNIFVentanaCentro;
	private JLabel lblDireccionVentanaCentro;
	private JLabel lblCodigoCentroVentanaCentro;
	private JLabel lblDATVentanaCentro;
	private JLabel lblDenominacionCentroVentanaCentro;
	private JPanel contentPane;
	private Controlador controlador;
	private JButton btnModificar;
	private JLabel lblDirectorcentro;
	private JLabel lblDniRepresentante;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblLocalidad;
	private JTextField textField_2;
	private JLabel lblCodigoPostal;
	private JTextField textField_3;

	/**
	 * Create the frame.
	 */
	public VentanaCentros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 864, 192);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Codigo centro", "Denominacion centro", "Director Centro", "NIF Director Centro", "Nombre Representante", "DNI Representante", "DAT", "Direccion", "Localidad", "Codigo Postal"
			}
		));
		scrollPane.setViewportView(table);

		lblCodigoCentroVentanaCentro = new JLabel("Codigo Centro:");
		lblCodigoCentroVentanaCentro.setBounds(52, 220, 86, 14);
		getContentPane().add(lblCodigoCentroVentanaCentro);

		txtCodigoCentroVentanaCentro = new JTextField();
		txtCodigoCentroVentanaCentro.setBounds(181, 217, 86, 20);
		getContentPane().add(txtCodigoCentroVentanaCentro);
		txtCodigoCentroVentanaCentro.setHorizontalAlignment(SwingConstants.LEFT);
		txtCodigoCentroVentanaCentro.setColumns(10);

		lblDireccionVentanaCentro = new JLabel("Direccion: ");
		lblDireccionVentanaCentro.setBounds(51, 336, 75, 14);
		getContentPane().add(lblDireccionVentanaCentro);

		txtDireccionVentanaCentro = new JTextField();
		txtDireccionVentanaCentro.setBounds(181, 333, 86, 20);
		getContentPane().add(txtDireccionVentanaCentro);
		txtDireccionVentanaCentro.setColumns(10);

		lblNIFVentanaCentro = new JLabel("NIF Director:");
		lblNIFVentanaCentro.setBounds(438, 256, 68, 14);
		getContentPane().add(lblNIFVentanaCentro);

		txtNIFVentanaCentro = new JTextField();
		txtNIFVentanaCentro.setBounds(567, 253, 86, 20);
		getContentPane().add(txtNIFVentanaCentro);
		txtNIFVentanaCentro.setColumns(10);

		JButton button = new JButton("Volver");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.botonVolverMenuDirector();
			}
		});
		button.setBounds(161, 413, 136, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("Alta centro");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.VentanaCentroAAltaCentro();
			}
		});
		button_1.setBounds(490, 413, 136, 23);
		getContentPane().add(button_1);

		lblDenominacionCentroVentanaCentro = new JLabel("Denominacion centro: ");
		lblDenominacionCentroVentanaCentro.setBounds(438, 220, 139, 14);
		getContentPane().add(lblDenominacionCentroVentanaCentro);

		txtDenominacionCentroVentanaCentro = new JTextField();
		txtDenominacionCentroVentanaCentro.setBounds(567, 214, 86, 20);
		getContentPane().add(txtDenominacionCentroVentanaCentro);
		txtDenominacionCentroVentanaCentro.setColumns(10);

		lblDATVentanaCentro = new JLabel("DAT:");
		lblDATVentanaCentro.setBounds(438, 376, 119, 14);
		getContentPane().add(lblDATVentanaCentro);

		txtDATVentanaCentro = new JTextField();
		txtDATVentanaCentro.setBounds(567, 373, 86, 20);
		getContentPane().add(txtDATVentanaCentro);
		txtDATVentanaCentro.setColumns(10);

		lblNombreRepresentanteVentanaCentro = new JLabel("Nombre Representante: ");
		lblNombreRepresentanteVentanaCentro.setBounds(52, 297, 119, 14);
		getContentPane().add(lblNombreRepresentanteVentanaCentro);

		txtNombreRepresentanteVentanaCentro = new JTextField();
		txtNombreRepresentanteVentanaCentro.setBounds(181, 294, 86, 20);
		getContentPane().add(txtNombreRepresentanteVentanaCentro);
		txtNombreRepresentanteVentanaCentro.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(327, 413, 136, 23);
		contentPane.add(btnModificar);
		
		lblDirectorcentro = new JLabel("Director Centro:");
		lblDirectorcentro.setBounds(52, 259, 85, 14);
		contentPane.add(lblDirectorcentro);
		
		lblDniRepresentante = new JLabel("DNI Representante: ");
		lblDniRepresentante.setBounds(438, 297, 119, 14);
		contentPane.add(lblDniRepresentante);
		
		textField = new JTextField();
		textField.setBounds(567, 294, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 253, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(438, 336, 68, 14);
		contentPane.add(lblLocalidad);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setBounds(567, 333, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblCodigoPostal = new JLabel("Codigo Postal:");
		lblCodigoPostal.setBounds(52, 376, 119, 14);
		contentPane.add(lblCodigoPostal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(181, 373, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(655, 413, 89, 23);
		contentPane.add(btnEliminar);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
	}
}
