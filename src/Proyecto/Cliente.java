package Proyecto;
public class Cliente extends Persona {
    private int peso;
    private double altura;
    private String objetivo;
    private String membres;
    public Cliente(String a, int b, int c, int d, double e,String f,String g) {
        super(a, b, c);
        peso=d;
        altura=e;
        objetivo=f;
        membres=g;
    }
	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getMembres() {
		return membres;
	}


	public void setMembres(String membres) {
		this.membres = membres;
	}


	public void mostrar() {
    	System.out.println("             *CLIENTE");
    	super.mostrarP();
    	System.out.println("               -PESO: " +peso+ "kg"+ "  -ALTURA: " +altura+ " DESCRIPCION: " +objetivo+ " MEMBRESIA: " +membres);
    	
    }
}
