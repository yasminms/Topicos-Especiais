package com.example.yasminmoraes.exerccio1;

import java.io.Serializable;

/**
 * Created by yasminmoraes on 22/04/19.
 */

public class Veiculo implements Serializable{

    private String placa;
    private String cor;
    private boolean novo;
    private String marca;

    public Veiculo() {

    }

    public Veiculo(String placa, String cor, boolean novo, String marca) {
        this.placa = placa;
        this.cor = cor;
        this.novo = novo;
        this.marca = marca;
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

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", novo=" + novo +
                ", marca='" + marca + '\'' +
                '}';
    }
}
