package com.wohr.inventoryservice.controller;

import com.wohr.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public String isInStock(@PathVariable("sku-code") String skuCode) {
        inventoryService.isInStock(skuCode);
        return "Order Placed Successfully";
    }
}
