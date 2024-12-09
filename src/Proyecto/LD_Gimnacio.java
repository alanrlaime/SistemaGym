package Proyecto;

public class LD_Gimnacio {
	protected NodoGimnacio P;
	public LD_Gimnacio() {
		P = null;
	}
	public NodoGimnacio getP() {
		return P;
	}
	public void setP(NodoGimnacio p){
		P = p;
	}
	public boolean esVacia() {
		if(P == null) {
			return true;
		}
		return false;
	}
	public int nroNodos() {
		NodoGimnacio R = P;
		int c =0;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	public void adiPrincipio(Gimnacio z) {
		NodoGimnacio nuevo = new NodoGimnacio();
		nuevo.setZ(z);
		if(esVacia()) {
			P = nuevo;

		}
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}

	}
	public void adiFinal(Gimnacio z) {
		NodoGimnacio nuevo = new NodoGimnacio();
		nuevo.setZ(z);
		if(esVacia()) {
			P = nuevo;

		}else {
			NodoGimnacio R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	public void mostrar() {
		NodoGimnacio R = P;
		System.out.println("GIMNACIO");
		while(R != null) {
			R.getZ().mostrar();
			R = R.getSig();
		}
	}
}
