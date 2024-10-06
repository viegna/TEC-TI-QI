public class ConverterReais {
    //atributos
    private double valorDolar;
    //
    
    public double getValorDolar() {
        return valorDolar;
    }

       
    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }
    //metodo
    public double converterReais(double cotacao){
       return this.valorDolar * cotacao;
        
    }

    //
    @Override
    public String toString() {
        return "Valor do Dolar=" + valorDolar;
    }
    

    
    
}
