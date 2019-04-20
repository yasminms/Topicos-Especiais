package com.example.yasminmoraes.exemplo84k2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela1Activity extends AppCompatActivity {

    private EditText etNome;
    private EditText etTelefone;
    private Button btAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        this.inicializaComponentes();

        this.btAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = etNome.getText().toString();
                String telefone = etTelefone.getText().toString();

                Intent itTela2 = new Intent(Tela1Activity.this, Tela2Activity.class);

                //Tem duas formas
                // 1) Adicionando direto na intent
                itTela2.putExtra("nome", nome);
                itTela2.putExtra("telefone", telefone);
                // 2) Utilizando a classe bundle
                startActivity(itTela2); // executa a intenção
                finish();
            }
        });
    }

    private void inicializaComponentes() {
        this.etNome = findViewById(R.id.et_nome);
        this.etTelefone = findViewById(R.id.et_telefone);
        this.btAvancar = findViewById(R.id.bt_avancar);
    }
}
