public class ContaBancaria {
    //Atributos:
    public double saldo;
    
    //Métodos:
    //toString:
    //Método com retorno e sem argumento:
    @Override
    public String toString() {
        return "Saldo: R$ " + saldo;
    }
    
    //Depositar: Método sem retorno e com argumento;
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        //OU this.saldo += valor;
    }
    
    //Sacar: Método sem retorno e com argumento;
    public void sacar(double valor){
        this.saldo = this.saldo - valor;
        //OU this.saldo -= valor;
    }
    
}
