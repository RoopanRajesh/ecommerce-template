package com.squareshift.ecommerce.controller;

import com.squareshift.ecommerce.dto.WarehouseResponseDto;
import com.squareshift.ecommerce.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WareHouseController {

    @Autowired
    WareHouseService wareHouseService;

    @GetMapping(value = "/v1/warehouse/{postalCode}")
    public WarehouseResponseDto getWarehouseDistance(@PathVariable Long postalCode) throws Exception{
        return wareHouseService.getWareHouseDistanceByPostalCode(postalCode);
    }

}
