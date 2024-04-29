import java.util.Scanner;
public class ExCondicional4{
    public static void main(String[] args){

        Scanner scann = new Scanner(System.in);

        System.out.println("Digite o nome dos dois times: ");
        String time1 = scann.nextLine();
        String time2 = scann.nextLine();

        System.out.println("Digite a quantidade de gols dos dois times: ");
        int gol1 = scann.nextInt();
        int gol2 = scann.nextInt();

        if(gol1 > gol2){
            System.out.println("Time"+ time1 + "venceu" );
        }else if(gol1 == gol2){
            System.out.println("Deu empate");
        }else{
            System.out.println("Time" + time2 + "venceu" );
        }


    }
}