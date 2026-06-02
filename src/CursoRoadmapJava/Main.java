package CursoRoadmapJava;

public class Main {

    public static void main(String[] args) {
        
        Enum();
        Excepciones();
        herencia();   
        Herencia();   
        
    }

    // --------------------------------------------------
    // 1. MÉTODO ENUM
    // --------------------------------------------------
    public static void Enum() {
        Enum.Color miColor = Enum.Color.AZUL;
        Enum.Game gm = Enum.Game.GAME_OVER;
        
        System.out.println("--- PRUEBA ENUMS ---");
        System.out.println(gm);
        
        for (Enum.Game g : Enum.Game.values()) {
            System.out.println(g);
        }
        
        System.out.println(miColor);
        System.out.println(Enum.Color.BLANCO);
    }

    // --------------------------------------------------
    // 2. MÉTODO EXCEPCIONES
    // --------------------------------------------------
    public static void Excepciones() {
        Excepcion ej = new Excepcion();

        System.out.println("\n---------- DIVISION ----------");
        try {
            ej.dividir(100, 25);
            ej.dividir(100, 0); 
        } catch (ArithmeticException e) {
            System.out.println("Error matemático detectado: " + e.getMessage());
        }

        System.out.println("\n---------- CONVERSION ----------");
        ej.convertir("2026");      
        ej.convertir("Guatemala"); 
    }

    // --------------------------------------------------
    // 3. MÉTODO HERENCIA (Prueba del Padre)
    // --------------------------------------------------
    public static void herencia() {
        System.out.println("\n---------- CLASE PADRE (Persona) ----------");
        // Nuevo ejemplo
        Persona p1 = new Persona("Maria", 25);
        
        System.out.println("El nombre es " + p1.getNombre());
        System.out.println("La edad es " + p1.getEdad());
    }

    // --------------------------------------------------
    // 4. MÉTODO HERENCIA (Prueba del Hijo)
    // --------------------------------------------------
    public static void Herencia() {
        System.out.println("\n---------- CLASE HIJA (Usuario) ----------");
        // Nuevo ejemplo usando el hijo
        Usuario n = new Usuario("Pedro", 30);
        
        n.setNum(1050); // Le asignamos un ID diferente
        System.out.println(n.toString());
    }

}