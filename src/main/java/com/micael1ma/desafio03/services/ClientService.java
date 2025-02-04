package com.micael1ma.desafio03.services;

import com.micael1ma.desafio03.dto.ClientDTO;
import com.micael1ma.desafio03.entities.Client;
import com.micael1ma.desafio03.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }
}
