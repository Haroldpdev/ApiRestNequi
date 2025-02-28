package com.FinalApiRestPrueba.FinalApiRestPrueba.Sucursal;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.FinalApiRestPrueba.FinalApiRestPrueba.Producto.Producto;

@RestController
@RequestMapping("/sucursal")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SucursalController {

    private final SucursalService sucursalService;

    @PostMapping("/crear")
    public Sucursal crearSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.crearSucursal(sucursal);
    }
    
    @PostMapping("/{id}/agregarProducto")
    public Sucursal agregarProducto(@PathVariable Integer id, @RequestBody Producto producto) {
        return sucursalService.agregarProducto(id, producto);
    }
    @DeleteMapping("/{sucursalId}/eliminarProducto/{productoId}")
    public Sucursal eliminarProductoDeSucursal(@PathVariable Integer sucursalId, @PathVariable Integer productoId) {
    return sucursalService.eliminarProductoDeSucursal(sucursalId, productoId);
}


}