
import java.util.Scanner;

/**
 *
 * @author DIOGENES
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        CalcularValorProduto cvp1=new CalcularValorProduto();
        
        //pede e le
        System.out.println("Digite o nome do produto: ");
        cvp1.setProduto(ler.nextLine());
        do{
            System.out.println("Digite o valor do produto: ");
            cvp1.setValor(ler.nextDouble());
            if(cvp1.getValor()<0){
                System.out.println("Erro! Valor de produto negativo!");
            }
        }while(cvp1.getValor()<0);
        
        //respostas
        System.out.println(cvp1.toString());
        System.out.println("O valor com juros é: "+cvp1.calcularJuros());
        System.out.println("O valor com juros é: "+cvp1.calcularDesconto());
        
        
    }
    
}
