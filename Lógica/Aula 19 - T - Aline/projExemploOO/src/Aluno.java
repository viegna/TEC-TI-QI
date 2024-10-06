public class Aluno{
    //Atributos:
    public String nome;
    public double nota1;
    public double nota2;
    
    //Métodos:
    public double calcularMedia(){
        return (this.nota1 + this.nota2)/2;
    }
    public String retornarResultado(){
        if(calcularMedia()>=6){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }    
}
