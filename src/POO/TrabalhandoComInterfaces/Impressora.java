package POO.TrabalhandoComInterfaces;

public class Impressora implements Impressao{

    @Override
    public void imprimir(String mensagem) {
        System.out.println("impressão: " + mensagem);
    }

}
