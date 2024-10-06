
import java.util.Arrays;

public class Nota {
    // atributos
    private double[] notas;
    
    //metodo cons
    public Nota(){
        this.notas=new double[5];
    }
    
    //set e get

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void cadasrar(int indice, double nota){
        this.notas[indice]=nota;
        
        
    }
    
    //public string
    public String toString(){
        return"Nota:" +Arrays.toString(this.getNotas());
    }
}
