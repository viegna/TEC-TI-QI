
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler= new Scanner(System.in);
        //declarar variaveis
        double valorA;
        double valorB;
        double valorC;
        double delta;
        double x1;
        double x2;
        
        //pede e le
        System.out.println("Digite o valor de A: ");
        valorA= ler.nextDouble();
        System.out.println("Digite o valor de B: ");
        valorB=ler.nextDouble();
        System.out.println("Digite o valor de C: ");
        valorC= ler.nextDouble();
        
        //calculos
        delta=Math.pow(valorB,2)-4*valorA*valorB;
        
        //if
        if(delta<0){
            x1=0;
            x2=0;
        }else if(valorA==0){
            x1=-1000;
            x2=-1000;
        }else{
            x1=(-valorB+delta)/(2*valorA);
            x2=(-valorB-delta)/(2*valorA);
        }
        System.out.println("**********************************************");
        System.out.println("O valor de x1 é: "+x1+" e o valor de x2 é: "+x2);
        System.out.println("**********************************************");
        
    
    }
}
