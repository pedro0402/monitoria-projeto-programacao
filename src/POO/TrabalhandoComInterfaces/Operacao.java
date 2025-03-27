package POO.TrabalhandoComInterfaces;

/*
 * ExemploInterfaces.java
 *
 * Este exemplo demonstra o uso de interfaces em Java.
 * Uma interface define um contrato que as classes implementadoras devem seguir.
 *
 * Conceitos abordados:
 * 1. Interface: Define métodos que devem ser implementados pelas classes.
 * 2. Implementação de interface: Classes que implementam os métodos definidos pela interface.
 * 3. Métodos default: Métodos com implementação padrão na interface, disponíveis para as classes.
 */

// Interface que define uma operação matemática
public interface Operacao {

    // Método abstrato: as classes que implementam essa interface devem fornecer uma implementação
    double executar(double a, double b);
}
