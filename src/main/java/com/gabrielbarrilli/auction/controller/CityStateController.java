package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.CityState;
import com.gabrielbarrilli.auction.service.CityStateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city-states")
public class CityStateController {

    private final CityStateService cityStateService;

    public CityStateController(CityStateService cityStateService) {
        this.cityStateService = cityStateService;
    }

    @PostMapping
    public ResponseEntity<CityState> createCityState(@RequestBody CityState cityState) {
        CityState createdCityState = cityStateService.createCityState(cityState);
        return new ResponseEntity<>(createdCityState, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityState> getCityStateById(@PathVariable Long id) {
        CityState cityState = cityStateService.getCityStateById(id);
        return new ResponseEntity<>(cityState, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CityState> updateCityState(@PathVariable Long id, @RequestBody CityState cityState) {
        cityState.setId(id);
        CityState updatedCityState = cityStateService.updateCityState(cityState);
        return new ResponseEntity<>(updatedCityState, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCityState(@PathVariable Long id) {
        cityStateService.deleteCityState(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
