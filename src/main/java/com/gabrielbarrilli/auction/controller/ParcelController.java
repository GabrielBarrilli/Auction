package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.Parcel;
import com.gabrielbarrilli.auction.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parcels")
public class ParcelController {

    private final ParcelService parcelService;

    public ParcelController(ParcelService parcelService) {
        this.parcelService = parcelService;
    }

    @PostMapping
    public ResponseEntity<Parcel> createParcel(@RequestBody Parcel parcel) {
        Parcel createdParcel = parcelService.createParcel(parcel);
        return new ResponseEntity<>(createdParcel, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parcel> getParcelById(@PathVariable Long id) {
        Parcel parcel = parcelService.getParcelById(id);
        return new ResponseEntity<>(parcel, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Parcel> updateParcel(@PathVariable Long id, @RequestBody Parcel parcel) {
        parcel.setId(id);
        Parcel updatedParcel = parcelService.updateParcel(parcel);
        return new ResponseEntity<>(updatedParcel, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParcel(@PathVariable Long id) {
        parcelService.deleteParcel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}