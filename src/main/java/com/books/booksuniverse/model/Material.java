package com.books.booksuniverse.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主キーを自動生成
    private Long id; // 主キーとなるフィールド

    private String name; // その他のフィールド
    private String description;

    // GetterとSetter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
