
import java.util.ArrayList; // importa a função ArrayList ao programa, podendo criar listas
/**
 *
 * @author Lab-xx-xx
 */
public class Cadastro {
    //ArrayList
    private ArrayList<Material> lista; // Cria uma lista privada
    
    //metodo construtor Funciona um comando já no inicio da classe
    public Cadastro(){
        this.lista =new ArrayList<>();
    }
    public void setLista(ArrayList<Material> lista) {
    this.lista = lista;
    }

    public ArrayList<Material> getLista() {
        return lista;
    }
    
    
    //toString cRud LER VISUALIZAR, método para mostrar o conteúdo de cada variavel

    @Override
    public String toString() {
        return  "   Lista de Materiais: \n*--------------------------*" + lista;
    }
    
    
    //metodos para cadastrar 
    public void cadastrar(Material m1){
        this.lista.add(m1);
    }
    
    //metodo para remover
    public void removerCadastro(Material m1){
        this.lista.remove(m1);
    }
    
    //ver quantidade de materiais
    
    
}
