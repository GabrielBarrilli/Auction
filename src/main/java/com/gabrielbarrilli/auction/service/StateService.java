package com.gabrielbarrilli.auction.service;

import com.gabrielbarrilli.auction.model.State;
import com.gabrielbarrilli.auction.repository.StateRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public State createState(State state) {
        return stateRepository.save(state);
    }

    public State getStateById(Long id) {
        return stateRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("State not found"));
    }

    public State updateState(State state) {
        return stateRepository.save(state);
    }

    public void deleteState(Long id) {
        stateRepository.deleteById(id);
    }
}
