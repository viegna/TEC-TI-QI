
import java.util.Scanner;

/**
 *
 * @author DIOGENES
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        ConverterReais cr1 = new ConverterReais();
        //pede e le
        do{
            System.out.println("Digit o valor do dólar: $");
            cr1.setValorDolar(ler.nextDouble());
            if(cr1.getValorDolar()<0){
                System.out.println("Erro! Valor do dólar negativo!");
            }
        }while(cr1.getValorDolar()<0);
        
        double cotacao;
        do{
            System.out.println("Diga o valor da cotação: ");
            cotacao = ler.nextDouble();
            if(cotacao<0){
                System.out.println("Erro! Cotação negativa!");
            }
        }while(cotacao<0);
        
        
        //respostas
        System.out.println(cr1.toString());
        System.out.println("Convertendo em reais: R$"+cr1.converterReais(cotacao));
        
        
        
        
        
        
        
        
        
    }
    
}
