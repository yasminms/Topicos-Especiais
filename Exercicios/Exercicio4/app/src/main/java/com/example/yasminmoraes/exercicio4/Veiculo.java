package com.example.yasminmoraes.exercicio4;

import java.io.Serializable;

/**
 * Created by yasminmoraes on 23/04/19.
 */

public class Veiculo implements Serializable {

    private String placa;
    private String cor;
    private String marca;
    private boolean novo;

    public Veiculo() {

    }

    public Veiculo(String placa, String cor, String marca, boolean novo) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.novo = novo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    private String getEstadoFormatado() {
        if (isNovo()) {
            return "Novo";
        }
        return "Semi-Novo";
    }

    @Override
    public String toString() {
        return placa + ":" +
                cor + ":" +
                marca + ":" +
                this.getEstadoFormatado();
    }
}
