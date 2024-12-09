package Proyecto;
public class Gimnacio {
	private String nombre;
	private int idGim;
	private String ubicacion;
	private LS_Espacio espacio;
	private int MembresiaDia;
	private int MembresiaSemana;
	private int MembresiaMes;
	public Gimnacio() {

	}
	public Gimnacio(String a, int b, String c, LS_Espacio d, int e,int f, int g) {
		nombre=a; idGim=b; ubicacion=c; espacio=d; MembresiaDia=e; MembresiaSemana=f; MembresiaMes=g;
	}
	public void mostrar() {
		System.out.println("** GIMNACIO = " +nombre+ " **");
		System.out.println("  -IDE_GIMNACIO: " +idGim+ "  -UBICACION: " +ubicacion);
		System.out.println("   COSTOS= DIA = "+MembresiaDia+ "Bs "+" MEMBRESIA SEMANA: " +MembresiaSemana+ "Bs " + " MEMBRESIA MES = "+MembresiaMes+ "Bs");
		espacio.mostrar();
	}
	public int getIdGim() {
		return idGim;
	}
	public void setIdGim(int idGim) {
		this.idGim = idGim;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public LS_Espacio getEspacio() {
		return espacio;
	}
	public void setEspacio(LS_Espacio espacio) {
		this.espacio = espacio;
	}
	public int getMembresiaDia() {
		return MembresiaDia;
	}
	public void setMembresiaDia(int membresiaDia) {
		MembresiaDia = membresiaDia;
	}
	public int getMembresiaSemana() {
		return MembresiaSemana;
	}
	public void setMembresiaSemana(int membresiaSemana) {
		MembresiaSemana = membresiaSemana;
	}
	public int getMembresiaMes() {
		return MembresiaMes;
	}
	public void setMembresiaMes(int membresiaMes) {
		MembresiaMes = membresiaMes;
	}
}
