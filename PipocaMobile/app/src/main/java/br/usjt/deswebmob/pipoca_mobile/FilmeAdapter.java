package br.usjt.deswebmob.pipoca_mobile;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class FilmeAdapter extends ArrayAdapter<Filme> {

    public FilmeAdapter(Context context, List<Filme> filme){
        super(context, -1, filme);
    }

    private static class ViewHolder{
        ImageView imageView;
        TextView nome;
        TextView diretor;
        TextView dtLancamento;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Filme filme = getItem(position);
        View raiz = null;
        ViewHolder viewHolder = null;
        Context context = getContext();
        if(convertView ==null){
            LayoutInflater inflater = LayoutInflater.from(context);
            raiz = inflater.inflate(R.layout.lista_personalizada, parent, false);
            viewHolder = new ViewHolder();
            raiz.setTag(viewHolder);
            viewHolder.imageView = raiz.findViewById(R.id.imagem);
            viewHolder.nome = raiz.findViewById(R.id.nome);
            viewHolder.diretor = raiz.findViewById(R.id.diretor);
            viewHolder.dtLancamento = raiz.findViewById(R.id.dtLancamento);

        }
        else{
            raiz = convertView;
            viewHolder = (ViewHolder) raiz.getTag();

        }
        viewHolder.nome.setText(filme.getNome());
        viewHolder.diretor.setText(filme.getDiretor());
        viewHolder.dtLancamento.setText(filme.getDtLancamento());
        return  raiz;
    }
}
