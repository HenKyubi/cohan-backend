package com.HenKyubi666.cohantest.dao;

import com.HenKyubi666.cohantest.models.Person;

import java.util.List;

public interface PersonDao {
	
	void createPerson(Person person);
	List<Person> getPersons();
	Person getPerson(int id);
	void updatePerson(int id, Person person);
	void deletePerson(int id);
	
}
