//Import para limpar tela: - coloca no inínio da classe Main - junto com import do scanner:
import java.awt.AWTException;
import java.awt.Robot;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Instancia a classe:
        ContaBancaria cb = new ContaBancaria();
        
        //MENU:
        byte op;
        do{
            System.out.println("\n*---------------------------*");
            System.out.println("|   1 - Informar Saldo      |");
            System.out.println("|   2 - Ver Saldo atual     |");
            System.out.println("|   3 - Depositar           |");
            System.out.println("|   4 - Sacar               |");
            System.out.println("|   0 - Sair                |");
            System.out.println("*---------------------------*");
            op = teclado.nextByte();
            switch(op){
                case 1:
                    limparTela();
                    System.out.println("*---------------------------*");
                    System.out.println("|   Informando Saldo...      |");
                    System.out.println("*---------------------------*");
                    do{
                       System.out.println("Digite o saldo: ");
                       cb.saldo = teclado.nextDouble();
                       if(cb.saldo<=0){
                           System.out.println("ERRO!!!!");
                       }
                    }while(cb.saldo<=0);
                    break;
                case 2:
                    limparTela();
                    System.out.println("*---------------------------*");
                    System.out.println("|  Visualizando Saldo...    |");
                    System.out.println("*---------------------------*");
                    System.out.println(cb);
                    break;
                case 3:
                    limparTela();
                    System.out.println("*---------------------------*");
                    System.out.println("|     Depositando...        |");
                    System.out.println("*---------------------------*");
                    //Sempre que tiver argumento criar uma variável:
                    double valorDeposito;
                    do{
                       System.out.println("Informe o valor de depósito: ");
                       valorDeposito = teclado.nextDouble();
                       if(valorDeposito<=0){
                           System.out.println("ERRO!");
                       }
                    }while(valorDeposito<=0);
                    cb.depositar(valorDeposito);
                    System.out.println("Depositado com SUCESSO!");
                    break;
                case 4:
                    limparTela();
                    System.out.println("*---------------------------*");
                    System.out.println("|         Sacando...        |");
                    System.out.println("*---------------------------*");
                    //Variável para o argumento:
                    double valorSaque;
                    do{
                        System.out.println("Informe o valor de saque: ");
                        valorSaque = teclado.nextDouble();
                        if(valorSaque<=0){
                            System.out.println("ERRO!");
                        }
                    }while(valorSaque<=0);
                    cb.sacar(valorSaque);
                    System.out.println("Saque realizado com SUCESSO!");
                    break;
                case 0:
                    limparTela();
                    System.out.println("*---------------------------*");
                    System.out.println("|          TCHAU...         |");
                    System.out.println("*---------------------------*");
                    break;
                default:
                    limparTela(); 
                   System.out.println("ERRO! Opção inválida!");
            }
            
        }while(op!=0);
    } 
    //Após o fechamento do public static void main, antes da última chave do main colar:
//Método para limpar tela:
    //Limpar tela:
    public static void limparTela() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17);
            pressbot.keyPress(76);
            pressbot.keyRelease(17);
            pressbot.keyRelease(76);
        } catch (AWTException awte) {
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }//fim do limparTela
}
