package com.odontologiacalvo.Odontologia.Calvo.dao.impl;

import com.odontologiacalvo.Odontologia.Calvo.dao.IDao;
import com.odontologiacalvo.Odontologia.Calvo.model.Patient;
import org.apache.log4j.Logger;

import java.util.List;

public class IDaoPatientH2 implements IDao<Patient> {
    private static final Logger LOGGER= Logger.getLogger(IDaoPatientH2.class);
    //Methods Patient
    private static final String TABLE_SELECT = "SELECT * FROM PATIENT WHERE ID=?";
    private static final String TABLE_SELECT_ALL = "SELECT * FROM PATIENT";
    private static final String TABLE_UPDATE = "UPDATE PATIENT SET FIRSTNAME=?," +
            "LASTNAME=?,EMAIL=?,PASSWORD=?,PATIENT=?,ID=?,ADDRESS_ID=?,DISCHARGE_DATE=? WHERE ID=?";
    @Override
    public Patient save(Patient patient) {
        return null;
    }

    @Override
    public Patient search(int id) {
        return null;
    }

    @Override
    public void update(Patient patient) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Patient> searchAll() {
        return null;
    }

    @Override
    public Patient searchIntoString(String value) {
        return null;
    }
}
