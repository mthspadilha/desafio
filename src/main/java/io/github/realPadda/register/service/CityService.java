package io.github.realPadda.register.service;

import io.github.realPadda.register.model.City;
import io.github.realPadda.register.repo.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private CityRepo cityRepo;

    @Autowired
    public CityService(CityRepo cityRepo){
        this.cityRepo = cityRepo;
    }
    public City addCity(City city){

        return cityRepo.save(city);
    }
    public List<City> findAllCities(){

        return cityRepo.findAll();
    }
}