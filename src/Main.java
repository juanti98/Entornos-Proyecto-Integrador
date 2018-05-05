import java.awt.EventQueue;

import javax.swing.JFrame;

import Controlador.Controlador;
import Vistas.AltaCentro;
import Vistas.AltaCiclos;
import Vistas.AltaEmpresa;
import Vistas.AltaEstudiante;
import Vistas.AltaGrupo;
import Vistas.AltaTutor;
import Vistas.MenuDirector;
import Vistas.MenuTutor;
import Vistas.VentanaCentros;
import Vistas.VentanaCiclos;
import Vistas.VentanaEmpresas;
import Vistas.VentanaEstudiantes;
import Vistas.VentanaGrupos;
import Vistas.VentanaLogin;
import Vistas.VentanaTutor;
import Vistas.VisualizarEmpresas;

public class Main {

	public Main(){
		super();
	}
	public void ejecutar() {
		VentanaLogin vistaInicial = new VentanaLogin();

		AltaEstudiante vistaAltaEstu = new AltaEstudiante();
		VentanaEstudiantes VentanaEstudiante = new VentanaEstudiantes();
		Controlador controlador = new Controlador();
		MenuTutor MenuTutor=new MenuTutor();
		VisualizarEmpresas VerEmpresas=new VisualizarEmpresas();
		MenuDirector MenDirector=new MenuDirector();
		VentanaCentros VentCentros=new VentanaCentros();
		AltaCentro AltCentro=new AltaCentro();
		VentanaGrupos VentGrupos = new VentanaGrupos();
		VentanaCiclos VentCiclos=new VentanaCiclos();
		AltaGrupo AltGrupo=new AltaGrupo();
		AltaCiclos AltCiclos=new AltaCiclos();
		VentanaEmpresas VentEmpresas=new VentanaEmpresas();
		AltaEmpresa AltEmpresas=new AltaEmpresa();
		VentanaTutor VenTutor=new VentanaTutor();
		AltaTutor AltaTutor=new AltaTutor();

	

		vistaInicial.setControlador(controlador);
		vistaAltaEstu.setControlador(controlador);
		VentanaEstudiante.setControlador(controlador);
		MenuTutor.setControlador(controlador);
		VerEmpresas.setControlador(controlador);
		VentCentros.setControlador(controlador);
		MenDirector.setControlador(controlador);
		AltCentro.setControlador(controlador);
		VentGrupos.setControlador(controlador);
		AltGrupo.setControlador(controlador);
		VentCiclos.setControlador(controlador);
		AltCiclos.setControlador(controlador);
		VentEmpresas.setControlador(controlador);
		AltEmpresas.setControlador(controlador);
		VenTutor.setControlador(controlador);
		AltaTutor.setControlador(controlador);
		
		
		controlador.setVentanaLogin(vistaInicial);
		controlador.setAltaEstudiante(vistaAltaEstu);
		controlador.setVentanaEstudiante(VentanaEstudiante);
		controlador.setMenuTutor(MenuTutor);
		controlador.setVerEmpresas(VerEmpresas);
		controlador.setVentCentros(VentCentros);
		controlador.setMenuDirector(MenDirector);
		controlador.setAltCentro(AltCentro);
		controlador.setVentGrupos(VentGrupos);
		controlador.setAltGrupo(AltGrupo);
		controlador.setVenCiclos(VentCiclos);
		controlador.setAltCiclos(AltCiclos);
		controlador.setVenEmpresas(VentEmpresas);
		controlador.setAltEmpresas(AltEmpresas);
		controlador.setVenTutor(VenTutor);
		controlador.setAltaTutor(AltaTutor);
		
		vistaInicial.setVisible(true);
		
	}

	public static void main(String[] args) {

		new Main().ejecutar();

	}

}
