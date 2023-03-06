package com.dio.dominio;

public abstract class Conteudo {

    protected final double XP_PADRA0 = 10d;
    private String titulo;
    private String descricao;

    public abstract double calculaXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
