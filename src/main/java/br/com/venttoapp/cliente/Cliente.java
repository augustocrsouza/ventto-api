package br.com.venttoapp.cliente;

import jakarta.persistence.*;

@Entity
@Table(name = "br/com/venttoapp/cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Torna o nome obrigatório no banco de dados
    private String nome;

    @Column(nullable = false, unique = true) // Torna o CPF/CNPJ obrigatório e único na tabela
    private String documento;

    private String email;
    private String telefone;

    // --- GETTERS E SETTERS ---
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

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}