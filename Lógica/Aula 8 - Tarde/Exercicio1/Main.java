
/**
 * Write a description of class Main here.
 *
 * @author (W.Nefi)
 * @version (Aula 8)
 */
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    System.out.print("\f");
    double horas;
    double valorHrs;
    double salario;
    double inss;
    double valeTransp;
    double salarioLiq;
    System.out.println("Digite o número de horas que você trabalhou: ");
    horas = ler.nextDouble();
    System.out.println("Digite o valor da hora: R$ ");
    valorHrs = ler.nextDouble();
    salario = horas * valorHrs;
    inss = salario * 0.08;
    valeTransp = salario * 0.06;
    salarioLiq = salario - inss - valeTransp;
    System.out.println("\f-------------------------------------------");
    System.out.println("Seu salário bruto é de R$ " +salario);
    System.out.println("O valor do seu INSS é: R$ " +inss);
    System.out.println("O valor do seu vale transporte é: R$ " +valeTransp);
    System.out.println("O seu salário líquido é de R$ " +salarioLiq);
    System.out.println("-------------------------------------------");
    
   
}
}