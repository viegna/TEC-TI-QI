
import java.util.ArrayList;

public class Cadastro {
    //Atributos
    private ArrayList<Funcionarios> lista;
    
    
    //metodo construtor
    public Cadastro(){
        this.lista=new ArrayList<>();
    }
    
    //set e get  

    public ArrayList<Funcionarios> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Funcionarios> lista) {
        this.lista = lista;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Lista de Funcionários: " + lista;
    }
    
    
    //metodo para cadastrar
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
    
    
    
}
