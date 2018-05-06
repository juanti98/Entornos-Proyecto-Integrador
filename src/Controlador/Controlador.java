package Controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;

import Vistas.AltaCentro;
import Vistas.AltaCiclos;
import Vistas.AltaEmpresa;
import Vistas.AltaEstudiante;
import Vistas.AltaEstudianteMenuDirector;
import Vistas.AltaGrupo;
import Vistas.AltaTutor;
import Vistas.MenuDirector;
import Vistas.MenuTutor;
import Vistas.VentanaCentros;
import Vistas.VentanaCiclos;
import Vistas.VentanaEmpresas;
import Vistas.VentanaEstudiantes;
import Vistas.VentanaEstudiantesDirector;
import Vistas.VentanaGrupos;
import Vistas.VentanaLogin;
import Vistas.VentanaTutor;
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
	private VentanaCentros VentCentros;
	private MenuDirector MenDirector;
	private AltaCentro AltCentro;
	private VentanaGrupos VenGrupos;
	private VentanaCentros VenCentros;
	private VentanaCiclos VenCiclos;
	private AltaGrupo AltGrupo;
	private AltaCiclos AltCiclos;
	private VentanaEmpresas VenEmpresas;
	private AltaEmpresa AltEmpresas;
	private VentanaTutor VenTutor;
	private AltaTutor AltTutor;
	private VentanaEstudiantesDirector VentEstDir;
	private AltaEstudianteMenuDirector AltEstuMenuDirector;

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

	public void setVentCentros(VentanaCentros ventCentros2) {
		this.VentCentros = ventCentros2;

	}

	public void LoginAMenuDirector() {
		VentLogin.setVisible(false);
		MenDirector.setVisible(true);
	}

	public void MenuAVentanaCentros() {
		MenDirector.setVisible(false);
		VentCentros.setVisible(true);
	}

	public void setMenuDirector(MenuDirector menDirector2) {
		this.MenDirector = menDirector2;

	}

	public void botonVolverMenuDirector() {
		VenTutor.setVisible(false);
		VenCiclos.setVisible(false);
		VenGrupos.setVisible(false);
		VentCentros.setVisible(false);
		MenDirector.setVisible(true);

	}

	public void setAltCentro(AltaCentro altCentro2) {
		this.AltCentro = altCentro2;

	}

	public void VentanaCentroAAltaCentro() {
		VentCentros.setVisible(false);
		AltCentro.setVisible(true);

	}

	public void botonVolverVentanaCentro() {
		AltCentro.setVisible(false);
		VentCentros.setVisible(true);

	}

	public void VentanaGruposAAltaGrupo() {
		VenGrupos.setVisible(false);
		AltGrupo.setVisible(true);

	}

	public void MenuAVentanaGrupos() {
		MenDirector.setVisible(false);
		VenGrupos.setVisible(true);

	}

	public void setVentGrupos(VentanaGrupos ventGrupos) {
		// TODO Auto-generated method stub
		this.VenGrupos = ventGrupos;
	}

	public void botonVolverMenuDirectorDesdeGrupos() {
		VenEmpresas.setVisible(false);
		VenGrupos.setVisible(false);
		MenDirector.setVisible(true);
	}

	public void VentanaGrupoAAltaGrupo() {
		AltGrupo.setVisible(true);
		VenGrupos.setVisible(false);

	}

	public void setAltGrupo(AltaGrupo altGrupo2) {
		this.AltGrupo = altGrupo2;

	}

	public void botonVolverVentanaGrupo() {
		AltGrupo.setVisible(false);
		VenGrupos.setVisible(true);

	}

	public void MenuAVentanaCiclos() {
		VenCiclos.setVisible(true);
		MenDirector.setVisible(false);

	}

	public void setVenCiclos(VentanaCiclos ventCiclos) {
		this.VenCiclos = ventCiclos;

	}

	public void VentanaCiclosAAltaCiclos() {
		VenCiclos.setVisible(false);
		AltCiclos.setVisible(true);

	}

	public void setAltCiclos(AltaCiclos altCiclos2) {
		this.AltCiclos = altCiclos2;

	}

	public void botonVolverVentanaCiclos() {
		AltCiclos.setVisible(false);
		VenCiclos.setVisible(true);

	}

	public void MenuAVentanaEmpresas() {
		VenEmpresas.setVisible(true);
		MenDirector.setVisible(false);

	}

	public void setVenEmpresas(VentanaEmpresas ventEmpresas) {
		this.VenEmpresas = ventEmpresas;

	}

	public void VentanaEmpresasAAltaEmpresas() {
		AltEmpresas.setVisible(true);
		VenEmpresas.setVisible(false);

	}

	public void setAltEmpresas(AltaEmpresa altEmpresas2) {
		this.AltEmpresas = altEmpresas2;

	}

	public void AltaEmpresaAVentanaEmpresa() {
		AltEmpresas.setVisible(false);
		VenEmpresas.setVisible(true);

	}

	public void setVenTutor(VentanaTutor venTutor) {
		this.VenTutor = venTutor;

	}
	
	public void setVentEstDir(VentanaEstudiantesDirector VentEstDir){
		this.VentEstDir = VentEstDir;
	}

	public void MenuAVentanaTutor() {
		MenDirector.setVisible(false);
		VenTutor.setVisible(true);

	}
	
	public void MenuDirAVistaAlumnos(){
		MenDirector.setVisible(false);
		VentEstDir.setVisible(true);
	}

	public void VentanaTutorAAltaTutor() {
		VenTutor.setVisible(false);
		AltTutor.setVisible(true);
		
	}

	public void setAltaTutor(AltaTutor altaTutor) {
		this.AltTutor=altaTutor;
		
	}

	public void botonVolverVentanaTutor() {
		this.AltTutor.setVisible(false);
		this.VenTutor.setVisible(true);
		
	}
	
	public void botonCerrarEstudianteVolverDirector() {
		VentEstDir.setVisible(false);
		MenDirector.setVisible(true);
	}

	public void botonVolverVentanaEstudianteMenuDirector() {
		AltEstuMenuDirector.setVisible(false);
		VentEstDir.setVisible(true);
		
		
	}

	public void setAltEstuMenuDirector(AltaEstudianteMenuDirector altEstuMenuDirector) {
		this.AltEstuMenuDirector=altEstuMenuDirector;
		
	}

	public void VentEstuDirectorAAltaEstuMenuDirector() {
		VentEstDir.setVisible(false);
		AltEstuMenuDirector.setVisible(true);
		
	}

}
