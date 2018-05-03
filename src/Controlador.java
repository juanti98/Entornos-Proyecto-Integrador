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
		MenuTutor.setVisible(true);
	}

	public void botonVolver() {
		AltaEst.setVisible(false);
		MenuTutor.setVisible(true);
	}
	
	public void irAActualizar(){
		MenuTutor.setVisible(false);
		ActEst.setVisible(true);
	}
	
	public void irAAnadir(){
		MenuTutor.setVisible(false);	
		AltaEst.setVisible(true);
	}
	
	public void irABorrar(){	
		MenuTutor.setVisible(false);
		BorrarEst.setVisible(true);
	}

}
