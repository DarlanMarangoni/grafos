package com.example.grafo.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {

    private int qtdMaximaVertices;
    private boolean isQtdeMaximaDefinida;
    private int qtdAtualVertices = 0;

    private Map<String, Integer> rotulosEmIndice = new HashMap<String, Integer>();

    private List<Vertice> vertices = new ArrayList<Vertice>(0);

    public Grafo() {
        this.qtdMaximaVertices  = 10;
    }

    public Grafo(int qtdVertices) {
        if (qtdVertices <= 0) {
            throw new	IllegalArgumentException("A	quantidade máxima de vértices deve ser maior ou igual à 1");
        }
        this.qtdMaximaVertices = qtdVertices;
        this.isQtdeMaximaDefinida = true;
    }

    public void adicionarVertice(String rotulo) throws Exception {
        if (qtdAtualVertices <= qtdMaximaVertices -1) {
            Vertice novoVertice = new Vertice(rotulo);
            this.vertices.add(novoVertice);
            this.rotulosEmIndice.put(rotulo, qtdAtualVertices);
            qtdAtualVertices++;
        } else {
            throw new Exception("A quantidade de vértices permitida (" + qtdMaximaVertices + ") foi excedida!");
        }
    }

    public List<Vertice> getVertices() {
        return vertices;
    }
}
