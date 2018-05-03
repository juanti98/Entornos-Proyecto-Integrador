import java.awt.EventQueue;

import javax.swing.JFrame;

import Controlador.Controlador;
import Vistas.AltaEstudiante;
import Vistas.VentanaEstudiantes;
import Vistas.VentanaLogin;

public class Main {

	public Main(){
		super();
	}
	public void ejecutar() {
		VentanaLogin vistaInicial = new VentanaLogin();

		AltaEstudiante vistaAltaEstu = new AltaEstudiante();
		VentanaEstudiantes vistaMenuTutor = new VentanaEstudiantes();
		Controlador controlador = new Controlador();

		vistaInicial.setControlador(controlador);
		vistaAltaEstu.setControlador(controlador);
		vistaMenuTutor.setControlador(controlador);

		controlador.setVentanaLogin(vistaInicial);
		controlador.setAltaEstudiante(vistaAltaEstu);
		controlador.setMenuTutor(vistaMenuTutor);
		
		vistaInicial.setVisible(true);
	}

	public static void main(String[] args) {

		new Main().ejecutar();

	}

}
