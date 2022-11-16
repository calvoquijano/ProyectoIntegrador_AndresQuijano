package Test;

import model.Patient;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
public class PatientTest{
    @Test
    public void verificateName(){
        //Given
        Patient testName = new Patient("Andres","Quijano","correo@correo.com","AD12324","true","Calle 69",80794136,"3112022");
        //When
        boolean correct = testName.getFirstName() == "Calvo";
        //Get
        assertFalse(correct);

    }
}
