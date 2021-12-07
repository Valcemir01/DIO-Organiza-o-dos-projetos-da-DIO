package br.com.valcemir;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Valcemir");
        nomes.add("Alice");
        nomes.add("Alexandre");
        nomes.add("Sofia");
        nomes.add("Isabele");


        //RETORNA O TAMANHO DA LISTA
        System.out.println(nomes.stream().count());

        //RETORNA SOMENTE OS ITEM QUER CONTEM A LETRA C
        System.out.println("Item com a letra C " + nomes.stream().filter((nome)-> nome.toLowerCase().contains("c"))
                .collect(Collectors.toList()));

        //RETORNA OS NUMERO INDICA DA PARTE DE CIMA DA LISTA
        System.out.println(nomes.stream().limit(4).collect(Collectors.toList()));
    }
}
