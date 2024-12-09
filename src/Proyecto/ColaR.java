package Proyecto;
public class ColaR {
	private int max=30;
	private Reserva v[]=new Reserva[max+1];
	private int ini,fin;
	public ColaR() {
		ini=fin=0;
	}
	public boolean esvacia ()
	{
		if (ini == 0 && fin == 0)
			return (true);
		return (false);
	}
	public boolean esllena ()
	{
		if (fin == max)
			return (true);
		return (false);
	}
	public int nroelem ()
	{
		return (fin - ini);
	}
	public void adicionar (Reserva elem)
	{
		if (!esllena ())
		{
			fin++;
			v [fin] = elem;
		}
		else
			System.out.println ("Cola Simple llena");
	}
	public Reserva eliminar ()
	{
		Reserva elem = null;
		if (!esvacia ())
		{
			ini++;
			elem = v [ini];
			if (ini == fin)
				ini = fin = 0;
		}
		else
			System.out.println ("Cola Simple vacia");
		return (elem);
	}
	public void mostrar ()
	{
		Reserva elem=null;
		if (esvacia ())
			System.out.println ("Cola vacia");
		else
		{
			System.out.println();
			System.out.println ("              *RESERVA ");
			ColaR aux = new ColaR ();
			while (!esvacia ())
			{
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();
			}
			System.out.println();
			while (!aux.esvacia ())
			{
				elem = aux.eliminar ();

				adicionar (elem);
			}
		}
	}
	public void vaciar (ColaR a)
	{
		while (!a.esvacia ())
			adicionar (a.eliminar ());
	}
}
