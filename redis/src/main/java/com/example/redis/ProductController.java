package com.example.redis;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/products/{id}")
    public Product getAll(@PathVariable Long id){
        return productService.getById(id);
    }

    @PutMapping("/products/{id}")
    public Product update(@PathVariable Long id, @RequestBody ProductDto product) throws NotFoundException {
        return productService.updateById(id, product);
    }

    @PostMapping()
    public Product create(@RequestBody ProductDto productDto){
        return productService.create(productDto);
    }



}
