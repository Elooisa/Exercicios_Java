import java.util.Scanner;

public class Boletim{
    public static void main (String [] args) {
    
    /*
    System.out.println("Digite nome do aluno:");
   
    String nome = "Eloisa";

    System.out.println("Digite n1: ");
    double n1 = 10.0;
    
    System.out.println("Digite n2: ");
    double n2 = 8.5;
   
    System.out.println("Digite n3: ");
    double n3 = 9.4;

    double media = (n1 + n2 + n3) / 3;
    */

    //Lendo teclado
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: "); //escreva ("Digite o nome do aluno")
    String nome = teclado.nextLine();                //leia (nome)

    System.out.println("Digite a primeira nota: ");
    double n1 = teclado.nextDouble();

    System.out.println("Digite a segunda nota: ");
    double n2 = teclado.nextDouble();

    System.out.println("Digite a terceira nota: ");
    double n3 = teclado.nextDouble();

    double media = (n1 + n2 + n3) / 3;
    
    String mensagem = "";

    if( media >= 7){
         mensagem = "Aprovado(a)";
    } else if (media > 5 && media < 7){
                 mensagem = "Recuperação";
    } else if ( media <= 5){
                mensagem = "Reprovado(a)";
    }

    System.out.println("###BOLETIM ESCOLAR ###");
    System.out.println("Nome: " + nome +"\n Resultado: " + mensagem);
    System.out.printf("Media: %, .2f", media);

   

   
    
     }

}

    