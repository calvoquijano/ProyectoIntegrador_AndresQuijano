package com.odontologiacalvo.Odontologia.Calvo;

import com.odontologiacalvo.Odontologia.Calvo.dao.DB_consult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OdontologiaCalvoApplication {

	public static void main(String[] args)  throws Exception{

		DB_consult.createTable();
		SpringApplication.run(OdontologiaCalvoApplication.class, args);
	}

}
