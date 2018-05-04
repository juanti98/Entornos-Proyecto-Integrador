package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaCiclos extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNombreCiclo;
	private JLabel lblFamiliaProfesional;
	private JLabel lblClaveCiclo;
	private JTextField txtClaveCiclo;
	private JTextField txtNombreCiclo;
	private JTextField txtFamiliaProfesional;
	private JTextField txtNombreFamiliaProfesional;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCiclos frame = new VentanaCiclos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCiclos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 528, 115);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Clave Ciclo", "Nombre Ciclo", "Familia Profesional", "Nombre Familia Profesional"
			}
		));
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		
		lblNewLabel = new JLabel("Nombre Familia Profesional:");
		lblNewLabel.setBounds(269, 193, 140, 42);
		contentPane.add(lblNewLabel);
		
		lblNombreCiclo = new JLabel("Nombre Ciclo:");
		lblNombreCiclo.setBounds(44, 207, 68, 14);
		contentPane.add(lblNombreCiclo);
		
		lblFamiliaProfesional = new JLabel("Familia Profesional:");
		lblFamiliaProfesional.setBounds(269, 165, 107, 14);
		contentPane.add(lblFamiliaProfesional);
		
		lblClaveCiclo = new JLabel("Clave Ciclo:");
		lblClaveCiclo.setBounds(44, 165, 68, 14);
		contentPane.add(lblClaveCiclo);
		
		txtClaveCiclo = new JTextField();
		txtClaveCiclo.setBounds(133, 162, 86, 20);
		contentPane.add(txtClaveCiclo);
		txtClaveCiclo.setColumns(10);
		
		txtNombreCiclo = new JTextField();
		txtNombreCiclo.setColumns(10);
		txtNombreCiclo.setBounds(133, 204, 86, 20);
		contentPane.add(txtNombreCiclo);
		
		txtFamiliaProfesional = new JTextField();
		txtFamiliaProfesional.setColumns(10);
		txtFamiliaProfesional.setBounds(406, 162, 86, 20);
		contentPane.add(txtFamiliaProfesional);
		
		txtNombreFamiliaProfesional = new JTextField();
		txtNombreFamiliaProfesional.setColumns(10);
		txtNombreFamiliaProfesional.setBounds(406, 204, 86, 20);
		contentPane.add(txtNombreFamiliaProfesional);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(10, 246, 107, 23);
		contentPane.add(btnVolver);
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBounds(127, 246, 136, 23);
		contentPane.add(btnAñadir);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(273, 246, 136, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(416, 246, 122, 23);
		contentPane.add(btnEliminar);
	}
}
