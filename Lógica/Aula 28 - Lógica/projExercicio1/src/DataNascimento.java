public class DataNascimento {
    private String dia;
    private String mes;
    private String ano;

   
    
    //set e get

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    //metodos
    
    
    
    
    
    //to string
    

    @Override
    public String toString() {
        return ""+dia + "/" + mes + "/" + ano ;
    }
    
}
