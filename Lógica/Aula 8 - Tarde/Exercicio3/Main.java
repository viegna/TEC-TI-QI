
/**
 * Write a description of class Main here.
 *
 * @author (Nefi)
 * @version (Aula 8)
 */
import java.util.Scanner;
public class Main{
    public static void Main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.print("\f");
        int numero;
        String resposta;
        System.out.print("Digite um número inteiro: ");
        numero = ler.nextInt();
        
        if(numero%2==0){
            resposta = "par";
        }else{
            resposta = "Ímpar";
        }
        System.out.println("\f●●●●●●●●●●●●●●●●●●●●●●●●●●●●"); 
        System.out.println("O número " +numero+ " é " +resposta);
        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●"); 
    

}
}
