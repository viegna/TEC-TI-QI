
/**
 * Write a description of class Main here.
 * 
 * @author (Aline Zenker) 
 * @version (15/03/2018)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        //Declaramos variáveis:
        String nome;
        double valor;
        double valorJuros;
        double valorDesconto;
        //Atribuimos - Pede e lê:
        System.out.print("\fDigite o nome do produto: ");
        nome = ler.nextLine();
        
        System.out.print("\fDigite o valor do produto: R$");
        valor = ler.nextDouble();
        
        //Cálculos
        valorJuros = valor + valor * 0.12;
        valorDesconto = valor - valor * 0.05;
        //Respostas:
        System.out.println("\f-----------------------------------");
        System.out.println("Nome Produto: "+nome);
        System.out.println("Valor R$ "+valor);
        System.out.println("Valor com Juros R$ "+valorJuros);
        System.out.println("Valor com Desconto R$ "+valorDesconto);
        System.out.println("-----------------------------------");
        
    }    
}
