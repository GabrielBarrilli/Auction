package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.PropertyType;
import com.gabrielbarrilli.auction.repository.PropertyTypeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PropertyTypeService {

    private final PropertyTypeRepository propertyTypeRepository;

    public PropertyTypeService(PropertyTypeRepository propertyTypeRepository) {
        this.propertyTypeRepository = propertyTypeRepository;
    }

    public PropertyType createPropertyType(PropertyType propertyType) {
        return propertyTypeRepository.save(propertyType);
    }

    public PropertyType getPropertyTypeById(Long id) {
        return propertyTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("PropertyType not found"));
    }

    public PropertyType updatePropertyType(PropertyType propertyType) {
        return propertyTypeRepository.save(propertyType);
    }

    public void deletePropertyType(Long id) {
        propertyTypeRepository.deleteById(id);
    }
}
