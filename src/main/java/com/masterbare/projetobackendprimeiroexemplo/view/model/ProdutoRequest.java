package com.masterbare.projetobackendprimeiroexemplo.view.model;

public class ProdutoRequest {

      //#region Atributos   
      private String nome;
  
      private Long quantidade;
  
      private Double valor;
  
      private String observacao;
      //Sendregion
  
      //#region Getters and Setters
      public String getNome() {
          return nome;
      }
  
      public void setNome(String nome) {
          this.nome = nome;
      }
  
      public Long getQuantidade() {
          return quantidade;
      }
  
      public void setQuantidade(Long quantidade) {
          this.quantidade = quantidade;
      }
  
      public Double getValor() {
          return valor;
      }
  
      public void setValor(Double valor) {
          this.valor = valor;
      }
  
      public String getObservacao() {
          return observacao;
      }
  
      public void setObservacao(String observacao) {
          this.observacao = observacao;
      }
      //Sendregion
    
}
