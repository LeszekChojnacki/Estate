package com.estate.estate;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EstateService {

    private EstateRepository estateRepository;
    public Estate create(Estate estate) {
        return this.estateRepository.save(estate);
    }
    public List<Estate> getAll() {
        return this.estateRepository.findAll();
    }
    public Estate getById(long id) {
        return this.estateRepository.findById(id).get();
    }
    public void deleteById(long id) {
        this.estateRepository.deleteById(id);
    }
}
