package org.example;

public class ProdutoEstadoVendido implements ProdutoEstado {
    private ProdutoEstadoVendido() {};
    private static ProdutoEstadoVendido instance = new ProdutoEstadoVendido();
    public static ProdutoEstadoVendido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vendido";
    }
}