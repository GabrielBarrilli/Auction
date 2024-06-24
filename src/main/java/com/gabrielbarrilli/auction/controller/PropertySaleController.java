package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.PropertySale;
import com.gabrielbarrilli.auction.service.PropertySaleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/property-sales")
public class PropertySaleController {

    private final PropertySaleService propertySaleService;

    public PropertySaleController(PropertySaleService propertySaleService) {
        this.propertySaleService = propertySaleService;
    }

    @PostMapping
    public ResponseEntity<PropertySale> createPropertySale(@RequestBody PropertySale propertySale) {
        PropertySale createdPropertySale = propertySaleService.createPropertySale(propertySale);
        return new ResponseEntity<>(createdPropertySale, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropertySale> getPropertySaleById(@PathVariable Long id) {
        PropertySale propertySale = propertySaleService.getPropertySaleById(id);
        return new ResponseEntity<>(propertySale, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PropertySale> updatePropertySale(@PathVariable Long id, @RequestBody PropertySale propertySale) {
        propertySale.setId(id);
        PropertySale updatedPropertySale = propertySaleService.updatePropertySale(propertySale);
        return new ResponseEntity<>(updatedPropertySale, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePropertySale(@PathVariable Long id) {
        propertySaleService.deletePropertySale(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
