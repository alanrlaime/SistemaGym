package Proyecto;

public class NodoA {
	private Actividad q;  //define el dato objeto persona
	private NodoA sig; //definiendo el campo enlace sig
	
	public NodoA() {  //constructor
		sig = null;
	}

	public Actividad getQ() {
		return q;
	}

	public void setQ(Actividad q) {
		this.q = q;
	}

	public NodoA getSig() {
		return sig;
	}

	public void setSig(NodoA sig) {
		this.sig = sig;
	}
}
