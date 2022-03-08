/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.container.controller;
import com.container.model.movimentacaoModel;
import com.container.repository.movimentacaoRepository;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
/**
 *
 * @author Lucas Santos
 */
@ManagedBean
@ViewScoped
public class movimentacaoController {
    
    private movimentacaoModel movimentacaoModel;
    private movimentacaoRepository movimentacaoRepository;
    private List<movimentacaoModel> listaDeMovimentacao;
    
    public movimentacaoController() {
        this.movimentacaoModel = new movimentacaoModel();
        this.movimentacaoRepository = new movimentacaoRepository();
        this.listaDeMovimentacao = new ArrayList<>();
    }
    
     public String salvar(){
        this.movimentacaoRepository.salvar(this.movimentacaoModel);
        return "BuscarMovimentacao.xhtml?faces-redirect=true";
    }
    
    public String salvarEdicao() {
        this.movimentacaoRepository.salvar(this.movimentacaoModel);
        return "BuscarMovimentacao.xhtml?faces-redirect=true";
    }
    
    public void remover(long idMovimentacao) {
        
        this.movimentacaoRepository.remover(idMovimentacao);
    }
    
    public String editar(long idMovimentacao) {
        return "EditarMovimentacao.xhtml?faces-redirect=true&idMovimentacao=" + idMovimentacao;
    }
   
    public void buscarMovimentacao() {
        this.movimentacaoModel = this.movimentacaoRepository.buscarPorId(this.movimentacaoModel.getIdMovimentacao());
    }
    public void getMovimentacao() {
        this.movimentacaoModel = this.movimentacaoRepository.buscarPorId(this.movimentacaoModel.getIdMovimentacao());
    }


    public List<SelectItem> getMovimentacoes() {
        ArrayList<SelectItem> itens = new ArrayList<SelectItem>();
        List<movimentacaoModel> listaDeMovimentacoes = this.movimentacaoRepository.buscarTodos();
        for (movimentacaoModel movimentacao : listaDeMovimentacoes) {
            itens.add(new SelectItem(movimentacao.getIdMovimentacao(), movimentacao.getMovimentacaoTipo()));
        }
        return itens;
    }
    
    public void buscarTodosMovimentacoes() {
        this.listaDeMovimentacao = this.movimentacaoRepository.buscarTodos();
    }

    public movimentacaoModel getMovimentacaoModel() {
        return movimentacaoModel;
    }

    public void setMovimentacaoModel(movimentacaoModel movimentacaoModel) {
        this.movimentacaoModel = movimentacaoModel;
    }

    public movimentacaoRepository getMovimentacaoRepository() {
        return movimentacaoRepository;
    }

    public void setMovimentacaoRepository(movimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public List<movimentacaoModel> getListaDeMovimentacao() {
        return listaDeMovimentacao;
    }

    public void setListaDeMovimentacao(List<movimentacaoModel> listaDeMovimentacao) {
        this.listaDeMovimentacao = listaDeMovimentacao;
    }


    

}
