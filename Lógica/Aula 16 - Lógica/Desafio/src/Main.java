import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Lab-xx-xx
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Random random=new Random();
        
        //v
        byte numero1;
        byte numero2;
        byte repete;
        
        do{
        //p e l
        System.out.println("\n\nDigite o numero que quer sortear: ");
        numero1=ler.nextByte();
         numero2=(byte) (Math.random()*3+1);
        if(numero1==numero2){
            System.out.println("Parábens");
        }else{
            System.out.println("Que pena");
        }
       
        
        System.out.println("Numero sorteado é "+numero2);
        
            System.out.println("\n\nDigite 1 para continuar ou 0 para sair");
            repete = ler.nextByte();
        }while(repete!=0);
        
        
        
        
    }
    
}
