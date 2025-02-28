package com.FinalApiRestPrueba.FinalApiRestPrueba.Franquicia;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.FinalApiRestPrueba.FinalApiRestPrueba.Producto.Producto;
import com.FinalApiRestPrueba.FinalApiRestPrueba.Sucursal.Sucursal;

@RestController
@RequestMapping("/franquicia")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class FranquiciaController {

    private final FranquiciaService franquiciaService;

    @PostMapping("/crear")
    public Franquicia crearFranquicia(@RequestBody Franquicia franquicia) {
        return franquiciaService.crearFranquicia(franquicia);
    }
    
    @PostMapping("/{id}/agregarSucursal")
    public Franquicia agregarSucursal(@PathVariable Integer id, @RequestBody Sucursal sucursal) {
        return franquiciaService.agregarSucursal(id, sucursal);
    }
    
    @GetMapping("/{id}/producto-con-mas-stock")
    public Producto obtenerProductoConMasStock(@PathVariable Integer id) {
        return franquiciaService.obtenerProductoConMasStock(id);
    }
    
    @PutMapping("/{id}/actualizar-nombre")
    public Franquicia actualizarNombreFranquicia(@PathVariable Integer id, @RequestParam String nuevoNombre) {
        return franquiciaService.actualizarNombreFranquicia(id, nuevoNombre);
    }
}