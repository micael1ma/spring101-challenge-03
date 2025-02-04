package com.micael1ma.desafio03.repositories;

import com.micael1ma.desafio03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
