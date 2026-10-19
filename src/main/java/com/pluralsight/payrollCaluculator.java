package com.pluralsight;

import java.util.*;

public class payrollCaluculator {

    static double hourlyPay=0.0;
    static double workHours=0.0;
    static String name=" ";
    static String corpName=" ";
    static double grossPay=0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("your companies name here ->: ");
        corpName=scanner.nextLine();

        System.out.print("your name here ->: ");
        name=scanner.nextLine();

        System.out.print("your companies work hours here ->: ");
        workHours=scanner.nextDouble();

        System.out.print("your hourly pay here ->: ");
        hourlyPay=scanner.nextDouble();

        grossPay=hourlyPay*workHours;
        currentReport();
    }

    public static void currentReport(){

        System.out.printf("""
                %s:
                *===== Today's work log ======*
                employees name: %s
                current hourly rate: %f.2
                completed work hour's: %f.2
                %s current gross pay: %f.2
                """,
                corpName,name,hourlyPay,workHours,name,grossPay);
    }

}