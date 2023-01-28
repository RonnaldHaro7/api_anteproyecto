package uic.api_anteproyecto.anteproyecto;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AnteproyectoRepository extends JpaRepository<Anteproyecto, Long> {
 public List<Anteproyecto> findAll();

}