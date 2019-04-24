package com.example.yasminmoraes.exercicio3;

import java.io.Serializable;

/**
 * Created by yasminmoraes on 23/04/19.
 */

class Produto implements Serializable{

    private String nome;
    private Double peso;
    private String unidadeMedida;
    private String estadoFisico;

    public Produto() {

    }

    public Produto(String nome, Double peso, String unidadeMedida, String estadoFisico) {
        this.nome = nome;
        this.peso = peso;
        this.unidadeMedida = unidadeMedida;
        this.estadoFisico = estadoFisico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    @Override
    public String toString() {
        return nome + ":" + estadoFisico;
    }
}
