
import java.util.Scanner;

/**
 *
 * @author Lab-xx-xx
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        JogoSorte js1=new JogoSorte();
    //
    byte menu;
    do{
        System.out.println("1. Escolher nº sorte!");
        System.out.println("2. Ver nºs");
        System.out.println("3. Verifique se venceu!");
        System.out.println("0. Sair");
        menu=ler.nextByte();
        switch(menu){
            case 1:
                System.out.println("Escolha seu número!");
                js1.getNumeroUsuario(ler.nextByte());
                break;
            case 2: 
                System.out.println("O numero escolhido é: "+js1.getNumeroUsuario());
               
                break;
                
            case 3:
                
                
                break;
                
            default:
                
                break;
        }
    }while(menu!=0);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
