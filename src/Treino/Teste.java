package Treino;

/**
 * Created by Douglas on 05/10/2016.
 */
public class Teste {
    public static void main(String[] args) {
        /* Aluno aluno = new Aluno();
        Professor professor = new Professor();
        aluno.setNome("Douglas");
        aluno.setEndereco("NereuRamos");
        aluno.setCpf("04741300960");
        aluno.setTelefone("88294200");
        professor.setSalario(440.00);

        System.out.println("Nome: " +aluno.getNome());
        System.out.println("Salario Professor " +professor.getSalario()); */

        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        //pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());



    }
}
