package br.com.magalu.exercise27;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.magalu.exercise27.exercise2.Exercise2;

import java.util.Arrays;
import java.util.Date;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Calendar;

@SpringBootApplication
public class Exercise27Application {

	public static void main(String[] args) {

		SpringApplication.run(Exercise27Application.class, args);

		Exercise2 data1 = new Exercise2("14/05/2020");

//		int dataCompara  = data1.compara(new LocalDate("2015","04","02"));
//		System.out.println("dataCompara= " + dataCompara);

		Calendar  dia = Calendar.getInstance();
		data1.getDia( dia);
		data1.getMes(dia);
		data1.getAno(dia);

		String eBissexto = data1.isBissexto(new GregorianCalendar());
		System.out.println("isBissexto: " + eBissexto);


	}

}
