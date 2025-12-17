package com.example.demo.service;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repositry.LocationRepository;

public class LocationServiceImpl implements LocationService {
    @Autowired 
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return Locationrepo.save(le);
    }
    @Override
    public List<LocationEntity> getallLocation() {
        return Locationrepo.findAll();
    }

}