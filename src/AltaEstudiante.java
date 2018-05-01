import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaEstudiante extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumMat;
	private JTextField txtDni;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JComboBox comboBox;
	private JButton btnAadirEstudiante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaEstudiante frame = new AltaEstudiante();
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
	public AltaEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(25, 23, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(25, 48, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI/NIF:");
		lblDni.setBounds(25, 73, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblNmeroDeMatricula = new JLabel("N\u00FAmero de matricula:");
		lblNmeroDeMatricula.setBounds(25, 98, 109, 14);
		contentPane.add(lblNmeroDeMatricula);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(25, 123, 46, 14);
		contentPane.add(lblEstado);
		
		txtNumMat = new JTextField();
		txtNumMat.setBounds(144, 95, 86, 20);
		contentPane.add(txtNumMat);
		txtNumMat.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(144, 70, 86, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(144, 45, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(144, 20, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "En pr\u00E1cticas", "Finalizado"}));
		comboBox.setBounds(144, 120, 86, 20);
		contentPane.add(comboBox);
		
		btnAadirEstudiante = new JButton("A\u00F1adir estudiante");
		btnAadirEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaEstudiante.this.dispose();
				MenuTutor menu = new MenuTutor();
				menu.setVisible(true);
			}
		});
		btnAadirEstudiante.setBounds(129, 172, 117, 23);
		contentPane.add(btnAadirEstudiante);
	}
}
