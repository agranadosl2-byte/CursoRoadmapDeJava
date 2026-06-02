package CursoRoadmapJava;

public class Main {

    public static void main(String[] args) {
        
        // Llamamos a los métodos que llevamos hasta ahora
        Enum();
        Excepciones();

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

        // ---------- EJEMPLO 1 ----------
        System.out.println("\n---------- DIVISION ----------");
        try {
            ej.dividir(100, 25); // funciona (da 4)
            ej.dividir(100, 0);  // falla y salta al catch
        } catch (ArithmeticException e) {
            System.out.println("Error matemático detectado: " + e.getMessage());
        }

        // ---------- EJEMPLO 2 ----------
        System.out.println("\n---------- CONVERSION ----------");
        ej.convertir("2026");      // funciona
        ej.convertir("Guatemala"); // falla y el catch de la clase Excepcion lo atrapa
    }

}