
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
        System.out.println("\n1. Escolher nº sorte!");
        System.out.println("2. Ver nºs");
        System.out.println("3. Verifique se venceu!");
        System.out.println("0. Sair");
        menu=ler.nextByte();
        switch(menu){
            case 1:
                do{
                    System.out.println("Escolha um número de 1 a 5!");
                    js1.setNumeroUsuario(ler.nextByte());
                    if(js1.getNumeroUsuario()<=0 || js1.getNumeroUsuario()>5){
                        System.out.println("\nErro!");
                    }
                }while(js1.getNumeroUsuario()<=0 || js1.getNumeroUsuario()>5);
                break;
            case 2: 
                System.out.println("\nO número escolhido pelo usuário é: "+js1.getNumeroUsuario());
                System.out.println("O número escolhido pelo sistema é: "+js1.sortearNumero());
                break;
            case 3:
                if(js1.sortearNumero()==js1.getNumeroUsuario()){
                    System.out.println("\nPARABÉNS! Você Venceu!");
                }else{
                    System.out.println("\nQUE PENA! Tente novamente!");
                }
                break;
            default:
                
                break;
        }
    }while(menu!=0);
    }
    
    }
    

