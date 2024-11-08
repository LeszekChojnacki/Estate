package com.estate.estate;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/estate")
@AllArgsConstructor
public class EstateController {

    private EstateService estateService;
    @GetMapping("/all-estates")
    public ResponseEntity<List<Estate>> getAllEstates() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.estateService.getAll());
    }
    @GetMapping("/estate-by-id/{id}")
    public ResponseEntity<Estate> getEstateById(@PathVariable("id") long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.estateService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Estate> createEstate(@RequestBody Estate estate) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.estateService.create(estate));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Estate> deleteEstateById(@PathVariable("id") long id) {
        this.estateService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
