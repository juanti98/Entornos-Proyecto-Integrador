public class Controlador {

	public Controlador() {
		super();
	}


	private AltaEstudiante AltaEst;
	private MenuTutor MenuTutor;
	private VentanaLogin VentLogin;


	public void setVentanaLogin(VentanaLogin vistaInicial) {
		this.VentLogin = vistaInicial;
	}


	public void setAltaEstudiante(AltaEstudiante vistaAltaEstu) {
		this.AltaEst = vistaAltaEstu;
	}


	public void setMenuTutor(MenuTutor vistaMenu) {
		this.MenuTutor = vistaMenu;
	}

	public void log() {
		VentLogin.dispose();
		MenuTutor.setVisible(true);
	}

	public void botonVolver() {
		AltaEst.setVisible(false);
		MenuTutor.setVisible(true);
	}
	

	
	public void irAAnadir(){
		MenuTutor.setVisible(false);	
		AltaEst.setVisible(true);
	}
	


}
