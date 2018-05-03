
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

public class MenuTutor extends JFrame {

	private JPanel contentPane;
	private JTable tableEstudiantes;
	private Controlador controlador;

	/**
	 * Create the frame.
	 */
	public MenuTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
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
		btnAadirEstudiante.setBounds(10, 61, 122, 23);
		contentPane.add(btnAadirEstudiante);

		JButton btnActualizarEstado = new JButton("Actualizar estado");
		btnActualizarEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.irAActualizar();
			}
		});
		btnActualizarEstado.setBounds(165, 61, 115, 23);
		contentPane.add(btnActualizarEstado);

		JButton btnBorrarEstudiante = new JButton("Borrar estudiante");
		btnBorrarEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.irABorrar();
			}
		});
		btnBorrarEstudiante.setBounds(305, 61, 119, 23);
		contentPane.add(btnBorrarEstudiante);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}
}
