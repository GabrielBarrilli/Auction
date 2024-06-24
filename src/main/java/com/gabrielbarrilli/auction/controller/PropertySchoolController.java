package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.PropertySchool;
import com.gabrielbarrilli.auction.service.PropertySchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/property-schools")
public class PropertySchoolController {

    private final PropertySchoolService propertySchoolService;

    public PropertySchoolController(PropertySchoolService propertySchoolService) {
        this.propertySchoolService = propertySchoolService;
    }

    @PostMapping
    public ResponseEntity<PropertySchool> createPropertySchool(@RequestBody PropertySchool propertySchool) {
        PropertySchool createdPropertySchool = propertySchoolService.createPropertySchool(propertySchool);
        return new ResponseEntity<>(createdPropertySchool, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropertySchool> getPropertySchoolById(@PathVariable Long id) {
        PropertySchool propertySchool = propertySchoolService.getPropertySchoolById(id);
        return new ResponseEntity<>(propertySchool, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PropertySchool> updatePropertySchool(@PathVariable Long id, @RequestBody PropertySchool propertySchool) {
        propertySchool.setId(id);
        PropertySchool updatedPropertySchool = propertySchoolService.updatePropertySchool(propertySchool);
        return new ResponseEntity<>(updatedPropertySchool, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePropertySchool(@PathVariable Long id) {
        propertySchoolService.deletePropertySchool(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
