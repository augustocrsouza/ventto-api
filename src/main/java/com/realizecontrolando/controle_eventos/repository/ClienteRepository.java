package com.realizecontrolando.controle_eventos.repository;

import com.realizecontrolando.controle_eventos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}