package com.squareshift.ecommerce.controller;

import com.squareshift.ecommerce.dto.CartEmptyActionDto;
import com.squareshift.ecommerce.dto.CartItemsDto;
import com.squareshift.ecommerce.dto.CartStatusMessageDto;
import com.squareshift.ecommerce.dto.ItemDto;
import com.squareshift.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cart/")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping(value = "item/add")
    public CartStatusMessageDto addItemToCart(@RequestBody ItemDto item) throws Exception{
        return cartService.addItemToCart(item);
    }

    @GetMapping(value = "item/get")
    public CartItemsDto getCartItems() throws Exception{
        return cartService.getCartItems();
    }

    @PostMapping(value = "items/empty")
    public CartStatusMessageDto emptyCart(@RequestBody CartEmptyActionDto action) {
        return cartService.emptyCart(action.getAction());
    }

    @GetMapping(value = "checkout-value/{postalCode}")
    public CartStatusMessageDto getTotalAmount(@PathVariable Long postalCode) throws Exception{
        return cartService.getTotalAmount(postalCode);
    }
}
