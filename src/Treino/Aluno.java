package Treino;

import Treino.Pessoa;

/**
 * Created by Douglas on 05/10/2016.
 */
public class Aluno extends Pessoa {

    private String curso;
    private double notas;


    public String obterEtiquetaEndereco() {

        String s = "Endereço do aluno: ";
        s += super.getEndereco();
        return s;
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }


    public Aluno() {
        super();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double calcularMedia() {

        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("123213");
        this.setCpf("1231231");
    }

    public void verificarAcesso() {

        super.nomeVisibilidade = "Douglas!";
        this.nomeVisibilidade = "dodi";
    }
}
