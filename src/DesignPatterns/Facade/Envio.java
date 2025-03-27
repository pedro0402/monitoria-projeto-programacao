package DesignPatterns.Facade;

public class Envio {
    public void enviarProduto(String produtoId, String usuarioId) {
        System.out.println("Produto " + produtoId + " enviado para o usuario: " + usuarioId);
    }
}
