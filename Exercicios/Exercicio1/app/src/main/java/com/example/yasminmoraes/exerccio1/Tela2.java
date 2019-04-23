package com.example.yasminmoraes.exerccio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class Tela2 extends AppCompatActivity {

    private EditText etPlaca;
    private EditText etCor;
    private Spinner spMarca;
    private CheckBox cbNovo;
    private Button btEnviar;
    private String[] strMarcas = {"Fiat", "Audi", "BMW", "Ferrari"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        this.inicializaComponentes();

        spMarca.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strMarcas));

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itTela3 = new Intent(Tela2.this, Tela3.class);
                itTela3.putExtra("veiculo", new Veiculo(etPlaca.getText().toString(), etCor.getText().toString(), cbNovo.isChecked(), spMarca.getSelectedItem().toString()));
                startActivity(itTela3);
            }
        });
    }

    public void inicializaComponentes() {
        etPlaca = findViewById(R.id.et_placa);
        etCor = findViewById(R.id.et_cor);
        spMarca = findViewById(R.id.sp_marca);
        cbNovo = findViewById(R.id.cb_novo);
        btEnviar = findViewById(R.id.bt_enviar);
    }
}
