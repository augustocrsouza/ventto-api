package br.com.venttoapp.drinks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service // Esta anotação avisa ao Spring Boot que aqui mora a inteligência do sistema
public class EventoDrinksService {

    @Autowired
    private EventoDrinksRepository repository;

    public EventoDrinks processarE_SalvarContrato(EventoDrinks evento) {

        // 1. Proteção (Null Safety): Se o usuário esquecer de mandar algum valor no JSON, o sistema entende como ZERO em vez de travar e dar Erro 500.
        BigDecimal base = (evento.getValorBase() != null) ? evento.getValorBase() : BigDecimal.ZERO;
        BigDecimal adicionais = (evento.getValorAdicionais() != null) ? evento.getValorAdicionais() : BigDecimal.ZERO;
        BigDecimal desconto = (evento.getValorDesconto() != null) ? evento.getValorDesconto() : BigDecimal.ZERO;

        // 2. A Matemática: Valor Base + Adicionais - Descontos
        BigDecimal totalCalculado = base.add(adicionais).subtract(desconto);

        // 3. Injetamos o valor correto e automático no evento ANTES de salvar
        evento.setValorTotalFinal(totalCalculado);

        // 4. Mandamos o contrato finalizado para o banco de dados
        return repository.save(evento);
    }
}