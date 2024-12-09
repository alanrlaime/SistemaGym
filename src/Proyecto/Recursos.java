package Proyecto;
public class Recursos {
	private String nombre;
	private boolean disponibilidad;
	private String estado;
	public Recursos() {

	}
	public Recursos(String c ,boolean a, String b) {
		nombre=c;disponibilidad=a; estado=b;
	}
	public void mostrar() {
		System.out.println("          -NOMBRE DE LA MAQUINA: "+nombre+"    -DISPONIBILIDAD: "+disponibilidad+ "     -ESTADO: "+estado);
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
