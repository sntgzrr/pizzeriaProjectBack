package com.sntzrr.service;

import com.sntzrr.mapper.ClientMapper;
import com.sntzrr.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final ClientMapper mapper;

    @Override
    public List<Client> clients() {
        return mapper.clients();
    }
    @Override
    public int save(Client client) {
        return mapper.save(client);
    }
    @Override
    public Client client(String email, String password) {
        return mapper.client(email, password);
    }
}
