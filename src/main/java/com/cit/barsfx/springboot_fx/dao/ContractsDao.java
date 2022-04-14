package com.cit.barsfx.springboot_fx.dao;

import com.cit.barsfx.springboot_fx.entity.Contracts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractsDao {

    public List<Contracts> getAllContracts();

    public void saveContracts(Contracts contracts);

    public Contracts getContracts(int id);

    public void deleteContracts(int id);



}
