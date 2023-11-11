package org.example;

public class ProdutoEstadoExtraviado implements ProdutoEstado {
    private ProdutoEstadoExtraviado() {};
    private static ProdutoEstadoExtraviado instance = new ProdutoEstadoExtraviado();
    public static ProdutoEstadoExtraviado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Extraviada";
    }
}