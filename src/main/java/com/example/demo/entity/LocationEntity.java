package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LocationEntity {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double latitudue;
    private double longitude;
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
    public Double getLatitudue() {
        return latitudue;
    }
    public void setLatitudue(Double latitudue) {
        this.latitudue = latitudue;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public LocationEntity() {
    }
    public LocationEntity(Long id, String name, Double latitudue, double longitude) {
        this.id = id;
        this.name = name;
        this.latitudue = latitudue;
        this.longitude = longitude;
    }
}
