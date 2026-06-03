package CursoRoadmapJava;

public class Main {

    public static void main(String[] args) {
        
        Enum();
        Excepciones();
        herencia();   
        Herencia();  
        instancia();
        modificador_de_acceso();
        refernciayvalor();
        sobreCarga();
        type_casting();
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
    
 // --------------------------------------------------
    // 5. MÉTODO BLOQUE DE INSTANCIA (¡El nuevo!)
    // --------------------------------------------------
    public static void instancia() {
        System.out.println("\n---------- BLOQUE DE INSTANCIA ----------");
        
        // Al crear este objeto, verás que primero se imprime el bloque de instancia y luego el constructor
        InstanciaBloke va = new InstanciaBloke();
        
        va.mostrar();
        va.sumar(15); // Sumamos un valor nuevo
    }
    
 // --------------------------------------------------
    // 6. MÉTODO MODIFICADORES DE ACCESO (¡El nuevo!)
    // --------------------------------------------------
    public static void modificador_de_acceso() {
        System.out.println("\n---------- MODIFICADORES DE ACCESO ----------");
        
        ModificadorDeAccesoPersona p2 = new ModificadorDeAccesoPersona();
        
        // Usamos los setters públicos para modificar los atributos privados
        p2.setNombre("Carlos");
        p2.setEdad(28);
        p2.setPais("México");
        p2.setCiudad("Cancún");
        
        // Usamos los getters públicos para leer la información
        System.out.println("El nombre registrado es: " + p2.getNombre());
        System.out.println("Tiene una edad de: " + p2.getEdad() + " años");
        System.out.println("Su país de origen es: " + p2.getPais());
        System.out.println("Reside en la ciudad de: " + p2.getCiudad());
    }
    
 // --------------------------------------------------
    // 7. MÉTODO PASO POR REFERENCIA Y VALOR (¡El nuevo!)
    // --------------------------------------------------
    public static void refernciayvalor() {
        System.out.println("\n---------- PASO POR REFERENCIA Y POR VALOR ----------");
        
        ReferenciaYporValor p = new ReferenciaYporValor();

        // ---------- PRIMITIVO (Paso por Valor) ----------
        System.out.println("--- Primitivo (copia el valor) ---");
        int miNumero = 42;
        System.out.println("Antes de la función: " + miNumero);
        p.cambiarNumero(miNumero);
        System.out.println("Después de la función: " + miNumero); // NO cambia, sigue siendo 42

        // ---------- OBJETO/ARREGLO (Paso por Referencia) ----------
        System.out.println("\n--- Arreglo/Objeto (copia la dirección de memoria) ---");
        int[] miArreglo = {10, 20, 30};
        System.out.println("Antes de la función (posición 0): " + miArreglo[0]);
        p.cambiarArreglo(miArreglo);
        System.out.println("Después de la función (posición 0): " + miArreglo[0]); // SÍ cambia, ahora es 999
    }
    
 // --------------------------------------------------
    // 8. MÉTODO SOBRECARGA DE MÉTODOS (¡El nuevo!)
    // --------------------------------------------------
    public static void sobreCarga() {
        System.out.println("\n---------- SOBRECARGA DE MÉTODOS ----------");
        
        SobreCarga n = new SobreCarga();
        
        // Java sabe qué método usar dependiendo de los argumentos que le enviamos
        System.out.println("Suma de 2 enteros (10 + 50): " + n.suma(10, 50));
        System.out.println("Suma de 3 enteros (4 + 4 + 4): " + n.suma(4, 4, 4));
        System.out.println("Suma de 3 decimales (2.5 + 2.5 + 2.5): " + n.suma(2.5, 2.5, 2.5));
    }
    
 // --------------------------------------------------
    // 9. MÉTODO TYPE CASTING (¡El nuevo y final!)
    // --------------------------------------------------
    public static void type_casting() {
        System.out.println("\n---------- TYPE CASTING ----------");
        
        TypeCasting t = new TypeCasting();
        
        t.intADouble();
        t.intAString();
        t.stringAInt();
    }

}