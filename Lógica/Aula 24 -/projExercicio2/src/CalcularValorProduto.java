public class CalcularValorProduto {
    //atributos
    private String produto;
    private double valor;
    //encapsulamento

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    //metodos
    
    public double calcularJuros(){
        double resposta=valor*1.30;
        return resposta;
    }
    public double calcularDesconto(){
        double resposta=valor*0.75;
        return resposta;
    }
    //to string

    @Override
    public String toString() {
        return "Produto=" + produto + ", \nValor=" + valor ;
    }
    
}
