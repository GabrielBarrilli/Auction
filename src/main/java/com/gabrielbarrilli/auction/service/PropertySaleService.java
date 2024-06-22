package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.PropertySale;
import com.gabrielbarrilli.auction.repository.PropertySaleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PropertySaleService {

    private final PropertySaleRepository propertySaleRepository;

    public PropertySaleService(PropertySaleRepository propertySaleRepository) {
        this.propertySaleRepository = propertySaleRepository;
    }

    public PropertySale createPropertySale(PropertySale propertySale) {
        return propertySaleRepository.save(propertySale);
    }

    public PropertySale getPropertySaleById(Long id) {
        return propertySaleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("PropertySale not found"));
    }

    public PropertySale updatePropertySale(PropertySale propertySale) {
        return propertySaleRepository.save(propertySale);
    }

    public void deletePropertySale(Long id) {
        propertySaleRepository.deleteById(id);
    }
}
