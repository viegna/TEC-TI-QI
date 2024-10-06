
/**
 * Write a description of class Main here.
 * --
 * @author (Diógenes) 
 * @version (projPapelaria)
 */
public class Data{
    // Atributos de Data
    private byte dia;
    private byte mes;
    private int ano;
    
    //Set e Get  CrUd - GET = VISUALIZAR-------------SET = ATUALIZAR 
    
    public byte getDia() {           //Visualiza o dia na classe Data;
        return dia;
    }

    public void setDia(byte dia) {  //Atualiza o dia na classe Data;
        this.dia = dia;
    }

    public byte getMes() {          //Visualiza o mês na classe Data;
        return mes;
    }

    public void setMes(byte mes) {  //Atualiza o mês na classe Data;
        this.mes = mes;
    }

    public int getAno() {          //Visualiza o ano na classe Data;
        return ano;
    }

    public void setAno(int ano) {  //Atualiza o ano na classe Data;
        this.ano = ano;
    }
     
    
    
    // Métodos da Data;
    public boolean verificarData(){
        boolean erro;
        erro= dia<1 || dia>31 || mes<1 || mes>12 || ano<0 ||(dia==31 && (mes==4 || mes==6 || mes==9 || mes==11))|| (dia>=29 && mes==2  && ano%4!=0);

        if(erro){
            return true;
        }else{
            return false;        /* 
         * O programa marcará o dado inserido como erro, se:
         * O dia for menor que 1, ou maior que 31, ou tiver meses menores que um ou maiores que 12;
         * O mês 4, 6, 9, ou 11 tiver 31 dias;
         * O mês 2, com 29 dias, não for bissexto.
         * Se não, o programa não marcará o dado inserido como erro.
        */
        }
    }
    
        //toString, cRud - read = ver, visualizar  
    @Override
    public String toString() {
        return dia+"/"+mes+"/"+ano;
        //fim do o string
    }
    
   
}
    
    
    
   

    
    

