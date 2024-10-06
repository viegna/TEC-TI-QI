public class Fornecedor {
    private String nome;
    private String telefone;
    private DataNascimento dataNascimento;
    private Endereco endereco;
    //set e get

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

    public DataNascimento getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DataNascimento dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    
    
    //
    public Fornecedor(){
        this.dataNascimento=new DataNascimento();
        this.endereco=new Endereco();
    }

    @Override
    public String toString() {
        return "Fornecedor: " + nome + "\nTelefone: " + telefone + "\nData de Nascimento: " + dataNascimento + "\nEndereço:" + endereco;
    }
    
    
}
