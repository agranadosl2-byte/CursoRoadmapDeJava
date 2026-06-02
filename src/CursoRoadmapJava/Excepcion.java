package CursoRoadmapJava;

public class Excepcion {

    // Método para dividir dos números
    public void dividir(int a, int b) {
        int resultado = a / b;
        System.out.println("El resultado es: " + resultado);
    }

    // Método para convertir un texto a número
    public void convertir(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa, el número es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error de conversión: La palabra '" + texto + "' no es un número válido.");
        }
    }
}