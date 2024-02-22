package org.example;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigoTurma;
    private Disciplina disciplina;
    private List<Estudante> alunosMatriculados;


    public Turma (String codigoTurma, Disciplina disciplina) {
        this.codigoTurma = codigoTurma;
        this.disciplina = disciplina;
        this.alunosMatriculados = new ArrayList<>();

    }
}
