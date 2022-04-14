package com.cit.barsfx.springboot_fx.dao;

import com.cit.barsfx.springboot_fx.entity.Contracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ContractsDaoImpl implements ContractsDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Contracts> getAllContracts() {

        Query query =entityManager.createQuery("from Contracts");

        List<Contracts> allContracts = query.getResultList();
        return allContracts;
    }

    @Override
    public void saveContracts(Contracts contracts) {

        Contracts contracts1 =entityManager.merge(contracts);
         contracts.setId(contracts1.getId());

    }

    @Override
    public Contracts getContracts(int id) {
        Contracts contracts= entityManager.find(Contracts.class,id);
        return contracts;
    }

    @Override
    public void deleteContracts(int id) {

        Query query =entityManager.createQuery("delete from Contracts " + "where id=: contractsId");

        query.setParameter("contractsId",id);
        query.executeUpdate();

    }
}
