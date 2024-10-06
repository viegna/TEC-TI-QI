import java.util.Scanner;
/**
 *
 * @author Turma 1Ti1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Instanciando a classe - Objetos:
        Numero n1 = new Numero();
        //Pede e lê:
        do{
            System.out.println("Digite um nº");
            n1.numero = ler.nextInt();
            if(n1.numero<0){
                System.out.println("ERRO! Nº negativo");
            }
        }while(n1.numero<0);
        //Apresentando Menu:
        byte menu;
        do{
            System.out.println("1- Visualizar o número – (só no Main)\n" +
            "2- Ver se o número é par ou ímpar - (método)\n" +
            "3- Ver se o número é positivo, negativo ou nulo; - (método)\n" +
            "4- Calcular o fatorial do número; - (método)\n" +
            "5- Calcular o somatório do número; - (método)\n" +
            "6- Contar os pares menores que o número; - (método)\n" +
            "7- Contar os ímpares menores que o número; - (método)\n" +
            "0 - Sair");
            menu = ler.nextByte();
            switch(menu){
                case 1:
                    System.out.println("\nNúmero: "+n1.numero);
                    break;
                case 2:
                    System.out.println("\nPar ou Ímpar? "+n1.verParImpar());
                    break;
                case 3:
                    System.out.println("\nPositivo, Negativo ou Nulo: "
                                        +n1.verPositivo());
                    break;
                case 4:
                    System.out.println("\nFatorial: "+n1.calcularFatorial());
                    break;
                case 5:
                    System.out.println("\nSomatório: "+n1.calcularSomatorio());
                    break;
                case 6:
                    System.out.println("\nQuant. Pares: "+n1.contarPares());
                    break;
                case 7:
                    System.out.println("\nQuant. Ímpares: "+n1.contarImpar());
                    break;
                case 0:
                    System.out.println("\nTchau! Volte sempre.");
                    break;
                default:
                    System.out.println("\nERRO! Opção inválida");
            }//fim switch
        }while(menu!=0); //fim do do{
    }  //fim public static   
} //fim da classe
