package Controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;

import Vistas.AltaEstudiante;
import Vistas.MenuTutor;
import Vistas.VentanaEstudiantes;
import Vistas.VentanaLogin;
import Vistas.VisualizarEmpresas;

public class Controlador {

	public Controlador() {
		super();
	}

	private AltaEstudiante AltaEst;
	private VentanaEstudiantes EstudiantesTutor;
	private VentanaLogin VentLogin;
	private Vistas.MenuTutor menuTutor;
	private VisualizarEmpresas VerEmpresas;

	public void setVentanaLogin(VentanaLogin vistaInicial) {
		this.VentLogin = vistaInicial;
	}

	public void setAltaEstudiante(AltaEstudiante vistaAltaEstu) {
		this.AltaEst = vistaAltaEstu;
	}

	public void setVentanaEstudiante(VentanaEstudiantes vistaMenu) {
		this.EstudiantesTutor = vistaMenu;
	}

	public void LoginAMenuTutor() {
		VentLogin.dispose();
		menuTutor.setVisible(true);
	}

	public void botonVolverMenu() {
		VerEmpresas.setVisible(false);
		AltaEst.setVisible(false);
		EstudiantesTutor.setVisible(false);
		menuTutor.setVisible(true);
	}

	public void irAAnadir() {
		EstudiantesTutor.setVisible(false);
		AltaEst.setVisible(true);
	}

	public void TutorAEstudiantes() {
		menuTutor.setVisible(false);
		EstudiantesTutor.setVisible(true);

	}

	public void botonVolverVentanaEstudiante() {
		AltaEst.setVisible(false);
		EstudiantesTutor.setVisible(true);
	}

	public void TutorAEmpresas() {
		menuTutor.setVisible(false);
		VerEmpresas.setVisible(true);
	}

	public void setMenuTutor(MenuTutor menuTutor2) {
		this.menuTutor = menuTutor2;

	}

	public void setVerEmpresas(VisualizarEmpresas verEmpresas2) {
		this.VerEmpresas = verEmpresas2;

	}

}
