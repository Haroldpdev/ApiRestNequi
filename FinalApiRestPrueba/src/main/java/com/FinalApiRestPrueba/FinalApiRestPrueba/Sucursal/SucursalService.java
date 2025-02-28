package com.FinalApiRestPrueba.FinalApiRestPrueba.Sucursal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.FinalApiRestPrueba.FinalApiRestPrueba.Producto.Producto;

import jakarta.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class SucursalService {
    private final SucursalRepository sucursalRepository;
    
    public Sucursal crearSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }
    
    public Sucursal agregarProducto(Integer sucursalId, Producto producto) {
        Sucursal sucursal = sucursalRepository.findById(sucursalId)
                .orElseThrow(() -> new RuntimeException("Sucursal no encontrada"));
        sucursal.getProductos().add(producto);
        return sucursalRepository.save(sucursal);
    }
    @Transactional
    public Sucursal eliminarProductoDeSucursal(Integer sucursalId, Integer productoId) {
    Sucursal sucursal = sucursalRepository.findById(sucursalId)
            .orElseThrow(() -> new RuntimeException("Sucursal no encontrada"));
    sucursal.getProductos().removeIf(producto -> producto.getId().equals(productoId));
    return sucursalRepository.save(sucursal);
}

}