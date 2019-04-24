package com.example.yasminmoraes.exercicio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.io.Serializable;
import java.util.List;

public class Tela2 extends AppCompatActivity {

    private Spinner spProdutos;
    private List<Produto> produtos;
    private boolean flagItemSelecionado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        this.inicializaComponentes();
        produtos = (List<Produto>) getIntent().getSerializableExtra("produtos");

        produtos.add(0, new Produto("Escolha um opção", null, null, ""));

        spProdutos.setAdapter(new ArrayAdapter<Produto>(this, android.R.layout.simple_list_item_1, produtos));

        spProdutos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (flagItemSelecionado) {
                    Intent itTela3 = new Intent(Tela2.this, Tela3.class);
                    itTela3.putExtra("produto", produtos.get(i));
                    startActivity(itTela3);
                }
                flagItemSelecionado = true;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void inicializaComponentes() {
        spProdutos = findViewById(R.id.sp_produtos);
    }
}
