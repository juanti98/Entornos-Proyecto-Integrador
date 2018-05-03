import java.awt.EventQueue;

import javax.swing.JFrame;

import Controlador.Controlador;
import Vistas.AltaEstudiante;
import Vistas.MenuTutor;
import Vistas.VentanaEstudiantes;
import Vistas.VentanaLogin;
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

		vistaInicial.setControlador(controlador);
		vistaAltaEstu.setControlador(controlador);
		VentanaEstudiante.setControlador(controlador);
		MenuTutor.setControlador(controlador);
		VerEmpresas.setControlador(controlador);

		controlador.setVentanaLogin(vistaInicial);
		controlador.setAltaEstudiante(vistaAltaEstu);
		controlador.setVentanaEstudiante(VentanaEstudiante);
		controlador.setMenuTutor(MenuTutor);
		controlador.setVerEmpresas(VerEmpresas);
		
		vistaInicial.setVisible(true);
	}

	public static void main(String[] args) {

		new Main().ejecutar();

	}

}
