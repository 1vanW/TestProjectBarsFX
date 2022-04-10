package com.cit.barsfx.springboot_fx.repository;

import com.cit.barsfx.springboot_fx.entity.Contracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ContractsRepository extends CrudRepository<Contracts, Integer> {
       Contracts findByNumberContracts(int number);


}
