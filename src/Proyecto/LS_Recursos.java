package Proyecto;

public class LS_Recursos {
private NodoRec P;  //raiz de la lista
	
	public NodoRec getP() {
		return P;
	}

	public void setP(NodoRec p) {
		P = p;
	}
	
	public LS_Recursos() {
		P = null;
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Recursos z) {
		NodoRec nuevo = new NodoRec();
		nuevo.setQ(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Recursos z) {
		NodoRec nuevo = new NodoRec();
		nuevo.setQ(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoRec R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoRec R = P;   //R apunta  a la raiz P
		System.out.println("       	*RECURSOS DE MAQUINAS DEL ESPACIO DEL GIMNACIO");
		while(R != null) {
			R.getQ().mostrar();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoRec R = P;
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
	
	public NodoRec eliPrincipio() {
		NodoRec x = new NodoRec();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoRec eliFinal() {
		NodoRec x = new NodoRec();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoRec R = P;
				NodoRec S = P;
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
