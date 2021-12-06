package br.com.valcemir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    //Comentarios
    /*Codigos validos*/
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Valcemir");
        nomes.add("Alice");
        nomes.add("Alexandre");
        nomes.add("Sofia");
        nomes.add("Isabele");
        System.out.println(nomes);

        //ORDENAÇÃO
        /*Collections.sort(nomes);*/

        //ATUALIZAR ITEM DE UMA POSIÇÃO
        //CASO COLOQUE UM INDEX QUE NÃO EXISTI GERA UM ERRO
        /*nomes.set(0, "Valcemir Costa");*/

        //DELETAR UM ITEM DA LISTA PODE SER PASSADO UM INDEX OU UM OBJETO
        //CASO COLOQUE UM INDEX QUE NÃO EXISTI GERA UM ERRO
        /*nomes.remove(2);
        nomes.remove("Sofia");*/

        //RECUPERA UM ITEM DA LISTA PASSANDO UM INDEX
        //CASO COLOQUE UM INDEX QUE NÃO EXISTI GERA UM ERRO
        /*String nome = nomes.get(2);
        System.out.println(nome);*/

        //RETORNA O TAMANHO DA LISTA
        /*int tamanho = nomes.size();
        System.out.println(tamanho);*/

        //RETORNA SE EXISTI TÃO ELEMENTO NA LISTA RETORNA TRUE OU FALSE
        /*boolean contem = nomes.contains("Valcemir");
        System.out.println(contem);*/

        //RETORNA SE A LISTA ESTA VAZIA RETORNA TRUE OU FALSE
        /*boolean vazia = nomes.isEmpty();
        System.out.println(vazia);*/

        //RETORNA POSIÇÃO DO ELEMENTO CASO EXISTA NA LISTA
        /*int posicaoElemento = nomes.indexOf(4);*/

        //PERCORRER A LISTA ITEM POR ITEM
        /*for (String item: nomes) {
            System.out.println(item);
        }*/

        //LIMPAR LISTA
        /*nomes.clear();*/

       // System.out.println(nomes);
    }
}
