package com.example.yasminmoraes.exemplo64k2019;

public class Usuario {

    private String nome;
    private boolean notificacao;
    private String genero;

    public Usuario() {

    }

    public Usuario(String nome, boolean notificacao, String genero) {
        this.nome = nome;
        this.notificacao = notificacao;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isNotificacao() {
        return notificacao;
    }

    public void setNotificacao(boolean notificacao) {
        this.notificacao = notificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
