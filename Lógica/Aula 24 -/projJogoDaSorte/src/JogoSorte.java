public class JogoSorte {
    private int numeroSorteado;
    private int numeroUsuario;
    //set e get

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }
    
    //metodos
    public  int sortearNumero(){
        int random = (int)(Math.random() * 11 + 10);
        return random;
    }
    //to string

    @Override
    public String toString() {
        return "Jogo da Sorte! \nNumeroSorteado= " + numeroSorteado + ", \nNumeroUsuario= " + numeroUsuario + '}';
    }
    
    
}
