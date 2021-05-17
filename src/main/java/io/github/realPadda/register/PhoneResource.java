package io.github.realPadda.register;

import io.github.realPadda.register.model.City;
import io.github.realPadda.register.model.Phone;
import io.github.realPadda.register.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneResource {

    private final PhoneService phoneService;

    @Autowired
    public PhoneResource(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping
    public ResponseEntity<List<Phone>> getAllPhones(){

        List<Phone> phones = phoneService.findAllPhone();
        return new ResponseEntity<>(phones, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Phone> addCity(@RequestBody Phone phone){
        Phone newPhone = phoneService.addPhone(phone);
        return new ResponseEntity<>(newPhone, HttpStatus.CREATED);
    }

}
