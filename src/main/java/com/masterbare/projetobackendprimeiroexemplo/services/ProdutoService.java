package com.masterbare.projetobackendprimeiroexemplo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masterbare.projetobackendprimeiroexemplo.model.Produto;
import com.masterbare.projetobackendprimeiroexemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    /**
     * Método para retornar uma lista de produtos
     * @return Lista dos produtos
     */
    public List<Produto> obterTodos() {
        // Colocar regra aqui caso tenha ...
        //return produtoRepository.obterTodos();
        return produtoRepository.findAll();
    }

    /**
     * Método que retorna o produto encontrado pelo seu id.
     * @param id do produto que será localizado. 
     * @return Retorna um produto caso seja encontrado.
     */
    public Optional<Produto> obterPorId(Long id) {
        //return produtoRepository.obterPorId(id);
        return produtoRepository.findById(id);
    }

     /**
     * Método para adicionar produto na lista.
     * @param produto que será adicionado.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto) {
        // Poderia ter alguma regra de negócio para validar o produto.
        //return produtoRepository.adicionar(produto);
        return produtoRepository.save(produto);
    }

    /**
     * Método para deletar o produto por id.
     * @param id do produto a ser deletado.
     */
    public void deletar(Long id) {
        // Aqui poderia ter alguma lógica de validação.
        //produtoRepository.deletar(id);
        produtoRepository.deleteById(id);
    }

    /**
     * Método para atualizar o produto na lista.
     * @param produto que será atualizado.
     * @param id do produto.
     * @return Retorna o produto após atualizar a lista.
     */
    public Produto atualizar(Long id, Produto produto) {
       
        // Ter alguma validação no ID.
        produto.setId(id);

        //return produtoRepository.atualizar(produto);
        return produtoRepository.saveAndFlush(produto);
    }

}
