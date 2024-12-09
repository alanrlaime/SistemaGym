package Proyecto;

public class MulticolaR {
	private int max=30;
	private ColaR v[]=new ColaR[max+1];
	private int ini,fin;
	public MulticolaR (int i)
	{
		ini=0;  
		this.fin=i;
		for (int j = 0; j < i; j++) {
			v[j]=new ColaR();
		}
	}
	public int nroelem (int i)
	{
		return v[i].nroelem();
	}
	public int nroelem ()
	{
		return ((max + fin - ini) % max);
	}
	public boolean esvacia (int i)
	{
		return v[i].esvacia();
	}
	public boolean esllena (int i)
	{
		return v[i].esllena();
	}

	public void adicionar (int i,Reserva elem)
	{
		v[i].adicionar(elem);
	}

	public Reserva eliminar (int i)
	{
		return v[i].eliminar();
	}
	
	public void mostrar ()
	{
		for (int i = ini; i < fin; i++) {
			v[i].mostrar();
		}
	}
	
	public void mostrar(int i) {
		v[i].mostrar();
	}
	
	public void vaciar(int i,ColaR z) {
		v[i].vaciar(z);
	}

	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public ColaR[] getV() {
		return v;
	}
	public void setV(ColaR[] v) {
		this.v = v;
	}
	public int getIni() {
		return ini;
	}
	public void setIni(int ini) {
		this.ini = ini;
	}
	public int getFin() {
		return fin;
	}
	public void setFin(int fin) {
		this.fin = fin;
	}
	
}
