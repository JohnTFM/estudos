package joao.jpaLearn.records;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import joao.jpaLearn.entity.Produto;

import java.util.List;

public record ClienteDados(

        Long id,
        String nome,
        String descricaoCliente,
         List<Produto> produtos
) {
}
