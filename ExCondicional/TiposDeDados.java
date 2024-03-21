public class TiposDeDados { 

    public static void main (String [] args) {
    //Tipos primitivos de dados
    //Declaração devariáveis de acordo com o tipo
    
    byte n1;
    short n2;
    int n3;
    long n4;

    //Aribuição de valores
    //Obs: Por padrão numérico que extrapola a capacidade do tipo da variável assume o tipo "int"
    //Exemplo:
    // n1 = 1000; Erro: O tipo de byte não comporta o valor 1000 o máx seria 127
     n1 = 88; //aqui está ok 
     n2 = 1235;
     n3 = 65486;
     n4 = 4648644;

    //Declaração e atribuição de valores de valores, vamos utilizar valores reais como exemplo:
    //Por padrão um valor númerico real atribuido será sempre "double"

    float n5 = 5641.68f; //Colocar no final do número a letra "f" caso queira do tipo float
    double n6 = 65987.45;

    //Declaração e atribuição dado tipo caracter
    //Apenas 1 letra e sempre com aspas simples
    char letra = 'c';

    //Declaração e atribuição do valor lógico (boolean)

    boolean solteiro = true;
    boolean comFome = false;    

    //Declaração e atribuição de cadeia (String)
    //OBS: String NÃO É UM TIPO PRIMITIVO DE DADOS NO JAVA. String é uma classe.
    // String sempre com aspas duplas
    String escola = "Brasílio Flores de Azevedo";
    
    }



}