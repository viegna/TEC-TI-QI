public class CalcularFolha {
    //atributos
    public String nome;
    public String cpf;
    public String cargo;
    public double valorHora;
    public double quantidadeHora;
    public double valorTotalPassagem;
    public int quantidadeDependentes;
    public byte tipoInsalubridade;
    
    //metodos
    
    //salario bruto
    public double salarioBruto(){
        double resposta;
        resposta=this.quantidadeHora*this.valorHora;
        return resposta;
    }
    
    //vale transporte
    public double calcularValeTransporte(){
        double resposta;
        if((salarioBruto()*0.06)>valorTotalPassagem){
            resposta=this.valorTotalPassagem;
        }else{
            resposta=salarioBruto()*0.06;
        }
        return resposta;
    }
        
        //salario familia
        public double calcularSalarioFamilia(){
            double resposta;
            if(salarioBruto()<=725.02){
                resposta=this.quantidadeDependentes*37.18;
            }else if(salarioBruto()>=725.03 && salarioBruto()<=1089.72){
                resposta=this.quantidadeDependentes*26.2;
            }else{
                resposta=0;
            }
            return resposta;
        }
        
        //insalubridade
        public double calcularInsalubridade(){
            double resposta;
            switch(this.tipoInsalubridade){
                case 1:
                    resposta=0;
                break;
                case 2:
                    resposta=868*0.1;
                    break;
                case 3:
                    resposta=868*0.2;
                    break;
                case 4:
                    resposta=868*0.14;
                    break;
                default:
                    resposta=0;
            }
                return resposta;
            }
            
        //inss
        public double calcularINSS(){
            double resposta;
            if(salarioBruto()<=1317.07){
                resposta=salarioBruto()*0.08;
            }else if(salarioBruto()>=1317.08 && salarioBruto()<=2195.12){
                resposta=salarioBruto()*0.09;
            }else if(salarioBruto()>=2195.13 && salarioBruto()<=4390.24){
                resposta=salarioBruto()*0.11;
            }else{
                resposta=0;
            }
            return resposta;
        }
            
        //salarioliquido
        public double calcularSalarioLiquido(){
            double resposta=salarioBruto()-calcularINSS()-calcularValeTransporte()+calcularInsalubridade()+calcularSalarioFamilia();
        return resposta;
        
        }

    @Override
    public String toString() {
        return "\nNome=" + nome + "\nCPF=" + cpf + "\nCargo=" + cargo + "\nValor/Hora=" + valorHora + "\nQuantidade/Hora=" + quantidadeHora + "\nValor Total de Passagem=" + valorTotalPassagem + "\nQuantidade de Dependentes=" + quantidadeDependentes + "\nTipo de Insalubridade=" + tipoInsalubridade + '.';
    }

}
        
    
    
    

