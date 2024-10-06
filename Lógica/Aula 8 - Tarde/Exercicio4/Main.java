
/**
 * Write a description of class Main here.
 *
 * @author (Nefi)
 * @version (Aula 8)
 */
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    System.out.print("\f");
    String nome;
    String resposta;
    double nota1;
    double nota2;
    double media;
    System.out.println("Digite o seu nome: ");
    nome = ler.nextLine();
    System.out.println("\fBoa tarde, " +nome+ ".");
    System.out.println("Digite a sua primeira nota: ");
    nota1 = ler.nextDouble();
    System.out.println("Digite a sua segunda nota: ");
    nota2 = ler.nextDouble();
    media = (nota1 + nota2) /2;
    if(media>=6){
        resposta = "Parabéns, você foi aprovado"; 
    }else{ 
        resposta = "Infelizmente você não atingiu a média \ne está reprovado";}
    System.out.println("\f↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
    System.out.println( nome+ ", sua média é: " +media);
    System.out.println(resposta);
    System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        
    
    

}
}