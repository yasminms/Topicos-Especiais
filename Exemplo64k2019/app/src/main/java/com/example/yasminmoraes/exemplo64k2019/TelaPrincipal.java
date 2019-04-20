package com.example.yasminmoraes.exemplo64k2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TelaPrincipal extends AppCompatActivity {

    private CheckBox cbNotificacao;
    private Button btSalvar;
    private EditText etNome;
    private RadioGroup rgGenero;
    private RadioButton rbSelecionado;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        this.inicializaComponentes();

        this.rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int idSelecionado) {
                rbSelecionado = findViewById()
            }
        });

        this.btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setNome(etNome.getText().toString());
                usuario.setNotificacao(cbNotificacao.isChecked());

                // ENVIAR OBJETO USUARIO PARA O SERVIDOR

                Toast.makeText(TelaPrincipal.this, "status: " + cbNotificacao.isChecked(), Toast.LENGTH_LONG).show();
            }
        });

        this.cbNotificacao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

    }

    private void inicializaComponentes() {
        this.cbNotificacao = findViewById(R.id.cb_notificacao);
        this.btSalvar = findViewById(R.id.bt_salvar);
        this.etNome = findViewById(R.id.et_nome);
        this.rgGenero = findViewById(R.id.rg_genero);
        this.usuario = new Usuario();
    }
}
