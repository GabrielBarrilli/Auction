package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.Zip;
import com.gabrielbarrilli.auction.repository.ZipRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ZipService {

    private final ZipRepository zipRepository;

    public ZipService(ZipRepository zipRepository) {
        this.zipRepository = zipRepository;
    }

    public Zip createZip(Zip zip) {
        return zipRepository.save(zip);
    }

    public Zip getZipById(Long id) {
        return zipRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Zip not found"));
    }

    public Zip updateZip(Zip zip) {
        return zipRepository.save(zip);
    }

    public void deleteZip(Long id) {
        zipRepository.deleteById(id);
    }
}
