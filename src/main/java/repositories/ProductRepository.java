package repositories;
import entities.Prodotto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Prodotto, Long> {

    List<Prodotto> findById(List<Long> perfumesIds);
    Page<Prodotto> findAll(Pageable pageable);

}