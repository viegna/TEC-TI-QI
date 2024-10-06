
/**
 * Write a description of class Main here.
 * 
 * @author (Aline) 
 * @version (15/03/2018)
 */
import java.util.Scanner; //Importa a classe para leitura de dados
public class Main{
    public static void main (String []args){
        Scanner ler = new Scanner(System.in);//Cria um objeto para leitura de dados
        //Declarando variáveis:
        String nome;
        int anoNascimento;
        int anoAtual;
        int idade;
        
        //Atribui valores:
        System.out.print("\fDigite seu nome: ");
        nome = ler.nextLine();
        System.out.print("\fDigite o ano que nasceu: ");
        anoNascimento = ler.nextInt();
        System.out.print("\fDigite o ano atual: ");
        anoAtual = ler.nextInt();
        
        //Cálculo:
        idade = anoAtual - anoNascimento;
        
        //Respostas:
        System.out.println("\f************************************");
        System.out.println("RESPOSTAS:");
        System.out.println("Nome: "+nome);
        System.out.println("Ano Nascimento: "+anoNascimento);
        System.out.println("Ano Atual: "+anoAtual);
        System.out.println("Idade: "+idade);
        System.out.println("************************************");  
    } 
}
