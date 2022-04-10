package com.cit.barsfx.springboot_fx.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

//Сущность аннотация Entity указывает что это в базе данных
@Entity
public class Contracts{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column
    @NonNull
    private int numberContracts;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateInsert;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateLastModifided;

    public Contracts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberContracts() {
        return numberContracts;
    }

    public void setNumberContracts(int numberContracts) {
        this.numberContracts = numberContracts;
    }

    public Date getDateInsert() {
        return dateInsert;
    }

    public void setDateInsert(Date dateInsert) {
        this.dateInsert = dateInsert;
    }

    public Date getDateLastModifided() {
        return dateLastModifided;
    }

    public void setDateLastModifided(Date dateLastModifided) {
        this.dateLastModifided = dateLastModifided;
    }
}
