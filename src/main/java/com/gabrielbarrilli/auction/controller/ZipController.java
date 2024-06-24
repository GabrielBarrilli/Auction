package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.Zip;
import com.gabrielbarrilli.auction.service.ZipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zips")
public class ZipController {

    private final ZipService zipService;

    public ZipController(ZipService zipService) {
        this.zipService = zipService;
    }

    @PostMapping
    public ResponseEntity<Zip> createZip(@RequestBody Zip zip) {
        Zip createdZip = zipService.createZip(zip);
        return new ResponseEntity<>(createdZip, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Zip> getZipById(@PathVariable Long id) {
        Zip zip = zipService.getZipById(id);
        return new ResponseEntity<>(zip, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Zip> updateZip(@PathVariable Long id, @RequestBody Zip zip) {
        zip.setId(id);
        Zip updatedZip = zipService.updateZip(zip);
        return new ResponseEntity<>(updatedZip, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteZip(@PathVariable Long id) {
        zipService.deleteZip(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
