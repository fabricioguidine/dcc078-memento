package org.example;

public class ProdutoEstadoEmEstoque implements ProdutoEstado {
    private ProdutoEstadoEmEstoque() {};
    private static ProdutoEstadoEmEstoque instance = new ProdutoEstadoEmEstoque();
    public static ProdutoEstadoEmEstoque getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em estoque";
    }
}

