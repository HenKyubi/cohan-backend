package com.HenKyubi666.cohantest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.HenKyubi666.cohantest.dao.PersonDao;
import com.HenKyubi666.cohantest.models.Person;

@RestController
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public boolean login(@RequestBody Person person){
        return personDao.verifyPerson(person);
    }

}