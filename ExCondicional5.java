import java.util.Scanner;

public class ExCondicional5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do mes ( 1 a 12):  ");
        int numMes = scanner.nextInt();
        
        if (numMes >= 1 && numMes <= 12){
            String[] meses = {
                "Janeiro", "Fevereiro", 
                "Março", "Abril",
                "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro",
                "Novembro", "Dezembro"
            };

            String mesCorrespondente = meses[numMes - 1];
            System.out.println("O mes correspondente é: " + mesCorrespondente);
        }else {
            System.out.println("Numero de mes invalido. Digite um valor entre 1 e 12");
        }
    }

}