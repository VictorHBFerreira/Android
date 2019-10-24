package br.com.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContatosAdapter extends BaseAdapter {

    Context context;
    List<Contato> contatos;

    public ContatosAdapter(Context context, List<Contato> contatos){
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount(){
        return this.contatos.size();
    }

    @Override
    public Object getItem(int i){
        return (Object)this.contatos.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        Contato contatos = this.contatos.get(i);

        View v = layoutInflater.inflate(R.layout.listview_contatos,null);
        TextView txtNomeContato = (TextView) v.findViewById(R.id.txtNomeContato);
        TextView txtTelefoneContato = (TextView) v.findViewById(R.id.txtTelefoneContato);

        txtNomeContato.setText(contatos.getNome());
        txtTelefoneContato.setText(contatos.getTelefome());

        return v;

    }

}
