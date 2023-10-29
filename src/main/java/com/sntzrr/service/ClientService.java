package com.sntzrr.service;

import com.sntzrr.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> clients();
    int save(Client client);
    Client client(String email, String password);
}
