package POO.TrabalhandoComAssociacaoAgregacaoComposicao.Agregacao;

import POO.TrabalhandoComAssociacaoAgregacaoComposicao.Associacao.Aluno;

import java.util.ArrayList;
import java.util.List;

// AGREGAÇÃO: A universidade tem alunos, mas os alunos podem existir sem ela.
public class Universidade {
    String nome;
    List<Aluno> alunos; // Lista de alunos (agregação)

    public Universidade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void mostrarAlunos(){
        System.out.println("Universidade " + nome);
        for (Aluno aluno : alunos){
            System.out.println("Aluno: " + aluno.nome);
        }
    }

}
