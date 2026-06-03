package CursoRoadmapJava;

public class ModificadorDeAccesoPersona {
    
    private String nombre;
    private int edad;
    private String pais;
    private String ciudad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // --- GETTERS Y SETTERS PARA EDAD ---
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Aquí podríamos poner reglas de validación gracias a que el atributo es privado
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // --- GETTERS Y SETTERS PARA PAIS ---
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // --- GETTERS Y SETTERS PARA CIUDAD ---
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}