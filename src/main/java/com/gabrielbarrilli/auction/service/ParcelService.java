package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.Parcel;
import com.gabrielbarrilli.auction.repository.ParcelRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ParcelService {

    private final ParcelRepository parcelRepository;

    public ParcelService(ParcelRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }

    public Parcel createParcel(Parcel parcel) {
        return parcelRepository.save(parcel);
    }

    public Parcel getParcelById(Long id) {
        return parcelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Parcel not found"));
    }

    public Parcel updateParcel(Parcel parcel) {
        return parcelRepository.save(parcel);
    }

    public void deleteParcel(Long id) {
        parcelRepository.deleteById(id);
    }
}