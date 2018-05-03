public class Controlador {
	
	public Controlador() {
		super();
	}

	private ActualizarEstudiante ActEst;
	private AltaEstudiante AltaEst;
	private BorrarEstudiante BorrarEst;
	private MenuTutor MenuTutor;
	private VentanaLogin VentLogin;

	public void setVentanaLogin(VentanaLogin vistaInicial) {
		this.VentLogin = vistaInicial;
	}

	public void setActualizarEstudiante(ActualizarEstudiante vistaActualizar) {
		this.ActEst = vistaActualizar;
	}

	public void setAltaEstudiante(AltaEstudiante vistaAltaEstu) {
		this.AltaEst = vistaAltaEstu;
	}

	public void setBorrarEstudiante(BorrarEstudiante vistaBorrar) {
		this.BorrarEst = vistaBorrar;
	}

	public void setMenuTutor(MenuTutor vistaMenu) {
		this.MenuTutor = vistaMenu;
	}

	public void log() {
		VentLogin.dispose();
		MenuTutor menu = new MenuTutor();
		menu.setVisible(true);
		
	}
}
