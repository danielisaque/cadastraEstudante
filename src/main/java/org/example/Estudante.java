package org.example;

import java.util.Objects;

public class Estudante implements Comparable<Estudante> {

    private String nome;
    private int idade;
    private String matricula;

    public Estudante(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Estudante outroEstudante) {
        return this.idade - outroEstudante.getIdade();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return idade == estudante.idade &&
                Objects.equals(nome, estudante.nome) &&
                Objects.equals(matricula, estudante.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, matricula);
    }
}
