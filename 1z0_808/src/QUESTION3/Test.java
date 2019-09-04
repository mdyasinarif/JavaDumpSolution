/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        //String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);// get Unsupported field: HourOfDay error
        String date1 = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);// give result
       // System.out.println(date);
        System.out.println(date1);
    }
    
}
