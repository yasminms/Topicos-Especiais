package com.example.yasminmoraes.exercicio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tela1 extends AppCompatActivity {

    private EditText etProduto;
    private EditText etPeso;
    private AutoCompleteTextView actEstadoFisico;
    private RadioGroup rgUnidadeMedida;
    private RadioButton rbSelecionado;
    private Button btCadastrar;
    private Button btListar;
    private String[] strEstadosFisicos = {"Líquido", "Sólido", "Gasoso"};
    private List<Produto> produtosCadastrados;
    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        this.inicializaComponentes();

        rgUnidadeMedida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rbSelecionado = findViewById(i);
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strEstadosFisicos);
        actEstadoFisico.setAdapter(adapter);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                produtosCadastrados.add(new Produto(etProduto.getText().toString(), Double.parseDouble(etPeso.getText().toString()), rbSelecionado.getText().toString(), actEstadoFisico.getText().toString()));
                Toast.makeText(Tela1.this, "Cadastrado com sucesso!", Toast.LENGTH_LONG).show();
            }
        });

        btListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itTela2 = new Intent(Tela1.this, Tela2.class);
                itTela2.putExtra("produtos", (Serializable) produtosCadastrados);
                startActivity(itTela2);
            }
        });

    }

    private void inicializaComponentes() {
        etProduto = findViewById(R.id.et_produto);
        etPeso = findViewById(R.id.et_peso);
        actEstadoFisico = findViewById(R.id.act_estado_fisico);
        rgUnidadeMedida = findViewById(R.id.rg_unidade_medida);
        btCadastrar = findViewById(R.id.bt_cadastrar);
        btListar = findViewById(R.id.bt_listar);

        produtosCadastrados = new ArrayList<>();
    }
}
