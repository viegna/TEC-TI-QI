
import java.util.ArrayList;

public class Cadastro {
    //Atributos
    private ArrayList<Funcionarios> lista;
    
    
    //metodo construtor
    public Cadastro(){
        this.lista=new ArrayList<>();
    }
    
    //set e get: crUd - update = atualizar

    public ArrayList<Funcionarios> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Funcionarios> lista) {
        this.lista = lista;
    }
    
    
    //toString cRud - read = ler,visualizar

    @Override
    public String toString() {
        return "   Lista de Funcionários: \n*--------------------------*" + lista;
    }
    
    
    //metodo para cadastrar Crud - create = criar, cadastrar
    public void cadastrar(Funcionarios f1){
        this.lista.add(f1);
    }
    //METODO PARA REMOVER  
    public void remover(Funcionarios f1){
        this.lista.remove(f1);
    }
    
    //METODO PARA V3R QUANTIDADE
    public int verQuantidade(){
        return this.lista.size();
        
    }
            //PESQUISA POR FUNCIONARIO PELO SEU CÓDIGO
    public Funcionarios pesquisarPorCodigo(int codigo){
        Funcionarios encontrado= null;
        for(int i =0; i<this.lista.size() && encontrado== null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                encontrado= this.lista.get(i);
            }
        }
        return encontrado;
    }
    
            //PESQUISA POR FUNCIONARIOS POR CPF
    public Funcionarios pesquisarPorCpf(String cpf){
        Funcionarios encontrado=null;
        for(int i=0; i<this.lista.size() && encontrado==null; i++){
            if(this.lista.get(i).getCpf().equals(cpf)){
                encontrado= this.lista.get(i);
            }
        }
        return encontrado;
    }
            //PESQUISA POR FUNCIONARIOS POR SALARIO
    public ArrayList<Funcionarios> pesquisarPorSalario(Double salario){
            ArrayList<Funcionarios> encontrados=new ArrayList<>();
            for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getSalario()<=salario){
                encontrados.add(this.lista.get(i));
            }
        }
        return encontrados;
    }
            //PESQUISA POR FUNCIONARIOS POR CIDADE  
    public ArrayList<Funcionarios> pesquisarPorCidade(String cidade){
        ArrayList<Funcionarios> encontrado=new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getEndereco().getCidade().equalsIgnoreCase(cidade)){
                encontrado.add(this.lista.get(i));
                }
            }  
        return encontrado;

        }
             //PESQUISA DE FUNCIONARIOS POR NOME
    public ArrayList<Funcionarios> pesquisaPorNome(String nome){
        ArrayList<Funcionarios> encontrados= new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getNome().equalsIgnoreCase(nome)){
                encontrados.add(this.lista.get(i));
            
            }
        }
        return encontrados;
    }
    
    
}
