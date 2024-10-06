public class Aluno {
    public double nota1;
    public double nota2;
    
    // metodos
        //calculo da media
    public double calcularMedia(){
        return(this.nota1+nota2)/2;
        
    }
    
        //retorno de resultados
    public String retornarResultado(){
        if(calcularMedia()<6){
            return "reprovado";
        }else{
            return "aprovado";
        }
    }
}
