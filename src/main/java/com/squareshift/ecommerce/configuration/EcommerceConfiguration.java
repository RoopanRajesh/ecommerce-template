package com.squareshift.ecommerce.configuration;

import com.squareshift.ecommerce.dto.CartItemsDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EcommerceConfiguration {
    @Bean
    public CartItemsDto cartItem(){
        return new CartItemsDto();
    }
}
