package wilgner.diogenes.pokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import wilgner.diogenes.pokemon.model.Player;

public class MainActivity extends AppCompatActivity {
    //widgets
    private EditText etNome;
    private EditText etSenha;
    private Button btCadastrar;
    private Button btLimpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //refs

        etNome=findViewById(R.id.ma_et_nome);
        etSenha=findViewById(R.id.ma_et_senha);
        btCadastrar=findViewById(R.id.ma_bt_cadastrar);
        btLimpar=findViewById(R.id.ma_bt_limpar);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Player p = new Player();
                p.setEtNome(etNome.getText().toString());
                p.setEtSenha(etSenha.getText().toString());
                limpar();
                Toast.makeText(
                        getBaseContext(),
                        "Relatório: "+p.toString(),
                        Toast.LENGTH_LONG).show();

        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpar();
            }
        });
            }
        });


    }
    private void limpar(){
        etSenha.setText(null);
        etNome.setText(null);
            }
}
