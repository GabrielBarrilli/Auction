package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.State;
import com.gabrielbarrilli.auction.service.StateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/states")
public class StateController {

    private final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @PostMapping
    public ResponseEntity<State> createState(@RequestBody State state) {
        State createdState = stateService.createState(state);
        return new ResponseEntity<>(createdState, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> getStateById(@PathVariable Long id) {
        State state = stateService.getStateById(id);
        return new ResponseEntity<>(state, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<State> updateState(@PathVariable Long id, @RequestBody State state) {
        state.setId(id);
        State updatedState = stateService.updateState(state);
        return new ResponseEntity<>(updatedState, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteState(@PathVariable Long id) {
        stateService.deleteState(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
