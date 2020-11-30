package com.example.grafo;

import com.example.grafo.core.Grafo;

public class TesteGrafo1 {

    public static void main(String[] args) throws Exception {

        Grafo grafo = new Grafo();

        grafo.adicionarVertice("RJ");
        grafo.adicionarVertice("SP");
        grafo.adicionarVertice("BH");
        grafo.adicionarVertice("PT");
        grafo.adicionarVertice("OS");
        grafo.adicionarVertice("SV");
        grafo.adicionarVertice("CR");
        grafo.adicionarVertice("PA");

        System.out.println("O Grafo G possui os seguintes vértices: " + System.lineSeparator());
        grafo.getVertices().forEach(v -> System.out.println("Vértice - " + v.getRotulo()));
    }
}
