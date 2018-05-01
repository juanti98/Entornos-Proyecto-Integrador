import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		VentanaLogin vistaInicial = new VentanaLogin();
		ActualizarEstudiante vistaActualizar = new ActualizarEstudiante();
		AltaEstudiante vistaAlta = new AltaEstudiante();
		BorrarEstudiante vistaBorrar = new BorrarEstudiante();
		MenuTutor vistaMenu = new MenuTutor();
		Controlador controlador = new Controlador();
	}
}
