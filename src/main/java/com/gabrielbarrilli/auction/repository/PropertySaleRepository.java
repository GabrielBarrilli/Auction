package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.PropertySale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertySaleRepository extends JpaRepository<PropertySale, Long> {
}
