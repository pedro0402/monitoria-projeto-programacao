package POO;

import POO.TrabalhandoComClasses.Aluno;
import POO.TrabalhandoComClasses.Pessoa;
import POO.TrabalhandoComClassesAbstratas.Animal;
import POO.TrabalhandoComClassesAbstratas.Cachorro;

public class Main {
    public static void main(String[] args) {

        // Exemplos de tipos primitivos
        int numero = 10;
        double decimal = 5.5;
        boolean verdadeiro = true;
        char letra = 'A';

        System.out.println("Tipos primitivos: " + numero + ", " + decimal + ", " + verdadeiro + ", " + letra);

        // Criando objetos utilizando construtores
        Pessoa p1 = new Pessoa("Maria", 30);
        Aluno aluno1 = new Aluno("João", 20, "2023A001");

        // Chamando métodos de instância
        p1.apresentar();
        aluno1.apresentar();

        // Utilizando método estático da classe Pessoa
        Pessoa.mostrarContador();

        // Exemplo de abstração e polimorfismo com Animal
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.dormir();
    }
}
