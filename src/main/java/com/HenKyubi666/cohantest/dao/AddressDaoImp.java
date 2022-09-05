package com.HenKyubi666.cohantest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.HenKyubi666.cohantest.models.Address;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AddressDaoImp implements AddressDao{
	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAddresses() {
		String query = "FROM Address";
		return (List<Address>) entityManager.createQuery(query).getResultList();
	}

	@Override
	public Address getAddress(int id) {
		return (Address)  entityManager.find(Address.class, id);
	}

	@Override
	public Address createAddress(Address address) {
		return entityManager.merge(address);
	}

	@Override
	public Address updateAddress(Address address) {
		return entityManager.merge(address);
	}

	@Override
	public void deleteAddress(int id) {
		Address address = entityManager.find(Address.class, id);
		entityManager.remove(address);
	}

}
