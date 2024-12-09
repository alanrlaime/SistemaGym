package Proyecto;

public class NodoEspacio {
	private Espacio q;  //define el dato objeto persona
	private NodoEspacio sig; //definiendo el campo enlace sig
	
	public NodoEspacio() {  //constructor
		sig = null;
	}

	public Espacio getQ() {
		return q;
	}

	public void setQ(Espacio q) {
		this.q = q;
	}

	public NodoEspacio getSig() {
		return sig;
	}

	public void setSig(NodoEspacio sig) {
		this.sig = sig;
	}	
}
