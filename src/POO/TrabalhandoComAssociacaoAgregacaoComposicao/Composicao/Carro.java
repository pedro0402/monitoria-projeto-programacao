package POO.TrabalhandoComAssociacaoAgregacaoComposicao.Composicao;

public class Carro {

    String modelo;
    Motor motor; // Composição (o motor só existe se o carro existir)

    public Carro(String modelo, String tipoMotor){
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor);
    }

    public void ligarCarro() {
        System.out.println("Carro " + modelo + " está ligando...");
        motor.ligar();
    }
}
