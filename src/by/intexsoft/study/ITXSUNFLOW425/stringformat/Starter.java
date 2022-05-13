package by.intexsoft.study.ITXSUNFLOW425.stringformat;

import java.util.Date;

public class Starter {
    public static void main(String[] args) {

        System.out.println(String.format("%d", 16));
        System.out.println(String.format("|%20d|", -16));
        System.out.println(String.format("|%-20d|", 16));
        System.out.println(String.format("|% d |", 16));
        System.out.println(String.format("|%020d|", 16));
        System.out.println(String.format("|%+20d|", 16));
        System.out.println(String.format("|%(d|", -16));
        System.out.println(String.format("|%o|", 160));
        System.out.println(String.format("|%#o|", 160));
        System.out.println(String.format("|%x|", 160));
        System.out.println(String.format("|%#x|", 160));
        System.out.println(String.format("|%c|", 16345));

        String name = "Kate";
        System.out.println(String.format("My name is %s", name));
        System.out.println(String.format("|My name is %s|", name));
        System.out.println(String.format("|My name is %10s|", name));
        System.out.println(String.format("|My name is %.1s|", name));
        System.out.println(String.format("|My name is %10.1s|", name));
        System.out.println(String.format("Value = %f", 16.16));
        System.out.println(String.format("Value = %f", 16.123456));
        System.out.println(String.format("Value = %.7f", 16.1234567));
        System.out.println(String.format("Value = %.10f", 16.1234567));
        System.out.println(String.format("Value = %e", 16.1234567));
        System.out.println(String.format("Value = %.10e", 16.1234567));
        System.out.println(String.format("Value = %a", 16.1234567));
        System.out.println(String.format("Value = %.10a", 16.1234567));
        System.out.println(String.format("Value = %b", false));
        System.out.println(String.format("Value = %h", name.hashCode()));

        System.out.println(String.format("%s = %d", "16", 16));
        System.out.println(String.format("%s = %f", "16", 16f));

        System.out.println(String.format("%n First %n Second %n"));

        System.out.println(String.format("Today %tA", new Date()));
    }
}
