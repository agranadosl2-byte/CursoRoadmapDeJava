package CursoRoadmapJava;

public class Main {

    public static void main(String[] args) {
        
        // Llamamos al método tal como en tu código original
        Enum();

    }

    public static void Enum() {
        // Usamos los nuevos valores
        Enum.Color miColor = Enum.Color.AZUL;
        Enum.Game gm = Enum.Game.GAME_OVER;
        
        System.out.println(gm);
        
        // Recorremos los estados del juego
        for (Enum.Game g : Enum.Game.values()) {
            System.out.println(g);
        }
        
        System.out.println(miColor);
        System.out.println(Enum.Color.BLANCO);
    }

}