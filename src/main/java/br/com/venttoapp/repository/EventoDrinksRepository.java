package br.com.venttoapp.repository;

import br.com.venttoapp.model.EventoDrinks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoDrinksRepository extends JpaRepository<EventoDrinks, Long> {
}