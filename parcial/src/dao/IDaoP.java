package dao;

import model.Patient;
import model.Record;

public interface IDaoP<P extends Record> {
    Patient save(Patient patient);


}
