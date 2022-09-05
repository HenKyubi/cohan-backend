package com.HenKyubi666.cohantest.controllers;

import com.HenKyubi666.cohantest.dao.PersonDao;
import com.HenKyubi666.cohantest.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping(value = "api/person", method = RequestMethod.POST)
    public void createPerson(@RequestBody Person person){
        personDao.createPerson(person);
    }

    @RequestMapping(value = "api/person", method = RequestMethod.GET)
    public List<Person> getPersons(){
        return personDao.getPersons();
    }

    @RequestMapping(value = "api/person/{id}" , method = RequestMethod.GET)
    public Person getPerson(@PathVariable int id){
        return personDao.getPerson(id);
    }

    @RequestMapping(value = "api/person", method = RequestMethod.PATCH)
    public void updatePerson(@RequestBody int id, Person person){
        personDao.updatePerson(id, person);
    }

    @RequestMapping(value = "api/person/{id}" , method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable int id){
        personDao.deletePerson(id);
    }


}


