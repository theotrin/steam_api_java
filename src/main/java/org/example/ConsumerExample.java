package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(44,66,77,99);

        //Imprimir dados pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //chamando
        numbers.forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        });
    }
}
