package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.Zip;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ZipRepository extends JpaRepository<Zip, Long> {
}