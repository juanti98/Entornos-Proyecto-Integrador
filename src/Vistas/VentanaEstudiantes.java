package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

import Controlador.Controlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDninif;
	private JLabel lblNMatrcula;
	private JLabel lblEstado;
	private JComboBox comboBox;

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
//		tableEstudiantes.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				
//				int row = tableEstudiantes.getSelectedRow();
//				
//				String nombre = miModelo.getValueAt(row, 0).toString();
//				txtNombre.setText(nombre);
//				
//				String apellido = miModelo.getValueAt(row, 1).toString();
//				txtApellido.setText(apellido);
//				
//				String telefono = miModelo.getValueAt(row, 2).toString();
//				txtTelefono.setText(telefono);
//			}
//		});
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
		
		setLblNombre(new JLabel("Nombre:"));
		getLblNombre().setVisible(false);
		getLblNombre().setBounds(48, 236, 65, 14);
		contentPane.add(getLblNombre());
		
		setLblApellido(new JLabel("Apellido:"));
		getLblApellido().setVisible(false);
		getLblApellido().setBounds(48, 261, 65, 14);
		contentPane.add(getLblApellido());
		
		setLblDninif(new JLabel("DNI/NIF:"));
		getLblDninif().setVisible(false);
		getLblDninif().setBounds(48, 286, 65, 14);
		contentPane.add(getLblDninif());
		
		setLblNMatrcula(new JLabel("N\u00B7 Matr\u00EDcula:"));
		getLblNMatrcula().setVisible(false);
		getLblNMatrcula().setBounds(48, 311, 122, 14);
		contentPane.add(getLblNMatrcula());
		
		setLblEstado(new JLabel("Estado:"));
		getLblEstado().setVisible(false);
		getLblEstado().setBounds(48, 336, 65, 14);
		contentPane.add(getLblEstado());
		
		setTxtNombre(new JTextField());
		getTxtNombre().setVisible(false);
		getTxtNombre().setBounds(151, 233, 86, 20);
		contentPane.add(getTxtNombre());
		getTxtNombre().setColumns(10);
		
		setTxtApellido(new JTextField());
		getTxtApellido().setVisible(false);
		getTxtApellido().setBounds(151, 258, 86, 20);
		contentPane.add(getTxtApellido());
		getTxtApellido().setColumns(10);
		
		setTxtDNI(new JTextField());
		getTxtDNI().setVisible(false);
		getTxtDNI().setBounds(151, 283, 86, 20);
		contentPane.add(getTxtDNI());
		getTxtDNI().setColumns(10);
		
		setTxtMat(new JTextField());
		getTxtMat().setVisible(false);
		getTxtMat().setBounds(151, 308, 86, 20);
		contentPane.add(getTxtMat());
		getTxtMat().setColumns(10);
		
		setComboBox(new JComboBox());
		getComboBox().setVisible(false);
		getComboBox().setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "En pr\u00E1cticas", "Finalizado"}));
		getComboBox().setBounds(151, 333, 86, 17);
		contentPane.add(getComboBox());
		
		btnMostrarCuestionario = new JButton("Mostrar Cuestionario");
		btnMostrarCuestionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTxtDNI().setVisible(true);
				controlador.mostrarCuestionario();
			}
		});
		btnMostrarCuestionario.setBounds(282, 282, 133, 23);
		contentPane.add(btnMostrarCuestionario);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}

	public JTextField getTxtDNI() {
		return txtDNI;
	}

	public void setTxtDNI(JTextField txtDNI) {
		this.txtDNI = txtDNI;
	}

	public JTextField getTxtMat() {
		return txtMat;
	}

	public void setTxtMat(JTextField txtMat) {
		this.txtMat = txtMat;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JLabel getLblApellido() {
		return lblApellido;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblApellido = lblApellido;
	}

	public JLabel getLblNMatrcula() {
		return lblNMatrcula;
	}

	public void setLblNMatrcula(JLabel lblNMatrcula) {
		this.lblNMatrcula = lblNMatrcula;
	}

	public JLabel getLblDninif() {
		return lblDninif;
	}

	public void setLblDninif(JLabel lblDninif) {
		this.lblDninif = lblDninif;
	}

	public JLabel getLblEstado() {
		return lblEstado;
	}

	public void setLblEstado(JLabel lblEstado) {
		this.lblEstado = lblEstado;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
}
