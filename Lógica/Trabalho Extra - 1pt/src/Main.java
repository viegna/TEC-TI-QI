
import java.util.Scanner;

/**
 *
 * @author Lab-xx-xx
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        CalcularFolha cf1=new CalcularFolha();
        
        //byte menu
        byte menu;
        
        //pede e le
        do{
            System.out.println("\n1 – Digitar os dados\n" +
                                "2 – Ver dados\n" +
                                "3 – Ver respostas\n" +
                                "0 - Sair");
            menu=ler.nextByte();
            switch(menu){
                case 1:
                    System.out.println("\nDigite o nome: ");
                    ler.nextLine();
                    cf1.setNome(ler.nextLine());
                        do{
                            System.out.println("\nDigite o CPF: ");
                            cf1.setCpf(ler.next());
                            if(cf1.getCpf().length()!=11){
                                System.out.println("Erro! CPF inválido!");
                            }
                        }while(cf1.getCpf().length()!=11);
                    System.out.println("\nDigite o cargo: ");
                    cf1.setCargo(ler.nextLine());
                    
                    //validação valor hora
                    
                    do{
                        System.out.println("\nDigite o valor/hora: ");
                        cf1.setValorHora(ler.nextDouble());
                        if(cf1.getValorHora()<0){
                            System.out.println("Erro! Valor/hora negativo!");
                        }
                    }while(cf1.getValorHora()<0);
                    
                    //validação quantidade horas
                    
                    do{
                        System.out.println("\nDigite a quantidade de horas: ");
                        cf1.setQuantidadeHora(ler.nextDouble());
                        if(cf1.getQuantidadeHora()<0){
                            System.out.println("Erro! Quantidade de horas negativa!");
                        }
                    }while(cf1.getQuantidadeHora()<0);
                    
                    //validação passagem/mes
                    do{
                        System.out.println("\nDigite o valor total de passagem do mês: ");
                        cf1.setValorTotalPassagem(ler.nextDouble());
                        if(cf1.getValorTotalPassagem()<0){
                            System.out.println("Erro! Valor de passagem ao mês negativo!");
                        }
                    }while(cf1.getValorTotalPassagem()<0);
                    
                    //validação quantidade dependentes
                    
                    do{
                        System.out.println("\nDigite a quantidade de dependentes: ");
                        cf1.setQuantidadeDependentes(ler.nextInt());
                        if(cf1.getQuantidadeDependentes()<0){
                            System.out.println("Erro! Quantidade de dependentes negativa!");
                        }
                    }while(cf1.getQuantidadeDependentes()<0);
                    
                    //validação insalubridade
                    do{
                        System.out.println("\nOpção de Insalubridade\n"+
                                            "Escolha uma opção abaixo\n" +
                                            "1 – Sem Insalubridade\n" +
                                            "2 – Mínimo\n" +
                                            "3 – Médio\n" +
                                            "4 – Máximo");
                        cf1.setTipoInsalubridade(ler.nextByte());
                        if(cf1.getTipoInsalubridade()<0 || cf1.getTipoInsalubridade()>4){
                            System.out.println("Erro! Insalubridade não estabelecida!");
                        }
                    }while(cf1.getTipoInsalubridade()<0 || cf1.getTipoInsalubridade()>4);
                    
                    break;
                case 2:
                    System.out.println(cf1.toString());
                    break;
                case 3:
                    System.out.println("\nNome: "+cf1.getNome());
                    System.out.println("CPF: "+cf1.getCpf());
                    System.out.println("Cargo: "+cf1.getCargo());
                    System.out.println("Salario Bruto: "+cf1.salarioBruto());
                    System.out.println("Valor vale transporte: "+cf1.calcularValeTransporte());
                    System.out.println("Salário Família: "+cf1.calcularSalarioFamilia());
                    System.out.println("Insalubridade: "+cf1.calcularInsalubridade());
                    System.out.println("INSS: "+cf1.calcularINSS());
                    System.out.println("Salário Líquido: "+cf1.calcularSalarioLiquido());
                    break;
                case 0:
                    System.out.println("Sayonara!");
                    break;
                default:
                    System.out.println("\nErro! Opção não estabelecida!");
            }
        }while(menu!=0);
    }
}
