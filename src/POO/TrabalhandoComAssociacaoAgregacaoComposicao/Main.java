package POO.TrabalhandoComAssociacaoAgregacaoComposicao;

import POO.TrabalhandoComAssociacaoAgregacaoComposicao.Agregacao.Universidade;
import POO.TrabalhandoComAssociacaoAgregacaoComposicao.Associacao.Aluno;
import POO.TrabalhandoComAssociacaoAgregacaoComposicao.Associacao.Professor;
import POO.TrabalhandoComAssociacaoAgregacaoComposicao.Composicao.Carro;

public class Main {
    public static void main(String[] args) {

        // Associação
        Professor prof = new Professor("Dr. Silva");
        Aluno aluno1 = new Aluno("Pedro", prof);
        aluno1.mostrarDados();

        System.out.println("------------");

        // Agregação
        Universidade univ = new Universidade("UFJava");
        univ.adicionarAluno(aluno1);
        univ.adicionarAluno(new Aluno("Maria", prof));
        univ.mostrarAlunos();

        System.out.println("------------");

        // Composição
        Carro carro = new Carro("Fusca", "1.6");
        carro.ligarCarro();
    }
}
