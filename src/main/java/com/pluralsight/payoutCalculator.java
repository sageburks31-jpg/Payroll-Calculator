package com.pluralsight;

import java.util.*;

public class payoutCalculator {

    static List<Double> inputList= new ArrayList<>();
    static List<String> oprSymbollist=new ArrayList<>();
    static int symbolKey=0;
    static double sum=0.0;

    public static void main(String[] args) {

        oprSymbollist.add(" + ");
        oprSymbollist.add(" - ");
        oprSymbollist.add(" * ");
        oprSymbollist.add(" / ");
        oprSymbollist.add(" % ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("what your name? :");

        String command = scanner.nextLine();

        System.out.println("What operation do you want to run? ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("(R)emainer");
        System.out.print("Please select an option: ");

        command = scanner.nextLine();
        String lowCommand = command.toLowerCase();

        setOperat(lowCommand);
        inputValue(scanner);

    }

    public static void setOperat(String lowCommand) {

        switch (lowCommand) {

            case "a" -> {
                symbolKey = 0;
            }
            case "s" -> {
                symbolKey = 1;
            }
            case "m" -> {
                symbolKey = 2;
            }
            case "d" -> {
                symbolKey = 3;
            }
            case "r" -> {
                symbolKey = 4;
            }

        }

    }

    public static void inputValue(Scanner scanner) {

        System.out.print("Enter 1st number: ");
        inputList.add(scanner.nextDouble());

        System.out.print("Enter 2nd number: ");
        inputList.add(scanner.nextDouble());
        String opr = oprSymbollist.get(symbolKey);


        switch (symbolKey){

            case (0)->{
                sum = inputList.get(0) + inputList.get(1);
            }
            case (1)->{
                sum = inputList.get(0) - inputList.get(1);
            }
            case (2)->{
                sum = inputList.get(0) * inputList.get(1);
            }
            case (3)->{
                sum = inputList.get(0) / inputList.get(1);
            }
            case (4)->{
                sum = inputList.get(0) % inputList.get(1);
            }

        }

        System.out.print(inputList.get(0));
        System.out.print(opr);
        System.out.print(inputList.get(1));
        System.out.print(" = "+sum);

    }

}