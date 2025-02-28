package com.FinalApiRestPrueba.FinalApiRestPrueba.Sucursal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import com.FinalApiRestPrueba.FinalApiRestPrueba.Producto.Producto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Basic
    private String nombre;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;
}
