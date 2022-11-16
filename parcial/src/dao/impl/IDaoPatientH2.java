package dao.impl;

import dao.DB_consult;
import dao.IDaoP;
import model.Patient;
import model.Record;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IDaoPatientH2<P extends Record> implements IDaoP<P> {
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/test";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";
    private static final Logger LOGGER= Logger.getLogger(IDaoPatientH2.class);
    private static final String SQL_INSERT = "INSERT INTO PATIENT (FIRSTNAME,LASTNAME,EMAIL,PASSWORD,PATIENT,ID,ADDRESS,DISCHARGEDATE) VALUES (?,?,?,?,?,?,?,?)";
    @Override
    public Patient save(Patient patient){
        LOGGER.info("A request was initiated");
        Connection connection = null;
        try{
            connection = DB_consult.getConnection();
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            psInsert.setString(1, patient.getFirstName());
            psInsert.setString(2, patient.getLastName());
            psInsert.setString(3, patient.getEmail());
            psInsert.setString(4, patient.getPassword());
            psInsert.setString(5, patient.getPatient());
            psInsert.setString(6, patient.getAddress());
            psInsert.setInt(7, patient.getIdentificationDocument());
            psInsert.setString(8, patient.getDischargeDate());

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
}
