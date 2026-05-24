package br.com.venttoapp.fornecedor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fornecedores")
@CrossOrigin("*")
public class FornecedorController {

    private final FornecedorService service;

    public FornecedorController(FornecedorService service) {
        this.service = service;
    }

    public record CadastroRequest(String nome, String email, String senha, String nomeEmpresa, String categoria) {}
    public record LoginRequest(String email, String senha) {}

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody CadastroRequest request) {
        service.cadastrar(
                request.nome(), request.email(), request.senha(), request.nomeEmpresa(), request.categoria()
        );
        return ResponseEntity.ok("CADASTRO EFETUADO COM SUCESSO");
    }

    @PostMapping("/login")
    public ResponseEntity<Fornecedor> login(@RequestBody LoginRequest request) {
        Fornecedor autenticado = service.autenticar(request.email(), request.senha());
        return ResponseEntity.ok(autenticado);
    }
}