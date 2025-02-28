package com.FinalApiRestPrueba.FinalApiRestPrueba.Producto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor

public class ProductoController {

    private final ProductService productService;

    @PostMapping("create")
    public void createproduct(@RequestBody Producto producto) {
        productService.createProducto(producto);
    }

    @PutMapping("/{id}/modificarStock")
    public Producto modificarStock(@PathVariable Integer id, @RequestParam Integer nuevoStock) {
    return productService.actualizarStock(id, nuevoStock);
    }
    
}
