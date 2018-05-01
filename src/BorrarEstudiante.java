import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorrarEstudiante extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumMat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrarEstudiante frame = new BorrarEstudiante();
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
	public BorrarEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumeroDeMatrcula = new JLabel("Numero de Matr\u00EDcula:");
		lblNumeroDeMatrcula.setBounds(84, 74, 102, 14);
		contentPane.add(lblNumeroDeMatrcula);

		txtNumMat = new JTextField();
		txtNumMat.setBounds(196, 71, 86, 20);
		contentPane.add(txtNumMat);
		txtNumMat.setColumns(10);

		JButton btnBorrarEstudiante = new JButton("Borrar Estudiante");
		btnBorrarEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorrarEstudiante.this.dispose();
				MenuTutor menu = new MenuTutor();
				menu.setVisible(true);
			}
		});
		btnBorrarEstudiante.setBounds(148, 131, 117, 23);
		contentPane.add(btnBorrarEstudiante);
	}

}
