package DesignPatterns.Adapter;
//Adapter (O "tradutor" entre P2 e USB-C)
public class AdaptadorUSB implements CarregadorUSB_C{

    private CarregadorMicroUSB carregadorMicroUSB;

    public AdaptadorUSB(CarregadorMicroUSB carregadorMicroUSB){
        this.carregadorMicroUSB = carregadorMicroUSB;
    }

    @Override
    public void carregar() {
        carregadorMicroUSB.carregarMicroUSB();
    }
}
