package io.github.realPadda.register.service;


import io.github.realPadda.register.model.Adress;
import io.github.realPadda.register.repo.AdressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService {
    private AdressRepo adressRepo;

    @Autowired
    public AdressService(AdressRepo adressRepo){
        this.adressRepo = adressRepo;
    }

    public Adress addAdress(Adress adress){
        return adressRepo.save(adress);
    }

    public List<Adress> findAllAdress(Adress adress){
        return adressRepo.findAll();

    }
}
