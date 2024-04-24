import java.util.Scanner;
public class ExVetor5{
    public static void main(String[]args){
        
        int numeros [] = new int[3];
        Scanner teclado = new Scanner(System.in);
       

        int i = 0;
        while(i < numeros.length) {
        System.out.println("Digite um número inteiro");
        int numeros =teclado.nextInt();

        if(numeros > 38){
        System.out.println("Número adicionado");
        }else{
            System.out.println("Apenas números de 0 a 38");
        }

            i++;
        }


     }
}

