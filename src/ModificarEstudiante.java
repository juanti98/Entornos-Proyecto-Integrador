import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class ModificarEstudiante extends JFrame {

	private JPanel contentPane;
	private JTextField txtNmatricula;
	private JTextField txtDnialumno;
	private JTextField txtApellidoalumno;
	private JTextField txtNombrealumno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarEstudiante frame = new ModificarEstudiante();
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
	public ModificarEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 434, 262);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(25, 23, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Apellido:");
		label_1.setBounds(25, 48, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("DNI/NIF:");
		label_2.setBounds(25, 73, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("N\u00FAmero de matricula:");
		label_3.setBounds(25, 98, 109, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Estado:");
		label_4.setBounds(25, 123, 46, 14);
		panel.add(label_4);
		
		txtNmatricula = new JTextField();
		txtNmatricula.setText("N\u00B7Matricula");
		txtNmatricula.setColumns(10);
		txtNmatricula.setBounds(144, 95, 86, 20);
		panel.add(txtNmatricula);
		
		txtDnialumno = new JTextField();
		txtDnialumno.setText("DniAlumno");
		txtDnialumno.setHorizontalAlignment(SwingConstants.LEFT);
		txtDnialumno.setColumns(10);
		txtDnialumno.setBounds(144, 70, 86, 20);
		panel.add(txtDnialumno);
		
		txtApellidoalumno = new JTextField();
		txtApellidoalumno.setText("ApellidoAlumno");
		txtApellidoalumno.setColumns(10);
		txtApellidoalumno.setBounds(144, 45, 86, 20);
		panel.add(txtApellidoalumno);
		
		txtNombrealumno = new JTextField();
		txtNombrealumno.setText("NombreAlumno");
		txtNombrealumno.setColumns(10);
		txtNombrealumno.setBounds(144, 20, 86, 20);
		panel.add(txtNombrealumno);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "En pr\u00E1cticas", "Finalizado"}));
		comboBox.setBounds(144, 120, 86, 20);
		panel.add(comboBox);
		
		JButton btnModificarEstudiante = new JButton("Modificar estudiante");
		btnModificarEstudiante.setBounds(129, 172, 136, 23);
		panel.add(btnModificarEstudiante);
	}
}
