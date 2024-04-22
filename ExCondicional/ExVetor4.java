import java.util.Scanner;

public class ExVetor4{
    public static void main(String[] args){

        String[] palavrasEscondidas = {"java","arrays","vetor","variavel","objetos"};
        String palavraComum = "software";
        int tentativasMax = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de palavras");
        System.out.println("Descubra a palavra em comum entre as palavras secretas");
        System.out.println("Você tem" + tentativasMax + "tentativas para acertar.\n");

        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < tentativasMax && !acertou){
            System.out.print("Digite uma palavra: ");
            String palpite = scanner.nextLine();

            for (String palavra : palavrasEscondidas){
                if (palpite.equalsIgnoreCase(palavra)){
                    acertou = true;
                    break;
                }
            }
            tentativas++;
        }        
        
        if (acertou){
            System.out.println("Parabéns você encontrou a palavra secreta!!");
        }else{
            System.out.println("Você não conseguiu encontrar a palavra secreta.");
        }
        scanner.close();
            
        
        
       
    }
}