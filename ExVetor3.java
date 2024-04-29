import java.util.Scanner;
import java.util.Arrays;
public class ExVetor3{
    public static void main(String[] args){
 //Lógica dos múltiplos
 //% -> mod: obtem o resto de uma divisão, muito utilizado para verificar a divisibilidade entre números
 //Exemplo:
 int x = 2;
 int resto = x % 2;
 if(resto == 0) {
    System.out.println(x + " é par!!");
 }
   
   Scanner teclado = new Scanner(System.in);
   int[] numeros = new int[20];

   for( int i = 0; i < numeros.length; i++){

      System.out.println("Digite o" + (i + 1) + "º número: ");
      numeros[i] = teclado.nextInt();

      if( i % 2 == 0){
         numeros[i] = numeros[i] * 2;
      }
   }
    
    System.out.println("Resultado:" + Arrays.toString(numeros));
    teclado.close();
    }
}