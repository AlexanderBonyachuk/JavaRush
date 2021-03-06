package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        private Customer customer;
        private Contact contact;

        @Override
        public String getCountryCode() {
            Set<Map.Entry<String, String>> entrySet = countries.entrySet();
            String country = customer.getCountryName();
            String retu = null;
            for (Map.Entry<String, String> pair: entrySet) {
                if (country.equals(pair.getValue())) {
                    retu = pair.getKey();
                }
            }
            return retu;
        }


        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] mas = contact.getName().split(", ");
            return mas[1];
        }

        @Override
        public String getContactLastName() {
            String[] mas = contact.getName().split(", ");
            return mas[0];
        }

        @Override
        public String getDialString() {
            String str = contact.getPhoneNumber();
            String[] mas = str.split("\\D"); // убираем из телефонного номера плюс и дефисы
            String tellNumber = "callto://+";
            for (String s: mas) {
                tellNumber += s;
            }
            return tellNumber;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer  {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}