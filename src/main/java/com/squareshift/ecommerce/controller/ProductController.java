package com.squareshift.ecommerce.controller;

import com.squareshift.ecommerce.dto.ProductDto;
import com.squareshift.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/product/")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "{id}")
    public ProductDto getProductById(@PathVariable Long id) throws Exception{
        return productService.getProductById(id);
    }
}
