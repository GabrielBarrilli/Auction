package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.Condado;
import com.gabrielbarrilli.auction.service.CondadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/condados")
public class CondadoController {

    private final CondadoService condadoService;

    public CondadoController(CondadoService condadoService) {
        this.condadoService = condadoService;
    }

    @PostMapping
    public ResponseEntity<Condado> createCondado(@RequestBody Condado condado) {
        Condado createdCondado = condadoService.createCondado(condado);
        return new ResponseEntity<>(createdCondado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Condado> getCondadoById(@PathVariable Long id) {
        Condado condado = condadoService.getCondadoById(id);
        return new ResponseEntity<>(condado, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Condado> updateCondado(@PathVariable Long id, @RequestBody Condado condado) {
        condado.setId(id);
        Condado updatedCondado = condadoService.updateCondado(condado);
        return new ResponseEntity<>(updatedCondado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCondado(@PathVariable Long id) {
        condadoService.deleteCondado(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


