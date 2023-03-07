package com.dio;

import com.dio.dominio.Bootcamp;
import com.dio.dominio.Curso;
import com.dio.dominio.Dev;
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


        curso02.setTitulo("javascript");
        curso02.setCargahoraria(40);
        curso02.setDescricao("curso da dio de javascript");


        mentoria01.setTitulo("java");
        mentoria01.setDescricao("mentoria de java da dio");
        mentoria01.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Melhor Bootcamp já visto de java");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria01);

        Dev dev01 = new Dev();
        dev01.setNome("Camila");
        dev01.inscreverBootcamp(bootcamp);
        System.out.println("CAMILA");
        System.out.println("Conteudos inscritos de Camila" + dev01.getConteudosInscritos());
        System.out.println("-----------------------------");
        dev01.progredir();
        dev01.progredir();
        System.out.println("Conteudos concluídos de Camila" + dev01.getConteudosConcluidos());
        System.out.println("Conteudos inscritos de Camila" + dev01.getConteudosInscritos());
        System.out.println("-----------------------------");
        System.out.printf("XP: %.1f\n\n", dev01.calcularTotalXp());

        Dev dev02 = new Dev();
        dev02.setNome("Joao");
        dev02.inscreverBootcamp(bootcamp);
        System.out.println("JOÃO");
        System.out.println("Conteudos inscritos de João" + dev02.getConteudosInscritos());
        System.out.println("-----------------------------");
        dev02.progredir();
        System.out.println("Conteudos concluídos de João" + dev02.getConteudosConcluidos());
        System.out.println("Conteudos inscritos de João" + dev02.getConteudosInscritos());
        System.out.println("XP: " + dev02.calcularTotalXp());
    }
}
