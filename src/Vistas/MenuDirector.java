package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MenuDirector extends JFrame {

	private JPanel contentPane;
	

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
		
		JButton btnNewButton = new JButton("Centros");
		btnNewButton.setBounds(113, 25, 194, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grupos\r\n");
		btnNewButton_1.setBounds(113, 78, 194, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ciclos");
		btnNewButton_2.setBounds(113, 129, 194, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Empresas");
		btnNewButton_3.setBounds(113, 182, 194, 42);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Tutor");
		btnNewButton_4.setBounds(113, 235, 194, 42);
		contentPane.add(btnNewButton_4);
	}

}
