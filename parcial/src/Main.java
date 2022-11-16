import dao.DB_consult;
import model.Dentist;
import model.Patient;
import service.PatientService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        PatientService patientService = new PatientService();
        DB_consult.CREATE_TABLE();
        Patient paciente = new Patient("Andres","Quijano","correo@correo.com","AD12324","true","Calle 69",80794136,"3112022");
//        System.out.println(paciente);

        patientService.save(paciente);
    }
}