public class MediaVendas {
    //atributo
    public String nome;
    public double vendasAbril;
    public double vendasMarco;
    
    //metodo
    public double mediaVendas(){
        double resposta;
        resposta=(this.vendasAbril+this.vendasMarco)/2;
        return resposta;
    }
    
    //bonificar
    public double calcularBonificar(){
        double mdv=mediaVendas();
        double bon;
        if(mdv<=5000){
            bon=mdv*0.02;
        }else if(mdv>5000 && mdv<=10000){
            bon=mdv*0.03;
        }else if(mdv>10000 && mdv<=20000){
            bon=mdv*0.04;
        }else{
            bon=mdv*0.05;
        }
        return bon;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + "\nVendas de Abril=" + vendasAbril + "\nVendas de Março=" + vendasMarco + '.';
    }
    
    
    
}
