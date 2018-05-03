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

public class MenuTutor extends JFrame {

	private JPanel contentPane;

	private Controlador controlador;

	/**
	 * Create the frame.
	 */
	public MenuTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ventanas Estudiantes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.TutorAEstudiantes();
			}
		});
		btnNewButton.setBounds(58, 67, 310, 43);
		contentPane.add(btnNewButton);
		
		JButton btnVisualizarEmpresas = new JButton("Visualizar Empresas");
		btnVisualizarEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.TutorAEmpresas();
			}
		});
		btnVisualizarEmpresas.setBounds(58, 133, 310, 43);
		contentPane.add(btnVisualizarEmpresas);
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}

}
