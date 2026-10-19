import java.util.Random;

public class Main {
    public static void main(String[] args){

        //Def variables
        char[][] tablero = new char[10][10];
        int contVader = 0;
        int contYoda = 0;
        int contMuros = 0;
        int contLibre = 0;

        Random random = new Random();

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '.';
            }
        }

        //Introducir darth vader
        colocarObjeto(tablero, 'V');
        colocarObjeto(tablero, 'Y');
        for (int i = 0; i < 5; i++) {
            colocarObjeto(tablero, '#');
        }


        //Mostrar tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }

        //Recorrer tablero para recoger info
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                switch (tablero[i][j]){
                    case 'V' -> contVader++;
                    case 'Y' -> contYoda++;
                    case '#' -> contMuros++;
                    case '.' -> contLibre++;
                }
            }
        }

        //Mostrar resultados
        System.out.println(" ");
        System.out.println("Vaders encontrados: " + contVader);
        System.out.println("Yodas encontrados: " + contYoda);
        System.out.println("Muros encontrados: " + contMuros);
        System.out.println("Posiciones libres encontradas: " + contLibre);
        System.out.println("Total de posiciones: " + tablero.length * tablero[0].length);
        //espacio para legibilidad
        System.out.println(" ");


        // Volver a meter 5 muros y analizar el tablero de nuevo

        for (int i = 0; i < 5; i++) {
            colocarObjeto(tablero, '#');
        }

        //Mostrar tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }

        //Recorrer tablero para recoger info
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                switch (tablero[i][j]){
                    case 'V' -> contVader++;
                    case 'Y' -> contYoda++;
                    case '#' -> contMuros++;
                    case '.' -> contLibre++;
                }
            }
        }

        //Mostrar resultados
        System.out.println(" ");
        System.out.println("Vaders encontrados: " + contVader);
        System.out.println("Yodas encontrados: " + contYoda);
        System.out.println("Muros encontrados: " + contMuros);
        System.out.println("Posiciones libres encontradas: " + contLibre);
        System.out.println("Total de posiciones: " + tablero.length * tablero[0].length);

        //Reiniciar contadores
        contYoda = 0;
        contVader = 0;
        contMuros = 0;
        contLibre = 0;

    }
    public static void colocarObjeto(char[][] tablero, char objeto){

        Random random = new Random();
        boolean colocado = false;
        while(!colocado){
            int fila = random.nextInt(0, tablero.length);
            int columna = random.nextInt(0, tablero.length);

            if(tablero[fila][columna] == '.'){
                tablero[fila][columna] = objeto;
                colocado = true;
            }
        }
    }
}
