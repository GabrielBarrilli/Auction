package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.PropertySchool;
import com.gabrielbarrilli.auction.repository.PropertySchoolRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PropertySchoolService {

    private final PropertySchoolRepository propertySchoolRepository;

    public PropertySchoolService(PropertySchoolRepository propertySchoolRepository) {
        this.propertySchoolRepository = propertySchoolRepository;
    }

    public PropertySchool createPropertySchool(PropertySchool propertySchool) {
        return propertySchoolRepository.save(propertySchool);
    }

    public PropertySchool getPropertySchoolById(Long id) {
        return propertySchoolRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("PropertySchool not found"));
    }

    public PropertySchool updatePropertySchool(PropertySchool propertySchool) {
        return propertySchoolRepository.save(propertySchool);
    }

    public void deletePropertySchool(Long id) {
        propertySchoolRepository.deleteById(id);
    }
}

