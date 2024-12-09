package Proyecto;
public class Espacio {
	private String tipo;
	private String Funcion;
	private LS_Recursos rec;
	public Espacio() {

	}
	public Espacio(String a, String b,LS_Recursos c) {
		tipo=a; Funcion=b; rec=c;
	}
	public void mostrar() {
		System.out.println();
		System.out.println("     -TIPO DE ESPACIO: " +tipo+ "  FUNCION: " +Funcion);
		rec.mostrar();
	}
	
	public String getFuncion() {
		return Funcion;
	}
	public void setFuncion(String funcion) {
		Funcion = funcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LS_Recursos getRec() {
		return rec;
	}
	public void setRec(LS_Recursos rec) {
		this.rec = rec;
	}
}
