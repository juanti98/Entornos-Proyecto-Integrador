import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AltaGrupo extends JFrame{
	
	private JPanel contentPane;
	private JTextField txtAnoAcademico;
	private JTextField txtCodGrupo;
	private JButton btnAnadirGrupo;




	/**
	 * Create the frame.
	 */
	public AltaGrupo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCodGrupo = new JLabel("Código Grupo: ");
		lblCodGrupo.setBounds(25, 23, 72, 14);
		contentPane.add(lblCodGrupo);

		JLabel lblAnoAcademico = new JLabel("Año Académico: ");
		lblAnoAcademico.setBounds(25, 73, 86, 14);
		contentPane.add(lblAnoAcademico);

		txtAnoAcademico = new JTextField();
		txtAnoAcademico.setBounds(135, 70, 86, 20);
		contentPane.add(txtAnoAcademico);
		txtAnoAcademico.setColumns(10);

		txtCodGrupo = new JTextField();
		txtCodGrupo.setBounds(135, 20, 86, 20);
		contentPane.add(txtCodGrupo);
		txtCodGrupo.setColumns(10);

		btnAnadirGrupo = new JButton("Añadir Grupo");

		btnAnadirGrupo.setBounds(223, 172, 117, 23);
		contentPane.add(btnAnadirGrupo);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(110, 172, 86, 23);
		contentPane.add(btnVolver);
	}


}

