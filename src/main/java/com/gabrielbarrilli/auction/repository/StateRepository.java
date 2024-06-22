package com.gabrielbarrilli.auction.repository;

import com.gabrielbarrilli.auction.model.State;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}