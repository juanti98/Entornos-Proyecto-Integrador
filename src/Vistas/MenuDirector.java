package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuDirector extends JFrame {

	private JPanel contentPane;
	
	private Controlador controlador;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnEstudiantes;

	/**
	 * Create the frame.
	 */
	public MenuDirector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Centros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuAVentanaCentros();
			}
		});
		btnNewButton.setBounds(115, 64, 194, 42);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Grupos\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuAVentanaGrupos();
			}
		});
		btnNewButton_1.setBounds(115, 117, 194, 42);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Ciclos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuAVentanaCiclos();
			}
		});
		btnNewButton_2.setBounds(115, 168, 194, 42);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Empresas");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuAVentanaEmpresas();
			}
		});
		btnNewButton_3.setBounds(115, 221, 194, 42);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Tutor");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuAVentanaTutor();
			}
		});
		btnNewButton_4.setBounds(115, 274, 194, 42);
		contentPane.add(btnNewButton_4);
		
		btnEstudiantes = new JButton("Estudiantes");
		btnEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuDirAVistaAlumnos();
			}
		});
		btnEstudiantes.setBounds(115, 11, 194, 42);
		contentPane.add(btnEstudiantes);
	}

	public void setControlador(Controlador controlador2) {
		this.controlador=controlador2;
		
	}

}
