package Proyecto;

public class LS_Espacio {
private NodoEspacio P;  //raiz de la lista
	
	public NodoEspacio getP() {
		return P;
	}

	public void setP(NodoEspacio p) {
		P = p;
	}
	
	public LS_Espacio() {
		P = null;
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Espacio z) {
		NodoEspacio nuevo = new NodoEspacio();
		nuevo.setQ(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Espacio z) {
		NodoEspacio nuevo = new NodoEspacio();
		nuevo.setQ(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoEspacio R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoEspacio R = P;   //R apunta  a la raiz P
		System.out.println();
		System.out.println("   *ESPACIOS DEL GIMNACIO.");
		while(R != null) {
			R.getQ().mostrar();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoEspacio R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	
	public NodoEspacio eliPrincipio() {
		NodoEspacio x = new NodoEspacio();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoEspacio eliFinal() {
		NodoEspacio x = new NodoEspacio();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoEspacio R = P;
				NodoEspacio S = P;
				while(R.getSig() != null) {
					S = R;         //S apunta a R
					R = R.getSig(); //R apunta al siguiente de R
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
}
