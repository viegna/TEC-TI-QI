package wilgner.diogenes.materiais;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import wilgner.diogenes.materiais.model.Produto;

public class MainActivity extends AppCompatActivity {

    //WIDGETS
    private EditText etNome;
    private EditText etCodigo;
    private RadioGroup rgReciclavel;
    private RadioButton rdSim;
    private RadioButton rdNao;
    private CheckBox chPlastico;
    private CheckBox chMetal;
    private CheckBox chPapel;
    private CheckBox chOrganico;
    private Button btOK;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // REFS
        //edit view
        etNome = findViewById(R.id.ma_et_nome);
        etCodigo = findViewById(R.id.ma_et_codigo);
        //radio button
        rdSim = findViewById(R.id.ma_rd_sim);
        rdNao = findViewById(R.id.ma_rd_nao);
        //radiogroup
        rgReciclavel=findViewById(R.id.ma_rg_reciclavel);
        //checkbox
        chPlastico = findViewById(R.id.ma_ch_plastico);
        chMetal = findViewById(R.id.ma_ch_metal);
        chPapel = findViewById(R.id.ma_ch_papel);
        chOrganico = findViewById(R.id.ma_ch_organico);
        //button
        btOK = findViewById(R.id.ma_bt_ok);

        Produto p = new Produto(MainActivity.this);

        p.setNome(etNome.getText().toString());

        //Radio Button
        if(rgReciclavel.getCheckedRadioButtonId() == rdSim.getId()){
            p.setReciclavel(rdSim.getText().toString());
        }else if(rgReciclavel.getCheckedRadioButtonId() == rdNao.getId()){
            p.setReciclavel(rdNao.getText().toString());
        }//fecha else

        //CheckBox
        ArrayList<String> material = new ArrayList<>();

        if(chPlastico.isChecked()){
            material.add(chPlastico.getText().toString());
        }else{ material.add("-"); }

        if(chMetal.isChecked()){
            material.add(chMetal.getText().toString());
        }else{ material.add("-"); }

        if(chPapel.isChecked()){
            material.add(chPapel.getText().toString());
        }else{ material.add("-"); }

        if(chOrganico.isChecked()){
            material.add(chOrganico.getText().toString());
        }else{ material.add("-"); }

        p.setMaterial(material); //Inserindo arraylist prefs no objeto p
        Limpar();
        Toast.makeText(
                getBaseContext(),
                "Relatório: "+p.toString()
                        +"Verificar sexo: "+p.verificarReciclavel(),
                Toast.LENGTH_LONG).show();

    }//fecha on create



    private void Limpar() {
        etNome.setText(null);
        rgReciclavel.clearCheck();
        chPlastico.setChecked(false);
        chPapel.setChecked(false);
        chMetal.setChecked(false);
        chOrganico.setChecked(false);

    }
    }

