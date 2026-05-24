package br.com.venttoapp.fornecedor;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public Fornecedor cadastrar(String nome, String email, String senha, String nomeEmpresa, String categoria) {
        Optional<Fornecedor> existente = repository.findByEmail(email);

        if (existente.isPresent()) {
            throw new RuntimeException("E-mail já está em uso!");
        }

        Fornecedor novoFornecedor = new Fornecedor();
        novoFornecedor.setNome(nome);
        novoFornecedor.setEmail(email);
        novoFornecedor.setSenha(senha);
        novoFornecedor.setNomeEmpresa(nomeEmpresa);
        novoFornecedor.setCategoria(categoria);

        return repository.save(novoFornecedor);
    }

    public Fornecedor autenticar(String email, String senhaInformada) {
        Fornecedor fornecedor = repository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));

        if (!fornecedor.getSenha().equals(senhaInformada)) {
            throw new RuntimeException("Senha incorreta");
        }

        return fornecedor;
    }
}