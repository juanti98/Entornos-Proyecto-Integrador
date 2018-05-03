import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AltaCentro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaCentro window = new AltaCentro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AltaCentro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_1.setBounds(0, 0, 434, 262);
		panel.add(panel_1);
		
		JLabel lblCodigoCentro = new JLabel("Codigo Centro:");
		lblCodigoCentro.setBounds(79, 33, 86, 14);
		panel_1.add(lblCodigoCentro);
		
		JLabel lblNifCentro = new JLabel("Denominacion centro: ");
		lblNifCentro.setBounds(79, 58, 109, 14);
		panel_1.add(lblNifCentro);
		
		JLabel lblNif = new JLabel("NIF:");
		lblNif.setBounds(79, 83, 46, 14);
		panel_1.add(lblNif);
		
		JLabel lblNombreRepresentante = new JLabel("Nombre Representante: ");
		lblNombreRepresentante.setBounds(79, 167, 119, 14);
		panel_1.add(lblNombreRepresentante);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(198, 105, 86, 20);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(198, 77, 86, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(198, 52, 86, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(198, 27, 86, 20);
		panel_1.add(textField_3);
		
		JButton btnAltaCiclo = new JButton("Alta centro");
		btnAltaCiclo.setBounds(128, 214, 136, 23);
		panel_1.add(btnAltaCiclo);
		
		JLabel lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setBounds(79, 139, 119, 14);
		panel_1.add(lblDireccion);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(198, 136, 86, 20);
		panel_1.add(textField_4);
		
		JLabel lblDat = new JLabel("DAT:");
		lblDat.setBounds(79, 111, 119, 14);
		panel_1.add(lblDat);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(198, 164, 86, 20);
		panel_1.add(textField_5);
	}
}
