package com.example.yasminmoraes.exemplo44k2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipalActivity extends AppCompatActivity {

    private Button btIrTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        this.btIrTela2 = findViewById(R.id.bt_tela2);
        this.btIrTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itTelaSecundaria = new Intent(TelaPrincipalActivity.this, TelaSecundariaActivity.class);
                startActivity(itTelaSecundaria);
            }
        });
    }
}
