
/**
 * Write a description of class Main here.
 *
 * @author (W.Nefi)
 * @version (Aula 8)
 */
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.print("\f");
        int num;
        String resposta;
        System.out.println("Digite um número que equivale \na um dia da semana: ");
        num = ler.nextInt();
        if(num==1){
            resposta = "Equivale ao dia da semana Domingo.";
        }else if(num==2){
            resposta = "Equivale ao dia da semana Segunda-feira.";
        }else if(num==3){
            resposta = "Equivale ao dia da semana Terça-feira.";
        }else if(num==4){
            resposta = "Equivale ao dia da semana Quarta-feira.";
        }else if(num==5){
            resposta= "Equivale ao dia da semana Quinta-feira.";
        }else if(num==6){
            resposta= "Equivale ao dia da semana Sexta-feira.";
        }else if(num==7){
            resposta= "Equivale ao dia da semana Sábado.";
        }else{
            resposta= "Esse número não equivale a um dia da semana.";
        }
        System.out.println("\f▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰");
        System.out.println("O número " +num+ "\n" +resposta);
        
        System.out.println("▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰▰");
           
                
            
        
}
}