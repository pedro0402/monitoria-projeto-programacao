package POO.TrabalhandoComAssociacaoAgregacaoComposicao.Associacao;


public class Aluno {
    public String nome;
    public Professor professor; // Associação com a classe Professor

    public Aluno(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void mostrarDados(){
        System.out.println("Aluno: " + nome + " | Professor: " + professor.nome);
    }
}
