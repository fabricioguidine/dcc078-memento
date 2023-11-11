import org.example.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveArmazenarEstados() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEstadoEmEstoque.getInstance());
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        assertEquals(2, produto.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEstadoEmEstoque.getInstance());
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        produto.restauraEstado(0);
        assertEquals(ProdutoEstadoEmEstoque.getInstance(), produto.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEstadoEmEstoque.getInstance());
        produto.setEstado(ProdutoEstadoEmFalta.getInstance());
        produto.setEstado(ProdutoEstadoEmEstoque.getInstance());
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        produto.restauraEstado(2);
        assertEquals(ProdutoEstadoEmEstoque.getInstance(), produto.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Produto produto = new Produto();
            produto.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}