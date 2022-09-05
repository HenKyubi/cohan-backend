package com.HenKyubi666.cohantest.controllers;

import com.HenKyubi666.cohantest.dao.AddressDao;
import com.HenKyubi666.cohantest.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressDao addressDao;

    @RequestMapping(value = "api/address", method = RequestMethod.POST)
    public void createAddress(@RequestBody Address address){
        addressDao.createAddress(address);
    }

    @RequestMapping(value = "api/address", method = RequestMethod.GET)
    public List<Address> getAddresses(){
        return addressDao.getAddresses();
    }

    @RequestMapping(value = "api/address/{id}" , method = RequestMethod.GET)
    public Address getAddress(@PathVariable int id){
        return addressDao.getAddress(id);
    }

    @RequestMapping(value = "api/address", method = RequestMethod.PATCH)
    public void updateAddress(@RequestBody Address address){
        addressDao.updateAddress(address);
    }

    @RequestMapping(value = "api/address/{id}" , method = RequestMethod.DELETE)
    public void deleteAddress(@PathVariable int id){
        addressDao.deleteAddress(id);
    }


}


