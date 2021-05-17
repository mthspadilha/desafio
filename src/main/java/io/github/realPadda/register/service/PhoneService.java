package io.github.realPadda.register.service;

import io.github.realPadda.register.model.City;
import io.github.realPadda.register.model.Phone;
import io.github.realPadda.register.repo.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {
    private PhoneRepo phoneRepo;

    @Autowired
    public PhoneService(PhoneRepo phoneRepo){
        this.phoneRepo = phoneRepo;
    }

    public Phone addPhone(Phone phone){
        return phoneRepo.save(phone);
    }

    public List<Phone> findAllPhone(){

        return phoneRepo.findAll();
    }
}