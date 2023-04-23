package joao.jpaLearn.entity;

import jakarta.persistence.*;
import joao.jpaLearn.records.ClienteDados;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    public String nome;
    private String descricaoCliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;
    public Cliente(){};

    public Cliente(ClienteDados clienteDados) {
        this.nome = clienteDados.nome();
        descricaoCliente = clienteDados.descricaoCliente();
        produtos = clienteDados.produtos();
    }
}
