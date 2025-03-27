package POO.TrabalhandoComInterfaces;

// Implementação da interface Operacao para somar dois números
public class Soma implements Operacao{

    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
