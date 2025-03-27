package DesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {

        CarregadorMicroUSB carregadorMicroUSB = new CarregadorMicroUSB();

        CarregadorUSB_C adaptador = new AdaptadorUSB(carregadorMicroUSB);

        adaptador.carregar();

    }
}
