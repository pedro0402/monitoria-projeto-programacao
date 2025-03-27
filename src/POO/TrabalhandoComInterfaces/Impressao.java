package POO.TrabalhandoComInterfaces;

// Outra interface com um método abstrato e um método default
public interface Impressao {

    // Método abstrato: deve ser implementado pelas classes
    void imprimir(String mensagem);

    // Método default: já possui implementação e pode ser utilizado diretamente ou sobrescrito
    default void imprimirComPrefixo(String mensagem) {
        System.out.println("Prefixo: " + mensagem);
    }
}
