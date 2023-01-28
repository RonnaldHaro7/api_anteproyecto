package uic.api_anteproyecto.anteproyecto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/anteproyecto")
@CrossOrigin({"*"})
public class AnteproyectoController {
 @Autowired AnteproyectoService anteproyectoService;
 @GetMapping("/")
 public List<Anteproyecto> findAll(){
 return anteproyectoService.findAll();
 }
 @GetMapping("/{id}")
 public Anteproyecto findById(@PathVariable Long id){
 return anteproyectoService.findById(id);
 }
 @PostMapping("/")
 public Anteproyecto save(@RequestBody Anteproyecto entity){
 return anteproyectoService.save(entity);
 }
 @PutMapping("/")
 public Anteproyecto update(@RequestBody Anteproyecto entity){
 return anteproyectoService.save(entity);
 }
 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
    anteproyectoService.deleteById(id);
 }
}