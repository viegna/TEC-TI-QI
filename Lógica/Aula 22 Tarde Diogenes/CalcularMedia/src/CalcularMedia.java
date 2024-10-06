public class CalcularMedia {
//atributos
public String nome;
public double nota1;
public double nota2;
public double nota3;

//metodos
public double calcularMedia(){
    double resposta=(this.nota1+this.nota2+this.nota3)/3;
    return resposta;
}
public String retornarConceito(){
    String resposta;
    double md= calcularMedia();
    if(md>=0 && md<=4.9){
        resposta="Conceito D";
    }else if(md>=5 && md<=5.9){
        resposta="Conceito C";
    }else if(md>=6 && md<8.9){
        resposta="Conceito B";
    }else{
        resposta="Conceito A";
    }
    return resposta;
}

    @Override
    public String toString() {
        return " Nome=" + nome + 
               ";\n Nota1=" + nota1 + 
               ";\n Nota2=" + nota2 + 
               ";\n Nota3=" + nota3 + 
               '.';
    }

}
