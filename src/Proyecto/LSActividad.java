package Proyecto;
public class LSActividad{
	private NodoA P;

	public LSActividad() {
		P = null;
	}

	public NodoA getP() {
		return P;
	}

	public void setP(NodoA p) {
		P = p;
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Actividad z) {
		NodoA nuevo = new NodoA();
		nuevo.setQ(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Actividad z) {
		NodoA nuevo = new NodoA();
		nuevo.setQ(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoA R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoA R = P;   //R apunta  a la raiz P
		System.out.println();
		System.out.println("                 *ACTIVIDADES QUE REALIZO EL CLIENTE:*");
		while(R != null) {
			R.getQ().mostrarObj();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoA R = P;
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
	
	public NodoA eliPrincipio() {
		NodoA x = new NodoA();    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoA eliFinal() {
		NodoA x = new NodoA();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoA R = P;
				NodoA S = P;
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
	
	public void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Actividad z = new Actividad();
			z.definir();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Actividad z = new Actividad();
			z.definir();
			adiFinal(z);
		}
	}
}
