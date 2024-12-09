package Proyecto;
import java.util.Scanner;

public class Sesion {
    private Cliente cliente;
    private Instructor instructor;
    private LSActividad actividades; 
    private int costo;
 
    public Sesion(){

    }
    
    public Sesion(Cliente a, Instructor b, LSActividad c, int e) {
        cliente = a;
        instructor = b;
        actividades = c;
     
        costo = e;
   
    }

    public void mostrar(){
    	System.out.println();
    	System.out.println("            -SECIONES: COSTO = " +costo);
     instructor.mostrar();
     cliente.mostrar();
     actividades.mostrar();
    }
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public LSActividad getActividades() {
		return actividades;
	}

	public void setActividades(LSActividad actividades) {
		this.actividades = actividades;
	}


	public int getDia() {
		return costo;
	}

	public void setDia(int costo) {
		this.costo = costo;
	}
	public void definir(){
        Scanner lee = new Scanner(System.in);
        System.out.println("No se puede leer una Sesion");
    }
}
