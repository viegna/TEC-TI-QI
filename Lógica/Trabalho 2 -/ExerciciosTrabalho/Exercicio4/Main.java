
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        //variaveis
        String nome;
        double salario;
        double salarioMinimo;
        double quantidadeSalario;
        
        //pede e le
        System.out.println("Digite o nome: ");
        nome=ler.nextLine();
        System.out.println("Digite o salário: ");
        salario=ler.nextDouble();
        System.out.println("Digite o salário mínimo");
        salarioMinimo=ler.nextDouble();
        
        //calculos
        quantidadeSalario=salario/salarioMinimo;
        //resp
        System.out.println("O funcionário "+nome+" ganha o total de "+quantidadeSalario+" salários mínimos.");
        
 
    
    
    
    
    }
}
