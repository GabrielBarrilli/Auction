package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.CityState;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CityStateRepository extends JpaRepository<CityState, Long> {
}