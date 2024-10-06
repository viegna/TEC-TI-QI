
import java.util.Scanner;

/*
 *
 * @author DIOGENES
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
    
    Funcionario f1= new Funcionario();
    
    //pede e le
    double salario;
    for(int i=0; i<f1.getSalarios().length; i++){
        System.out.println("Digite o "+(i+1)+" salário: ");
        salario=ler.nextDouble();
        f1.cadastrar(i, salario);
    }
    
    
        System.out.println("*--------------------------------*");
        System.out.println("|           RESPOSTAS:           |");
        System.out.println("*--------------------------------*");
        System.out.println(f1);
        System.out.println("Média é: "+f1.calcularMedia());
    
        
        
    }
}
    
    

    

