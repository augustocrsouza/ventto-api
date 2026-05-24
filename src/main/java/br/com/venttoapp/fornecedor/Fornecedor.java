package br.com.venttoapp.fornecedor;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    // Aqui está a coluna da senha!
    @Column(nullable = false)
    private String senha;

    @Column(name = "nome_empresa")
    private String nomeEmpresa;

    // NOVO CAMPO: Para saber se é Bar de Drinks, Buffet, etc.
    @Column(nullable = false)
    private String categoria;

    @Column(name = "google_id", unique = true)
    private String googleId;

    // Construtor vazio obrigatório para o JPA
    public Fornecedor() {}

    // Construtor com todos os campos
    public Fornecedor(String nome, String email, String senha, String nomeEmpresa, String googleId, String categoria) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nomeEmpresa = nomeEmpresa;
        this.googleId = googleId;
        this.categoria = categoria;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Olha o seu get e set da senha aqui, perfeitos:
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getNomeEmpresa() { return nomeEmpresa; }
    public void setNomeEmpresa(String nomeEmpresa) { this.nomeEmpresa = nomeEmpresa; }

    public String getGoogleId() { return googleId; }
    public void setGoogleId(String googleId) { this.googleId = googleId; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}