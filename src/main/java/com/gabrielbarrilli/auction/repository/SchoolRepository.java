package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}
