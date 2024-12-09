package Proyecto;

public class NodoGimnacio {
	private NodoGimnacio sig;
	private NodoGimnacio ant;
	private Gimnacio z;
	public NodoGimnacio() {
		sig = null;
		ant = null;
	}
	public NodoGimnacio getSig() {
		return sig;
	}
	public void setSig(NodoGimnacio sig) {
		this.sig = sig;
	}
	public NodoGimnacio getAnt() {
		return ant;
	}
	public void setAnt(NodoGimnacio ant) {
		this.ant = ant;
	}
	public Gimnacio getZ() {
		return z;
	}
	public void setZ(Gimnacio z) {
		this.z = z;
	}
}
