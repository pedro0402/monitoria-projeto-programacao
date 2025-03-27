package POO.TrabalhandoComInterfaces;

// Implementação da interface Operacao para multiplicar dois números
public class Multiplicacao implements Operacao{

    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
