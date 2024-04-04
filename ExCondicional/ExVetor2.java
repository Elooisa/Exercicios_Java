public class ExVetor2{
    public static void main(String[] args){

        /*
        double [] notasAtividades = new double [5];
        notasAtividades[0] = 6.0;
        notasAtividades[1] = 8.0;
        notasAtividades[2] = 4.0;
        notasAtividades[3] = 2.0;
        notasAtividades[4] = 9.0;
        */
        // Declaração com atribuição
        
        double [] notasAtividades = {6.0, 8.0, 4.0, 2.0, 9.0 };
        double soma = 0, media;

        // += -> atribuição com soma
        // -= -> atribuição com subtração
        // *= -> atribuição com multiplicação
         // /= -> atribuição com divisão

         //length : retorna o tamanho do valor

        for( int i = 0; i < 5; i++) {
           // System.out.println(notasAtividades[i]);
           soma += notasAtividades[i]; // soma = soma + notasAtividades[i]
       
        }
        System.out.println("Soma das notas: " + soma );
         
         //calculando a media
        media = soma / notasAtividades.length;
        System.out.println("Media das notas: " + media);
          
           }  
         }
    
