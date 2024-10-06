public class JogoSorte {
    private int numeroUsuario;
    //set e get
    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }
    
    //metodos
    public  int sortearNumero(){
        byte sorteio = (byte)(Math.random()*5+1
                );
        return sorteio;
    }
    //to string

    @Override
    public String toString() {
        return "Jogo da Sorte! \nNumero Sorteado= " + sortearNumero() + ", \nNumero do Usuario= " + numeroUsuario + '}';
    }
    
    
}
