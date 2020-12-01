package br.imd.fic.projetologin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.imd.fic.projetologin.domain.Cidade;

public class CidadeAdapter extends RecyclerView.Adapter<CidadeAdapter.CidadeHolder> {

    private List<Cidade> cidades;
    private Context context;

    public CidadeAdapter(Context context, List<Cidade> cidades) {
        this.cidades = cidades;
        this.context = context;
    }

    @NonNull
    @Override
    public CidadeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(android.R.layout.simple_list_item_2, parent, false);

        CidadeHolder cidadeHolder = new CidadeHolder(view);

        return cidadeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CidadeHolder holder, int position) {

        Cidade cidade = cidades.get(position);

        holder.txtId.setText(String.valueOf(cidade.getId()));
        holder.txtNome.setText(cidade.getNome());
    }

    @Override
    public int getItemCount() {
        return cidades.size();
    }

    public class CidadeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView txtId;
        public TextView txtNome;

        public CidadeHolder(View view) {
            super(view);
            txtId = view.findViewById(android.R.id.text1);
            txtNome = view.findViewById(android.R.id.text2);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getLayoutPosition();
            cidades.remove(pos);

            Toast.makeText(context, "Item removido com sucesso!", Toast.LENGTH_LONG).show();

            notifyItemRemoved(pos);
        }
    }
}
