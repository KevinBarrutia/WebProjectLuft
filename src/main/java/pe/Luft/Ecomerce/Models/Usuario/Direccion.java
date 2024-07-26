package pe.Luft.Ecomerce.Models.Usuario;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long direccionId;
    private String calle;
    private String departamento;
    private String provincia;
    private String urbanizacion;
    private String referencia;

    @OneToOne(mappedBy = "direccion")
    @JsonBackReference
    private InfoUsuario infoUsuario;





}
