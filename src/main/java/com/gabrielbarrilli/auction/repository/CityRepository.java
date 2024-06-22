package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.City;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
