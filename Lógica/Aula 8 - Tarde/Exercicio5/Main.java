
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
        double num;
        String resposta;
        System.out.println("Digite um número: ");
        num = ler.nextDouble();
        if(num>0){
            resposta = "Este número é positivo";
        }else if(num<0){
            resposta = "Este número é negativo";
        }else{ 
            resposta = "Este número é nulo";}
            System.out.println("\f" +num);
            System.out.println(resposta);
            
}
}