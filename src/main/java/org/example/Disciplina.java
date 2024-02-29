package org.example;

public class Disciplina {

    private String nome;
    private String codigo;
    private String professor;

    public Disciplina (String nome, String codigo, String professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProfessor() {
        return professor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código da disciplina não pode ser vazio ou nulo");
        }
        this.codigo = codigo;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
