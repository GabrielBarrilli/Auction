package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.AuctionType;
import com.gabrielbarrilli.auction.service.AuctionTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auction-types")
public class AuctionTypeController {

    private final AuctionTypeService auctionTypeService;

    public AuctionTypeController(AuctionTypeService auctionTypeService) {
        this.auctionTypeService = auctionTypeService;
    }

    @PostMapping
    public ResponseEntity<AuctionType> createAuctionType(@RequestBody AuctionType auctionType) {
        AuctionType createdAuctionType = auctionTypeService.createAuctionType(auctionType);
        return new ResponseEntity<>(createdAuctionType, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuctionType> getAuctionTypeById(@PathVariable Long id) {
        AuctionType auctionType = auctionTypeService.getAuctionTypeById(id);
        return new ResponseEntity<>(auctionType, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuctionType> updateAuctionType(@PathVariable Long id, @RequestBody AuctionType auctionType) {
        auctionType.setId(id);
        AuctionType updatedAuctionType = auctionTypeService.updateAuctionType(auctionType);
        return new ResponseEntity<>(updatedAuctionType, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuctionType(@PathVariable Long id) {
        auctionTypeService.deleteAuctionType(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}