
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaEstudiantes extends JFrame {

	private JPanel contentPane;
	private JTable tableEstudiantes;
	private Controlador controlador;
	private JTextField txtDNI;
	private JTextField txtMat;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JButton btnMostrarCuestionario;

	/**
	 * Create the frame.
	 */
	public VentanaEstudiantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 414, 130);
		contentPane.add(scrollPane);

		tableEstudiantes = new JTable();
		tableEstudiantes.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Nombre", "Apellido", "DNI/NIF", "N\u00FAmero de matr\u00EDcula", "Estado" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, Object.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableEstudiantes.getColumnModel().getColumn(2).setPreferredWidth(86);
		tableEstudiantes.getColumnModel().getColumn(3).setPreferredWidth(111);
		scrollPane.setViewportView(tableEstudiantes);

		JButton btnAadirEstudiante = new JButton("A\u00F1adir estudiante");
		btnAadirEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.irAAnadir();
			}
		});
		btnAadirEstudiante.setBounds(151, 61, 122, 23);
		contentPane.add(btnAadirEstudiante);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setVisible(false);
		lblNombre.setBounds(48, 236, 65, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setVisible(false);
		lblApellido.setBounds(48, 261, 65, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDninif = new JLabel("DNI/NIF:");
		lblDninif.setVisible(false);
		lblDninif.setBounds(48, 286, 65, 14);
		contentPane.add(lblDninif);
		
		JLabel lblNMatrcula = new JLabel("N\u00B7 Matr\u00EDcula:");
		lblNMatrcula.setVisible(false);
		lblNMatrcula.setBounds(48, 311, 122, 14);
		contentPane.add(lblNMatrcula);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setVisible(false);
		lblEstado.setBounds(48, 336, 65, 14);
		contentPane.add(lblEstado);
		
		txtNombre = new JTextField();
		txtNombre.setVisible(false);
		txtNombre.setBounds(151, 233, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setVisible(false);
		txtApellido.setBounds(151, 258, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setVisible(false);
		txtDNI.setBounds(151, 283, 86, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtMat = new JTextField();
		txtMat.setVisible(false);
		txtMat.setBounds(151, 308, 86, 20);
		contentPane.add(txtMat);
		txtMat.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setVisible(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "En pr\u00E1cticas", "Finalizado"}));
		comboBox.setBounds(151, 333, 86, 17);
		contentPane.add(comboBox);
		
		btnMostrarCuestionario = new JButton("Mostrar Cuestionario");
		btnMostrarCuestionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarCuestionario();
			}
		});
		btnMostrarCuestionario.setBounds(282, 282, 133, 23);
		contentPane.add(btnMostrarCuestionario);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}
}
