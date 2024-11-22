package com.books.booksuniverse.repository;

import com.books.booksuniverse.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}
