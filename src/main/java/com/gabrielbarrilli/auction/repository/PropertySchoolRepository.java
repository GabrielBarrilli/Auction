package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.PropertySchool;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PropertySchoolRepository extends JpaRepository<PropertySchool, Long> {
}
