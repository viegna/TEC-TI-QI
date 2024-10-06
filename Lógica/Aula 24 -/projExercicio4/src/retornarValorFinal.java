public class retornarValorFinal {
    //atributos 
    public byte codigo;
    private int quantidade;
    //set get

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    //metodos
    public double calcularValorPagar(){
        double resposta;
        switch(codigo){
            case 1:
                resposta=quantidade*2.3;
                break;
            case 2:
                resposta=quantidade*1.5;
                break;
            case 3:
                resposta=quantidade*1.3;
                break;
            default:
                resposta=quantidade*0.7;
        }
        return resposta;
    }

    @Override
    public String toString() {
        return "Codigo=" + codigo + ", \nQuantidade=" + quantidade;
    }
    
}
