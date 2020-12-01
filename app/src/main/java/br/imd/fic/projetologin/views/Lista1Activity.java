package br.imd.fic.projetologin.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.imd.fic.projetologin.R;

public class Lista1Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista1);

        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<String> listCidades = new ArrayList<>();

        listCidades.add("Fortaleza");
        listCidades.add("Natal");
        listCidades.add("São Paulo");
        listCidades.add("Rio de Janeiro");
        listCidades.add("Bahia");

        ListView listView = findViewById(R.id.listview);

        ArrayAdapter<String> listAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listCidades);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        String cidade = (String) adapterView.getItemAtPosition(position);

        Toast.makeText(this, cidade, Toast.LENGTH_LONG).show();
    }
}