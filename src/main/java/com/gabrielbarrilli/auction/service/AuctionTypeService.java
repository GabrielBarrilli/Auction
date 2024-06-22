package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.AuctionType;
import com.gabrielbarrilli.auction.repository.AuctionTypeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuctionTypeService {

    private final AuctionTypeRepository auctionTypeRepository;

    public AuctionTypeService(AuctionTypeRepository auctionTypeRepository) {
        this.auctionTypeRepository = auctionTypeRepository;
    }

    public AuctionType createAuctionType(AuctionType auctionType) {
        return auctionTypeRepository.save(auctionType);
    }

    public AuctionType getAuctionTypeById(Long id) {
        return auctionTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Auction type not found"));
    }

    public AuctionType updateAuctionType(AuctionType auctionType) {
        return auctionTypeRepository.save(auctionType);
    }

    public void deleteAuctionType(Long id) {
        auctionTypeRepository.deleteById(id);
    }
}

