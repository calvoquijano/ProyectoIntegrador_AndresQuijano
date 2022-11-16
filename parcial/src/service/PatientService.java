package service;

import dao.IDaoP;
import dao.impl.IDaoPatientH2;
import model.Patient;

public class PatientService {
    private IDaoP<Patient> patientIDao;
    public PatientService(){
        patientIDao = new IDaoPatientH2();
    }

    public void setPatientIDao(IDaoP<Patient> patientIDao) {
        this.patientIDao = patientIDao;
    }

    public Patient save(Patient patient){
        return patientIDao.save(patient);
    }
}
