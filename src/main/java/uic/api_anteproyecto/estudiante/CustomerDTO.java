package uic.api_anteproyecto.estudiante;

import java.time.LocalDate;
import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String nro_identificacion;
    private LocalDate date_of_bird;
    private String email;
    private String cellphone;
    private String career;
}