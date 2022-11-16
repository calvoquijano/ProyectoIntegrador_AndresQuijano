package model;

public abstract class Record {
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String patient;

    public Record() {
    }
    public Record(String firstName, String lastName, String email, String password, String patient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.patient = patient;
    }

    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getEmail();
    public abstract String getPassword();
    public abstract String getPatient();
}
