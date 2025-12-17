package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity,Long> {   
}


Service
LocationService



package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.LocationEntity;

public interface LocationService {
    LocationEntity createlocation(LocationEntity locationEntity);
    List<LocationEntity>getallLocation();

}
