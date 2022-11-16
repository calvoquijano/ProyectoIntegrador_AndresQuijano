package dao;

import com.sun.source.tree.TryTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB_consult {
    private static final String CREATE_TABLE_PATIENT = "DROP TABLE IF EXISTS PATIENT;" +
            "CREATE TABLE PATIENT" +
            "("+
            "FIRSTNAME VARCHAR(120) NOT NULL," +
            "LASTNAME VARCHAR(120) NOT NULL," +
            "EMAIL VARCHAR(300) NOT NULL," +
            "PASSWORD VARCHAR(20) NOT NULL," +
            "PATIENT VARCHAR(5) NOT NULL," +
            "ID INT NOT NULL," +
            "ADDRESS VARCHAR(150) NOT NULL," +
            "DISCHARGEDATE VARCHAR(30) NOT NULL" +
            ")";
//    private static final String CREATE_TABLE_DENTIST = "DROP TABLE IF EXISTS DENTIST;" +
//        "CREATE TABLE DENTIST"+
//        "("+
//        "FIRSTNAME VARCHAR(120) NOT NULL,"+
//        "LASTNAME VARCHAR(120) NOT NULL,"+
//        "EMAIL VARCHAR(300) NOT NULL,"+
//        "PASSWORD VARCHAR(20) NOT NULL,"+
//        "PATIENT VARCHAR(5) NOT NULL,"+
//        "ID INT NOT NULL"+
//        ")";
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/h2-database-consult");
    }
    public static void CREATE_TABLE(){
        Connection connection = null;
        try{
            connection = getConnection();

            Statement statementPatient = connection.createStatement();
            statementPatient.execute(CREATE_TABLE_PATIENT);
//            Statement statementDentist = connection.createStatement();
//            statementDentist.execute(CREATE_TABLE_DENTIST);
        }catch (Exception f){
            f.printStackTrace();
        }
    }
}
