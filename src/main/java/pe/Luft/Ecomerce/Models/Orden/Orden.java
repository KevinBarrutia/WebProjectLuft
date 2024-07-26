package pe.Luft.Ecomerce.Models.Orden;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import pe.Luft.Ecomerce.Models.Producto.EEstado;
import pe.Luft.Ecomerce.Models.Usuario.Usuario;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ordenId;
    private LocalDate fecha;
    private Float precioTotal;
    private String direccionEnvio;

    @Enumerated(EnumType.STRING)
    private EEstadoOrden estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "orden")
    private Set<DetalleOrden> detallesOrden;


}
