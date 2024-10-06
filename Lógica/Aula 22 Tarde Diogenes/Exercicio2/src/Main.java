
import java.util.Scanner;

/**
 *
 * @author Diogenes
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        MediaVendas mv1=new MediaVendas();
        
        byte menu;
        do{
            System.out.println("\n1 - Informar Dados"
                                + "\n2 - Ver Dados"
                                + "\n3 - Ver Resposta"
                                + "\n0 - Sair");
            menu=ler.nextByte();
            
            switch(menu){
                case 1:
                    System.out.println("Digite o nome do funcionário: ");
                    ler.nextLine();
                    mv1.nome=ler.nextLine();
                    do{
                        System.out.println("Digite o valor de vendas de março: ");
                        mv1.vendasMarco=ler.nextDouble();
                        if(mv1.vendasMarco<0){
                            System.out.println("Erro! Valor de vendas de março negativas!");
                        }
                    }while(mv1.vendasMarco<0);
                    do{
                        System.out.println("Digite o valor de abril: ");
                        mv1.vendasAbril=ler.nextDouble();
                        if(mv1.vendasAbril<0){
                            System.out.println("Erro! Valor de vendas de abril negativas!");
                        }
                    }while(mv1.vendasAbril<0);
                    break;
                case 2:
                    System.out.println(mv1.toString());
                    break;
                case 3:
                    System.out.println("\nA média de vendas de março e abril é: "+mv1.mediaVendas());
                    System.out.println("O valor ganho de bonificação sobre as vendas é: "+mv1.calcularBonificar());
                    break;
                case 0:
                    System.out.println("Asta la vista, baby!");
                    break;
                default:
                    System.out.println("Erro! Opção não estabelecida");
            }
            }while(menu!=0);
        }
    }
    

