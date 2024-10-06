/**
 *
 * @author Vitoria Malta;
 */
public class Material {
    //atrubutos;
    private int codigo;
    private  String descricao;
    private int quantidade;
    private double valor;
    private String marca;
    private Fornecedor fornecedor;    
    private Data dataLote;
    
    //Instanciar: instanciar o fornecedor.
    public Material(){
        this.fornecedor = new Fornecedor();
        this.dataLote = new Data();
        
    }
    //Sets e Gets, vem antes dos métodos.

    public Data getDataLote() {
        return dataLote;
    }

    public void setDataLote(Data dataLote) {
        this.dataLote = dataLote;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    // toString  cRud VISUALIZAR. ler os materiais

    @Override
    public String toString() {
        return  "\n     *---------------------------*"+
                "\n     | Codigo: " + codigo +                
                "\n     | Descricao: " + descricao + 
                "\n     | Quantidade: " + quantidade + 
                "\n     | Valor: " + valor + 
                "\n     | Marca: " + marca + 
                "\n     | Fornecedor: " + fornecedor ;
                 
    }
    
    
}
