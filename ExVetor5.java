import java.util.Scanner;
public class ExVetor5{
    public static void main(String[]args){
        
        int numeros []  = new int[3];
        Scanner teclado = new Scanner(System.in);
        double soma = 0;

        int i = 0;
        while(i < numeros.length) {
        System.out.println("Digite um número inteiro");
        int n = teclado.nextInt();

        if(n >= 0  && n <= 38){
           numeros[i] = n;
        }else{
           i--;//decrementa um valor ao contador (i)
        }
         i++; //incrementa um valor ao contador (i)
        }

           for( i = 0; i < numeros.length; i++ ){
            if(numeros[i] % 4 == 0){
                soma += numeros[i];          
            }
           

           }
            
       

     double resultado = soma / numeros.length;
     String mensagem = "";

     if (resultado > 25){
        mensagem ="Prêmio Máximo";
     }else if (resultado < 20){
        mensagem = "Prêmio Comum";
     }else {
        mensagem = "Infelizmente você não recebeu o prêmio";
     }

     System.out.println(mensagem + "Pontuação: " + resultado);

      }
    } 


