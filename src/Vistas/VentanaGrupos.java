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

public class VentanaGrupos extends JFrame {
	private JTable table;
	private JTextField txtCodigoGrupoVentanaGrupo;
	private JTextField txtAñoAcademicoVentanaGrupo;
	private JLabel lblCodigoGrupoVentanaGrupo;
	private JLabel lblAñoAcademicoVentanaGrupo;
	private JPanel contentPane;
	private Controlador controlador;

	/**
	 * Create the frame.
	 */
	public VentanaGrupos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 764, 192);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"C\u00F3digo grupo", "A\u00F1o acad\u00E9mico"
			}
		));
		scrollPane.setViewportView(table);

		lblCodigoGrupoVentanaGrupo = new JLabel("Codigo Grupo:");
		lblCodigoGrupoVentanaGrupo.setBounds(52, 220, 86, 14);
		getContentPane().add(lblCodigoGrupoVentanaGrupo);

		txtCodigoGrupoVentanaGrupo = new JTextField();
		txtCodigoGrupoVentanaGrupo.setBounds(148, 217, 86, 20);
		getContentPane().add(txtCodigoGrupoVentanaGrupo);
		txtCodigoGrupoVentanaGrupo.setHorizontalAlignment(SwingConstants.LEFT);
		txtCodigoGrupoVentanaGrupo.setColumns(10);

		JButton button = new JButton("Volver");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.botonVolverMenuDirectorDesdeGrupos();
			}
		});
		button.setBounds(168, 316, 136, 23);
		getContentPane().add(button);

		JButton btnAltaGrupo = new JButton("Alta grupo");
		btnAltaGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.VentanaGrupoAAltaGrupo();
			}
		});
		btnAltaGrupo.setBounds(357, 317, 136, 23);
		getContentPane().add(btnAltaGrupo);

		lblAñoAcademicoVentanaGrupo = new JLabel("A\u00F1o acad\u00E9mico:");
		lblAñoAcademicoVentanaGrupo.setBounds(357, 220, 139, 14);
		getContentPane().add(lblAñoAcademicoVentanaGrupo);

		txtAñoAcademicoVentanaGrupo = new JTextField();
		txtAñoAcademicoVentanaGrupo.setBounds(446, 217, 92, 20);
		getContentPane().add(txtAñoAcademicoVentanaGrupo);
		txtAñoAcademicoVentanaGrupo.setColumns(10);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
	}
}
