package com.example.yasminmoraes.exercicio4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Tela2 extends AppCompatActivity {

    private EditText etPlaca;
    private EditText etCor;
    private Spinner spMarca;
    private RadioGroup rgEstado;
    private RadioButton rbSelecionado;
    private Button btCadastrar;
    private String[] strMarcas = {"Chevrolet", "Fiat", "Ford", "Volkswagen"};
    private Veiculo veiculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        this.inicializaComponentes();

        spMarca.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strMarcas));

        rgEstado.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rbSelecionado = findViewById(i);
            }
        });

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veiculo = new Veiculo(etPlaca.getText().toString(), etCor.getText().toString(), spMarca.getSelectedItem().toString(), getRadioButtonSelected());
                Intent itTela1 = new Intent(Tela2.this, Tela1.class);
                itTela1.putExtra("veiculo", veiculo);
                startActivity(itTela1);
                Toast.makeText(Tela2.this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void inicializaComponentes() {
        etPlaca = findViewById(R.id.et_placa);
        etCor = findViewById(R.id.et_cor);
        spMarca = findViewById(R.id.sp_marca);
        rgEstado = findViewById(R.id.rg_estado);
        btCadastrar = findViewById(R.id.bt_cadastrar);
    }

    private boolean getRadioButtonSelected() {
        if (rbSelecionado.getText().toString().equalsIgnoreCase("Novo")) {
            return true;
        }
        return false;
    }
}
