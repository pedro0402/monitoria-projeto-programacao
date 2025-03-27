package DesignPatterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //exemplo 1
        Singleton s1 = Singleton.getInstance();
        s1.setValue("Primeira instância");

        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);

        System.out.println("---------------");

        //exemplo 2
        System.out.println(s2.getValue());

        System.out.println("---------------");

        //exemplo 3
        List<Singleton> singletonList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            singletonList.add(Singleton.getInstance());
        }

        boolean b = singletonList.stream().allMatch(s -> s == singletonList.getFirst());

        System.out.println("Todas as instâncias são iguais? " + b);

    }
}
