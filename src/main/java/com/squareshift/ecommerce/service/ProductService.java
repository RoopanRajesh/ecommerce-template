package com.squareshift.ecommerce.service;

import com.squareshift.ecommerce.dto.ProductDto;

public interface ProductService {

    ProductDto getProductById(Long id) throws Exception;
}
