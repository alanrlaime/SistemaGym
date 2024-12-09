package Proyecto;
public class ColaS{
	private int max=30;
	private Sesion v[]=new Sesion[max+1];
	private int ini,fin;
	public ColaS() {
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
	public void adicionar (Sesion elem)
	{
		if (!esllena ())
		{
			fin++;
			 v [fin] = elem;
		}
		else
			System.out.println ("Cola Simple llena");
	}
	public Sesion eliminar ()
	{
		Sesion elem = new Sesion();
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
		Sesion elem;
		if (esvacia ())
			System.out.println ("Cola vacia");
		else
		{
			
			ColaS aux = new ColaS ();
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

	public void invertir ()
	{
		ColaS a = new ColaS ();
		ColaS b = new ColaS ();
		while (!esvacia ())
		{
			while (nroelem () != 1)
				a.adicionar (eliminar ());
			b.adicionar (eliminar ());
			while (!a.esvacia ())
				adicionar (a.eliminar ());
		}
		while (!b.esvacia ())
			adicionar (b.eliminar ());

	}
	public void vaciar (ColaS a)
	{
		while (!a.esvacia ())
			adicionar (a.eliminar ());
	}

}
	