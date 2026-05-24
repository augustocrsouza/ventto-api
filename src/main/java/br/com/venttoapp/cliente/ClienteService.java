package br.com.venttoapp.cliente;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente buscarOuCadastrar(String nome, String documento, String telefone, String email) {
        // 1. Tenta achar o cliente pelo CPF/CNPJ
        Optional<Cliente> clienteExistente = repository.findByDocumento(documento);

        // 2. Se achou, apenas devolve ele (reaproveita o ID)
        if (clienteExistente.isPresent()) {
            return clienteExistente.get();
        }

        // 3. Se não achou, monta a ficha completa e salva no banco
        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        novoCliente.setDocumento(documento);
        novoCliente.setTelefone(telefone);
        novoCliente.setEmail(email);

        return repository.save(novoCliente);
    }
}