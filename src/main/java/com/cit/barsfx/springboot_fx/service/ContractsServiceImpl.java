package com.cit.barsfx.springboot_fx.service;

import com.cit.barsfx.springboot_fx.dao.ContractsDao;
import com.cit.barsfx.springboot_fx.dao.ContractsDaoImpl;
import com.cit.barsfx.springboot_fx.entity.Contracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class ContractsServiceImpl implements ContractService {

    @Autowired
    ContractsDao contractsDao;

    @Override
    @Transactional
    public List<Contracts> getAllContracts() {

        return contractsDao.getAllContracts();
    }

    @Override
    @Transactional
    public void saveContracts(Contracts contracts) {
        contractsDao.saveContracts(contracts);
    }

    @Override
    @Transactional
    public Contracts getContracts(int id) {

        return contractsDao.getContracts(id);
    }

    @Override
    @Transactional
    public void deleteContracts(int id) {

        contractsDao.deleteContracts(id);
    }
}
