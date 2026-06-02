package CursoRoadmapJava;

public class InstanciaBloke {
    
    private int valorBase;

    {
        valorBase = 50; // Le asignamos un valor inicial diferente
        System.out.println("[Bloque de Instancia] -> Se ha inicializado el valorBase en: " + valorBase);
    }

    // Constructor de la clase
    public InstanciaBloke() {
        System.out.println("[Constructor] -> El objeto Instanciabloke ha sido creado por completo.");
    }

    // Método para mostrar el valor actual
    public void mostrar() {
        System.out.println("El valor base actual es: " + valorBase);
    }

    // Método para sumar una cantidad al valor base
    public void sumar(int cantidad) {
        int resultado = valorBase + cantidad;
        System.out.println("Si sumamos " + cantidad + " al valor base (" + valorBase + "), el resultado es: " + resultado);
    }
}