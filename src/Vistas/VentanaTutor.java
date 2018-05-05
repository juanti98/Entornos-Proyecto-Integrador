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

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaTutor extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNombre;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JTextField txtNIF;
	private Controlador controlador;

	public VentanaTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 713, 199);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido 1", "Apellido 2", "NIF"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(46, 232, 67, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido1 = new JLabel("Apellido 1:");
		lblApellido1.setBounds(46, 257, 79, 14);
		contentPane.add(lblApellido1);
		
		JLabel lblApellido2 = new JLabel("Apellido 2:");
		lblApellido2.setBounds(429, 224, 67, 14);
		contentPane.add(lblApellido2);
		
		JLabel lblNif = new JLabel("NIF:");
		lblNif.setBounds(429, 254, 46, 14);
		contentPane.add(lblNif);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(143, 229, 146, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.setBounds(143, 254, 146, 20);
		contentPane.add(txtApellido1);
		txtApellido1.setColumns(10);
		
		txtApellido2 = new JTextField();
		txtApellido2.setBounds(526, 221, 146, 20);
		contentPane.add(txtApellido2);
		txtApellido2.setColumns(10);
		
		txtNIF = new JTextField();
		txtNIF.setBounds(526, 251, 146, 20);
		contentPane.add(txtNIF);
		txtNIF.setColumns(10);
		
		JButton btnAnadir = new JButton("Dar de Alta");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.VentanaTutorAAltaTutor();
			}
		});
		btnAnadir.setBounds(401, 296, 133, 23);
		contentPane.add(btnAnadir);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(258, 296, 133, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(544, 296, 133, 23);
		contentPane.add(btnEliminar);
		
		JButton btnVovler = new JButton("Vovler");
		btnVovler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.botonVolverMenuDirector();
			}
		});
		btnVovler.setBounds(115, 296, 133, 23);
		contentPane.add(btnVovler);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}
}
