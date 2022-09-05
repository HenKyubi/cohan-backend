package com.HenKyubi666.cohantest.dao;

import com.HenKyubi666.cohantest.models.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PersonDaoImp implements PersonDao{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void createPerson(Person person) {
		entityManager.merge(person);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getPersons() {
		String query = "FROM Person";
		return (List<Person>) entityManager.createQuery(query).getResultList();
	}

	@Override
	public Person getPerson(int id) {
		return (Person)  entityManager.find(Person.class, id);
	}



	@Override
	public void updatePerson(int id, Person person) {
		//String query = "FROM Person WHERE person_id = {id}";
		//Person person = entityManager.find(Person.class, id);
		//return entityManager.merge(person);
	}

	@Override
	public void deletePerson(int id) {
		Person person = entityManager.find(Person.class, id);
		entityManager.remove(person);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean verifyPerson(Person person) {
		String query = "FROM Person WHERE person_email_address = :email AND person_phone_number = :phone";
		List<Person> list = entityManager.createQuery(query).setParameter("email", person.getEmailAddress())
			.setParameter("phone", person.getPhoneNumber())
		.getResultList();

		return !list.isEmpty();
	}

}
