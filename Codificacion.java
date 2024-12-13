public class Codificacion {
}
public class Damas {
    public static void main(String[] args) {
        // Representación del tablero:
        // 'B' = ficha del jugador blanco
        // 'N' = ficha del jugador negro
        // ' ' = casilla vacía
        char[][] tablero = {
                {'B', ' ', 'B', ' ', 'B', ' ', 'B', ' '},
                {' ', 'B', ' ', 'B', ' ', 'B', ' ', 'B'},
                {'B', ' ', 'B', ' ', 'B', ' ', 'B', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', 'N', ' ', 'N', ' ', 'N', ' ', 'N'},
                {'N', ' ', 'N', ' ', 'N', ' ', 'N', ' '},
                {' ', 'N', ' ', 'N', ' ', 'N', ' ', 'N'}
        };

        int contadorBlancas = 0;
        int contadorNegras = 0;

        // Recorrer el tablero
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                char ficha = tablero[fila][columna];

                if (ficha != ' ') { // Si la casilla no está vacía
                    // Mostrar coordenada y tipo de ficha
                    System.out.println("Casilla ocupada en (" + fila + ", " + columna + ") por una ficha " + (ficha == 'B' ? "blanca" : "negra"));

                    // Contar fichas según el tipo
                    if (ficha == 'B') {
                        contadorBlancas++;
                    } else if (ficha == 'N') {
                        contadorNegras++;
                    }
                }
            }
        }


