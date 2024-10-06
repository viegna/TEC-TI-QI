package wilgner.diogenes.pokemon.model;

import android.widget.Button;

public class Player {

private String etNome;
private String etSenha;

    public Player() {

    }


    public Player(String etNome, String etSenha) {
        this.etNome = etNome;
        this.etSenha = etSenha;
    }


    public String getEtNome() {
        return etNome;
    }

    public void setEtNome(String etNome) {
        this.etNome = etNome;
    }

    public String getEtSenha() {
        return etSenha;
    }

    public void setEtSenha(String etSenha) {
        this.etSenha = etSenha;
    }

    @Override
    public String toString() {
        return  "\nNome: " + etNome +
                "\nSenha: " + etSenha
                ;
    }
}
