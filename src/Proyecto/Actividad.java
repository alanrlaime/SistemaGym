package Proyecto;
import java.util.Scanner;
public class Actividad {
    private String espacio;
    private String tipo;
    public Actividad(){
      
    }
    public Actividad(String espacio, String tipo) {
        this.espacio = espacio;
        this.tipo = tipo;
    }
    public String getEspacio() {
        return espacio;
    }
    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarObj(){
        System.out.println("                   -TIPO: "+this.tipo+" , ESPACIO: "+this.espacio);
    }

    public void definir(){
        Scanner lee = new Scanner(System.in);
        System.out.println("No se puede leer actividad");
    }
}