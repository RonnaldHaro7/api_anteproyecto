package uic.api_anteproyecto.anteproyecto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnteproyectoService {
 @Autowired AnteproyectoRepository anteproyectoRepository;
 public Anteproyecto save(Anteproyecto entity){
 return anteproyectoRepository.save(entity);
 }
 public Anteproyecto findById( Long id){
 return anteproyectoRepository.findById(id).orElse(new Anteproyecto());
 }
 public void deleteById(Long id){
    anteproyectoRepository.deleteById(id);
 }
 public List<Anteproyecto> findAll(){
 return anteproyectoRepository.findAll();
 }
}