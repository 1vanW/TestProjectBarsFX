package com.cit.barsfx.springboot_fx.controller;

import com.cit.barsfx.springboot_fx.entity.Contracts;



import com.cit.barsfx.springboot_fx.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//Пишем аннотации и указываем урл на который будет ввести ответ пользователю
@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private ContractService contractService;

    @GetMapping("contracts")
    public List<Contracts> showListContracts(){
        List<Contracts> allContracts =contractService.getAllContracts();
        return allContracts;
    }

    @GetMapping("contracts/{id}")
    public Contracts getContracts(@PathVariable int id){
        Contracts contracts =contractService.getContracts(id);

        return contracts;
    }



    @PostMapping("contracts")
    public Contracts addNewContracts(@RequestBody Contracts contracts){
        contractService.saveContracts(contracts);
        return contracts;
    }

    @PutMapping("contracts")
    public Contracts updateContracts(@RequestBody Contracts contracts){
        contractService.saveContracts(contracts);
        return contracts;
    }

    @DeleteMapping("/contracts/{id}")
    public String deleteContracts(@PathVariable int id){

        Contracts contracts = contractService.getContracts(id);
        contractService.deleteContracts(id);

        return "Contracts = " + id + " was deleted";
    }






}
