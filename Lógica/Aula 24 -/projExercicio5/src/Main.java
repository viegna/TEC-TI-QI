
import java.util.Scanner;

/**
 *
 * @author DIOGENES
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Vendedor v1=new Vendedor();
        //pede e le
        do{
            System.out.print("Escreva o salário fixo do vendedor: RS");
            v1.salarioFixo=ler.nextDouble();
            if(v1.salarioFixo<0){
                System.out.println("Erro! Salário fixo negativo!");
            }
        }while(v1.salarioFixo<0);
        
        do{
            System.out.println("Escreva o total de vendas por ele efetuada: ");
            v1.totalVendas=ler.nextInt();
            if(v1.totalVendas<0){
                System.out.println("Erro! Total de vendas não pode ser negativa!");
            }
        }while(v1.totalVendas<0);
        
        do{
            System.out.print("Escreva o percentual ganho sobre as vendas: "+"%");
            v1.setPercentualGanho(ler.nextDouble());
            if(v1.getPercentualGanho()<0){
                System.out.println("Erro! Percentual ganho sobre as vendas não pode ser negativo!");
            }
        }while(v1.getPercentualGanho()<0);
        
        //respostas
        
        System.out.println(v1.toString());
        System.out.println(v1.calcularSalarioTotal());
        
        
        
        
        
        }
    
}
