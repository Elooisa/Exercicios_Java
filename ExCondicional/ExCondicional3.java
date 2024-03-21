import java.util.Scanner;
public class ExCondicional3{
    public static void main(String[] args){

         Scanner teclado = new Scanner(System.in);

         System.out.println("Informe um numero: ");
         int numero = teclado.nextInt();
 
         if(numero >= 100 && numero <= 200){
           System.out.println("O valor esta no intervalo de 100 e 200 ");
         }
         else {
            System.out.println("O valor nao esta no intervalo de 100 e 200");

         }



    }

}