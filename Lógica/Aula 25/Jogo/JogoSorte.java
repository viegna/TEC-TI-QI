public class JogoSorte {
    private byte numeroUsuario;
    private byte numeroSorteado;
    //set e get
    public byte getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(byte numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }
    
    public byte getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(byte numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }
    //metodos
    public  void sortearNumero(){
        this.numeroSorteado = (byte)(Math.random()*5+1);        
    }
    //to string

    @Override
    public String toString() {
        return "Jogo da Sorte! \nNumero Sorteado: " + this.numeroSorteado + " \nNumero do Usuario: " + this.numeroUsuario ;
        
    }
    
    public boolean verificarSeVenceu(){
        if(this.numeroUsuario==this.numeroSorteado){
            return  true;
        }else{
            return false;
        }
    }
            
    
    
}