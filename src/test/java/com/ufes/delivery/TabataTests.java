/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.delivery;

import com.ufes.delivery.dao.ProdutoDAO;
import com.ufes.delivery.model.Cliente;
import com.ufes.delivery.model.Estabelecimento;
import com.ufes.delivery.model.Produto;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Aluno
 */
public class TabataTests {
    private ProdutoDAO produtoDao;

    @BeforeEach
    public void carregaDao() {
        produtoDao = ProdutoDAO.getInstance();
    }

    @Test
    @DisplayName("verificar se o método getPrecoUnitario da classe Produto retorna o valor correto do produto")
    public void CT001() {
        
        //Arrange
        Produto produto = produtoDao.buscaProdutoPorCodigo(5);
        double precoUnitarioTeste = 0;
        double precoUnitarioReal = 4.95;
        
        //Act
        precoUnitarioTeste = produto.getPrecoUnitario();
        
        //Assert
        assertEquals(precoUnitarioTeste,precoUnitarioReal);
        
    }
    
    @Test
    @DisplayName("Verificar o ToString da classe Estabelecimento")
    public void CT002() {
        
        //Arrange
        Estabelecimento estabelecimento = new Estabelecimento( "Amazon" );
        String stringEsperada = "Estabelecimento: Amazon";
        String stringRecebida;
        
        //Act
        stringRecebida = estabelecimento.toString();
        
        //Assert
        assertEquals(stringEsperada,stringRecebida);
        
    }
    
    @Test
    @DisplayName("Verificar o ToString da classe Cliente")
    public void CT003() {
        
         //Arrange
        Cliente cliente = new Cliente( "Guilherme", 12000 );
        String stringEsperada = "Cliente: Guilherme, saldo de R$ 12000,00";
        String stringRecebida;
        
        //Act
        stringRecebida = cliente.toString();
        
        //Assert
        assertEquals(stringEsperada,stringRecebida);
        
    }
}

