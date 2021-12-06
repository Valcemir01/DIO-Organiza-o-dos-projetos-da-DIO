package br.com.valcemir;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        //PERCORRE A FILA
        for (String item : filaBanco){
            System.out.println(item);
        }
        //RETONA O PRIMEIRO ITEM DA FILA SEM REMOVER
        System.out.println(filaBanco.peek());
        //RETORNA O PRIMEIRO ITEM DA FILA E O REMOVE
        System.out.println(filaBanco.poll());
        //ADIVIONA NOVO ITEM A FILA
        filaBanco.add("Daniel");
        //VERIFICA TAMANHO DA FILA
        System.out.println(filaBanco.size());
        //VERIFICA SE A FILA ESTA VAZIA
        System.out.println(filaBanco.isEmpty());
        //VERIFICA SE UM ITEM EXISTI NA FILA
        System.out.println(filaBanco.contains("Daniel"));

        System.out.println(filaBanco);
    }
}
