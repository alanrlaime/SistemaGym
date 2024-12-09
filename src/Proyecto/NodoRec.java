package Proyecto;

public class NodoRec {
	private Recursos q;  //define el dato objeto persona
	private NodoRec sig; //definiendo el campo enlace sig
	
	public NodoRec() {  //constructor
		sig = null;
	}

	public Recursos getQ() {
		return q;
	}

	public void setQ(Recursos q) {
		this.q = q;
	}

	public NodoRec getSig() {
		return sig;
	}

	public void setSig(NodoRec sig) {
		this.sig = sig;
	}
}
