package br.imd.fic.projetologin.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.imd.fic.projetologin.R;
import br.imd.fic.projetologin.adapter.CidadeAdapter;
import br.imd.fic.projetologin.domain.Cidade;

public class Lista2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista2);

        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Cidade> cidadesList = new ArrayList<>();

        cidadesList.add(new Cidade(1, "Fortaleza"));
        cidadesList.add(new Cidade(2, "Natal"));
        cidadesList.add(new Cidade(3, "São Paulo"));
        cidadesList.add(new Cidade(4, "Rio de Janeiro"));
        cidadesList.add(new Cidade(5, "Bahia"));

        CidadeAdapter cidadeAdapter = new CidadeAdapter(this, cidadesList);

        DividerItemDecoration dic = new
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(dic);
        recyclerView.setAdapter(cidadeAdapter);
    }
}