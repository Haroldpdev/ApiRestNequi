package com.FinalApiRestPrueba.FinalApiRestPrueba.Franquicia;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import com.FinalApiRestPrueba.FinalApiRestPrueba.Sucursal.Sucursal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Franquicia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Basic
    private String nombre;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sucursal> sucursales;
}
