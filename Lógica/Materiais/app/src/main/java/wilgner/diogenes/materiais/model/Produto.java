package wilgner.diogenes.materiais.model;

import android.app.AlertDialog;
import android.content.Context;

import java.sql.Array;
import java.util.ArrayList;

import wilgner.diogenes.materiais.R;

public class Produto {

    private String nome;
    private int codigo;
    private String reciclavel;
    private ArrayList<String> material;
    private Context context;

    public Produto(Context context) {
    }

    public Produto(String nome, int codigo, String reciclavel, ArrayList<String> material, Context context) {
        this.nome = nome;
        this.codigo = codigo;
        this.reciclavel = reciclavel;
        this.material = material;
        this.context = context;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getReciclavel() {
        return reciclavel;
    }

    public void setReciclavel(String reciclavel) {
        this.reciclavel = reciclavel;
    }

    public ArrayList<String> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<String> material) {
        this.material = material;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String verificarReciclavel(){
        if(reciclavel.equalsIgnoreCase("Sim")){
            return "Este produto é reciclável!";
        }else{
            return "Este produto não é reciclável!";
        }//fecha else
    }//fecha método

    @Override
    public String toString() {
        return   "\n"+ context.getResources().getString(R.string.ma_et_nome)+ nome
                + "\n"+ context.getResources().getString(R.string.ma_et_codigo)+ codigo
                + "\n"+ context.getResources().getString(R.string.ma_tv_reciclavel)+ verificarReciclavel();
    }
}
