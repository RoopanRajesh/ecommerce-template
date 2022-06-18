package com.squareshift.ecommerce.service;

import com.squareshift.ecommerce.dto.ProductDto;
import com.squareshift.ecommerce.dto.ProductResponseDto;
import com.squareshift.ecommerce.proxy.Proxy;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    Proxy proxy;

    public ProductDto getProductById(Long id) throws Exception{
        ProductResponseDto productById = proxy.getProductById(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productById.getProductDto(), productDto);
        return productDto;
    }
}
