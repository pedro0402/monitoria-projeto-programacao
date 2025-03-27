package POO.TrabalhandoComInterfaces;

public class Main {
    public static void main(String[] args) {

        Operacao operacao1 = new Soma();
        Operacao operacao2 = new Multiplicacao();

        double n1 = 10;
        double n2 = 5;

        System.out.println("soma: " + operacao1.executar(n1, n2));
        System.out.println("multiplicação: " + operacao2.executar(n1,n2));

        System.out.println("-----------------------------");

        Impressao impressora = new Impressora();
        impressora.imprimir("imprimindo agora");
        impressora.imprimirComPrefixo("método default");
    }
}
