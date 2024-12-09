package Proyecto;
public class Persona {
    private String nombre;
    private int ci;
    private int edad;
    public Persona(String nombre, int ci, int edad) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarP() {
    	System.out.println("               -NOMBRE: " +nombre+ "  -CI: " +ci+ "  -EDAD: " +edad);
    }
}
