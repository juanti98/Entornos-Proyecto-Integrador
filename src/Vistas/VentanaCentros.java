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

	/**
	 * Create the frame.
	 */
	public VentanaCentros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 764, 192);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null }, }, new String[] {
				"Codigo centro", "Denominacion centro", "NIF", "DAT", "Direccion", "Nombre Representante" }));
		scrollPane.setViewportView(table);

		lblCodigoCentroVentanaCentro = new JLabel("Codigo Centro:");
		lblCodigoCentroVentanaCentro.setBounds(52, 220, 86, 14);
		getContentPane().add(lblCodigoCentroVentanaCentro);

		txtCodigoCentroVentanaCentro = new JTextField();
		txtCodigoCentroVentanaCentro.setBounds(148, 217, 86, 20);
		getContentPane().add(txtCodigoCentroVentanaCentro);
		txtCodigoCentroVentanaCentro.setHorizontalAlignment(SwingConstants.LEFT);
		txtCodigoCentroVentanaCentro.setColumns(10);

		lblDireccionVentanaCentro = new JLabel("Direccion: ");
		lblDireccionVentanaCentro.setBounds(52, 248, 75, 14);
		getContentPane().add(lblDireccionVentanaCentro);

		txtDireccionVentanaCentro = new JTextField();
		txtDireccionVentanaCentro.setBounds(147, 245, 86, 20);
		getContentPane().add(txtDireccionVentanaCentro);
		txtDireccionVentanaCentro.setColumns(10);

		lblNIFVentanaCentro = new JLabel("NIF:");
		lblNIFVentanaCentro.setBounds(53, 276, 46, 14);
		getContentPane().add(lblNIFVentanaCentro);

		txtNIFVentanaCentro = new JTextField();
		txtNIFVentanaCentro.setBounds(147, 273, 86, 20);
		getContentPane().add(txtNIFVentanaCentro);
		txtNIFVentanaCentro.setColumns(10);

		JButton button = new JButton("Volver");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.botonVolverMenuDirector();
			}
		});
		button.setBounds(168, 316, 136, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("Alta centro");
		button_1.setBounds(357, 317, 136, 23);
		getContentPane().add(button_1);

		lblDenominacionCentroVentanaCentro = new JLabel("Denominacion centro: ");
		lblDenominacionCentroVentanaCentro.setBounds(438, 220, 139, 14);
		getContentPane().add(lblDenominacionCentroVentanaCentro);

		txtDenominacionCentroVentanaCentro = new JTextField();
		txtDenominacionCentroVentanaCentro.setBounds(567, 214, 86, 20);
		getContentPane().add(txtDenominacionCentroVentanaCentro);
		txtDenominacionCentroVentanaCentro.setColumns(10);

		lblDATVentanaCentro = new JLabel("DAT:");
		lblDATVentanaCentro.setBounds(438, 248, 119, 14);
		getContentPane().add(lblDATVentanaCentro);

		txtDATVentanaCentro = new JTextField();
		txtDATVentanaCentro.setBounds(567, 245, 86, 20);
		getContentPane().add(txtDATVentanaCentro);
		txtDATVentanaCentro.setColumns(10);

		lblNombreRepresentanteVentanaCentro = new JLabel("Nombre Representante: ");
		lblNombreRepresentanteVentanaCentro.setBounds(438, 276, 119, 14);
		getContentPane().add(lblNombreRepresentanteVentanaCentro);

		txtNombreRepresentanteVentanaCentro = new JTextField();
		txtNombreRepresentanteVentanaCentro.setBounds(567, 273, 86, 20);
		getContentPane().add(txtNombreRepresentanteVentanaCentro);
		txtNombreRepresentanteVentanaCentro.setColumns(10);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
	}
}
