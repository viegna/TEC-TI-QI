import java.util.ArrayList; // importa a função ArrayList: criar listas
/**
 *
 * @author  Vitoria Malta
 */
public class Cadastro {
    //ArrayList
    private ArrayList<Material> lista; //cria uma lista privada
    
    //metodo construtor 
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
        return ""+ lista;
    }
    //instanciar:
    
    
    //metodos para cadastrar 
    public void cadastrar(Material m1){
        this.lista.add(m1);
    }
    
    //metodo para remover
    public void removerCadastro(Material m1){
        this.lista.remove(m1);
    }
    
    //ver quantidade de materiais
     public int verQuantidadeCadastros(){
        return this.lista.size(); 
    }
     //Método busca Específica; pesquisar por código:
    public Material pesquisarPorCodigo(int codigo){
        Material materialEncontrado = null;//Criamos um objeto produto para guardar o produto encontrado
        for(int i=0; i<this.lista.size() && materialEncontrado==null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                materialEncontrado = this.lista.get(i);
            }//fim 
        }//termina o for
        return materialEncontrado;
    }//fim método
     //Método para pesquisar materiais de um fornecedor
    //busca Abrangente: retorna um ou nenhum.
    public ArrayList<Material> pesquisarPorFornecedor(String nome){
        ArrayList<Material> listaMaterial = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getFornecedor().getNome().equalsIgnoreCase(nome)){
                listaMaterial.add(this.lista.get(i));                
            }//termina o if
        }//termina o for
        return listaMaterial;
    }//fim métodoterial até 50 unidades
    //
    public Fornecedor pesquisarTelefone(String telefone){
        Fornecedor listaTelefone= null;
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getFornecedor().getTelefone().equals(telefone)){
                listaTelefone=this.lista.get(i);
            }
        }
        return listaTelefone;
        
    }
    //
    public ArrayList<Material> pesquisarMaterialAte50(){
        ArrayList<Material> listaMaterial50 = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getQuantidade()<=50){
                listaMaterial50.add(this.lista.get(i));
            } //fim if           
        }//fim for
        return listaMaterial50;
    }
    // Busca especifica: Método para pesquisar material pelo nome do mesmo:
    public ArrayList<Material> pesquisarPorNome(String nome){
        ArrayList<Material> materialEncontrado = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getDescricao().equalsIgnoreCase(nome)){
                materialEncontrado.add(this.lista.get(i));
            }
        }
        return materialEncontrado;        
    } 
    //Pesquisar um produto por valor:
    public ArrayList<Material> pesquisarPorValor(double valor){
        ArrayList<Material> encontrados = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getValor()<=valor){
                encontrados.add(this.lista.get(i));
            }
            
        }
        return encontrados;   
    }  
    public ArrayList<Material> pesquisarPorMarca(String marca){
        ArrayList<Material> materialEncontrado = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getMarca().equalsIgnoreCase(marca)){
                materialEncontrado.add(this.lista.get(i));
            }
        }
        return materialEncontrado;        
    
    }
    
}   


