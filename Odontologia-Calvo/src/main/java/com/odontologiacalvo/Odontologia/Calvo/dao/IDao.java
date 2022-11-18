package com.odontologiacalvo.Odontologia.Calvo.dao;

import com.odontologiacalvo.Odontologia.Calvo.model.Patient;

import java.util.List;

public interface IDao<T> {
    T save (T t);
    T search (int id);
    Patient update (T t);
    void delete(int id);
    List<T> searchAll();
    T searchIntoString(String value);
}
