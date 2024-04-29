import java.util.Scanner;

public class EXVetor1{

    public static void main(String[] args){

        String [] convidados = new String [10];
        Scanner teclado = new Scanner(System.in);
        
       // length : Retorna o tamanho do vetor (int)
       for(int i = 0; i < convidados.length; i++){
       System.out.println("Digite o(a)" + i + 1 + "º convidado(a)");
       convidados[i] = teclado.nextLine();

    }
    
    for(int i = 0; i < convidados.length; i++){
        System.out.println(i + 1 + "º convidado(a)" + convidados[i]);

}
   teclado.close();
   
    }
}