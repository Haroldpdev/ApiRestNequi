package com.FinalApiRestPrueba.FinalApiRestPrueba.Franquicia;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.FinalApiRestPrueba.FinalApiRestPrueba.Producto.Producto;
import com.FinalApiRestPrueba.FinalApiRestPrueba.Sucursal.Sucursal;

@Service
@RequiredArgsConstructor
public class FranquiciaService {

    private final FranquiciaRepository franquiciaRepository;

    public Franquicia crearFranquicia(Franquicia franquicia) {
        return franquiciaRepository.save(franquicia);
    }
    
    public Franquicia agregarSucursal(Integer franquiciaId, Sucursal sucursal) {
        Franquicia franquicia = franquiciaRepository.findById(franquiciaId)
                .orElseThrow(() -> new RuntimeException("Franquicia no encontrada"));
        franquicia.getSucursales().add(sucursal);
        return franquiciaRepository.save(franquicia);
    }
    
    public Producto obtenerProductoConMasStock(Integer franquiciaId) {
        Franquicia franquicia = franquiciaRepository.findById(franquiciaId)
                .orElseThrow(() -> new RuntimeException("Franquicia no encontrada"));
        
        return franquicia.getSucursales().stream()
                .flatMap(sucursal -> sucursal.getProductos().stream())
                .max((p1, p2) -> p1.getStock().compareTo(p2.getStock()))
                .orElseThrow(() -> new RuntimeException("No hay productos en esta franquicia"));
    }
    
    public Franquicia actualizarNombreFranquicia(Integer id, String nuevoNombre) {
        Franquicia franquicia = franquiciaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Franquicia no encontrada"));
        franquicia.setNombre(nuevoNombre);
        return franquiciaRepository.save(franquicia);
    }
}