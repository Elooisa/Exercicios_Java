import java.util.Scanner;
public class ExCondicional{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        int num = teclado.nextInt();

        String mensagem ="";

        if( num > 10){
           mensagem = "Este numero é maior ou igual a 10";
        }

        System.out.println("Numero: " + num +"\n " + mensagem);
        
    }
}