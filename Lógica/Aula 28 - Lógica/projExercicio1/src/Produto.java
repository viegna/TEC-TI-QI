public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;
    private double valor;
    private Fornecedor fornecedor;
    
    //metodo construtor
    public Produto(){
        this.fornecedor=new Fornecedor();
    }
    
    //set e get
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    
    //toString
    

    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nNome: " + nome + "\nQuantidade: " + quantidade + "\nValor: " + valor + "\n" + fornecedor ;
    }
    
}
