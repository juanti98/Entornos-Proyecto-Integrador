import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	public Main(){
		super();
	}
	public void ejecutar() {
		VentanaLogin vistaInicial = new VentanaLogin();
		ActualizarEstudiante vistaActualizarEstu = new ActualizarEstudiante();
		AltaEstudiante vistaAltaEstu = new AltaEstudiante();
		BorrarEstudiante vistaBorrarEstu = new BorrarEstudiante();
		MenuTutor vistaMenuTutor = new MenuTutor();
		Controlador controlador = new Controlador();

		vistaInicial.setControlador(controlador);
		vistaActualizarEstu.setControlador(controlador);
		vistaAltaEstu.setControlador(controlador);
		vistaBorrarEstu.setControlador(controlador);
		vistaMenuTutor.setControlador(controlador);

		controlador.setVentanaLogin(vistaInicial);
		controlador.setActualizarEstudiante(vistaActualizarEstu);
		controlador.setAltaEstudiante(vistaAltaEstu);
		controlador.setBorrarEstudiante(vistaBorrarEstu);
		controlador.setMenuTutor(vistaMenuTutor);
		
		vistaInicial.setVisible(true);
	}

	public static void main(String[] args) {

		new Main().ejecutar();

	}

}
