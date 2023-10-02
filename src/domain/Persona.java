
package domain;

public class Persona {
    // Propiedades
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}' + "; Direccion de memoria: " + super.toString();
        // Para visualizar la ubicacion de memoria mandamos llamar el metodo
        // toString de la clase padre
        
    }
    
    
}
