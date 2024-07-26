package pe.Luft.Ecomerce.Models.Orden;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import pe.Luft.Ecomerce.Models.Producto.ECategoria;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "detalle_orden")
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long detalleOrdenId;
    private Integer cantidad;
    private Float precioProducto;
    private String nombreProducto;
    private String descripcionProducto;

    @Enumerated(EnumType.STRING)
    private ECategoria categoriaProducto;

    @ManyToOne
    @JoinColumn(name = "orden_id")
    @JsonBackReference
    private Orden orden;

}
