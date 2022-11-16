package com.odontologiacalvo.Odontologia.Calvo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_consult {
    //DB Patient
    private static final String SQL_TABLE_PATIENT = "DROP TABLE IF EXISTS " +
            "PATIENT; CREATE TABLE PATIENT (FIRSTNAME VARCHAR(120) NOT NULL,"+
            "LASTNAME VARCHAR(120) NOT NULL,"+
            "EMAIL VARCHAR(300) NOT NULL," +
            "PASSWORD VARCHAR(20) NOT NULL," +
            "PATIENT VARCHAR(5) NOT NULL," +
            "ID INT NOT NULL PRIMARY KEY," +
            "ADDRESS_ID INT NOT NULL," +
            "DISCHARGE_DATE VARCHAR(30) NOT NULL" +
            ")";
    //DB Address
    private static final String SQL_TABLE_ADDRESS = "DROP TABLE IF EXISTS " +
            "ADDRESS; CREATE TABLE ADDRESS (ID INT AUTOINCREMENT PRIMARY KEY,"+
            "TYPE_STREET VARCHAR(20) NOT NULL,"+
            "NUMBER-STREET INT NOT NULL," +
            "FIRST_NUMBER INT NOT NULL," +
            "SECOND_NUMBER INT NOT NULL," +
            "TYPE_RESIDENT VARCHAR(120) NOT NULL," +
            "NEIGHBORHOOD VARCHAR(120) NOT NULL," +
            "DISTRICT VARCHAR(120) NOT NULL," +
            "CITY VARCHAR(120) NOT NULL," +
            ")";
    //DB Dentist
    private static final String SQL_TABLE_DENTIST = "DROP TABLE IF EXISTS " +
            "DENTIST; CREATE TABLE DENTIST(FIRSTNAME VARCHAR(120) NOT NULL," +
            "LASTNAME VARCHAR(120) NOT NULL,"+
            "EMAIL VARCHAR(300) NOT NULL," +
            "PASSWORD VARCHAR(20) NOT NULL," +
            "PATIENT VARCHAR(5) NOT NULL," +
            "ID INT NOT NULL PRIMARY KEY," +
            ")";
    //Methods
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/h2-database-consult","sa","");
    }
    public static void createTable(){
        Connection connection = null;
        try{
            connection = getConnection();
            Statement statementAll = connection.createStatement();
            statementAll.execute(SQL_TABLE_PATIENT);
            statementAll.execute(SQL_TABLE_ADDRESS);
            statementAll.execute(SQL_TABLE_DENTIST);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException g){
                g.printStackTrace();
            }
        }
    }
}
