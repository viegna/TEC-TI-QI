
/**
 * Write a description of class Main here.
 * 
 * @author (Aline Zenker) 
 * @version (Aula 7 - 20-03-2018)
 */
import java.util.Scanner; //Classe de leitura de dados
public class Main{ //Início da classe
    public static void main(String []args){ //torna a classe executável
        Scanner ler = new Scanner(System.in); //Cria um objeto para ler
        System.out.print("\f"); //Limpa o terminal
        //Declarar variáveis:
        int numero;
        String resposta;
        //Pede e lê:
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        //Cálculo:
        if(numero>=0){
            resposta = "Positivo";
        }else{
            resposta = "Negativo";
        }
        //Respostas:
        System.out.println("O número "+numero+ " é " +resposta);
    }   
}
