package CursoRoadmapJava;

public class TypeCasting {

    // 1. Convertir de Entero (int) a Decimal (double)
    // Esto es un "Casting Implícito" (Automático) porque double es más grande que int.
    public void intADouble() {
        int numeroEntero = 85;
        double numeroDecimal = numeroEntero; 
        System.out.println("De int a double: " + numeroEntero + " se convierte en -> " + numeroDecimal);
    }

    // 2. Convertir de Entero (int) a Texto (String)
    public void intAString() {
        int anio = 2026;
        String texto = String.valueOf(anio);
        System.out.println("De int a String: El número " + anio + " ahora es el texto -> \"" + texto + "\"");
    }

    // 3. Convertir de Texto (String) a Entero (int)
    public void stringAInt() {
        String precioTexto = "500";
        int precioNumero = Integer.parseInt(precioTexto);
        System.out.println("De String a int: El texto \"" + precioTexto + "\" ahora es el número -> " + precioNumero);
    }
}