package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.PropertyType;
import com.gabrielbarrilli.auction.service.PropertyTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/property-types")
public class PropertyTypeController {

    private final PropertyTypeService propertyTypeService;

    public PropertyTypeController(PropertyTypeService propertyTypeService) {
        this.propertyTypeService = propertyTypeService;
    }

    @PostMapping
    public ResponseEntity<PropertyType> createPropertyType(@RequestBody PropertyType propertyType) {
        PropertyType createdPropertyType = propertyTypeService.createPropertyType(propertyType);
        return new ResponseEntity<>(createdPropertyType, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropertyType> getPropertyTypeById(@PathVariable Long id) {
        PropertyType propertyType = propertyTypeService.getPropertyTypeById(id);
        return new ResponseEntity<>(propertyType, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PropertyType> updatePropertyType(@PathVariable Long id, @RequestBody PropertyType propertyType) {
        propertyType.setId(id);
        PropertyType updatedPropertyType = propertyTypeService.updatePropertyType(propertyType);
        return new ResponseEntity<>(updatedPropertyType, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePropertyType(@PathVariable Long id) {
        propertyTypeService.deletePropertyType(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
