package com.odontologiacalvo.Odontologia.Calvo.model;

public abstract class Record {
    //Atributos
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public Boolean role;
    //Constructor
    public Record() {
    }
    public Record(String firstName, String lastName, String email, String password, Boolean role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    //Encapsulation
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Boolean getRole() { return role; }
    public void setRole(Boolean role) { this.role = role; }
}
