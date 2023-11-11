package org.example;

public class ProdutoEstadoEmFalta implements ProdutoEstado {
    private ProdutoEstadoEmFalta() {};
    private static ProdutoEstadoEmFalta instance = new ProdutoEstadoEmFalta();
    public static ProdutoEstadoEmFalta getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em falta";
    }
}