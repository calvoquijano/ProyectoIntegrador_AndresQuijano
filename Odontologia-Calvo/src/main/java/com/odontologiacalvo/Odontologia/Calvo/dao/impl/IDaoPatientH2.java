package com.odontologiacalvo.Odontologia.Calvo.dao.impl;

import com.odontologiacalvo.Odontologia.Calvo.dao.DB_consult;
import com.odontologiacalvo.Odontologia.Calvo.dao.IDao;
import com.odontologiacalvo.Odontologia.Calvo.model.Address;
import com.odontologiacalvo.Odontologia.Calvo.model.Patient;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class IDaoPatientH2 implements IDao<Patient> {
    private static final Logger LOGGER= Logger.getLogger(IDaoPatientH2.class);
    //Methods Patient
    private static final String TABLE_SELECT = "SELECT * FROM PATIENT WHERE ID=?";
    private static final String TABLE_SELECT_ALL = "SELECT * FROM PATIENT";
    private static final String TABLE_INSERT = "INSERT INTO PATIENT (FIRSTNAME,LASTNAME,EMAIL,PASSWORD,PATIENT,ID,ADDRESS,DISCHARGE_DATE) VALUES (?,?,?,?,?,?,?,?)";
    private static final String TABLE_UPDATE = "UPDATE PATIENT SET FIRSTNAME=?," +
            "LASTNAME=?,EMAIL=?,PASSWORD=?,PATIENT=?,ID=?,ADDRESS_ID=?,DISCHARGE_DATE=? WHERE ID=?";
    private static final String TABLE_DELETE = "DELETE FROM PATIENT WHERE ID=?";
    @Override
    public Patient save(Patient patient) {
        LOGGER.info("A request was initiated");
        Connection connection = null;
        try{
            connection = DB_consult.getConnection();
            PreparedStatement psInsert = connection.prepareStatement(TABLE_INSERT);
            psInsert.setString(1, patient.getFirstName());
            psInsert.setString(2, patient.getLastName());
            psInsert.setString(3, patient.getEmail());
            psInsert.setString(4, patient.getPassword());
            psInsert.setString(5, patient.getPatient());
            psInsert.setInt(6, patient.getAddress().getId());
            psInsert.setInt(7, patient.getIdentificationDocument());
            psInsert.setDate(8, patient.getDischargeDate());

            psInsert.execute();

        }catch(Exception g){
            g.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception h){
                h.printStackTrace();
            }
        }
        return patient;
    }

    @Override
    public Patient search(int id) {
        return null;
    }

    @Override
    public Address update(Patient patient) {
        LOGGER.info("A request was initiated");
        Connection connection = null;
        try{
            connection = DB_consult.getConnection();
            //Address address = IDaoAddressH2.update(patient.getAddress());
            PreparedStatement psUpdate = connection.prepareStatement(TABLE_UPDATE);
            psUpdate.setString(1, patient.getFirstName());
            psUpdate.setString(2, patient.getLastName());
            psUpdate.setString(3, patient.getEmail());
            psUpdate.setString(4, patient.getPassword());
            psUpdate.setString(5, patient.getPatient());
            psUpdate.setInt(6, patient.getAddress().getId());
            psUpdate.setInt(7, patient.getIdentificationDocument());
            psUpdate.setDate(8, patient.getDischargeDate());
            psUpdate.execute();
        }catch(Exception g){
            g.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception h){
                h.printStackTrace();
            }
        }
        return patient.getAddress();

    }

    @Override
    public void delete(int id) {
        LOGGER.info("A request was initiated");
        Connection connection = null;
        try{
            connection = DB_consult.getConnection();
            PreparedStatement psDelete = connection.prepareStatement(TABLE_DELETE);
            psDelete.setInt(7, id);
            psDelete.execute();
        }catch (Exception f){
            f.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception h){
                h.printStackTrace();
            }
        }
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
