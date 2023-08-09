package UD05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Anexo2Date {

    public static void main(String[] args) {

        //Clase Date (java.util.Date)
        Date fecha = new Date(2021, 8, 19);
        System.out.println(fecha);           //Mon Sep 19 00:00:00 CEST 3921
        System.out.println(fecha.getTime()); //61590146400000

        //Clase GregorianCalendar (java.util.Calendar y java.util.GregorianCalendar)
        Calendar calendar = new GregorianCalendar(2021, 8, 19);
        System.out.println(calendar.getTime()); //Sun Sep 19 00:00:00 CEST 2021

        Date d = new Date();
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Fecha: " + d);  //Fecha: Thu Aug 19 20:06:14 CEST 2021
        System.out.println("Info: " + c); //Info: java.util.GregorianCalendar[time=1629396374723,
        //areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo
        //[id="Europe/Madrid",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=163,
        //lastRule=java.util.SimpleTimeZone[id=Europe/Madrid,offset=3600000,dstSavings=3600000,
        //useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,
        //startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,
        //endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,
        //YEAR=2021,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=231,
        //DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=6,SECOND=14,
        //MILLISECOND=723,ZONE_OFFSET=3600000,DST_OFFSET=3600000]
        c.setTime(d);
        System.out.print(c.get(Calendar.DAY_OF_MONTH));
        System.out.print("/");
        System.out.print(c.get(Calendar.MONTH) + 1);
        System.out.print("/");
        System.out.println(c.get(Calendar.YEAR) + 1); //19/8/2022

        //LocalDate, LocalTime, LocalDateTime, Duration y Period (java.time.*)
        //LocalDate d = new LocalDate(); //NO compila
        LocalDate date = LocalDate.of(1989, 11, 11); //1989-11-11 
        System.out.println(date.getYear()); //1989 
        System.out.println(date.getMonth()); //NOVEMBER 
        System.out.println(date.getDayOfMonth()); //11
        date = LocalDate.now();
        System.out.println(date); //2021-08-19

        LocalTime time = LocalTime.of(5, 30, 45, 35); //05:30:45:35 
        System.out.println(time.getHour()); //5 
        System.out.println(time.getMinute()); //30 
        System.out.println(time.getSecond()); //45 
        System.out.println(time.getNano()); //35
        time = LocalTime.now();
        System.out.println(time); //20:13:53.118044   

        LocalDateTime dateTime = LocalDateTime.of(1989, 11, 11, 5, 30, 45, 35);

        LocalDate date2 = LocalDate.of(1989, 11, 11);
        LocalTime time2 = LocalTime.of(5, 30, 45, 35);
        LocalDateTime dateTime1 = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.now();

        LocalTime localTime1 = LocalTime.of(12, 25);
        LocalTime localTime2 = LocalTime.of(17, 35);
        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println(duration1); //PT5H10M
        System.out.println(duration1.toDays()); //0

        LocalDateTime localDateTime1 = LocalDateTime.of(2016, Month.JULY, 18, 14, 13);
        LocalDateTime localDateTime2 = LocalDateTime.of(2016, Month.JULY, 20, 12, 25);
        Duration duration2 = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration2); //PT46H12M
        System.out.println(duration2.toDays()); //1

        Duration duracion3 = Duration.ofDays(1);
        System.out.println(duracion3); //PT24H
        System.out.println(duracion3.toDays()); //1

        LocalDate localDate1 = LocalDate.of(2016, 7, 18);
        LocalDate localDate2 = LocalDate.of(2016, 7, 20);
        Period periodo1 = Period.between(localDate1, localDate2);
        System.out.println("ORDEN NORMAL: " + periodo1); //P2D
        Period periodo22 = Period.between(localDate2, localDate1);
        System.out.println("ORDEN INVERS: " + periodo22); //P2D

        
        Period periodo2 = Period.of(1, 2, 3);
        System.out.println(periodo2); //P1Y2M3D

        Period periodo3 = Period.ofYears(1);
        System.out.println(periodo3); //P1Y

        //CHRONOUNIT (java.time.temporal.ChronoUnit)
        LocalDate fechaInicio = LocalDate.of(2016, 7, 18);
        LocalDate fechaFin = LocalDate.of(2016, 7, 20);
        // Calculamos el tiempo transcurrido entre las dos fechas
        // con la clase ChronoUnit y la unidad temporal en la que
        // queremos que nos lo devuelva, en este caso DAYS.
        long tiempo = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        System.out.println(tiempo); //2

        //Introducir fecha por teclado (java.time.format.DateTimeFormatter)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String fechaCadena = "16/08/2016";
        LocalDate mifecha = LocalDate.parse(fechaCadena, formato);
        System.out.println(formato.format(mifecha)); //16/08/2016

        //Manipulación
        LocalDate fec = LocalDate.of(2016, 7, 25);
        LocalDate fec1 = fec.withYear(2017);
        LocalDate fec2 = fec.withMonth(8);
        LocalDate fec3 = fec.withDayOfMonth(27);
        System.out.println(date);  //2016-07-25 
        System.out.println(fec1); //2017-07-25 
        System.out.println(fec2); //2016-08-25 
        System.out.println(fec3); //2016-07-27 

        LocalTime tim = LocalTime.of(14, 30, 35);
        LocalTime tim1 = tim.withHour(20);
        LocalTime tim2 = tim.withMinute(25);
        LocalTime tim3 = tim.withSecond(23);
        LocalTime tim4 = tim.withNano(24);
        System.out.println(tim);  //14:30:35
        System.out.println(tim1); //20:30:35
        System.out.println(tim2); //14:25:35
        System.out.println(tim3); //14:30:23
        System.out.println(tim4); //14:30:35.000000024        

        LocalDateTime dateTim = LocalDateTime.of(2016, 7, 25, 22, 11, 30);
        LocalDateTime dateTim1 = dateTim.withYear(2017);
        LocalDateTime dateTim2 = dateTim.withMonth(8);
        LocalDateTime dateTim3 = dateTim.withDayOfMonth(27);
        LocalDateTime dateTim4 = dateTim.withHour(20);
        LocalDateTime dateTim5 = dateTim.withMinute(25);
        LocalDateTime dateTim6 = dateTim.withSecond(23);
        LocalDateTime dateTim7 = dateTim.withNano(24);
        System.out.println(dateTim);  //2016-07-25T22:11:30
        System.out.println(dateTim1); //2017-07-25T22:11:30
        System.out.println(dateTim2); //2016-08-25T22:11:30
        System.out.println(dateTim3); //2016-07-27T22:11:30
        System.out.println(dateTim4); //2016-07-25T20:11:30
        System.out.println(dateTim5); //2016-07-25T22:25:30
        System.out.println(dateTim6); //2016-07-25T22:11:23
        System.out.println(dateTim7); //2016-07-25T22:11:30.000000024

        //OPERACIONES
        LocalDate date3 = LocalDate.of(2016, 7, 18);
        LocalDate date3PlusOneDay = date3.plus(1, ChronoUnit.DAYS);
        LocalDate date3MinusOneDay = date3.minus(1, ChronoUnit.DAYS);
        System.out.println(date3); 	      // 2016-07-18
        System.out.println(date3PlusOneDay);  // 2016-07-19
        System.out.println(date3MinusOneDay); // 2016-07-17

        LocalDate date4 = LocalDate.of(2016, 7, 18);
        LocalDate date4PlusOneDay = date4.plus(Period.ofDays(1));
        LocalDate date4MinusOneDay = date4.minus(Period.ofDays(1));
        System.out.println(date4); 	      // 2016-07-18
        System.out.println(date4PlusOneDay);  // 2016-07-19
        System.out.println(date4MinusOneDay); // 2016-07-17

        LocalDate date5 = LocalDate.of(2016, 7, 18);
        LocalDate date5PlusOneDay = date5.plusDays(1);
        LocalDate date5MinusOneDay = date5.minusDays(1);
        System.out.println(date5); 	      // 2016-07-18
        System.out.println(date5PlusOneDay);  // 2016-07-19
        System.out.println(date5MinusOneDay); // 2016-07-17   

        LocalTime time3 = LocalTime.of(15, 30);
        LocalTime time3PlusOneHour = time3.plus(1, ChronoUnit.HOURS);
        LocalTime time3MinusOneHour = time3.minus(1, ChronoUnit.HOURS);
        System.out.println(time3); 		// 15:30
        System.out.println(time3PlusOneHour);	// 16:30
        System.out.println(time3MinusOneHour);	// 14:30

        LocalTime time4 = LocalTime.of(15, 30);
        LocalTime time4PlusOneHour = time4.plus(Duration.ofHours(1));
        LocalTime time4MinusOneHour = time4.minus(Duration.ofHours(1));
        System.out.println(time4); 		// 15:30
        System.out.println(time4PlusOneHour);	// 16:30
        System.out.println(time4MinusOneHour);	// 14:30

        LocalTime time5 = LocalTime.of(15, 30);
        LocalTime time5PlusOneHour = time5.plusHours(1);
        LocalTime time5MinusOneHour = time5.minusHours(1);
        System.out.println(time5); 		// 15:30
        System.out.println(time5PlusOneHour);	// 16:30
        System.out.println(time5MinusOneHour);	// 14:30

        LocalDateTime dateTime3 = LocalDateTime.of(2016, 7, 28, 14, 30);
        LocalDateTime dateTime4 = dateTime3.plus(1, ChronoUnit.DAYS).plus(1, ChronoUnit.HOURS);
        LocalDateTime dateTime5 = dateTime3.minus(1, ChronoUnit.DAYS).minus(1, ChronoUnit.HOURS);
        System.out.println(dateTime3); // 2016-07-28T14:30
        System.out.println(dateTime4); // 2016-07-29T15:30
        System.out.println(dateTime5); // 2016-07-27T13:30

        LocalDateTime dateTime6 = LocalDateTime.of(2016, 7, 28, 14, 30);
        LocalDateTime dateTime7 = dateTime6.plus(Period.ofDays(1)).plus(Duration.ofHours(1));
        LocalDateTime dateTime8 = dateTime6.minus(Period.ofDays(1)).minus(Duration.ofHours(1));
        System.out.println(dateTime6); // 2016-07-28T14:30
        System.out.println(dateTime7); // 2016-07-29T15:30
        System.out.println(dateTime8); // 2016-07-27T13:30

        LocalDateTime dateTime9 = LocalDateTime.of(2016, 7, 28, 14, 30);
        LocalDateTime dateTime10 = dateTime9.plusDays(1).plusHours(1);
        LocalDateTime dateTime11 = dateTime9.minusDays(1).minusHours(1);
        System.out.println(dateTime9);  // 2016-07-28T14:30
        System.out.println(dateTime10); // 2016-07-29T15:30
        System.out.println(dateTime11); // 2016-07-27T13:30

        LocalDate dat1 = LocalDate.of(2016, 7, 28);
        LocalDate dat2 = LocalDate.of(2016, 7, 29);
        boolean isBefore = dat1.isBefore(dat2); //true 
        boolean isAfter = date2.isAfter(dat1); //true 
        boolean isEqual = dat1.isEqual(dat2); //false 

        //Formatos (java.time.format.DateTimeFormatter)
        LocalDate mifecha2 = LocalDate.of(2016, 7, 25);
        String fechaTexto = mifecha2.format(DateTimeFormatter.ofPattern("eeee',' dd 'de' MMMM 'del' yyyy"));
        System.out.println("La fecha es: " + fechaTexto); // La fecha es: lunes, 25 de julio del 2016

        //DAYOFWEEK
        LocalDate lafecha = LocalDate.of(2016, 7, 25);
        if (lafecha.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            System.out.println("La fecha es Sábado");
        } else {
            System.out.println("La fecha NO es Sábado");
        }
//La fecha NO es Sábado
    }
}
