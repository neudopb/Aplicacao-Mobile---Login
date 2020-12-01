package br.imd.fic.projetologin.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.imd.fic.projetologin.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText editNomeC;
    private EditText editEmailC;
    private EditText editSenhaC;

    private Button btnCadastro;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        preferences = getSharedPreferences("login", MODE_PRIVATE);

        editNomeC = findViewById(R.id.editNomeC);
        editEmailC = findViewById(R.id.editEmailC);
        editSenhaC = findViewById(R.id.editSenhaC);

        btnCadastro = findViewById(R.id.btnCadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = editNomeC.getText().toString();
                String email = editEmailC.getText().toString();
                String senha = editSenhaC.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString("nome", nome);
                editor.putString("email", email);
                editor.putString("senha", senha);

                //editor.commit();
                editor.apply();

                Intent intent = new Intent();
                intent.putExtra("email", email);
                intent.putExtra("senha", senha);

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}