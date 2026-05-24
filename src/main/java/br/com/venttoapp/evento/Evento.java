package br.com.venttoapp.evento;

import br.com.venttoapp.cliente.Cliente;
import br.com.venttoapp.fornecedor.Fornecedor; // <-- Importamos a sua nova classe aqui!
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

    // Saiu o "Long idFornecedor" solto, e entrou o relacionamento real:
    @ManyToOne
    @JoinColumn(name = "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    private LocalDate dataEvento;
    private String turnoHorario;
    private String localFesta;
    private BigDecimal valorTotalFinal;


    // --- GETTERS E SETTERS ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Novos Getter e Setter para o objeto Fornecedor
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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