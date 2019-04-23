package com.example.yasminmoraes.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tela1 extends AppCompatActivity {

    private EditText etNome;
    private RadioGroup rgSexo;
    private CheckBox cbMusica;
    private CheckBox cbFilme;
    private Button btCadastrar;
    private Button btEnviar;
    private RadioButton rbSelecionado;
    private List<Usuario> usuariosCadastrados;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        this.inicializaComponentes();

        this.rgSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rbSelecionado = findViewById(i);
            }
        });

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario = new Usuario(etNome.getText().toString(), rbSelecionado.getText().toString(), cbMusica.isChecked(), cbFilme.isChecked());
                usuariosCadastrados.add(usuario);
                Toast.makeText(Tela1.this, usuario.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itTela2 = new Intent(Tela1.this, Tela2.class);
                itTela2.putExtra("usuarios", (Serializable) usuariosCadastrados);
                startActivity(itTela2);
            }
        });

    }

    private void inicializaComponentes() {
        etNome = findViewById(R.id.et_nome);
        rgSexo = findViewById(R.id.rg_sexo);
        cbMusica = findViewById(R.id.cb_musica);
        cbFilme = findViewById(R.id.cb_filme);
        btCadastrar = findViewById(R.id.bt_cadastrar);
        btEnviar = findViewById(R.id.bt_enviar);

        usuariosCadastrados = new ArrayList<Usuario>();
    }
}
