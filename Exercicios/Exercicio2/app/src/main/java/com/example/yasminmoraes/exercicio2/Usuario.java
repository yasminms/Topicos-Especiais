package com.example.yasminmoraes.exercicio2;

import java.io.Serializable;

/**
 * Created by yasminmoraes on 22/04/19.
 */

public class Usuario implements Serializable{

    private String nome;
    private String sexo;
    private boolean musica;
    private boolean filme;

    public Usuario() {

    }

    public Usuario(String nome, String sexo, boolean musica, boolean filme) {
        this.nome = nome;
        this.sexo = sexo;
        this.musica = musica;
        this.filme = filme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isMusica() {
        return musica;
    }

    public void setMusica(boolean musica) {
        this.musica = musica;
    }

    public boolean isFilme() {
        return filme;
    }

    public void setFilme(boolean filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return nome + ":" + sexo;
    }

    public String getInteresses() {
        String interesses = "";

        if (isFilme()) {
            interesses += ", Filme";
        }

        if (isMusica()) {
            interesses += ", Musica";
        }

        return interesses;
    }
}
