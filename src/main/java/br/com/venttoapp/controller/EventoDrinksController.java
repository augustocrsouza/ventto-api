package br.com.venttoapp.controller;

import br.com.venttoapp.model.EventoDrinks;
import br.com.venttoapp.repository.EventoDrinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos/drinks") // Rota específica que o seu app vai chamar
public class EventoDrinksController {

    @Autowired
    private EventoDrinksRepository eventoDrinksRepository;

    @PostMapping
    public EventoDrinks criarEventoDrinks(@RequestBody EventoDrinks eventoDrinks) {
        return eventoDrinksRepository.save(eventoDrinks);
    }

    @GetMapping
    public List<EventoDrinks> listarEventosDrinks() {
        return eventoDrinksRepository.findAll();
    }
}