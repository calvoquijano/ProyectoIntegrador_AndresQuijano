package com.odontologiacalvo.Odontologia.Calvo.dao.impl;

import com.odontologiacalvo.Odontologia.Calvo.dao.IDao;
import com.odontologiacalvo.Odontologia.Calvo.model.Address;
import org.apache.log4j.Logger;

import java.util.List;

public class IDaoAddressH2 implements IDao<Address> {
    private static final Logger LOGGER= Logger.getLogger(IDaoAddressH2.class);

    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public Address search(int id) {
        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Address> searchAll() {
        return null;
    }

    @Override
    public Address searchIntoString(String value) {
        return null;
    }
}
