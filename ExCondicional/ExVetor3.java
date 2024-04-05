public class ExVetor3{
    public static void main(String[] args){

    int [] valores = new int [20];
     Scanner teclado = new Scanner(System.in);
       

        for(int i = 0; i < valores.length; i++){
       System.out.println("Digite o" + i + 1 + "º valor");
       valores[i] = teclado.nextLine();

    }
    
    for(int i = 0; i < valores.length; i++){
        System.out.println(i + 1 + "º valor" + valores[i]);

}
    }
}