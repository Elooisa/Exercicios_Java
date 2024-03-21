import java.util.Scanner;
public class ExCondicional2{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int valor1,valor2;

        System.out.println("Digite um numero : ");
        valor1 = teclado.nextInt();

        System.out.println("Digite outro numero : ");
        valor2 = teclado.nextInt();


        if(valor1 == valor2){
            System.out.println("Os valores devem ser distintos");
        } else if(valor1 > valor2){
            System.out.println("O maior valor e: " + valor1);
        } else {
            System.out.println("O maior numero e: " + valor2);

        
        }

    }
}