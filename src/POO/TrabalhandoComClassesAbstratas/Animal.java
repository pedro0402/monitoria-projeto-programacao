package POO.TrabalhandoComClassesAbstratas;

// Abstração: Classe abstrata Animal
public abstract class Animal {

    // Método abstrato: sem implementação, deve ser implementado pelas subclasses
    public abstract void emitirSom();

    // Método comum com implementação
    public void dormir(){
        System.out.println("o animal está dormindo");
    }
}
