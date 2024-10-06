
/**
 * Write a description of class Main here.
 * 
 * @author (Aline Zenker) 
 * @version (Aula 7 - 20-03-2018)
 */
import java.util.Scanner; //Classe de leitura de dados
public class Main{ //Início da classe
    public static void main(String []args){ //torna a classe executável
        Scanner teclado = new Scanner(System.in); //Cria um objeto para ler
        System.out.print("\f"); //Limpa o terminal
        //Declarar variáveis:
        double raio;
        double calcularArea;
        double calcularPerimetro;
        //Pede e lê:
        System.out.println("Digite o raio do círculo: ");
        raio = teclado.nextDouble();
        //Cálculo:
        calcularArea = Math.PI * Math.pow(raio,2);
        calcularPerimetro = 2 * Math.PI * raio;
        //Respostas:
        System.out.println("\f--------------------------------");
        System.out.println("RESPOSTAS");
        System.out.println("Raio: "+raio);
        System.out.println("Área: "+calcularArea);
        System.out.println("Perímetro: "+calcularPerimetro);
        System.out.println("--------------------------------");
    }   
}
