package com.masterbare.projetobackendprimeiroexemplo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.masterbare.projetobackendprimeiroexemplo.model.Produto;
import com.masterbare.projetobackendprimeiroexemplo.model.exception.ResourceNotFoundException;

@Repository
public class ProdutoRepository_old {
    
    // Simulando um banco de dados em memória
    private List<Produto> produtos = new ArrayList<Produto>();
    private Long ultimoId = 0L;

    /**
     * Método para retornar uma lista de produtos
     * @return Lista dos produtos
     */
    public List<Produto> obterTodos() {
        return produtos;
    }

    /**
     * Método que retorna o produto encontrado pelo seu id.
     * @param id do produto que será localizado. 
     * @return Retorna um produto caso seja encontrado.
     */
    public Optional<Produto> obterPorId(Long id) {
        return produtos
                .stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }

    /**
     * Método para adicionar produto na lista.
     * @param produto que será adicionado.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto) {
       
        ultimoId++;

        produto.setId(ultimoId);
        produtos.add(produto);

        return produto;
    }

    /**
     * Método para deletar o produto por id.
     * @param id do produto a ser deletado.
     */
    public void deletar(Long id) {
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Método para atualizar o produto na lista.
     * @param produto que será atualizado.
     * @return Retorna o produto após atualizar a lista.
     */
    public Produto atualizar(Produto produto) {
        // Encontrar o produto na lista
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if(produtoEncontrado.isEmpty()){
            throw new ResourceNotFoundException("Produto não pode ser atualizado pois não existe.");
        } 

        // Eu tenho que remover o produto antigo da lista
        deletar(produto.getId());
        // Depois adicionar o produto atualizado na lista.
        produtos.add(produto);

        return produto;

    }

}
