package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;

public class VentanaEmpresas extends JFrame {

	private JTable table;
	private JTextField txtNumConvenio;
	private JTextField txtDireccion;
	private JLabel lblNumConvenio;
	private JLabel lblDireccion;
	private JPanel contentPane;
	private Controlador controlador;
	private JTextField txtNomEmpresa;
	private JTextField txtFechaFirma;
	private JTextField txtTutorEmpresa;
	private JTextField txtRepEmpresa;

	/**
	 * Create the frame.
	 */
	public VentanaEmpresas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 803, 192);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null},
			},
			new String[] {
				"N\u00FAmero de convenio", "Nombre empresa", "Fecha firma", "Direcci\u00F3n", "Tutor empresa", "Representante empresa"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(110);
		table.getColumnModel().getColumn(1).setPreferredWidth(92);
		table.getColumnModel().getColumn(4).setPreferredWidth(83);
		table.getColumnModel().getColumn(5).setPreferredWidth(129);
		scrollPane.setViewportView(table);

		lblNumConvenio = new JLabel("N\u00FAmero de convenio:");
		lblNumConvenio.setBounds(170, 221, 108, 14);
		getContentPane().add(lblNumConvenio);

		txtNumConvenio = new JTextField();
		txtNumConvenio.setBounds(291, 218, 86, 20);
		getContentPane().add(txtNumConvenio);
		txtNumConvenio.setHorizontalAlignment(SwingConstants.LEFT);
		txtNumConvenio.setColumns(10);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.botonVolverMenuDirectorDesdeGrupos();
			}
		});
		btnVolver.setBounds(142, 318, 117, 23);
		getContentPane().add(btnVolver);

		lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(489, 221, 139, 14);
		getContentPane().add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(578, 218, 92, 20);
		getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblNomEmpresa = new JLabel("Nombre empresa:");
		lblNomEmpresa.setBounds(170, 247, 92, 14);
		contentPane.add(lblNomEmpresa);
		
		txtNomEmpresa = new JTextField();
		txtNomEmpresa.setBounds(291, 244, 86, 20);
		contentPane.add(txtNomEmpresa);
		txtNomEmpresa.setColumns(10);
		
		JButton btnAnadir = new JButton("Dar de Alta");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.VentanaEmpresasAAltaEmpresas();
			}
		});
		btnAnadir.setBounds(412, 318, 136, 23);
		contentPane.add(btnAnadir);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(269, 318, 136, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(558, 318, 136, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblFechaFirma = new JLabel("Fecha firma:");
		lblFechaFirma.setBounds(170, 278, 67, 14);
		contentPane.add(lblFechaFirma);
		
		txtFechaFirma = new JTextField();
		txtFechaFirma.setBounds(291, 275, 86, 20);
		contentPane.add(txtFechaFirma);
		txtFechaFirma.setColumns(10);
		
		JLabel lblTutorEmpresa = new JLabel("Tutor empresa:");
		lblTutorEmpresa.setBounds(489, 250, 86, 14);
		contentPane.add(lblTutorEmpresa);
		
		txtTutorEmpresa = new JTextField();
		txtTutorEmpresa.setBounds(578, 246, 92, 20);
		contentPane.add(txtTutorEmpresa);
		txtTutorEmpresa.setColumns(10);
		
		JLabel lblRepEmpresa = new JLabel("Representante empresa:");
		lblRepEmpresa.setBounds(448, 278, 127, 14);
		contentPane.add(lblRepEmpresa);
		
		txtRepEmpresa = new JTextField();
		txtRepEmpresa.setBounds(578, 275, 92, 20);
		contentPane.add(txtRepEmpresa);
		txtRepEmpresa.setColumns(10);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
	}
}
