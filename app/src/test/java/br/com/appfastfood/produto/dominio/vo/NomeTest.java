package br.com.appfastfood.produto.dominio.vo;

import br.com.appfastfood.produto.dominio.vo.Nome;
import br.com.appfastfood.produto.exceptions.CamposObrigatorioException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class NomeTest {

    @Test
    void getNome_DeveRetornarNomeCorreto() {
        String nome = "Pizza";
        Nome objetoNome = new Nome(nome);

        assertEquals(nome, objetoNome.getNome());
    }
}

