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

import java.io.Serializable;
import java.util.List;

public class Tela4 extends AppCompatActivity {

    private EditText etPlaca;
    private EditText etCor;
    private Spinner spMarca;
    private RadioGroup rgEstado;
    private RadioButton rbSelecionado;
    private Button btEditar;
    private String[] strMarcas = {"Chevrolet", "Fiat", "Ford", "Volkswagen"};
    private Veiculo veiculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        this.inicializaComponentes();

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strMarcas);

        spMarca.setAdapter(adapter);

        veiculo = (Veiculo) getIntent().getSerializableExtra("veiculo");

        this.setComponentsValue(adapter);

        rgEstado.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rbSelecionado = findViewById(i);
            }
        });

        btEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veiculo = new Veiculo(etPlaca.getText().toString(), etCor.getText().toString(), spMarca.getSelectedItem().toString(), getRadioButtonSelected());
                Intent itTela1 = new Intent(Tela4.this, Tela1.class);
                itTela1.putExtra("veiculoEditado", veiculo);
                itTela1.putExtra("posicao", (int) getIntent().getExtras().get("posicao"));
                List<Veiculo> veiculos = (List<Veiculo>) getIntent().getSerializableExtra("veiculos");
                itTela1.putExtra("veiculos", (Serializable) veiculos);
                startActivity(itTela1);
                Toast.makeText(Tela4.this, "Editado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void inicializaComponentes() {
        etPlaca = findViewById(R.id.et_placa);
        etCor = findViewById(R.id.et_cor);
        spMarca = findViewById(R.id.sp_marca);
        rgEstado = findViewById(R.id.rg_estado);
        btEditar = findViewById(R.id.bt_editar);
    }

    private boolean getRadioButtonSelected() {
        if (rbSelecionado.getText().toString().equalsIgnoreCase("Novo")) {
            return true;
        }
        return false;
    }

    private void setComponentsValue(ArrayAdapter adapter) {
        etPlaca.setText(veiculo.getPlaca());
        etCor.setText(veiculo.getCor());
        spMarca.setSelection(adapter.getPosition(veiculo.getMarca()));
        rgEstado.check(getRadioButtonSelectedId());
        rbSelecionado = findViewById(getRadioButtonSelectedId());
    }

    private int getRadioButtonSelectedId() {
        if (veiculo.isNovo()) {
            return R.id.rb_novo;
        }
        return R.id.rb_semi_novo;
    }

}
