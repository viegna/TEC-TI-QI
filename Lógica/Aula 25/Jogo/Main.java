import java.util.Scanner;

/**
 *
 * @author Tio Rudi && Tio Diox
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        JogoSorte js1=new JogoSorte();
        System.out.println("\f");
    //variaveis
    byte menu;
    int contVitorias = 0;
    int contTentativas = 0;

    do{
        
        System.out.println("\n1. Jogar                 ");
        System.out.println("2. Verificar resultado    ");
        System.out.println("0. Sair                    ");
        menu=ler.nextByte();
        
        System.out.println("\f");
        switch(menu){
            case 1:
                do{
                    System.out.println("Escolha um número de 1 a 5!");
                    js1.setNumeroUsuario(ler.nextByte());
                    if(js1.getNumeroUsuario()<=0 || js1.getNumeroUsuario()>5){
                        System.out.println("\nErro!");
                    }
                    js1.sortearNumero();                   
                }while(js1.getNumeroUsuario()<=0 || js1.getNumeroUsuario()>5);
                contTentativas++;
                break;
            case 2:
                System.out.println(js1.toString());
                if(js1.verificarSeVenceu()){
                    
                    System.out.println("!!PARABÉNS CABEÇÃO!! Você venceu. ");
                    contVitorias++;
                }else{
                    System.out.println("!!You lose!!");
                }
                
                
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
    

    