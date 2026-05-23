package com.realizecontrolando.controle_eventos.controller;

import com.realizecontrolando.controle_eventos.model.Evento;
import com.realizecontrolando.controle_eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController // Diz ao Spring que esta classe é uma API REST
@RequestMapping("/eventos") // Define que todas as rotas dessa classe começam com /eventos
public class EventoController {

    @Autowired // Pede ao Spring para nos entregar uma instância pronta do repositório
    private EventoRepository eventoRepository;

    // Rota para SALVAR um evento (Criar)
    // URL para testar: POST http://localhost:8080/eventos
    @PostMapping
    public Evento criarEvento(@RequestBody Evento evento) {
        return eventoRepository.save(evento);
    }

    // Rota para LISTAR todos os eventos (Ler)
    // URL para testar: GET http://localhost:8080/eventos
    @GetMapping
    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }
}