package com.example.yasminmoraes.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        Toast.makeText(this, this.getUsuario(), Toast.LENGTH_LONG).show();
    }

    private String getUsuario() {
        Usuario usuario = (Usuario) getIntent().getSerializableExtra("usuario");
        return "Toast: " + usuario.getNome() + ", " + usuario.getSexo() + usuario.getInteresses();
    }
}
