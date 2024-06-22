package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
