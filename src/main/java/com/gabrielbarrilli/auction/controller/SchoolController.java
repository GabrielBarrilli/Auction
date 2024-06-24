package com.gabrielbarrilli.auction.controller;

import com.gabrielbarrilli.auction.model.School;
import com.gabrielbarrilli.auction.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping
    public ResponseEntity<School> createSchool(@RequestBody School school) {
        School createdSchool = schoolService.createSchool(school);
        return new ResponseEntity<>(createdSchool, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<School> getSchoolById(@PathVariable Long id) {
        School school = schoolService.getSchoolById(id);
        return new ResponseEntity<>(school, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<School> updateSchool(@PathVariable Long id, @RequestBody School school) {
        school.setId(id);
        School updatedSchool = schoolService.updateSchool(school);
        return new ResponseEntity<>(updatedSchool, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchool(@PathVariable Long id) {
        schoolService.deleteSchool(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
