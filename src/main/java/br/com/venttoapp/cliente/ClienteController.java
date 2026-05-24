package br.com.venttoapp.cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // O "envelope" que vai receber a ficha do front-end (note que usamos "documento")
    public record ClienteRequest(String nome, String documento, String telefone, String email) {}

    @PostMapping("/buscar-ou-cadastrar")
    public ResponseEntity<Cliente> buscarOuCadastrar(@RequestBody ClienteRequest request) {
        Cliente clienteProcessado = service.buscarOuCadastrar(
                request.nome(), request.documento(), request.telefone(), request.email()
        );
        return ResponseEntity.ok(clienteProcessado);
    }
}