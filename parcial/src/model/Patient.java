package model;

import java.util.Date;

public class Patient extends Record {
    private String address;
    private int identificationDocument;
    private String dischargeDate;

    //Constructor

    public Patient() {
        super();
    }

    public Patient(String firstName, String lastName, String email, String password, String patient, String address, int identificationDocument, String dischargeDate) {
        super(firstName, lastName, email, password, patient);
        this.address = address;
        this.identificationDocument = identificationDocument;
        this.dischargeDate = dischargeDate;
    }

    //Encapsulation



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(int identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getPatient() {
        return null;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "address='" + address + '\'' +
                ", identificationDocument=" + identificationDocument +
                ", dischargeDate=" + dischargeDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
