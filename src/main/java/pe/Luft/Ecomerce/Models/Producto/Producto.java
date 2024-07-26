package pe.Luft.Ecomerce.Models.Producto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import pe.Luft.Ecomerce.Models.Carrito.Carrito;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productoId;
    private String nombre;
    private String descripcion;
    private Float precio;

    @Enumerated(EnumType.STRING)
    private EEstado estado;

    @Enumerated(EnumType.STRING)
    private ECategoria categoria;

    @ManyToOne
    @JoinColumn(name = "carrito_id")
    @JsonBackReference
    private Carrito carrito;







}
