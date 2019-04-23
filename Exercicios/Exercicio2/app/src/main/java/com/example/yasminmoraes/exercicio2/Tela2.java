package com.example.yasminmoraes.exercicio2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Tela2 extends ListActivity {

    private List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        usuarios = (List<Usuario>) getIntent().getSerializableExtra("usuarios");
        ArrayAdapter<Usuario> adapter = new ArrayAdapter<Usuario>(this, android.R.layout.simple_list_item_1, usuarios);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent itTela3 = new Intent(Tela2.this, Tela3.class);
        itTela3.putExtra("usuario", usuarios.get(position));
        startActivity(itTela3);
    }
}
