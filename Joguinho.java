import java.util.Random;
import java.util.Scanner;

public class Joguinho {
    public static void main(String[] args){

        System.out.println("Seja Bem-vindo ao joguinho !!");
        System.out.println("----------------------------------------------------------");

        String[] palavras = {"desespero", "calhambeque", "tecnologias", "sistema"};
        Random aleatorio = new Random();
        String palavraSelecionada = palavras[aleatorio.nextInt(palavras.length)];
        
        String palavraEmbaralhada = embaralhar(palavraSelecionada);
       
        System.out.println("Qual palavra é essa: "+palavraEmbaralhada+ "?"); 
        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a palavra 'dica' para receber uma dica ou '0' para desistir");
            String entrada = scanner.nextLine();
            if(entrada.equals("0")) {
                System.out.println("Fim do jogo com "+tentativas+" tentativas");
                break;
    }
            if(entrada.equals("dica")) {
                System.out.println("A primeira letra é : "+palavraSelecionada.charAt(0)+"|| "+"e a última é : "+palavraSelecionada.charAt(palavraSelecionada.length())+"");
                continue;
            }
            if(entrada.equals(palavraSelecionada)) {
                System.out.println("Você acertou com "+tentativas+" tentativas");
                
            }else{
                tentativas++;
            }
        }
    }
    
    public static String embaralhar(String palavra) {
        char [] palavraArray = palavra.toCharArray();
        Random aleatorio = new Random();
        for(int x = 0; x < palavraArray.length; x++) {
            int indiceAleatorio = aleatorio.nextInt(palavraArray.length);
            char temp = palavraArray[x];
            palavraArray[x] = palavraArray[indiceAleatorio];
            palavraArray[indiceAleatorio] = temp;
        }
        return new String(palavraArray).toLowerCase();

    }
}

