import java.util.ArrayList;
/**
 * Write a description of class Main here.
 * 
 * @author (Diógenes, Douglas e Vitória) 
 * @version (projPapelaria)
 */
import java.util.ArrayList;
import java.util.Scanner; // importa a classe de scanner, posibilitando ao programa ler dados inseridos pelo usuario
public class Main{
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);// define ao scanner que "ler" é a palavra usada para ler dados inseridos.
        byte menu;
        Cadastro c1= new Cadastro(); // instancia a classe cadastro a classe Main
        do{
            System.out.println("\n     *---------------------------------------------*\n"+
                               "     | 1.  Cadastrar Materiais                     |\n" +
                               "     | 2.  Listar os materiais cadastrados         |\n" +
                               "     | 3.  Ver Quantidade de Materiais             |\n" +
                               "     | 4.  Excluir um material                     |\n" +
                               "     | 5.  Pesquisar material pelo código          |\n" +
                               "     | 6.  Pesquisar material de uma marca         |\n" +
                               "     | especificada pelo usuário do sistema        |\n" +
                               "     | 7.  Pesquisar material por valor.           |\n" +
                               "     | 8.  Pesquisar Material de um fornecedor     |\n" +
                               "     | 9.  Pesquisar telefone de um fornecedor     |\n" +
                               "     | 10. Pesquisar Material que tenham menos     |\n" +
                               "     | de 50 unidades (quantidade) em estoque      |\n" +
                               "     | 11. Editar                                  |\n" +
                               "     | 0. Sair                                     |");
            System.out.println("     *---------------------------------------------*");
            menu=ler.nextByte();
            switch(menu){
                case 1: //Caso o usuário insira o número 1, o sistema irá cadastrar os materiais;
                //LIMPAR TELA
                    
                    //
                    System.out.println("     *--------------------------------------*");
                    System.out.println("     |-------CADASTRANDO OS MATERIAIS-------|");
                    System.out.println("     *--------------------------------------*");
                    Material m1= new Material();
                    //Colocando o código do material como automatico no sistema
                    int codigo;
                    if(c1.getLista().isEmpty()){
                        codigo=1;
                    }else{
                        codigo=c1.getLista().get(c1.getLista().size()-1).getCodigo()+1;
                    }
                    m1.setCodigo(codigo);
                    //
                    
                    //Cadastrando a descrição(nome) do material
                    do{
                        System.out.println("Digite o nome do material: ");
                        ler.nextLine();
                        m1.setDescricao(ler.nextLine());
                        if(m1.getDescricao().length()<1){
                            System.out.println("O material precisa ter um nome!");
                        }
                    }while(m1.getDescricao().length()<1);
                    
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
                        if(m1.getValor()<0){
                            System.out.println(m1.getDescricao()+" precisa ter um valor!");
                        }
                    }while(m1.getValor()<0);
                    
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
                        if(f1.getNome().length()<0){
                            System.out.println("O(a) fornecedor(a) precisa ter um nome!");
                        }
                    }while(f1.getNome().length()<0);
                    
                    //CADASTRANDO O TELEFONE DO FORNECEDOR  
                        do{
                            System.out.println("Digite o telefone do(a) "+f1.getNome()+": ");
                            f1.setTelefone(ler.nextLine());
                            if(f1.getTelefone().length()<8){
                                System.out.println("O(A) "+f1.getNome()+" precisa ter um telefone!");
                            }
                        }while(f1.getTelefone().length()<8);

                    //CADASTRANDO O ENDEREÇO DO FORNECEDOR
                    //RUA
                        Endereco e1= new Endereco();
                    do{
                        System.out.println("Digite a rua do(a) "+f1.getNome()+":");
                        e1.setRua(ler.nextLine());
                        if(e1.getRua().length()<1){
                            System.out.println("O endereço precisa ter uma rua!");
                        }
                    }while(e1.getRua().length()<1);
                    
                   //CIDADE
                    do{
                        System.out.println("Digite a cidade do(a) "+f1.getNome()+":");
                        e1.setCidade(ler.nextLine());
                        if(e1.getCidade().length()<1){
                            System.out.println("O endereço precisa ter uma cidade!");
                        }
                    }while(e1.getCidade().length()<1);
                    
                    //BAIRRO
                    do{
                        System.out.println("Digite o bairro do(a) "+f1.getNome()+":");
                        e1.setBairro(ler.nextLine());
                        if(e1.getBairro().length()<1){
                            System.out.println("O endereço precisa ter um bairro!");
                        }
                    }while(e1.getBairro().length()<1);
                    
                    //UF
                    do{
                        System.out.println("Digite a UF(unidade federal) do(a) "+f1.getNome()+":");
                        e1.setUf(ler.nextLine());
                        if(e1.getUf().length()<1){
                            System.out.println("O endereço precisa ter uma UF(unidade federal)!");
                        }
                    }while(e1.getUf().length()<1);
                    
                    //NUMERO
                    do{
                        System.out.println("Digite o numero do endereço do(a) "+f1.getNome()+":");
                        e1.setNumero(ler.nextLine());
                        if(e1.getNumero().length()<1){
                            System.out.println("O endereço precisa ter um numero!");
                        }
                    }while(e1.getNumero().length()<1);
                    
                    //CEP
                    do{
                        System.out.println("Digite o cep do(a) "+f1.getNome()+":");
                        e1.setCep(ler.nextLine());
                        if(e1.getCep().length()!=11){
                            System.out.println("O endereço precisa ter um CEP!");
                        }
                    }while(e1.getCep().length()!=11);
                    
                    //COMPLEMENTO
                    do{
                        System.out.println("Digite o complemento do(a) "+f1.getNome()+":");
                        e1.setComplemento(ler.nextLine());
                        if(e1.getComplemento().length()<1){
                            System.out.println("O endereço precisa ter um complemento!");
                        }
                    }while(e1.getComplemento().length()<1);
                    f1.setEndereco(e1);
                    m1.setFornecedor(f1);
                    m1.setDataLote(d1);
                    c1.cadastrar(m1);
                    System.out.println("  _____          _           _                 _       _ \n" +
" / ____|        | |         | |               | |     | |\n" +
"| |     __ _  __| | __ _ ___| |_ _ __ __ _  __| | ___ | |\n" +
"| |    / _` |/ _` |/ _` / __| __| '__/ _` |/ _` |/ _ \\| |\n" +
"| |___| (_| | (_| | (_| \\__ \\ |_| | | (_| | (_| | (_) |_|\n" +
" \\_____\\__,_|\\__,_|\\__,_|___/\\__|_|  \\__,_|\\__,_|\\___/(_)\n" +
"                                                         ");
                    
                    
                    
                    
                    
                    break;
                case 2:
                
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |-----------LISTANDO MATERIAIS----------|");
                    System.out.println("     |--------------CADASTRADOS--------------|");
                    System.out.println("     *---------------------------------------*");
                    if(c1.getLista().isEmpty()){ // se a lista estiver vazia
                        System.out.println("Não há cadastros de materiais existentes no sistema!");
                    }else{ // manda a mensagem acima, senão, mostra a lista
                        System.out.println(c1);
                    }
                
                    break;
                case 3:
                
                    System.out.println("     *--------------------------------------*");
                    System.out.println("     |----------------VENDO A---------------|");
                    System.out.println("     |-------QUANTIDADE DE MATERIAIS--------|");
                    System.out.println("     *--------------------------------------*");
                    if(c1.getLista().isEmpty()){   // se a lista não contiver nada
                        System.out.println("Não existem materiais no sistema!"); // manda a mensagem ao lado
                    }else{ // se não, mostra a lista
                        System.out.println("\n     *------------------*\n"
                                +              "     |TOTAL DE CADASTROS|\n"
                                +              "     *------------------*\n");
                        System.out.print("     "+c1.verQuantidadeCadastros());
                        System.out.print(" materiai(s) cadastrado(s)\n");
                    }
                    
                    break;
                case 4:
                
                
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |----------DELETANDO MATERIAIS...-------|");
                    System.out.println("     |------DIGITE O CÓDIGO DO MATERIAL------|");
                    System.out.println("     *---------------------------------------*");
                    if(c1.getLista().isEmpty()){
                        System.out.println("\n     Não há materiais para serem deletados!");
                    }else{
                        codigo = ler.nextInt();
                        Material materialEncontrado= c1.pesquisarPorCodigo(codigo);
                        if(c1.pesquisarPorCodigo(codigo)==null){
                            System.out.println("     Material inexistente!");
                        }else{
                            System.out.println("     Tem certeza que deseja deletar "+materialEncontrado.getDescricao()+"?");
                            System.out.println("     *-------------*");
                            System.out.println("     | 1 - SIM     |");
                            System.out.println("     | 2 - NÃO     |");
                            System.out.println("     *-------------*");
                            byte menu2= ler.nextByte();
                            switch(menu2){
                                case 1:
                                    c1.removerCadastro(materialEncontrado);
                                    System.out.println("     "+materialEncontrado+" removido com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("     Cancelando operação...");
                                    break;
                                default:
                                    System.out.println("     Erro!!\n");
                            }
                        }
                    }
                    
                    break;
                case 5:
                
                
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |-----------PESQUISAR MATERIAL----------|");
                    System.out.println("     |--------------PELO CÓDIGO--------------|");
                    System.out.println("     *---------------------------------------*");
                    if(c1.getLista().isEmpty()){
                        System.out.println("     Nenhum material foi cadastrado no sistema!");
                    }else{
                        System.out.println("     Digite o código do material a ser pesquisado: ");
                        codigo= ler.nextInt();
                        Material materialEncontrado=c1.pesquisarPorCodigo(codigo);
                        if(materialEncontrado==null){
                            System.out.println("     Nenhum material foi cadastrado no sistema!");
                        }else{
                            System.out.println(materialEncontrado);
                        }
                    }
                    
                    
                    break;
                case 6:
                    System.out.println("     *---------------------------------------*");
                    System.out.println("     |-----------PESQUISAR MATERIAL----------|");
                    System.out.println("     |--------------DE UMA MARCA-------------|");
                    System.out.println("     |-------ESPECIFICADA PELO SISTEMA-------|");
                    System.out.println("     *---------------------------------------*");
                    ler.nextLine();
                    if(c1.getLista().isEmpty()){
                        System.out.println("     Nenhum material foi cadastrado no sistema!");
                    }else{
                        System.out.println("     Nenhum material foi cadastrado no sistema!");
                        String marca = ler.nextLine();
                        ArrayList<Material> materialEncontrado= c1.pesquisarPorMarca(marca);
                        if(c1.getLista().isEmpty()){
                            System.out.println("     Nenhum material foi cadastrado no sistema!");
                        }else{
                        System.out.println(materialEncontrado);
                        }
                    }
                    break;
                case 7:
                    
                    System.out.println("     *----------------------------------------*");
                    System.out.println("     |------------PESQUISAR MATERIAL----------|");
                    System.out.println("     |----------------POR VALOR---------------|");
                    System.out.println("     *----------------------------------------*");
                    if(c1.getLista().isEmpty()){
                        System.out.println("     Nenhum material foi cadastrado no sistema!");
                    }else{
                        System.out.println("     Digite o valor para buscar o material: ");
                        double valor=ler.nextDouble();
                        ArrayList<Material> materialEncontrado=c1.pesquisarPorValor(valor);
                        if(materialEncontrado.isEmpty()){
                            System.out.println("     Nenhum material foi cadastrado no sistema!");
                        }else{
                        System.out.println(materialEncontrado);
                        }
                    }
                    break;
                case 8:
                    System.out.println("\n     *---------------------------------------*");
                    System.out.println("     |-----------PESQUISAR MATERIAL----------|");
                    System.out.println("     |------------DE UM FORNECEDOR-----------|");
                    System.out.println("     *---------------------------------------*");
                    System.out.println("\n     Digite o nome do fornecedor: ");
                    String nome=ler.nextLine();
                    if(c1.getLista().isEmpty()){
                        System.out.println("     Nenhum material foi cadastrado no sistema!");
                    }else{
                        ArrayList<Material> materialEncontrado= c1.pesquisarPorFornecedor(nome);
                        if(materialEncontrado.isEmpty()){
                            System.out.println("     Nenhum material foi cadastrado no sistema!");
                        }else{
                            System.out.println(materialEncontrado);
                        }
                    }
                    break;
                case 9:
                    System.out.println("\n     *---------------------------------------*");
                    System.out.println("     |-----------PESQUISAR TELEFONE----------|");
                    System.out.println("     |------------DE UM FORNECEDOR-----------|");
                    System.out.println("\n     *---------------------------------------*");
                    System.out.println("     Digite o telefone do fornecedor: ");
                    String telefone=ler.nextLine();
                    if(c1.getLista().isEmpty()){
                        System.out.println("     Nenhum telefone foi cadastrado no sistema!");
                    }else{
                        ArrayList<Fornecedor> fornecedorEncontrado=c1.pesquisarPorFornecedor(nome);
                        if(fornecedorEncontrado.isEmpty()){
                            System.out.println("     Nenhum telefone foi cadastrado no sistema!");
                        }else{
                            System.out.println(fornecedorEncontrado);
                        }
                    }
                    break;
                case 10:
                    System.out.println("\n     *---------------------------------------*");
                    System.out.println("     |-----------PESQUISAR MATERIAL----------|");
                    System.out.println("     |------------COM MENOS DE 50------------|");
                    System.out.println("     |----------------UNIDADES---------------|");
                    System.out.println("\n     *---------------------------------------*");
                    System.out.println("     Digite o código do material: ");
                    String mcodigo=ler.nextLine();
                    if(c1.getLista().isEmpty()){
                        System.out.println("     Nenhum material foi cadastrado no sistema!");
                    }else{
                        ArrayList<Material> materiaisEncontrado= c1.pesquisarMaterialAte50();
                        if(materiaisEncontrado.isEmpty()){
                            System.out.println("     Nenhum material foi cadastrado no sistema!");
                        }else{
                            System.out.println(materiaisEncontrado);
                        }
                    }
                    break;
                case 11:
                    
                
        
        
            }
        }while(menu!=0);

    }
}

