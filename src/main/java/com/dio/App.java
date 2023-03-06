package com.dio;

import com.dio.dominio.Curso;
import com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {
        Curso curso01 = new Curso();
        Curso curso02 = new Curso();

        Mentoria mentoria01 = new Mentoria();

        curso01.setTitulo("java");
        curso01.setCargahoraria(40);
        curso01.setDescricao("curso da dio de java");
        System.out.println(curso01);

        curso02.setTitulo("javascript");
        curso02.setCargahoraria(40);
        curso02.setDescricao("curso da dio de javascript");
        System.out.println(curso02);

        mentoria01.setTitulo("java");
        mentoria01.setDescricao("mentoria de java da dio");
        mentoria01.setData(LocalDate.now());
        System.out.println(mentoria01);

    }
}
