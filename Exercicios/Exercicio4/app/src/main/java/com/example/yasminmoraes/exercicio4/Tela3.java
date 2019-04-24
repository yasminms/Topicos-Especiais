package com.example.yasminmoraes.exercicio4;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tela3 extends ListActivity {

    private List<Veiculo> veiculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        veiculos = (List<Veiculo>) getIntent().getSerializableExtra("veiculos");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, veiculos);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent itTela4 = new Intent(Tela3.this, Tela4.class);
        itTela4.putExtra("posicao", position);
        itTela4.putExtra("veiculo", veiculos.get(position));
        itTela4.putExtra("veiculos", (Serializable) veiculos);
        startActivity(itTela4);
    }
}
