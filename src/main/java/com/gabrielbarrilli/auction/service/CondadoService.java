package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.Condado;
import com.gabrielbarrilli.auction.repository.CondadoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondadoService {

    private final CondadoRepository condadoRepository;

    public CondadoService(CondadoRepository condadoRepository) {
        this.condadoRepository = condadoRepository;
    }

    public Condado createCondado(Condado condado) {
        return condadoRepository.save(condado);
    }

    public Condado getCondadoById(Long id) {
        return condadoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Condado not found"));
    }

    public Condado updateCondado(Condado condado) {
        return condadoRepository.save(condado);
    }

    public void deleteCondado(Long id) {
        condadoRepository.deleteById(id);
    }
}

