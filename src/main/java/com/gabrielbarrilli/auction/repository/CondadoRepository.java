package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.Condado;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CondadoRepository extends JpaRepository<Condado, Long> {
}