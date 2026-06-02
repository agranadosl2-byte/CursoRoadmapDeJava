package CursoRoadmapJava;

public class Persona {
    
    // Usamos 'protected' para que las clases hijas puedan acceder a ellos
    protected String nombre;
    protected int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}