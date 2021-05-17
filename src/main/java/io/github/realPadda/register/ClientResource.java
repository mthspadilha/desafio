package io.github.realPadda.register;

import io.github.realPadda.register.model.City;
import io.github.realPadda.register.model.Client;
import io.github.realPadda.register.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientResource {
    private final ClientService clientService;

    @Autowired
    public ClientResource(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients(){

        List<Client> clients = clientService.findAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Client> addCity(@RequestBody Client client){
        Client newClient = clientService.addClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

}
