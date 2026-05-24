package br.com.venttoapp.evento;

import br.com.venttoapp.cliente.Cliente;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "evento")
@Inheritance(strategy = InheritanceType.JOINED) // Ativa a estratégia de tabelas unidas
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idFornecedor;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    private LocalDate dataEvento;
    private String turnoHorario;
    private String localFesta;
    private BigDecimal valorTotalFinal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getTurnoHorario() {
        return turnoHorario;
    }

    public void setTurnoHorario(String turnoHorario) {
        this.turnoHorario = turnoHorario;
    }

    public String getLocalFesta() {
        return localFesta;
    }

    public void setLocalFesta(String localFesta) {
        this.localFesta = localFesta;
    }

    public BigDecimal getValorTotalFinal() {
        return valorTotalFinal;
    }

    public void setValorTotalFinal(BigDecimal valorTotalFinal) {
        this.valorTotalFinal = valorTotalFinal;
    }
}