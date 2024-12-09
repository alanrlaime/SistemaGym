package Proyecto;
public class Instructor extends Persona{
    private String especialidad;

    public Instructor(String nombre, int ci, int edad, String especialidad) {
        super(nombre, ci, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void mostrar() {
    	System.out.println("             *INSTRUCTOR");
    	super.mostrarP();
    	System.out.println("               -ESPECIALIDAD: "+especialidad);
    }
}
