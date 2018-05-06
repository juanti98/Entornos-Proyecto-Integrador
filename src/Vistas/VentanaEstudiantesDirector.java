package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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

public class VentanaEstudiantesDirector extends JFrame {

	private JPanel contentPane;
	private JTable tableEstudiantes;
	public JTable getTableEstudiantes() {
		return tableEstudiantes;
	}

	public void setTableEstudiantes(JTable tableEstudiantes) {
		this.tableEstudiantes = tableEstudiantes;
	}

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
	private DefaultTableModel miModelo;
	private JButton btnVolver;
	private JButton button;

	/**
	 * Create the frame.
	 */
	public VentanaEstudiantesDirector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 130);
		contentPane.add(scrollPane);

		tableEstudiantes = new JTable();

		tableEstudiantes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {

				getTxtDNI().setVisible(true);
				getTxtMat().setVisible(true);
				getTxtApellido().setVisible(true);
				getTxtNombre().setVisible(true);
				getLblNombre().setVisible(true);
				getLblApellido().setVisible(true);
				getLblDninif().setVisible(true);
				getLblNMatrcula().setVisible(true);
				getLblEstado().setVisible(true);
				getComboBox().setVisible(true);

				int fila = tableEstudiantes.getSelectedRow();

				txtNombre.setText((String) tableEstudiantes.getValueAt(fila, 0));

				txtApellido.setText((String) tableEstudiantes.getValueAt(fila, 0));

				txtDNI.setText((String) tableEstudiantes.getValueAt(fila, 0));

				txtMat.setText((String) tableEstudiantes.getValueAt(fila, 0));

				comboBox.setVisible(true);
			}
		});
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

		JButton btnAadirEstudiante = new JButton("Dar de Alta");
		btnAadirEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.VentEstuDirectorAAltaEstuMenuDirector();
			}
		});
		btnAadirEstudiante.setBounds(109, 313, 122, 23);
		contentPane.add(btnAadirEstudiante);

		setLblNombre(new JLabel("Nombre:"));
		getLblNombre().setVisible(false);
		getLblNombre().setBounds(20, 162, 65, 14);
		contentPane.add(getLblNombre());

		setLblApellido(new JLabel("Apellido:"));
		getLblApellido().setVisible(false);
		getLblApellido().setBounds(20, 187, 65, 14);
		contentPane.add(getLblApellido());

		setLblDninif(new JLabel("DNI/NIF:"));
		getLblDninif().setVisible(false);
		getLblDninif().setBounds(20, 212, 65, 14);
		contentPane.add(getLblDninif());

		setLblNMatrcula(new JLabel("N\u00B7 Matr\u00EDcula:"));
		getLblNMatrcula().setVisible(false);
		getLblNMatrcula().setBounds(20, 237, 122, 14);
		contentPane.add(getLblNMatrcula());

		setLblEstado(new JLabel("Estado:"));
		getLblEstado().setVisible(false);
		getLblEstado().setBounds(20, 262, 65, 14);
		contentPane.add(getLblEstado());

		setTxtNombre(new JTextField());
		getTxtNombre().setVisible(false);
		getTxtNombre().setBounds(123, 159, 86, 20);
		contentPane.add(getTxtNombre());
		getTxtNombre().setColumns(10);

		setTxtApellido(new JTextField());
		getTxtApellido().setVisible(false);
		getTxtApellido().setBounds(123, 184, 86, 20);
		contentPane.add(getTxtApellido());
		getTxtApellido().setColumns(10);

		setTxtDNI(new JTextField());
		getTxtDNI().setVisible(false);
		getTxtDNI().setBounds(123, 209, 86, 20);
		contentPane.add(getTxtDNI());
		getTxtDNI().setColumns(10);

		setTxtMat(new JTextField());
		getTxtMat().setVisible(false);
		getTxtMat().setBounds(123, 234, 86, 20);
		contentPane.add(getTxtMat());
		getTxtMat().setColumns(10);

		setComboBox(new JComboBox());
		getComboBox().setVisible(false);
		getComboBox()
				.setModel(new DefaultComboBoxModel(new String[] { "Pendiente", "En pr\u00E1cticas", "Finalizado" }));
		getComboBox().setBounds(123, 259, 86, 17);
		contentPane.add(getComboBox());

		btnMostrarCuestionario = new JButton("Mostrar Cuestionario");
		btnMostrarCuestionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTxtDNI().setVisible(true);
				getTxtDNI().setVisible(true);
				getTxtMat().setVisible(true);
				getTxtApellido().setVisible(true);
				getTxtNombre().setVisible(true);
				getLblNombre().setVisible(true);
				getLblApellido().setVisible(true);
				getLblDninif().setVisible(true);
				getLblNMatrcula().setVisible(true);
				getLblEstado().setVisible(true);
				getComboBox().setVisible(true);
			}
		});
		btnMostrarCuestionario.setBounds(282, 158, 133, 23);
		contentPane.add(btnMostrarCuestionario);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.botonCerrarEstudianteVolverDirector();
			}
		});
		btnVolver.setBounds(10, 313, 89, 23);
		contentPane.add(btnVolver);
		{
			button = new JButton("Eliminar");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button.setBounds(340, 313, 89, 23);
			contentPane.add(button);
		}
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(241, 313, 89, 23);
		contentPane.add(btnModificar);
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
	
	public DefaultTableModel getModel() {
		return miModelo;
	}
}
