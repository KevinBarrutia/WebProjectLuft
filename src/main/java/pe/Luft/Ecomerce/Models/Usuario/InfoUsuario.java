package pe.Luft.Ecomerce.Models.Usuario;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "infousuarios")
public class InfoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long infoUsuarioId;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;
    private String celular;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;

    @OneToOne(mappedBy = "infoUsuario")
    @JsonBackReference
    private Usuario usuario;

}
