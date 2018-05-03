
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActualizarEstudiante extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumMat;




	private Controlador controlador;


	/**
	 * Create the frame.
	 */
	public ActualizarEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNmeroDeMatrcula = new JLabel("N\u00FAmero de Matr\u00EDcula:");
		lblNmeroDeMatrcula.setBounds(53, 69, 102, 14);
		contentPane.add(lblNmeroDeMatrcula);

		txtNumMat = new JTextField();
		txtNumMat.setBounds(165, 66, 86, 20);
		contentPane.add(txtNumMat);
		txtNumMat.setColumns(10);
<<<<<<< HEAD
		
=======

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(53, 100, 46, 14);
		contentPane.add(lblEstado);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Pendiente", "En pr\u00E1cticas", "Finalizado" }));
		comboBox.setBounds(165, 97, 86, 20);
		contentPane.add(comboBox);

>>>>>>> branch 'master' of https://github.com/DAM-UEM-1718/ud5-tarea-2-aplicacion-swing-los-golfos.git
		JButton btnActualizarEstado = new JButton("Actualizar Estado");
		btnActualizarEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActualizarEstudiante.this.dispose();
				MenuTutor menu = new MenuTutor();
				menu.setVisible(true);
			}
		});
		btnActualizarEstado.setBounds(148, 115, 115, 23);
		contentPane.add(btnActualizarEstado);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}

}
