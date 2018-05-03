package Controlador;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Vistas.AltaEstudiante;
import Vistas.VentanaEstudiantes;
import Vistas.VentanaLogin;

public class Controlador {

	public Controlador() {
		super();
	}


	private AltaEstudiante AltaEst;
	private VentanaEstudiantes MenuTutor;
	private VentanaLogin VentLogin;


	public void setVentanaLogin(VentanaLogin vistaInicial) {
		this.VentLogin = vistaInicial;
	}


	public void setAltaEstudiante(AltaEstudiante vistaAltaEstu) {
		this.AltaEst = vistaAltaEstu;
	}


	public void setMenuTutor(VentanaEstudiantes vistaMenu) {
		this.MenuTutor = vistaMenu;
	}

	public void log() {
		VentLogin.dispose();
		MenuTutor.setVisible(true);
	}

	public void botonVolver() {
		AltaEst.setVisible(false);
		MenuTutor.setVisible(true);
	}
	
	public void mostrarCuestionario(){
		MenuTutor.getTxtDNI().setVisible(true);
		MenuTutor.getTxtMat().setVisible(true);
		MenuTutor.getTxtApellido().setVisible(true);
		MenuTutor.getTxtNombre().setVisible(true);
		MenuTutor.getLblNombre().setVisible(true);
		MenuTutor.getLblApellido().setVisible(true);
		MenuTutor.getLblDninif().setVisible(true);
		MenuTutor.getLblNMatrcula().setVisible(true);
		MenuTutor.getLblEstado().setVisible(true);
		MenuTutor.getComboBox().setVisible(true);
	}
	
	public void irAAnadir(){
		MenuTutor.setVisible(false);	
		AltaEst.setVisible(true);
	}
	


}
