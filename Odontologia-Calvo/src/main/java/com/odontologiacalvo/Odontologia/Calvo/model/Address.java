package com.odontologiacalvo.Odontologia.Calvo.model;

public class Address {
    //Atributos
    private int id;
    private String typeStreet;
    private int numberStreet;
    private int firstNumber;
    private int secondNumber;
    private String typeResidence;
    private String neighborhood;
    private String district;
    private String city;
    //Constructor
    public Address(int id, String typeStreet, int numberStreet, int firstNumber, int secondNumber, String typeResidence, String neighborhood, String district, String city) {
        this.id = id;
        this.typeStreet = typeStreet;
        this.numberStreet = numberStreet;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.typeResidence = typeResidence;
        this.neighborhood = neighborhood;
        this.district = district;
        this.city = city;
    }
    //Encapsulation
    public int getId() {
        return id;
    }
    public void setId(int id) { this.id = id; }
    public String getTypeStreet() { return typeStreet; }
    public void setTypeStreet(String typeStreet) { this.typeStreet = typeStreet; }
    public int getNumberStreet() { return numberStreet; }
    public void setNumberStreet(int numberStreet) { this.numberStreet = numberStreet; }
    public int getFirstNumber() { return firstNumber; }
    public void setFirstNumber(int firstNumber) { this.firstNumber = firstNumber; }
    public int getSecondNumber() { return secondNumber; }
    public void setSecondNumber(int secondNumber) { this.secondNumber = secondNumber; }
    public String getTypeResidence() { return typeResidence; }
    public void setTypeResidence(String typeResidence) { this.typeResidence = typeResidence; }
    public String getNeighborhood() { return neighborhood; }
    public void setNeighborhood(String neighborhood) { this.neighborhood = neighborhood; }
    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    //Overwrite
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", typeStreet='" + typeStreet + '\'' +
                ", numberStreet=" + numberStreet +
                ", firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", typeResidence='" + typeResidence + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
