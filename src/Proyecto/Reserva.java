package Proyecto;
public class Reserva {
	private String Nombre;
	private int idReserva;
	private int ci;
	private String fecha;
	private int membresia;
	public Reserva() {

	}
	public Reserva(String e,int a, int b, String c, int d) {
	Nombre=e;  idReserva=a; ci=b; fecha=c; membresia=d;
	}
	public void mostrar() {
		System.out.println("                -NOMBRE: "+Nombre+ ",  ID_RESERVA:" +idReserva+ ",  CI:" +ci+ " FECHA: " +fecha+ ",  MEMBRESIA: " +membresia);
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getMembresia() {
		return membresia;
	}
	public void setMembresia(int membresia) {
		this.membresia = membresia;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
