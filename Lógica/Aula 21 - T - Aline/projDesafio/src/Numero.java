public class Numero {
    //Atributos:
    public int numero;
    
    //Métodos:
    public String verParImpar(){
        if(this.numero%2==0){
            return "Par";
        }else{
            return "Impar";
        }      
    }
    //Método positivo, negativo ou nulo:
    
    public String verPositivo(){
        String resposta;
        if(this.numero>0){
            resposta = "positivo";
        }else if(this.numero<0){
            resposta = "negativo";            
        }else{
            resposta = "nulo";
        }
        return resposta;
    }
    //Calcular Fatorial:
    public int calcularFatorial(){
        int cont;
        int acum;
        acum = 1;
        for(cont=1; cont<=this.numero; cont++){
            acum = acum * cont;
        }
        return acum;
    }
    //Calcular Somatório:
    public int calcularSomatorio(){
        int acum = 0;
        for(int cont=1; cont<=this.numero; cont++){
            acum = acum + cont;
        }
        return acum;
    }
    
    //Calcular Contar Pares:
    public int contarPares(){
        int contPar=0;
        for(int cont=1; cont<=this.numero; cont++){
            if(cont%2==0){
                contPar++;                
            }           
        }
        return contPar;
    }
    //Contar impar:
    public int contarImpar(){
        int contImpar=0;
        for(int cont=1; cont<=this.numero; cont++){
            if(cont%2!=0){
                contImpar++;
            }            
        }
        return contImpar;
    }
}//Fim classe
