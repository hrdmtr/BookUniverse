package com.books.booksuniverse.service;

import com.books.booksuniverse.model.Material;
import com.books.booksuniverse.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    // Method to add a new material
    public void addMaterial(Material material) {
        materialRepository.save(material);
    }

    // Method to get all materials
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    // Method to find a material by ID
    public Material findMaterialById(Long id) {
        return materialRepository.findById(id).orElse(null);
    }
}
