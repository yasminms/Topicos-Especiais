package com.example.alunoinfo.exemplo14k2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela1 extends AppCompatActivity {

    private TextView tvTexto;
    private EditText etNome;
    private Button btCliqueAqui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        this.tvTexto = findViewById(R.id.tv_texto);
    }
}
