import java.util.scanner;
public class ExCondicional6{
    public static void main(String[] args){

        Scanner input = new
        Scanner (System.in);
        
       int  horasTrabalhadas;
       double horasExtras, salarioHora, salarioTotal; 

        System.out.println("Insira o número de horas trabalhadas no mês: ");
        horasTrabalhadas = input.nextInt();

        System.out.println("Insira o valor do salario por hora: ");
        salarioHora = input.nextDouble();

        if (horasTrabalhadas > 160) {
            horasExtras = horasTrabalhadas- 160;
            salarioTotal = (160 * salarioHora) + (horasExtras * salarioHora * 1.5);
        }else{
            slarioTotal = 
            horasTrabalhadas * salarioHora;
        }
       System.out.println("O salario total do funcionario é: R$ %.2f%n", salarioTotal);
    }
}