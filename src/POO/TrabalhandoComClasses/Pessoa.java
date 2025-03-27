package POO.TrabalhandoComClasses;

public class Pessoa {

    //Atributos privados (encapsulamento)
    private String nome;
    private int idade;

    //atributo estático: pertence à classe Pessoa
    public static int contadorPessoas = 0;

    //Construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        contadorPessoas++; //incrementa o contador sempre que um objeto Pessoa é criado
    }

    //Getters e Setters para acesso e modificação dos atributos.


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

    //método de instância: comportamento comum
    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos");
    }

    //método estático: pode ser chamado sem instanciar a nossa classe
    public static void mostrarContador(){
        System.out.println("Número de pessoas criadas: " + contadorPessoas);
    }


}
