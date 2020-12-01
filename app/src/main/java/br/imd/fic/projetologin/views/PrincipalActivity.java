package br.imd.fic.projetologin.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import br.imd.fic.projetologin.R;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String senha = intent.getStringExtra("senha");

        /*Toast.makeText(this, "Logim realizado com sucesso = " + email,
                Toast.LENGTH_LONG).show();*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_lista1:
                startActivity(new Intent(this, Lista1Activity.class));
                return true;
            case R.id.action_lista2:
                startActivity(new Intent(this, Lista2Activity.class));
                return true;
            case R.id.action_sair:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}