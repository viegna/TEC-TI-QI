
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
       
       String resposta;
       int numero;
       
       System.out.print("Digite um número inteiro: ");
       numero = ler.nextInt();
       if (numero>=10){
           resposta = "maior ou igual a 10";
        }else{
            resposta = "menor do que 10";}
            System.out.println("\f🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲");
            System.out.println("O número é " +resposta);
            System.out.println("🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲🎲");
           
       

}
}
