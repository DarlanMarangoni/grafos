package com.example.grafo.core;

import java.util.List;

public class Vertice {

    private String rotulo;

    private Integer grau;

    private List<Aresta> arestas;

    public Vertice(String rotulo) throws Exception {
        if (rotulo == null || rotulo != null && "".equals(rotulo.trim())) {
            throw new Exception("Não é permitida a inclusão de vértices com rótulo em branco");
        }
        this.rotulo = rotulo;
    }

    public String getRotulo() {
        return rotulo;
    }
}
