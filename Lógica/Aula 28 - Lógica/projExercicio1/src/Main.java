
import java.util.Scanner;

/**
 *
 * @author Diógenes
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        Produto p1= new Produto();
        
        //pede e le
        System.out.println("\n\n*--------------------------------*");
        System.out.println("|        DADOS DO PRODUTO        |");
        System.out.println("*--------------------------------*");
        
        do{
            System.out.println("Digite o código do produto: ");
            p1.setCodigo(ler.nextLine());
            if(p1.getCodigo().length()<=0){
                System.out.println("Erro! Código não especificado!!");
            }
        }while(p1.getCodigo().length()<=0);
        
        do{
            System.out.println("Digite o nome do produto: ");
            p1.setNome(ler.nextLine());
            if(p1.getNome().length()<=0){
                System.out.println("Erro! O produto precisa ter um nome!");
            }
        }while(p1.getNome().length()<=0);
            
        do{
            System.out.println("Digite a quantidade de produtos: ");
            p1.setQuantidade(ler.nextInt());
            if(p1.getQuantidade()<=0){
                System.out.println("Erro! Quantidade do produto negativa!");
            }
        }while(p1.getQuantidade()<=0);
            
        do{
            System.out.println("Digite o valor de produtos: ");
            p1.setValor(ler.nextDouble());
            if(p1.getValor()<=0 ){
                System.out.println("Erro! Valor do produto negativo!");
            }
        }while(p1.getValor()<=0);
            
        Fornecedor f1= new Fornecedor();
        System.out.println("\n\n*---------------------------------*");
        System.out.println("|       DADOS DO FORNECEDOR       |");
        System.out.println("*---------------------------------*");
        
        do{
            System.out.println("Digite o nome do fornecedor: ");
            ler.nextLine();
            f1.setNome(ler.nextLine());
            if(f1.getNome().length()<=0){
                System.out.println("Erro! O fornecedor precisa ter um nome!");
            }
        }while(f1.getNome().length()<=0);
        
        
        do{
            System.out.println("Digite o telefone do fornecedor: ");
            f1.setTelefone(ler.nextLine());
            if(f1.getTelefone().length()<=0){
                System.out.println("O fornecedor precisa ter um telefone!");
            }else if(f1.getTelefone().length()!=8){
                System.out.println("O fornecedor precisa ter um telefone com 8 dígitos!");
            }
        }while(f1.getTelefone().length()<=0);
        
        
        DataNascimento d1=new DataNascimento();
        System.out.println("\n\n*--------------------------------*");
        System.out.println("|       DATA DE NASCIMENTO       |");
        System.out.println("*--------------------------------*");

        do{
            System.out.println("\n\nDigite o dia de nascimento do fornecedor: ");
            System.out.println("\n   *------------------*");
            System.out.println(   "   |-----__/__/__-----|");
            System.out.println(   "   *------------------*");
            d1.setDia(ler.nextLine());
            if(d1.getDia().length()<=0){
                System.out.println("Erro! A data de nascimento precisa ter um dia!");
            }
        }while(d1.getDia().length()<=0);


        do{
            System.out.println("\n   *------------------*");
            System.out.println("   |-----"+d1.getDia()+"/__/__-----|");
            System.out.println("   *------------------*");
            System.out.println("Digite o mês de nascimento do fornecedor: ");
            d1.setMes(ler.nextLine());
            if(d1.getMes().length()<=0){
                System.out.println("Erro! A data de nascimento precisa ter um mês!");
            }

        }while(d1.getMes().length()<=0);

        do{
            System.out.println("\n   *------------------*");
            System.out.println("   |-----"+d1.getDia()+"/"+d1.getMes()+"/__-----|");
            System.out.println("   *------------------*");
            System.out.println("Digite o ano de nascimento do fornecedor"); 
            d1.setAno(ler.nextLine());
            if(d1.getAno().length()<=0){
                System.out.println("Erro! A data de nascimento precisa ter um ano!");
            }
        }while(d1.getAno().length()<=0);



        System.out.println("\n\n*--------------------------------*");
        System.out.println("|       DATA DE NASCIMENTO       |");
        System.out.println("*--------------------------------*");
        if(d1.getAno().length()==4){
            System.out.println("\n   *------------------*");
            System.out.println("   |----"+d1.getDia()+"/"+d1.getMes()+"/"+d1.getAno()+"----|");
            System.out.println("   *------------------*");
        }else{
        System.out.println("\n   *------------------*");
        System.out.println("   |-----"+d1.getDia()+"/"+d1.getMes()+"/"+d1.getAno()+"-----|");
        System.out.println("   *------------------*");
        }


        Endereco e1= new Endereco();
        System.out.println("\n\n*--------------------------------*");
        System.out.println("|     ENDEREÇO DO FORNECEDOR     |");
        System.out.println("*--------------------------------*");
        
        do{
            System.out.println("\n\nDigite a Cidade do Fornecedor: ");
            e1.setCidade(ler.nextLine());
            if(e1.getCidade().length()<=0){
                System.out.println("Erro! O fornecedor precisa morar em uma cidade!");
            }
        }while(e1.getCidade().length()<=0);

        do{
            System.out.println("Digite o Estado do Fornecedor: ");
            e1.setEstado(ler.nextLine());
            if(e1.getEstado().length()<=0){
                System.out.println("Erro! O fornecedor precisa morar em um estado!");
            }
        }while(e1.getEstado().length()<=0);

        //inserindo endereço e data nascimento ao fornecedor
        f1.setEndereco(e1);
        f1.setDataNascimento(d1);

        //fornecedor ao produto
        p1.setFornecedor(f1);

        //respostas

        System.out.println("\n");

        System.out.println("*--------------------------------*");
        System.out.println("|           RESPOSTAS            |");
        System.out.println("*--------------------------------*");

        System.out.println(p1);


    }
    
}
