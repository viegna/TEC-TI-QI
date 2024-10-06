
import java.util.Scanner;

/**
 *
 * @author DIOGENES
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        retornarValorFinal rvf1=new retornarValorFinal();
        //pede e le
        do{
            System.out.println("Digite a quantidade: ");
            rvf1.setQuantidade(ler.nextInt());
            if(rvf1.getQuantidade()<0){
                System.out.println("Erro! Quantidade negativa!");
            }
        }while(rvf1.getQuantidade()<0);
        do{
            System.out.println("Digite o código: ");
            rvf1.codigo=ler.nextByte();
            if(rvf1.codigo<1 || rvf1.codigo>4){
                System.out.println("Erro! Código não especificado!");
            }
        }while(rvf1.codigo<1 || rvf1.codigo>4);
        
        //respostas     
        System.out.println(rvf1.toString());
        System.out.println("Valor final a ser pago é de: "+rvf1.calcularValorPagar());
        
        
    }
}
    
    
   
    
