package com.example.yasminmoraes.exercicio4;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tela1 extends ListActivity {

    private String[] strOpcoes = {"Cadastrar", "Editar", "Buscar", "Excluir"};
    private static List<Veiculo> veiculosCadastrados;
    private Veiculo veiculo;
    private Veiculo veiculoEditado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.inicializaComponentes();

        if(getIntent().getSerializableExtra("veiculos") != null) {
            veiculosCadastrados = (List<Veiculo>) getIntent().getSerializableExtra("veiculos");
        }

        if (getIntent().getSerializableExtra("veiculo") != null) {
            veiculosCadastrados.add((Veiculo) getIntent().getSerializableExtra("veiculo"));
        }

        if (getIntent().getSerializableExtra("veiculoEditado") != null) {
            veiculoEditado = (Veiculo) getIntent().getSerializableExtra("veiculoEditado");

            veiculo = veiculosCadastrados.get((int) getIntent().getSerializableExtra("posicao"));


            veiculo.setCor(veiculoEditado.getCor());
            veiculo.setPlaca(veiculoEditado.getPlaca());
            veiculo.setNovo(veiculoEditado.isNovo());
            veiculo.setMarca(veiculo.getMarca());
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, strOpcoes);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                startActivity(new Intent(Tela1.this, Tela2.class));
                break;
            case 1:
                Intent itTela3 = new Intent(Tela1.this, Tela3.class);
                itTela3.putExtra("veiculos", (Serializable) veiculosCadastrados);
                startActivity(itTela3);
                break;
        }
    }

    private void inicializaComponentes() {
        veiculosCadastrados = new ArrayList<>();
    }
}
