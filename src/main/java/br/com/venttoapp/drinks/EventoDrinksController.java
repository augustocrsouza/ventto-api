package br.com.venttoapp.drinks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/eventos/drinks")
public class EventoDrinksController {

    // 1. Injetamos o nosso "cérebro" das regras de negócio
    @Autowired
    private EventoDrinksService eventoDrinksService;

    // 2. Mantemos o repository apenas para buscas simples (o GET)
    @Autowired
    private EventoDrinksRepository eventoDrinksRepository;

    @PostMapping
    public EventoDrinks criarEventoDrinks(@RequestBody EventoDrinks eventoDrinks) {
        // O Controller agora joga a bola para o Service processar a matemática antes de salvar
        return eventoDrinksService.processarE_SalvarContrato(eventoDrinks);
    }

    @GetMapping
    public List<EventoDrinks> listarEventosDrinks() {
        return eventoDrinksRepository.findAll();
    }
}