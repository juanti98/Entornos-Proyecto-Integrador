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

	/**
	 * Create the frame.
	 */
	public MenuDirector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 327);
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
		btnNewButton.setBounds(113, 25, 194, 42);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Grupos\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuAVentanaGrupos();
			}
		});
		btnNewButton_1.setBounds(113, 78, 194, 42);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Ciclos");
		btnNewButton_2.setBounds(113, 129, 194, 42);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Empresas");
		btnNewButton_3.setBounds(113, 182, 194, 42);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Tutor");
		btnNewButton_4.setBounds(113, 235, 194, 42);
		contentPane.add(btnNewButton_4);
	}

	public void setControlador(Controlador controlador2) {
		this.controlador=controlador2;
		
	}

}
