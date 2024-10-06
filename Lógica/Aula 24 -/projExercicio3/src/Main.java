
import java.util.Scanner;

/**
 *
 * @author Lab-xx-xx
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
    CalcularRefri cr1=new CalcularRefri();
    
    //pede e le
    do{
        System.out.println("\nDigite a quantidade de latas: ");
        cr1.setRefri350(ler.nextDouble());
        if(cr1.getRefri350()<0){
            System.out.println("\nErro! Quantidade negativa!");
        }
    }while(cr1.getRefri350()<0);
    
    do{
        System.out.println("\nDigite a quantidade de refrigerantes de 600ml: ");
        cr1.setRefri600(ler.nextDouble());
        if(cr1.getRefri600()<0){
            System.out.println("\nErro! Quantidade negativa!");
        }
    }while(cr1.getRefri600()<0);
    
    do{
        System.out.println("\nDigite a quantidade de refrigerantes de 2 litros: ");
        cr1.setRefri2000(ler.nextDouble());
        if(cr1.getRefri2000()<0){
            System.out.println("\nErro! quantidade negativa!");
        }
    }while(cr1.getRefri2000()<0);
    
    //to string
        System.out.println(cr1.toString());
        System.out.println("\nA quantidade de litros é: "+cr1.calcularLitros());
        System.out.println("O valor arrecadado é: "+cr1.calcularTotalVendido());
        
        
        
        
        
        
    }
    
}
