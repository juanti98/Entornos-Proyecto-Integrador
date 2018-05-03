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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisualizarEmpresas extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private Controlador controlador;
	private JButton btnVolver;


	/**
	 * Create the frame.
	 */
	public VisualizarEmpresas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 600, 205);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Numero de convenio", "Nombre de la empresa", "Localidad", "Representante de la empresa"
			}
		));
		scrollPane.setViewportView(table);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.botonVolverMenu();
			}
		});
		btnVolver.setBounds(276, 227, 89, 23);
		contentPane.add(btnVolver);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}

}
