package io.github.realPadda.register;

import io.github.realPadda.register.model.Adress;
import io.github.realPadda.register.model.City;
import io.github.realPadda.register.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adress")
public class AdressResource {
    private final AdressService adressService;

    @Autowired
    public AdressResource(AdressService adressService) {
        this.adressService = adressService;
    }
    @GetMapping
    public ResponseEntity<List<Adress>> getAllAdress(){

        List<Adress> adresses = adressService.findAllAdress();
        return new ResponseEntity<>(adresses, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Adress> addAdress(@RequestBody Adress adress){
        Adress newAdress = adressService.addAdress(adress);
        return new ResponseEntity<>(newAdress, HttpStatus.CREATED);
    }

}
