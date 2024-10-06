
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        //variaveis
        int anoNascimento;
        int anoAtual;
        double idade;
        double idadeMeses;
        double idadeSemanas;
        double idadeDias;
        double idadeHoras;
        double idadeMinutos;
        double idadeSegundos;
        
        //pede e le
        System.out.println("Digite o ano atual: ");
        anoAtual=ler.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento=ler.nextInt();
        //calculos
        idade=anoAtual-anoNascimento;
        idadeMeses=idade*12;
        idadeSemanas=idadeMeses*4;
        idadeDias=idadeSemanas*7;
        idadeHoras=idadeDias*24;
        idadeMinutos=idadeHoras*60;
        idadeSegundos=idadeMinutos*60;
        //respostas
        System.out.println("Sua idade em anos é: "+idade);
        System.out.println("Sua idade em meses é: "+idadeMeses);
        System.out.println("Sua idade em semanas é: "+idadeSemanas);
        System.out.println("Sua idade em dias é: "+idadeDias);
        System.out.println("Sua idade em horas é: "+idadeHoras);
        System.out.println("Sua idade em minutos: "+idadeMinutos);
        System.out.println("Sua idade em segundos é: "+idadeSegundos);
        //
   
    
    
    
    
    }
}
