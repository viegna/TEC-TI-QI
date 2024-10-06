/**
 *
 * @author DIOGENES
 */
public class Vendedor {
    //atributos
    public double salarioFixo;
    public int totalVendas;
    private double percentualGanho;
    //set e get

    public double getPercentualGanho() {
        return percentualGanho;
    }

    public void setPercentualGanho(double percentualGanho) {
        this.percentualGanho = percentualGanho;
    }
    
    
    //metodos
    public double calcularSalarioTotal(){
        double resposta=this.salarioFixo+this.totalVendas*(this.percentualGanho/100);
        return resposta;
    }

    @Override
    public String toString() {
        return "Salario Fixo=" + salarioFixo + ", \nTotal de Vendas=" + totalVendas + ", \nPercentual Ganho=" + percentualGanho;
    }
    
    
}
