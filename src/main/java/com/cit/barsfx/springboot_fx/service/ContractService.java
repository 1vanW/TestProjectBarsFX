package com.cit.barsfx.springboot_fx.service;

import com.cit.barsfx.springboot_fx.entity.Contracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ContractService {

    public List<Contracts> getAllContracts();

    public void saveContracts(Contracts contracts);

    public Contracts getContracts(int id);

    public void deleteContracts(int id);


}
