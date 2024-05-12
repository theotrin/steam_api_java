package org.example;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
        //Usando Supplier com expressão lambda para criar uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)";

        //Usar o Supplier para obter um lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate( () -> "Olá, seja bem vindo")
                .limit(2) //quantas vezes vai imprimir
                .toList(); //vai adcionar em um Array

        listaSaudacoes.forEach(System.out::println);
    }
}
