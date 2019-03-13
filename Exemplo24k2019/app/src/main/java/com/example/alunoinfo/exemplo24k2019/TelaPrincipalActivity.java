package com.example.alunoinfo.exemplo24k2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaPrincipalActivity extends AppCompatActivity {

    private EditText etNome;
    private Button btCliqueAqui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //chamando o método onCreate da classe AppCompatActivity
        super.onCreate(savedInstanceState);
        //setando qual layout deve ser manipulado
        setContentView(R.layout.activity_tela_principal);

        //inicializando os componentes e vinculando com o layout
        this.etNome = findViewById(R.id.et_nome);
        this.btCliqueAqui = findViewById(R.id.bt_clique_aqui);

        //adicionando evento de clique no botão
        this.btCliqueAqui.setOnClickListener(new View.OnClickListener() {
            //classe anônima
            @Override
            public void onClick(View view) {
                //chamando o toast para exibir o texto do editText
                Toast.makeText(TelaPrincipalActivity.this, etNome.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}
