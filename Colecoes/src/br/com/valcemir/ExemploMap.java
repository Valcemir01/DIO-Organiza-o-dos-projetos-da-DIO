package br.com.valcemir;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, String> mundialFifa = new HashMap<>();

        //FUNCIONA COM CHAVE E VALOR
        mundialFifa.put("AC", "Acre");
        mundialFifa.put("AL", "Alagoas");
        mundialFifa.put("AP", "Amapá");
        mundialFifa.put("AM", "Amazonas");
        mundialFifa.put("BA", "Bahia");
        mundialFifa.put("CE", "CE");
        mundialFifa.put("DF", "Distrito Federal");
        mundialFifa.put("ES", "Espírito Santo");
        mundialFifa.put("GO", "Goiás");
        mundialFifa.put("MA", "Maranhão");
        mundialFifa.put("MT", "Mato Grosso");
        mundialFifa.put("MS", "Mato Grosso do Sul");
        mundialFifa.put("MG", "Minas Gerais");
        mundialFifa.put("PA", "Paraíba");
        mundialFifa.put("PR", "Paraná");
        mundialFifa.put("PE", "Pernambuco");
        mundialFifa.put("PI", "Piauí");
        mundialFifa.put("RJ", "Rio de Janeiro");
        mundialFifa.put("RN", "Rio Grande do Norte");
        mundialFifa.put("RS", "Rio Grande do Sul");
        mundialFifa.put("RO", "Rondônia");
        mundialFifa.put("RR", "Roraima");
        mundialFifa.put("SC", "Santa Catarina");
        mundialFifa.put("SP", "São Paulo");
        mundialFifa.put("SE", "Sergipe");
        mundialFifa.put("TO", "Tocantins");

        System.out.println(mundialFifa);

        //ATUALIZAR ITEM
        mundialFifa.put("CE", "Ceará");
        System.out.println(mundialFifa);

        //RECUPERA ITEM PASSANDO A CHAVE
        System.out.println(mundialFifa.get("RR"));

        //RETORNA TRUE OU FALSE PARA A EXISTENCIA DE UMA CHAVE
        System.out.println(mundialFifa.containsKey("RJ"));

        //RETORNA TRUE OU FALSE PARA A EXISTENCIA DE UM VALOR
        System.out.println(mundialFifa.containsValue("Sergipe"));

        //RETORNA O TAMANHO DO MAP
        System.out.println(mundialFifa.size());

        //MODOS DE NAVEGAR NO MAP
        for(Map.Entry<String, String> entry : mundialFifa.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for(String key : mundialFifa.keySet()){
            System.out.println(key + " -> " + mundialFifa.get(key));
        }

        //REMOVE ITEM
        mundialFifa.remove("São Paulo");


    }
}
