package uic.api_anteproyecto.anteproyecto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Anteproyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String fecha;
 private String linea_investigacion;
 private String tema;
 private String problema;
 private String objetivo_general;
 private String objetivo_especifico;
 private String justificacion;
 private String alcance;
 private String teorico;
 private String metodologico;
 private String metodologia;
 private String bibliografia;
 private String presupuesto;
}