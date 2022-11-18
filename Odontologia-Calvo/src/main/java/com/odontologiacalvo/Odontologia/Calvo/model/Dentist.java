package com.odontologiacalvo.Odontologia.Calvo.model;

public class Dentist extends Record{
    //Atributos
    private int enrollment;
    //Constructor
    public Dentist() {
    }
    public Dentist(String firstName, String lastName, String email, String password, Boolean role, int enrollment) {
        super(firstName, lastName, email, password, role);
        this.enrollment = enrollment;
    }
    //Encapsulation
    public int getEnrollment() { return enrollment; }
    public void setEnrollment(int enrollment) { this.enrollment = enrollment; }
    //Overwrite
    @Override
    public String toString() {
        return "Dentist{" +
                "enrollment=" + enrollment +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", admin='" + role + '\'' +
                '}';
    }
}
