/**
 *
 * @author DIOGENES
 */
public class CalcularRefri {
    //atributos
    private double refri350;
    private double refri600;
    private double refri2000;
    //getter e setter

    public double getRefri350() {
        return refri350;
    }

    public void setRefri350(double refri350) {
        this.refri350 = refri350;
    }

    public double getRefri600() {
        return refri600;
    }

    public void setRefri600(double refri600) {
        this.refri600 = refri600;
    }

    public double getRefri2000() {
        return refri2000;
    }

    public void setRefri2000(double refri2000) {
        this.refri2000 = refri2000;
    }
    
    
    //metodos
    public double calcularLitros(){
        double resposta=(this.refri2000*2000+this.refri350*350+this.refri600*600)/1000;
        return resposta;
    }
    public double calcularTotalVendido(){
        double resposta=this.refri2000*2.8+this.refri600*1.8+this.refri350*1.2;
        return resposta;
    }
    //to string

    @Override
    public String toString() {
        return "Refri350=" + refri350 + ", \nRefri600=" + refri600 + ", \nRefri2000=" + refri2000;
    }

    
}
