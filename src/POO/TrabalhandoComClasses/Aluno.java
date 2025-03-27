package POO.TrabalhandoComClasses;

// Herança: Aluno é uma especialização de Pessoa
public class Aluno extends Pessoa {

    private String matricula;

    // Construtor da classe Aluno, que chama o construtor da superclasse Pessoa
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); //chama o construtor da classe pessoa
        this.matricula = matricula;
    }

    // Getter e Setter para o atributo matrícula
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Polimorfismo: sobrescrita do método apresentar para incluir informações do aluno
    @Override
    public void apresentar(){
        super.apresentar(); // Chama o método da superclasse
        System.out.println("Minha mátricula é: " + matricula);
    }
}
