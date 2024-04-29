
public class ArrayTipoVetor {
    
    public static void main(String[] args){

        /*Criar um aplicativo que armazene 5 frutas (String) em um vetor */

       //Vetor com capacidade máxima de 5 elementos do tipo String
        String [] frutas = new String[8];
        
        // Em um vetor só podemos armazenar uma informação referida entidade. O vetor é UNIDIMENSIONAL
        
        frutas[0] = "Maca";
        frutas[1] = "Pera";
        frutas[2] = "Melancia";
        frutas[3] = "Morango";
        frutas[4] = "Tomate";
        frutas[5] = "Abacaxi";
        frutas[6] = "Limão";
        frutas[7] = "Cereja";
        
        //Mostrando a fruta 'Morango'
        System.out.println(frutas[3]);
       
        //Mostrando a fruta 'Pera'
        System.out.println(frutas[1]);

        System.out.println(frutas[0]);
        System.out.println(frutas[1]);
        System.out.println(frutas[2]);
        System.out.println(frutas[3]);
        System.out.println(frutas[4]);
        System.out.println(frutas[5]);
        System.out.println(frutas[6]);
        System.out.println(frutas[7]);

       
        //Mostrando todas as frutas
       //UTILIZE UMA ESTRUTURA DE REPETIÇÃO
       System.out.println("-------LISTANDO COM O LACO FOR--------");
       for(int i = 0; i < 8; i++){
           System.out.println(frutas[i]);
       
      
           
       }
    }
}
