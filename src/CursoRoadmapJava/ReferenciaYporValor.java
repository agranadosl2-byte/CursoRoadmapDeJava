package CursoRoadmapJava;

public class ReferenciaYporValor {

    // Método para intentar cambiar un dato primitivo
    public void cambiarNumero(int numero) {
        numero = 999; // Intentamos cambiar el valor a 999
        System.out.println("   (Dentro del método) El número ahora es: " + numero);
    }

    // Método para cambiar un dato por referencia (Arreglo)
    public void cambiarArreglo(int[] arreglo) {
        arreglo[0] = 999; // Cambiamos la primera posición a 999
        System.out.println("   (Dentro del método) El primer elemento del arreglo ahora es: " + arreglo[0]);
    }
}