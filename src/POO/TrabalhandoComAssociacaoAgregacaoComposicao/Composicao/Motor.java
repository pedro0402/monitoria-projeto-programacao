package POO.TrabalhandoComAssociacaoAgregacaoComposicao.Composicao;

// COMPOSIÇÃO: Um carro tem um motor e depende dele.
public class Motor {

    String tipo;

    Motor(String tipo){
        this.tipo = tipo;
    }

    void ligar() {
        System.out.println("Motor " + tipo + " ligado.");
    }
}
