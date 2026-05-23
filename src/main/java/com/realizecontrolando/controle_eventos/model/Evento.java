package com.realizecontrolando.controle_eventos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Diz ao JPA que esta classe é uma tabela no BD
public class Evento {

    @Id // Define o 'id' como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura o BD para gerar o ID
    private Long id;
    private String nome;
    private String cliente;
    private String data; // Vamos usar String por simplicidade, mas o ideal seria LocalDate
    private String local;

    // Construtor vazio (obrigatório pelo JPA)
    public Evento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    // Construtor para facilitar a criação de novos objetos
    public Evento(String nome, String cliente, String data, String local) {
        this.nome = nome;
        this.cliente = cliente;
        this.data = data;
        this.local = local;
    }
}