package com.estate.estate;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/estate")
@AllArgsConstructor
public class EstateController {

    private EstateService estateService;
    @GetMapping("/all-estates")
    public List<Estate> getAllEstates() {
        return this.estateService.getAll();
    }
    @GetMapping("/estate-by-id/{id}")
    public Estate getEstateById(@PathVariable("id") long id) {
        return this.estateService.getById(id);
    }
    @PostMapping
    public Estate createEstate(@RequestBody Estate estate) {
        return this.estateService.create(estate);
    }
    @DeleteMapping("/{id}")
    public void deleteEstateById(@PathVariable("id") long id) {
        this.estateService.deleteById(id);
    }
}
