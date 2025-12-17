package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.LocationEntity;

public interface LocationService {
    LocationEntity createlocation(LocationEntity locationEntity);
    List<LocationEntity>getallLocation();

}