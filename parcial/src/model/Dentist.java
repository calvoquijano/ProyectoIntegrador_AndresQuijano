package model;

public class Dentist extends Record {
    private int enrollment;
    //Constructor
    public Dentist() {
        super();
    }
    public Dentist(String firstName, String lastName, String email, String password, String patient, int enrollment) {
        super(firstName, lastName, email, password, patient);
        this.enrollment = enrollment;
    }
    //Encapsulation
    public int getEnrollment() {
        return enrollment;
    }
    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
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
        return "Dentist{" +
                "enrollment=" + enrollment +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
