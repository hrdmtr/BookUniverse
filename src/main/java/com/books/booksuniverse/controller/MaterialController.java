package com.books.booksuniverse.controller;

import com.books.booksuniverse.model.Material;
import com.books.booksuniverse.service.MaterialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materials")
public class MaterialController {

    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }





        
    // Endpoint to register a new material
    @PostMapping("/register")
    public String registerMaterial(@RequestBody String material) {
        // Logic to register material goes here
        return "Material registered successfully!";
    }

    // Endpoint to get all materials
    @GetMapping
    public List<Material> getAllMaterials() {
        return materialService.getAllMaterials();
    }
}
