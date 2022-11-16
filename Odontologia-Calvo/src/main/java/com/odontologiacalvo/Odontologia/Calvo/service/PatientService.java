package com.odontologiacalvo.Odontologia.Calvo.service;

import com.odontologiacalvo.Odontologia.Calvo.dao.IDao;
import com.odontologiacalvo.Odontologia.Calvo.dao.impl.IDaoPatientH2;
import com.odontologiacalvo.Odontologia.Calvo.model.Patient;

public class PatientService {
    private IDao<Patient> patientIDao;
    private PatientService(){ patientIDao = new IDaoPatientH2();}
    public void setPatientIDao(IDao<Patient> patientIDao){this.patientIDao = patientIDao;}
    public Patient save(Patient patient){
        return patientIDao.save(patient);
    }
}
