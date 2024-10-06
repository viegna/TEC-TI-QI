
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
        System.out.println("\f");
        
        //variaveis
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        //pede e le
        System.out.println("Digite a nota 1: ");
        nota1= ler.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2= ler.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3= ler.nextDouble();
        //calculo
        media=(nota1+nota2+nota3)/3;
        
        //respostas
        System.out.println("Com nota 1:"+nota1);
        System.out.println("Com nota 2:"+nota2);
        System.out.println("Com nota 3:"+nota3);
        System.out.println("A média é: "+media);
    
    
    }
}
