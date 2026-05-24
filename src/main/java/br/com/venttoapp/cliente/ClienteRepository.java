package br.com.venttoapp.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // O Spring Boot entende automaticamente que vai buscar pela coluna "documento"
    Optional<Cliente> findByDocumento(String documento);
}