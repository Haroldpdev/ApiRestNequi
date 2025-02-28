package com.FinalApiRestPrueba.FinalApiRestPrueba.Producto;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductoRepository productoRepository;

    public void createProducto(Producto producto){
        productoRepository.save(producto);
    }
    
    public Producto actualizarStock(Integer productoId, Integer nuevoStock) {
        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        producto.setStock(nuevoStock);
        return productoRepository.save(producto);
    }
}
