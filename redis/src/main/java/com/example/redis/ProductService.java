package com.example.redis;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product getById(Long id){
        return productRepository.getById(id);
    }


    public Product updateById(Long id, ProductDto productDto) throws NotFoundException {
        Product product = productRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("not found")
        );
        product.setName(productDto.getName());
        product.setCode(productDto.getCode());
        product.setSellPrice(productDto.getSellPrice());
        return productRepository.save(product);
    }

    public  Product create(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setCode(productDto.getCode());
        product.setSellPrice(productDto.getSellPrice());
        return productRepository.save(product);
    }


}
