package com.realizecontrolando.controle_eventos.repository;

import com.realizecontrolando.controle_eventos.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}