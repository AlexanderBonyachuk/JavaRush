package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;
        private String fName, mName, lName, bD;
        int index;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            SimpleDateFormat ft = new SimpleDateFormat("dd MM yyyy");
            Date dateBD = null;

//            if (fileScanner.hasNextLine()) {
                String stroka = fileScanner.nextLine();
                String[] split = stroka.split(" ");
                
                Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4])-1, Integer.parseInt(split[3]));
                Date date = calendar.getTime();
                Person pers = new Person(split[1], split[2], split[0], date);
//                lName = stroka.substring(0, stroka.indexOf(' '));
//
//                stroka = stroka.substring(1+stroka.indexOf(' '));
//                fName = stroka.substring(0, stroka.indexOf(' '));
//
//                stroka = stroka.substring(1+stroka.indexOf(' '));
//                mName = stroka.substring(0, stroka.indexOf(' '));
//
//                bD = stroka.substring(1+stroka.indexOf(' '));
//
//                try {
//                    dateBD  = ft.parse(bD);
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//            }
            return pers;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
