package com.HenKyubi666.cohantest.dao;

import com.HenKyubi666.cohantest.models.Address;

import java.util.List;

public interface AddressDao {
	
	Address createAddress(Address address);
	List<Address> getAddresses();
	Address getAddress(int id);
	Address updateAddress(Address address);
	void deleteAddress(int id);
	
}
