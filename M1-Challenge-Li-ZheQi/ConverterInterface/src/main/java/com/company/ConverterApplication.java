package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        //month
        System.out.println(converterIf.convertMonth(7));
        //day
        System.out.println(converterIf.convertDay(7));

        ConverterSwitch converterSwitch = new ConverterSwitch();
        System.out.println(converterSwitch.convertMonth(7));
        System.out.println(converterSwitch.convertDay(7));
    }
}
