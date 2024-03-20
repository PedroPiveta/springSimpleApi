package com.pedrotech.apiRest.interfaces;

import com.pedrotech.apiRest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
