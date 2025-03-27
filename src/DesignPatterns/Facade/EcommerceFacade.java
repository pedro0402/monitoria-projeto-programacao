package DesignPatterns.Facade;

public class EcommerceFacade {

    private Estoque estoque;

    private Pagamento pagamento;

    private Envio envio;

    public EcommerceFacade(){
        estoque = new Estoque();
        pagamento = new Pagamento();
        envio = new Envio();
    }

    public void processarPedido(String produtoId, String usuarioId){
        if (estoque.checarEstoque(produtoId) && pagamento.processarPagamento(usuarioId)){
            envio.enviarProduto(produtoId, usuarioId);
        } else {
            System.out.println("não foi possivel processar o pedido do usurio: " + usuarioId);
        }
    }

}
