package com.example.yasminmoraes.exemplo34k2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class TelaPrincipalActivity extends AppCompatActivity {

    private AutoCompleteTextView actEstado;
    private Button btSalvar;
    private Spinner spEstado;
    private String[] strEstados = {"Rio de Janeiro", "Rio Grande do Sul", "Rio Grande do Norte", "Pará", "Paraná", "Paraíba"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        actEstado = findViewById(R.id.act_estado);
        btSalvar = findViewById(R.id.bt_salvar);
        spEstado = findViewById(R.id.sp_estado);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strEstados);

        actEstado.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strEstados);

        spEstado.setAdapter(adapter2);

        this.btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TelaPrincipalActivity.this, actEstado.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
