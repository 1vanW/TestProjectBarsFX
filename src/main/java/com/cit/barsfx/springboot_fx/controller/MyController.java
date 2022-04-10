package com.cit.barsfx.springboot_fx.controller;

import com.cit.barsfx.springboot_fx.entity.Contracts;

import com.cit.barsfx.springboot_fx.repository.ContractsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

//Пишем аннотации и указываем урл на который будет ввести ответ пользователю
@RestController
@RequestMapping("/contracts")
public class MyController {
    @Autowired
    private ContractsRepository contractsRepo;

//    public MyController(ContractsRepository contractsRepo) {
//        this.contractsRepo = contractsRepo;
//    }
    //Первым делом создаем контроллер логика с пользователем

    @GetMapping("")
    public ResponseEntity getContracts(){

        return ResponseEntity.ok("Сервер работает");

    }
    @PostMapping()
    public ResponseEntity registration(@RequestBody Contracts contract){

        if(contractsRepo.findByNumberContracts(contract.getNumberContracts()) != null){
            return ResponseEntity.badRequest().body("Произошла ошибка и договор с таким именем уже существует");
        }
        contractsRepo.save(contract);
        return ResponseEntity.ok("Договор сохранен");

    }




}
