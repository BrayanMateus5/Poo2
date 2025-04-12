import java.util.Random;

public class Cruzadas {
    public static void main(String[] args) {
        String palavra[] = { "Brayan", "Mãezona", "paizão", "Alafe" };
        String selecionarPalavra = escolhePalavra(palavra).toLowerCase();
        System.out.println(selecionarPalavra);
        int tamanho = 10;
        char[][] tabuleiro = getMatriz(tamanho);
        incluirPalavra(tabuleiro, selecionarPalavra);

    }

    public static String escolhePalavra(String[] palavra) {
        Random aleatorio = new Random();
        return palavra[aleatorio.nextInt(palavra.length)];
    }

    public static void palavraVertical(char[][] matriz, String[] palavra) {
        Random aleatorio = new Random();
        String palavraSelecionada = palavra[aleatorio.nextInt(palavra.length)];
        int coluna = aleatorio.nextInt(matriz.length);
        int linha = aleatorio.nextInt(matriz.length - palavraSelecionada.length() + 1);
        for (int i = 0; i < palavraSelecionada.length(); i++) {
            matriz[linha + 1][coluna] = palavraSelecionada.charAt(i);
        }
    }

    public static void imprimirMatriz(char[][] matriz) {
        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.print(matriz[k][m] + " ");
            }
            System.out.println(" ");
        }
    }

    public static char[][] getMatriz(int tamanho) {
        Random aleatorio = new Random();

        char matriz[][] = new char[tamanho][tamanho];
        for (int l = 0; l < matriz.length; l++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[l][j] = (char) ('a' + aleatorio.nextInt(25));
            }
        }
        return matriz;
    }

    public static void incluirPalavra(char[][] matriz, String palavra) {
        Random aleatorio = new Random();
        int linha = aleatorio.nextInt(matriz.length);
        int coluna = aleatorio.nextInt(matriz.length - palavra.length());
        for (int i = 0; i < palavra.length(); i++) {
            matriz[linha][coluna + i] = palavra.charAt(i);
        }
        imprimirMatriz(matriz);
    }

    public static void selecionarPalavra(String[] palavra) {
        Random aleatorio = new Random();
        String palavraSelecionada = palavra[aleatorio.nextInt(palavra.length)];
        System.out.println("A palavra a se procurar é :" + palavraSelecionada);
        for (int a = 0; a < palavraSelecionada.length(); a++) {
            System.out.printf(palavraSelecionada.charAt(a) + " ");
        }

    }
}