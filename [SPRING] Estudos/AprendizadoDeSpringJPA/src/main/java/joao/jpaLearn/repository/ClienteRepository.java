package joao.jpaLearn.repository;

import joao.jpaLearn.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query("select c from Cliente c where c.id = :id")
    public Cliente procurarPeloId(@Param("id") Long id);

}
