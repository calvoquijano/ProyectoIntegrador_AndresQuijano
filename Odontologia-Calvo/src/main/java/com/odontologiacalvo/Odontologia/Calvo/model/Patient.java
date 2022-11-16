package com.odontologiacalvo.Odontologia.Calvo.model;

import java.time.LocalDate;

public class Patient extends Record{
    //Atributos
    private int identificationDocument;
    private LocalDate dischargeDate;
    private Address address;
    //Constructor
    public Patient() {
    }
    public Patient(String firstName, String lastName, String email, String password, String patient, int identificationDocument, LocalDate dischargeDate, Address address) {
        super(firstName, lastName, email, password, patient);
        this.identificationDocument = identificationDocument;
        this.dischargeDate = dischargeDate;
        this.address = address;
    }
    //Encapsulation
    public int getIdentificationDocument() { return identificationDocument; }
    public void setIdentificationDocument(int identificationDocument) { this.identificationDocument = identificationDocument; }
    public LocalDate getDischargeDate() { return dischargeDate; }
    public void setDischargeDate(LocalDate dischargeDate) { this.dischargeDate = dischargeDate; }
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
                ", patient='" + patient + '\'' +
                '}';
    }
}
