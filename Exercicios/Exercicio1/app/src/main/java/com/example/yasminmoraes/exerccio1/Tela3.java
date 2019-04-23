package com.example.yasminmoraes.exerccio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        Toast.makeText(this, getIntent().getSerializableExtra("veiculo").toString(), Toast.LENGTH_LONG).show();
    }
}
