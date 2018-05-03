import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AltaEmpresa extends JFrame{

	private JFrame frame;
	private JTextField txtDireccion;
	private JTextField txtNomEmpresa;
	private JTextField txtNumConvenio;
	private JTextField txtTutorEmpresa;
	private JTextField txtRepresentanteEmpresa;
	private JTextField txtFechaFirma;



	/**
	 * Create the application.
	 */
	public AltaEmpresa() {
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
		
		JLabel lblCodigoCentro = new JLabel("N\u00FAmero de convenio:");
		lblCodigoCentro.setBounds(79, 33, 109, 14);
		panel_1.add(lblCodigoCentro);
		
		JLabel lblNifCentro = new JLabel("Nombre empresa:");
		lblNifCentro.setBounds(79, 58, 109, 14);
		panel_1.add(lblNifCentro);
		
		JLabel lblNif = new JLabel("Fecha firma:");
		lblNif.setBounds(79, 83, 66, 14);
		panel_1.add(lblNif);
		
		JLabel lblNombreRepresentante = new JLabel("Representante empresa:");
		lblNombreRepresentante.setBounds(79, 167, 132, 14);
		panel_1.add(lblNombreRepresentante);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(214, 105, 86, 20);
		panel_1.add(txtDireccion);
		
		txtNomEmpresa = new JTextField();
		txtNomEmpresa.setColumns(10);
		txtNomEmpresa.setBounds(214, 55, 86, 20);
		panel_1.add(txtNomEmpresa);
		
		txtNumConvenio = new JTextField();
		txtNumConvenio.setColumns(10);
		txtNumConvenio.setBounds(214, 30, 86, 20);
		panel_1.add(txtNumConvenio);
		
		JButton btnAltaCiclo = new JButton("Volver");
		btnAltaCiclo.setBounds(75, 214, 136, 23);
		panel_1.add(btnAltaCiclo);
		
		JLabel lblDireccion = new JLabel("Tutor empresa:");
		lblDireccion.setBounds(79, 139, 119, 14);
		panel_1.add(lblDireccion);
		
		txtTutorEmpresa = new JTextField();
		txtTutorEmpresa.setColumns(10);
		txtTutorEmpresa.setBounds(214, 136, 86, 20);
		panel_1.add(txtTutorEmpresa);
		
		JLabel lblDat = new JLabel("Direcci\u00F3n:");
		lblDat.setBounds(79, 111, 66, 14);
		panel_1.add(lblDat);
		
		txtRepresentanteEmpresa = new JTextField();
		txtRepresentanteEmpresa.setColumns(10);
		txtRepresentanteEmpresa.setBounds(214, 164, 86, 20);
		panel_1.add(txtRepresentanteEmpresa);
		
		JButton btnAltaEmpresa = new JButton("Alta empresa");
		btnAltaEmpresa.setBounds(221, 214, 136, 23);
		panel_1.add(btnAltaEmpresa);
		
		txtFechaFirma = new JTextField();
		txtFechaFirma.setBounds(214, 80, 86, 20);
		panel_1.add(txtFechaFirma);
		txtFechaFirma.setColumns(10);
	}
}
