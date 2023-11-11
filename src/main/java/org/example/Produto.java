package org.example;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private ProdutoEstado estado;
    private List<ProdutoEstado> memento = new ArrayList<ProdutoEstado>();

    public ProdutoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ProdutoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ProdutoEstado> getEstados() {
        return this.memento;
    }
}