package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.AuctionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionTypeRepository extends JpaRepository<AuctionType, Long> {
}
