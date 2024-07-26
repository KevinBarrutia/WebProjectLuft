package pe.Luft.Ecomerce.Models.Carrito;

import com.fasterxml.jackson.annotation.JsonBackReference;
import pe.Luft.Ecomerce.Models.Producto.Producto;
import pe.Luft.Ecomerce.Models.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "carritos")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long carritoId;
    private Float precioTotal;

    @OneToOne (mappedBy = "carrito")
    @JsonBackReference
    private Usuario usuario;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Producto> productos;

}
