package com.odontologiacalvo.Odontologia.Calvo.dao.impl;

import com.odontologiacalvo.Odontologia.Calvo.dao.DB_consult;
import com.odontologiacalvo.Odontologia.Calvo.dao.IDao;
import com.odontologiacalvo.Odontologia.Calvo.model.Address;
import com.odontologiacalvo.Odontologia.Calvo.model.Patient;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class IDaoPatientH2 implements IDao<Patient> {
    private static final Logger LOGGER= Logger.getLogger(IDaoPatientH2.class);
    //Methods Patient
    private static final String TABLE_SELECT = "SELECT * FROM PATIENT WHERE ID=?";
    private static final String TABLE_SELECT_ALL = "SELECT * FROM PATIENT";
    private static final String TABLE_INSERT = "INSERT INTO PATIENT (FIRSTNAME,LASTNAME,EMAIL,PASSWORD,ROLE_ADMIN,ID,ADDRESS_ID,DISCHARGE_DATE) VALUES (?,?,?,?,?,?,?,?)";
    private static final String TABLE_UPDATE = "UPDATE PATIENT SET FIRSTNAME=?," +
            "LASTNAME=?,EMAIL=?,PASSWORD=?,ROLE_ADMIN=?,ID=?,ADDRESS_ID=?,DISCHARGE_DATE=? WHERE ID=?";
    private static final String TABLE_DELETE = "DELETE FROM PATIENT WHERE ID=?";

    @Override
    public Patient search(int id) {
        LOGGER.info("A request was initiated");
        Connection connection = null;
        Patient patient = null;
        try{
            connection = DB_consult.getConnection();
            PreparedStatement psSelect = connection.prepareStatement(TABLE_SELECT);
            psSelect.setInt(7,id);
            ResultSet resultSet = psSelect.executeQuery();
            IDaoAddressH2 daoAuxiliary = new IDaoAddressH2();
            while (resultSet.next()){
                Address address = daoAuxiliary.search(resultSet.getInt(6));
                patient=new Patient(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getBoolean(5),resultSet.getInt(6),resultSet.getDate(7),address);
            }
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
            psInsert.setBoolean(5, patient.getRole());
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
    public Patient update(Patient patient) {
        LOGGER.info("A request was initiated");
        Connection connection = null;
        try{
            connection = DB_consult.getConnection();
            PreparedStatement psUpdate = connection.prepareStatement(TABLE_UPDATE);
            psUpdate.setString(1, patient.getFirstName());
            psUpdate.setString(2, patient.getLastName());
            psUpdate.setString(3, patient.getEmail());
            psUpdate.setString(4, patient.getPassword());
            psUpdate.setBoolean(5, patient.getRole());
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

        return patient;
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
