package com.sntzrr.controller;

import com.sntzrr.model.Client;
import com.sntzrr.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService service;

    @GetMapping
    public List<Client> clients() {
        return service.clients();
    }
    @PostMapping
    public int save(@RequestBody Client client){
        return service.save(client);
    }
    @GetMapping("/login")
    public Client client(@RequestParam("email") String email, @RequestParam("password") String password){return this.service.client(email, password);}
}
