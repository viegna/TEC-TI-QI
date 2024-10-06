
import java.util.ArrayList;
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

        System.out.println("*----------------------------*");
        System.out.println("|          SEJA BEM          |");
        System.out.println("|          VINDA(O)          |");
        System.out.println("*----------------------------*");

        System.out.println("1 - Cadastrar Funcionários;");
        System.out.println("2 - Ver Cadastros;");
        System.out.println("3 - Ver Quantidade de Cadastros;");
        System.out.println("4 - Remover Cadastros;");
        System.out.println("5 - Pesquisar funcionário por CPF;");
        System.out.println("6 - Pesquisar funcionário por salário;");
        System.out.println("7 - Pesquisar funcionário por cidade;");
        System.out.println("8 - Pesquisar funcionário por nome;");
        System.out.println("0 - Sair.");
        menu=ler.nextByte();
        
        
        switch(menu){
            case 1:
                
                        //pede e lê validando dados do funcionário  Crud - Create = cadastrar, criar

                System.out.println("*----------------------------*");
                System.out.println("|        CADASTRANDO         |");
                System.out.println("|        FUNCIONÁRIO         |");
                System.out.println("*----------------------------*");
                Funcionarios f1 = new Funcionarios();
                
                        //pede e lê validado do codigo do funcionario

                do{
                    System.out.println("Digite o código do funcionário: ");
                    f1.setCodigo(ler.nextInt());
                    if(f1.getCodigo()<0){
                        System.out.println("Erro! Código negativo!");
                    }
                }while(f1.getCodigo()<0);
                
                        //pede e lê validado do nome do funcionario

                do{
                    System.out.println("Digite o nome do funcionário: ");
                    ler.nextLine();
                    f1.setNome(ler.nextLine());
                    if(f1.getNome().length()<=0){
                        System.out.println("Erro! O funcionário precisa ter um nome!");
                    }
                }while(f1.getNome().length()<=0);
                
                        //pede e lê validado do cpf do funcionario

                do{
                    System.out.println("Digite o cpf do funcionário: ");
                    f1.setCpf(ler.nextLine());
                    if(f1.getCpf().length()<11 || f1.getCpf().length()>11){
                        System.out.println("Erro! Cpf inválido!");
                }
                }while(f1.getCpf().length()<11 || f1.getCpf().length()>11);
                
                        //pede e lê validado do salario do funcionario

                do{
                    System.out.println("Digite o salário do funcionário: ");
                    f1.setSalario(ler.nextDouble());
                    if(f1.getSalario()<0){
                        System.out.println("Erro! Salário negativo!");
                    }
                }while(f1.getSalario()<0);
                    
                
                Endereco e1= new Endereco();
                
                        //pede e lê validando os dados do endereço

                    System.out.println("*---------------------------*");
                    System.out.println("|        CADASTRANDO        |");
                    System.out.println("|         ENDEREÇO          |");
                    System.out.println("*---------------------------*");

                                    //pede e lê validado da rua

                do{
                    System.out.println("Digite a rua: ");
                    ler.nextLine();
                    e1.setRua(ler.nextLine());
                    if(e1.getRua().length()<=0){
                        System.out.println("Erro! O endereço precisa ter uma rua!");
                    }
                }while(e1.getRua().length()<=0);
                
                                //pede e lê validado do numero

                do{
                    System.out.println("Digite o número: ");
                    e1.setNumero(ler.nextLine());
                    if(e1.getNumero().length()<=0){
                        System.out.println("Erro! O endereço precisa ter um número!");
                    }
                }while(e1.getNumero().length()<=0);
                    
                                //pede e lê validado do bairro

                do{
                    System.out.println("Digite o bairro: ");
                     e1.setBairro(ler.nextLine());
                     if(e1.getBairro().length()<=0){
                         System.out.println("Erro! O endereço precisa ter um bairro!");
                     }
                }while(e1.getBairro().length()<=0);
                
                                //pede e lê validado da cdade

                do{
                    System.out.println("Digite a cidade: ");
                    e1.setCidade(ler.nextLine());
                    if(e1.getCidade().length()<=0){
                        System.out.println("Erro! O endereço precisa ter uma cidade!");
                    }
                }while(e1.getCidade().length()<=0);
                
                                //pede e lê validado do uf
                
                do{
                    System.out.println("Digite a Unidade Federal do endereço (UF): ");
                    e1.setUf(ler.nextLine());
                    if(e1.getUf().length()<=0){
                        System.out.println("Erro! O endereço precisa ter uma UF!");
                    }
                }while(e1.getUf().length()<=0);
                
                                //pede e lê validado do cep

                do{
                    System.out.println("Digite o cep: ");
                    e1.setCep(ler.nextLine());
                    if(e1.getCep().length()<8){
                        System.out.println("Erro! CEP inválido!");
                    }
                }while(e1.getCep().length()<8);
                
              
                    
                
                        //Inserindo endereço no funcionario
                f1.setEndereco(e1);
                
                
                      //cadastrando funcionario no cadastrar
                c1.cadastrar(f1);
                  break;
            case 2:
                                // visualizando cadastros cRud - read - VER CADASTROS
                    System.out.println("*----------------------------*");
                    System.out.println("|        VISUALIZANDO        |");
                    System.out.println("|         CADASTRO...        |");
                    System.out.println("*----------------------------*");
                    
                    if(c1.getLista().isEmpty()){
                        System.out.println("O sistema não identificou cadastros existentes! ");
                    }else{
                        System.out.println(c1);
                    }
                break;
            case 3:
                
                    System.out.println("*---------------------------*");
                    System.out.println("|       VISUALIZANDO        |");
                    System.out.println("|         CADASTROS         |");
                    System.out.println("*---------------------------*");
                    if(c1.verQuantidade()==1){
                        System.out.println("Existe apenas um cadastro no sistema.");
                    }else{
                        System.out.println("Existem "+ c1.verQuantidade()+" cadastros no sistema.");
                    }

                break;
            case 4:
                    //EXCLUINDO FUNCIONARIOS
                    System.out.println("*-----------------------------*");
                    System.out.println("|          EXCLUINDO          |");
                    System.out.println("|         FUNCIONARIOS        |");
                    System.out.println("*-----------------------------*");
                if(c1.getLista().isEmpty()){
                    System.out.println("Não há funcionários para excluir.");
                }else{
                    System.out.print("Informe o código do funcionário à ser excluído: ");
                    int codigo=ler.nextInt();
                    Funcionarios encontrado=c1.pesquisarPorCodigo(codigo);
                    if(encontrado==null){
                        System.out.println("Sinto muito! Não foram encontrados funcionários com este código.");
                    }else{
                        c1.remover(encontrado);
                                //REMOVENDO FUNCIONÁRIO
                    System.out.println("*--------------------------*");
                    System.out.println("|        FUNCIONÁRIO       |");
                    System.out.println("|         REMOVIDO         |");
                    System.out.println("*--------------------------*");
                    }
                }
                
                break;
            case 5:
                System.out.println("\n*--------------------------*");
                System.out.println("|        PESQUISANDO       |");
                System.out.println("|         POR CPF          |");
                System.out.println("*--------------------------*");
                if(c1.getLista().isEmpty()){
                    System.out.println("Não existem funcionários à serem pesquisados.");
                }else{
                    System.out.println("Informe o cpf do funcionário: ");
                    String cpf=ler.nextLine();
                    Funcionarios encontrados= c1.pesquisarPorCpf(cpf);
                    if(encontrados==null){
                         System.out.println("Não existe funcionário com este cpf no sistema");
                    }else{
                        System.out.println(encontrados);
                    }
                }
                break;
            case 6:
                System.out.println("*--------------------------*");
                System.out.println("|        PESQUISANDO       |");
                System.out.println("|        POR SALARIO       |");
                System.out.println("*--------------------------*");
                if(c1.getLista().isEmpty()){
                    System.out.println("Não existem funcionários com este salário no sistema.");
                }else{
                    System.out.println("Informe o salário do funcionário: ");
                    double salario=ler.nextDouble();
                    ArrayList<Funcionarios> achados= c1.pesquisarPorSalario(salario);
                    if(achados.isEmpty()){
                        System.out.println("Não existem funcionários com este salário.");
                    }else{
                        System.out.println(achados);
                    }
                }
                break;
            }
                   
    }while(menu!=0);
    }
    }
