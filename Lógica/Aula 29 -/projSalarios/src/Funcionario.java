
import java.util.Arrays;

/**
 *
 * @author Lab-xx-xx
 */
public class Funcionario {
    //atributos
    private double[] salarios;
    
    //set e get

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    
    
    //metodo const
    public Funcionario(){
        this.salarios=new double[117];
    }
    
    
    
    //to String
    @Override
     public String toString(){
         return "Salários: "+Arrays.toString(this.salarios);
     }
    
     //Cadastrar
    public void cadastrar(int i, double salario){
        this.salarios[i]=salario;
    }
    
    //calcular media
    public double calcularMedia(){
        double acum= 0 ;
        for(int i=0; i<this.salarios.length; i++){
            acum=acum+this.salarios[i];
        }
        return acum/this.salarios.length ;
    }
}
