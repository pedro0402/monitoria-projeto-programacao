package DesignPatterns.Facade;

public class Main {
    public static void main(String[] args) {
        EcommerceFacade ecommerceFacade = new EcommerceFacade();
        ecommerceFacade.processarPedido("1234", "54587");
    }
}
