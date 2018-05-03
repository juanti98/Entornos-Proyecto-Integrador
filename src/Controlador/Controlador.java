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
		MenuTutor.txtDNI.setVisible(true);
		MenuTutor.txtMat.setVisible(true);
		MenuTutor.txtApellido.setVisible(true);
		MenuTutor.txtNombre.setVisible(true);
		MenuTutor.lblNombre.setVisible(true);
		MenuTutor.lblApellido.setVisible(true);
		MenuTutor.lblDninif.setVisible(true);
		MenuTutor.lblNMatrcula.setVisible(true);
		MenuTutor.lblEstado.setVisible(true);
		MenuTutor.comboBox.setVisible(true);
	}
	
	public void irAAnadir(){
		MenuTutor.setVisible(false);	
		AltaEst.setVisible(true);
	}
	


}
