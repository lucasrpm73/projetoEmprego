/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.container.model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Lucas Santos
 */
@Entity
@Table(name = "movimentacao")
public class movimentacaoModel implements Serializable {

    @Id
    @GeneratedValue
    private long idMovimentacao;
/*
    @Column(nullable = false, length = 80)
    private String clienteNome;
*/
    @Column(nullable = false, length = 80)
    private String movimentacaoTipo;
     
    @Column(nullable = false, length = 80)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHoraInicio;
      
    
    @Column(nullable = false, length = 80)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHoraFim;

    public long getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(long idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }
    public String getMovimentacaoTipo() {
        return movimentacaoTipo;
    }

    public void setMovimentacaoTipo(String movimentacaoTipo) {
        this.movimentacaoTipo = movimentacaoTipo;
    }

    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Date getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    
    
    
   

}
