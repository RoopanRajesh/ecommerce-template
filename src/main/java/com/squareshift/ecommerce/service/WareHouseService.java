package com.squareshift.ecommerce.service;

import com.squareshift.ecommerce.dto.WarehouseResponseDto;

public interface WareHouseService {

    WarehouseResponseDto getWareHouseDistanceByPostalCode(Long postalCode) throws Exception;
}
