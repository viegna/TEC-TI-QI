
/**
 * Write a description of class Main here.
 * 
 * @author (Diógenes, Douglas e Vitória) 
 * @version (projPapelaria)
 */
import java.util.Scanner; // importa a classe de scanner, posibilitando ao programa ler dados inseridos pelo usuario
public class Main{
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);// define ao scanner que "ler" é a palavra usada para ler dados inseridos.
        byte menu;
        Cadastro c1= new Cadastro();
        do{
            System.out.println("     *--------------------------------------------*\n"+
                               "     | 1. Cadastrar Materiais                     |\n" +
                               "     | 2. Listar os materiais cadastrados         |\n" +
                               "     | 3. Ver Quantidade de Materiais             |\n" +
                               "     | 4. Excluir um material                     |\n" +
                               "     | 5. Pesquisar material pelo código          |\n" +
                               "     | 6. Pesquisar material de uma marca         |\n" +
                               "     | especificada pelo usuário do sistema       |\n" +
                               "     | 7. Pesquisar material por valor.           |\n" +
                               "     | 8. Pesquisar Material de um fornecedor     |\n" +
                               "     | 9. Pesquisar telefone de um fornecedor     |\n" +
                               "     | 10. Pesquisar Material que tenham menos    |\n" +
                               "     | de 50 unidades (quantidade) em estoque     |\n" +
                               "     | 0. Sair                                    |");
            System.out.println("     *--------------------------------------------*");
            menu=ler.nextByte();
            switch(menu){
                case 1: //Caso o usuário insira o número 1, o sistema irá cadastrar os materiais;
                //LIMPAR TELA
                    System.out.println("     *--------------------------------------*");
                    System.out.println("     |-------CADASTRANDO OS MATERIAIS-------|");
                    System.out.println("     *--------------------------------------*");
                    Material m1= new Material();
                    //
                    int codigo;
                    if(c1.getLista().isEmpty()){
                        codigo=1;
                    }else{
                        codigo=c1.getLista().get(c1.getLista().size()-1).getCodigo()+1;
                    }
                    m1.setCodigo(codigo);
                    //
                    //Cadastrando o código do material
                    do{
                        System.out.println("    Digite o código do Material: ");
                        m1.setCodigo(ler.nextInt());
                        if(m1.getCodigo()<0){
                            System.out.println("    Erro! Código negativo!");
                        }
                    }while(m1.getCodigo()<0);
                    
                    //Cadastrando a descrição(nome) do material
                    do{
                        System.out.println("Digite o nome do material: ");
                        ler.nextLine();
                        m1.setDescricao(ler.nextLine());
                        if(m1.getDescricao().length()<=0){
                            System.out.println("O material precisa ter um nome!");
                        }
                    }while(m1.getDescricao().length()<=0);
                    
                    //Cadastrando a quantidade do material
                    do{
                        System.out.println("Digite a quantidade do "+m1.getDescricao()+": ");
                        m1.setQuantidade(ler.nextInt());
                        if(m1.getQuantidade()<0){
                            System.out.println(m1.getDescricao()+" precisa ter uma quantidade!\nDigite novamente!");
                        }
                    }while(m1.getQuantidade()<0);
                    
                    //Cadastrando o valor de cada material
                    do{
                        System.out.println("Digite o valor de cada "+m1.getDescricao()+": ");
                        m1.setValor(ler.nextDouble());
                        if(m1.getValor()<=0){
                            System.out.println(m1.getDescricao()+" precisa ter um valor!");
                        }
                    }while(m1.getValor()<=0);
                    
                    //Cadastrando a marca do material
                    do{
                        System.out.println("Digite a marca do "+m1.getDescricao()+":");
                        ler.nextLine();
                        m1.setMarca(ler.nextLine());
                        if(m1.getMarca().length()<1){
                            System.out.println(m1.getDescricao()+" precisa ter uma marca!");
                        }
                    }while(m1.getMarca().length()<1);
                    
                    //Cadastrando o lote do material
                    Data d1= new Data();
                    
                    //cadastrando o dia
                    do{
                        System.out.println("Digite o dia de lote do "+m1.getDescricao());
                        d1.setDia(ler.nextByte());
                    System.out.println("\n"+d1.getDia()+"/__/____");
                    
                    //cadastrando o mes
                        System.out.println("\nDigite o mês de lote do "+m1.getDescricao());
                        d1.setMes(ler.nextByte());
                    System.out.println("\n"+d1.getDia()+"/"+d1.getMes()+"/____");
                    
                    //cadastrando o ano
                        System.out.println("\nDigite um ano de lote do "+m1.getDescricao());
                        d1.setAno(ler.nextInt());
                        if(d1.verificarData()){
                            System.out.println(" Erro! Data inválida!\n Digite novamente!\n");
                        }
                    }while(d1.verificarData());
                    
                    System.out.println("\n"+d1.getDia()+"/"+d1.getMes()+"/"+d1.getAno());


                    //Cadastrando fornecedor 
                    System.out.println("\n" +
                                       "     *----------------------------------------*");
                    System.out.println("     |---------------CADASTRANDO--------------|");
                    System.out.println("     |---------------FORNECEDOR---------------|");
                    System.out.println("     *----------------------------------------*");
                    Fornecedor f1= new Fornecedor();
                    
                    // CADASTRANDO O NOME DO FORNECEODR
                    do{
                        System.out.println("Digite o nome do(a) fornecedor(a): ");
                        ler.nextLine();
                        f1.setNome(ler.nextLine());
                        if(f1.getNome().length()<=0){
                            System.out.println("O(a) fornecedor(a) precisa ter um nome!");
                        }
                    }while(f1.getNome().length()<=0);
                    
                    //CADASTRANDO O TELEFONE DO FORNECEDOR  
                        do{
                            System.out.println("Digite o telefone do(a) "+f1.getNome()+": ");
                            f1.setTelefone(ler.nextLine());
                            if(f1.getTelefone().length()<8){
                                System.out.println("O(A) "+f1.getNome()+" precisa ter um nome!");
                            }
                        }while(f1.getTelefone().length()<8);

                    //CADASTRANDO O ENDEREÇO DO FORNECEDOR
                    //RUA
                        Endereco e1= new Endereco();
                    do{
                        System.out.println("Digite a rua do(a) "+f1.getNome()+":");
                        e1.setRua(ler.nextLine());
                        if(e1.getRua().length()<=0){
                            System.out.println("O endereço precisa ter uma rua!");
                        }
                    }while(e1.getRua().length()<=0);
                    
                   //CIDADE
                    do{
                        System.out.println("Digite a cidade do(a) "+f1.getNome()+":");
                        e1.setCidade(ler.nextLine());
                        if(e1.getCidade().length()<=0){
                            System.out.println("O endereço precisa ter uma cidade!");
                        }
                    }while(e1.getCidade().length()<=0);
                    
                    //BAIRRO
                    do{
                        System.out.println("Digite o bairro do(a) "+f1.getNome()+":");
                        e1.setBairro(ler.nextLine());
                        if(e1.getBairro().length()<=0){
                            System.out.println("O endereço precisa ter um bairro!");
                        }
                    }while(e1.getBairro().length()<=0);
                    
                    //UF
                    do{
                        System.out.println("Digite a UF(unidade federal) do(a) "+f1.getNome()+":");
                        e1.setUf(ler.nextLine());
                        if(e1.getUf().length()<=0){
                            System.out.println("O endereço precisa ter uma UF(unidade federal)!");
                        }
                    }while(e1.getUf().length()<=0);
                    
                    //NUMERO
                    do{
                        System.out.println("Digite o numero do endereço do(a) "+f1.getNome()+":");
                        e1.setNumero(ler.nextLine());
                        if(e1.getNumero().length()<=0){
                            System.out.println("O endereço precisa ter um numero!");
                        }
                    }while(e1.getNumero().length()<=0);
                    
                    //CEP
                    do{
                        System.out.println("Digite o cep do(a) "+f1.getNome()+":");
                        e1.setCep(ler.nextLine());
                        if(e1.getCep().length()<=0 || e1.getCep().length()>11){
                            System.out.println("O endereço precisa ter um CEP!");
                        }
                    }while(e1.getCep().length()<=0 || e1.getCep().length()>11);
                    
                    //COMPLEMENTO
                    do{
                        System.out.println("Digite o complemento do(a) "+f1.getNome()+":");
                        e1.setComplemento(ler.nextLine());
                        if(e1.getComplemento().length()<=0){
                            System.out.println("O endereço precisa ter um complemento!");
                        }
                    }while(e1.getComplemento().length()<=0);
                    
                    
                    
                    
                    
                    break;
                case 2:
                
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |-----------LISTANDO MATERIAIS----------|");
                    System.out.println("     |--------------CADASTRADOS--------------|");
                    System.out.println("     *---------------------------------------*");
                    System.out.println(c1);
                
                    break;
                case 3:
                
                    System.out.println("     *--------------------------------------*");
                    System.out.println("     |----------------VENDO A---------------|");
                    System.out.println("     |-------QUANTIDADE DE MATERIAIS--------|");
                    System.out.println("     *--------------------------------------*");
                    
                    
                    break;
                case 4:
                
                
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |----------EXCLUINDO MATERIAIS----------|");
                    System.out.println("     *---------------------------------------*");
                    
                    break;
                case 5:
                
                
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |-----------PESQUISAR MATERIAL----------|");
                    System.out.println("     |--------------PELO CÓDIGO--------------|");
                    System.out.println("     *---------------------------------------*");
                    
                    break;
                case 6:
                
                
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |-----------PESQUISAR MATERIAL----------|");
                    System.out.println("     |--------------DE UMA MARCA-------------|");
                    System.out.println("     |-------ESPECIFICADA PELO SISTEMA-------|");
                    System.out.println("     *---------------------------------------*");
                            
                    break;
                case 7:
                        // inserindo data
                    /*          
                Data d1 = new Data();
                
                boolean erroData;
                do{
                    System.out.println("--PREENCHA A DATA--");
                    System.out.println("Digite o dia: ");
                    d1.setDia(ler.nextByte());
                    System.out.println("Digite o mês: ");
                    d1.setMes(ler.nextByte());
                    System.out.println("Digite o ano: ");
                    d1.setAno(ler.nextInt());
                    erroData = d1.verificarData();
                    if(erroData){
                        System.out.println("Data inválida! Digite novamente.");
                    }
                }while(erroData);
                
                System.out.println("*------------------*");
                System.out.println("|"+d1+"         |");
                System.out.println("*------------------*");
                 
                    
                    
                
        
        */
            }
        }while(menu!=0);

    }
}

