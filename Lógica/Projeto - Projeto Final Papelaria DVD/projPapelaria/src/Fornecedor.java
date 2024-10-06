/**
 * @author(Douglas Gomes)
 */
public class Fornecedor{
    //Atributos:
    private String nome;
    private String telefone;
    private Endereco endereco;
    
    //Instanciando o endereço:
    public Fornecedor(){
        this.endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "\n     | Nome: "+nome+
                "\n     | Telefone: "+telefone+
                "\n     | Endereço: "+endereco;
                
        
    }
    
    
}
