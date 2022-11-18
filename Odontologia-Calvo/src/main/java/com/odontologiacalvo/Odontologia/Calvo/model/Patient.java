package com.odontologiacalvo.Odontologia.Calvo.model;

import java.sql.Date;

public class Patient extends Record{
    //Attributes
    private int identificationDocument;
    private Date dischargeDate;
    private Address address;
    //Constructor
    public Patient() {
    }
    public Patient(String firstName, String lastName, String email, String password, Boolean role, int identificationDocument, Date dischargeDate, Address address) {
        super(firstName, lastName, email, password, role);
        this.identificationDocument = identificationDocument;
        this.dischargeDate = dischargeDate;
        this.address = address;
    }
    //Encapsulation
    public int getIdentificationDocument() { return identificationDocument; }
    public void setIdentificationDocument(int identificationDocument) { this.identificationDocument = identificationDocument; }
    public Date getDischargeDate() { return dischargeDate; }
    public void setDischargeDate(Date dischargeDate) { this.dischargeDate = dischargeDate; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    //Overwrite
    @Override
    public String toString() {
        return "Patient{" +
                "identificationDocument=" + identificationDocument +
                ", dischargeDate=" + dischargeDate +
                ", address=" + address +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", admin='" + role + '\'' +
                '}';
    }
}
