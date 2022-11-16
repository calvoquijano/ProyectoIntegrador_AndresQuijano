package com.odontologiacalvo.Odontologia.Calvo.dao.impl;

import com.odontologiacalvo.Odontologia.Calvo.dao.IDao;
import com.odontologiacalvo.Odontologia.Calvo.model.Address;
import com.odontologiacalvo.Odontologia.Calvo.model.Dentist;
import org.apache.log4j.Logger;

import java.util.List;

public class IDaoDentistH2 implements IDao<Dentist> {
    private static final Logger LOGGER= Logger.getLogger(IDaoPatientH2.class);
    //Methods Dentist
    private static final String TABLE_SELECT = "SELECT * FROM DENTIST WHERE ID=?";
    private static final String TABLE_SELECT_ALL = "SELECT * FROM DENTIST";
    private static final String TABLE_UPDATE = "UPDATE DENTIST SET FIRSTNAME=?," +
            "LASTNAME=?,EMAIL=?,PASSWORD=?,PATIENT=?,ID=? WHERE ID=?";
    @Override
    public Dentist save(Dentist dentist) {
        return null;
    }

    @Override
    public Dentist search(int id) {
        return null;
    }

    @Override
    public Address update(Dentist dentist) {

        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Dentist> searchAll() {
        return null;
    }

    @Override
    public Dentist searchIntoString(String value) {
        return null;
    }
}
