
import java.util.Scanner;

/**
 *
 * @author DIOGENES
 */
public class Main {
    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    Cadastro c1 = new Cadastro();
    
    byte menu;
    do{
        System.out.println("1 - Cadastrar Funcionários");
        System.out.println("2 - Ver Cadastros");
        System.out.println("3 - Ver Quantidade de Cadastros");
        System.out.println("4 - Remover Cadastros");
        System.out.println("0 - Sair");
        menu=ler.nextByte();
        switch(menu){
            case 1:
                System.out.println("*----------------------------*");
                System.out.println("|        CADASTRANDO         |");
                System.out.println("|        FUNCIONÁRIO         |");
                System.out.println("*----------------------------*");
                Funcionarios f1 = new Funcionarios();
                
                do{
                    System.out.println("Digite o código do funcionário: ");
                    f1.setCodigo(ler.nextInt());
                    if(f1.getCodigo()<0){
                        System.out.println("Erro! Código negativo!");
                    }
                }while(f1.getCodigo()<0);
                
                System.out.println("Digite o nome do funcionário: ");
                f1.setNome(ler.nextLine());
                
                do{
                    System.out.println("Digite o cpf do funcionário: ");
                    f1.setCpf(ler.nextLine());
                    if(f1.getCpf().length()<11 || f1.getCpf().length()>11){
                        System.out.println("Erro! Cpf inválido!");
                }
                }while(f1.getCpf().length()<11 || f1.getCpf().length()>11);
                System.out.println("Digite o salário do funcionário: ");
                f1.setSalario(ler.nextDouble());
                
                Endereco e1= new Endereco();
                System.out.println("*---------------------------*");
                System.out.println("|        CADASTRANDO        |");
                System.out.println("|         ENDEREÇO          |");
                System.out.println("*---------------------------*");
                
                System.out.println("Digite a rua: ");
                e1.setRua(ler.nextLine());
                System.out.println("Digite o número: ");
                e1.setNumero(ler.nextLine());
                System.out.println("Digite o bairro: ");
                e1.setBairro(ler.nextLine());
                System.out.println("Digite a cidade: ");
                e1.setCidade(ler.nextLine());
                
                do{
                    System.out.println("Digite o cep: ");
                    e1.setCep(ler.nextLine());
                    if(e1.getCep().length()<8){
                        System.out.println("Erro! CEP inválido!");
                    }
                }while(e1.getCep().length()<8);
                
                
                //Inserindo endereço no funcionario
                f1.setEndereco(e1);
                
                
                //cadastrando
                c1.cadastrar(f1);
        }
    }while(menu!=0);
    }
}
