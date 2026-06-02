package CursoRoadmapJava;

public class Usuario extends Persona {
    
    private int num; // Atributo propio del Usuario

    // Constructor que llama al constructor del Padre (Persona) usando 'super'
    public Usuario(String nombre, int edad) {
        super(nombre, edad);
    }

    // Setter para el número de usuario
    public void setNum(int num) {
        this.num = num;
    }

    // Sobreescribimos el método toString para imprimir los datos bonitos
    @Override
    public String toString() {
        return "Datos del Usuario -> Nombre: " + getNombre() + " | Edad: " + getEdad() + " | Número asignado: " + num;
    }
}