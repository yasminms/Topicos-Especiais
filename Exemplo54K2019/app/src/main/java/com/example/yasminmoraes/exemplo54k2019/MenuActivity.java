package com.example.yasminmoraes.exemplo54k2019;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity {

    private String[] strMenu = {"Cadastrar", "Editar", "Excluir", "Buscar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // não é classe anônima, por isso não perde a referência do this
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strMenu);

        //como não tem um componente, utilizo um método da classe
        super.setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                //  ABRIR TELA DE CADASTRAR
                break;
            case 1:
            //  ABRIR TELA DE EDITAR
            break;
            case 2:
                //  ABRIR TELA DE EXCLUIR
                break;
            case 3:
                //  ABRIR TELA DE BUSCAR
                break;
        }

        Toast.makeText(this, strMenu[position], Toast.LENGTH_LONG).show();

    }
}
