package br.com.magalu.exercise27.exercise2;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Exercise2 {
    private String dataPassada;

    public Exercise2(String dataPassada) {
        try{
            this.dataPassada = dataPassada;
            SimpleDateFormat dtFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date dataExibir = dtFormat.parse(this.dataPassada);
        }catch (java.text.ParseException e) {
             this.dataPassada = "01/01/0001";
        }

        System.out.println("dataPassada = " + this.dataPassada);
    }

    public int compara(LocalDate dataCompara ){
        LocalDate dataAtual =   LocalDate.now();

        if(dataCompara.isEqual(dataAtual)){
            return 0;
        }else if(dataCompara.isAfter(dataAtual)){
            return 1;
        }else{
            return -1;
        }
    }

    public void getDia( Calendar data){
        System.out.println ("Dia = " + (data.get(Calendar.DAY_OF_MONTH)));
    }

    public void getMesExtenso( GregorianCalendar data){

    }

    public void getMes( Calendar data){
        System.out.println ("Mês = " + (data.get(Calendar.MONTH)+ 1));
    }
    public void getAno( Calendar data){
        System.out.println ("Ano = " + (data.get(Calendar.YEAR)));
    }

    public String isBissexto( GregorianCalendar data){
       int ano = data.get(GregorianCalendar.YEAR);
       boolean isBissexto = data.isLeapYear(ano);
       return isBissexto ? "Ano é Bissexto" : "Ano não é Bissexto";
    }

}
