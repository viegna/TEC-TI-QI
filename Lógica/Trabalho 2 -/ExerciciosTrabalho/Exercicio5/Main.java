
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        System.out.print("\f");
        //variaveis
        double altura;
        double peso;
        double imc;
        String nome;
        //pede e le
        System.out.println("Diga seu nome: ");
        nome=ler.nextLine();
        System.out.println("Digite o seu peso: ");
        peso=ler.nextDouble();
        System.out.println("Digite a sua altura: ");
        altura=ler.nextDouble();
        //calculos
        imc=peso/(altura*altura); 
        if(imc>=18.5 && imc<=24.9){
            System.out.println(nome+",");
            System.out.println("Parabéns, você está no peso ideal!");
        }else{
            System.out.println(nome+",");
            System.out.println("Você não está no peso ideal!");
        }
    
    
    
    
    }
}
