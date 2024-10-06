

/**
 *
 * @author Tio Rudi && Tio Diox
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        JogoSorte js = new JogoSorte();
        System.out.println("\f");
    //variaveis
    byte menu;
    int contVitorias = 0;
    int contTentativas = 0;
   
    do{
        
        System.out.println("\n1. Jogar                 ");
        System.out.println("0. Sair                    ");
        menu=ler.nextByte();
        
        System.out.println("\f");
        switch(menu){
            case 1:
            js.jogar();
            System.out.println(js);
                if(js.verSeGanhou()){
                    
                    System.out.println("!!PARABÉNS CABEÇÃO!! Você venceu. ");
                    contVitorias++;
                }else{
                    
                    System.out.println("!!You lose!!");
                }
                
            contTentativas++;    
                break;
            case 0:
            
                System.out.println("Adiós!-Tio Diox");
                System.out.println("!!Hasta la vista!! <BABY>-Tio Rudi");
                System.out.print("Tentativas: "+contTentativas+" Vitórias: "+contVitorias);
            default:
                
                
                break;
        }
    }while(menu!=0);
    }
    
    }