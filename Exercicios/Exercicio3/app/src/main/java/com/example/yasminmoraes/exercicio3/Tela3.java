package com.example.yasminmoraes.exercicio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela3 extends AppCompatActivity {

    private EditText etProduto;
    private EditText etPeso;
    private EditText etEstadoFisico;
    private EditText etUnidadeMedida;
    private Button btVoltar;
    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        this.inicializaComponentes();
        this.atribuiValorComponentes();

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tela3.this, Tela2.class));
            }
        });
    }

    private void inicializaComponentes() {
        etProduto = findViewById(R.id.et_produto);
        etPeso = findViewById(R.id.et_peso);
        etEstadoFisico = findViewById(R.id.et_estado_fisico);
        etUnidadeMedida = findViewById(R.id.et_unidade_medida);
        btVoltar = findViewById(R.id.bt_voltar);
    }

    private void atribuiValorComponentes() {
        produto = (Produto) getIntent().getSerializableExtra("produto");
        etProduto.setText(produto.getNome());
        etPeso.setText(produto.getPeso().toString());
        etEstadoFisico.setText(produto.getEstadoFisico());
        etUnidadeMedida.setText(produto.getUnidadeMedida());

    }
}
