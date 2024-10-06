
import java.util.Scanner;

/**
 *
 * @author Lab-xx-xx
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //variaveis
        String nome;
        String rg;
        double horasTrabalhadas;
        double salarioBruto;
        double salario;
        
        //pede e le 
        System.out.println("Digite o nome do funcionario");
        nome=ler.nextLine();
        System.out.println("Digite o RG do funcionario: ");
        rg=ler.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas=ler.nextDouble();
        
        //calculo
        salarioBruto=horasTrabalhadas*15;
        salario=salarioBruto*1.05;
        //resp
        System.out.println(nome+" ganha R$ "+salarioBruto+" - pois trabalhou "+horasTrabalhadas+" horas este mês.");
        System.out.println("Seu salário aumentado 5% ficará R$ "+salario);
                
    }
    
}
