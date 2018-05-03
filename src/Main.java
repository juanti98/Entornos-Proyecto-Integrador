import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	public Main(){
		super();
	}
	public void ejecutar() {
		VentanaLogin vistaInicial = new VentanaLogin();

		AltaEstudiante vistaAltaEstu = new AltaEstudiante();
		MenuTutor vistaMenuTutor = new MenuTutor();
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
