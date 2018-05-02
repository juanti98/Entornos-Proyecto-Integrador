
public class Controlador {

	private ActualizarEstudiante ActEst;
	private AltaEstudiante AltaEst;
	private BorrarEstudiante BorrarEst;
	private MenuTutor MenuTutor;
	private VentanaLogin VentLogin;

	public void setvistaInicial(VentanaLogin vistaInicial) {
		this.VentLogin = vistaInicial;
	}

	public void setvistaActualizar(ActualizarEstudiante vistaActualizar) {
		this.ActEst = vistaActualizar;
	}

	public void setvistaAlta(AltaEstudiante vistaAltaEstu) {
		this.AltaEst = vistaAltaEstu;
	}

	public void setvistaBorrar(BorrarEstudiante vistaBorrar) {
		this.BorrarEst = vistaBorrar;
	}

	public void setvistaMenu(MenuTutor vistaMenu) {
		this.MenuTutor = vistaMenu;
	}

	public void loginMenuATutor() {
		VentLogin.dispose();
		MenuTutor menu = new MenuTutor();
		menu.setVisible(true);
		System.out.println("Hola Mundo");
	}

}
