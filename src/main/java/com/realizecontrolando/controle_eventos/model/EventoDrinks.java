package com.realizecontrolando.controle_eventos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "evento_drinks")
public class EventoDrinks extends Evento { // Herda a estrutura de Evento

    private Integer qtdConvidados;
    private Boolean temOutrasBebidas;
    private Integer horasDuracao;
    private String cardapio;

    private BigDecimal valorBase;
    private BigDecimal valorAdicionais;
    private BigDecimal valorDesconto;

    public Integer getQtdConvidados() {
        return qtdConvidados;
    }

    public void setQtdConvidados(Integer qtdConvidados) {
        this.qtdConvidados = qtdConvidados;
    }

    public Boolean getTemOutrasBebidas() {
        return temOutrasBebidas;
    }

    public void setTemOutrasBebidas(Boolean temOutrasBebidas) {
        this.temOutrasBebidas = temOutrasBebidas;
    }

    public Integer getHorasDuracao() {
        return horasDuracao;
    }

    public void setHorasDuracao(Integer horasDuracao) {
        this.horasDuracao = horasDuracao;
    }

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }

    public BigDecimal getValorBase() {
        return valorBase;
    }

    public void setValorBase(BigDecimal valorBase) {
        this.valorBase = valorBase;
    }

    public BigDecimal getValorAdicionais() {
        return valorAdicionais;
    }

    public void setValorAdicionais(BigDecimal valorAdicionais) {
        this.valorAdicionais = valorAdicionais;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
// Espaço para os Getters e Setters
}