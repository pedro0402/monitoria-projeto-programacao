package DesignPatterns.Singleton;

public class Singleton {

    //atributo estatico(pertence a classe)
    private static Singleton instance;
    private String value; //atributo para teste

    //construtor privado
    private Singleton(){};

    public static Singleton getInstance(){
        //verifica se a instance é nula (não existe)
        if (instance == null){
            instance = new Singleton();
        }
        //caso minha instance já exista, retorna a própia instance já existente
        return instance;
    }

    public String getValue(){
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }

}
