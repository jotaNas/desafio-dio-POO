package com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;


    @Override
    public double calculaXP(){
        return XP_PADRA0 + 20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
