package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.CityState;
import com.gabrielbarrilli.auction.repository.CityStateRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityStateService {

    private final CityStateRepository cityStateRepository;

    public CityStateService(CityStateRepository cityStateRepository) {
        this.cityStateRepository = cityStateRepository;
    }

    public CityState createCityState(CityState cityState) {
        return cityStateRepository.save(cityState);
    }

    public CityState getCityStateById(Long id) {
        return cityStateRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("City State not found"));
    }

    public CityState updateCityState(CityState cityState) {
        return cityStateRepository.save(cityState);
    }

    public void deleteCityState(Long id) {
        cityStateRepository.deleteById(id);
    }
}