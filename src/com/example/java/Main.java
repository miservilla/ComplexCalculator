package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String operation;
        Double result;
        System.out.print("This is a complex calculator, please enter the first number: ");
        double firstNumber = TryParseDouble();
        System.out.print("This is a complex calculator, please enter the second number: ");
        double secondNumber = TryParseDouble();
        System.out.print("Please enter one operation (-, +, /, *): ");
        Scanner op = new Scanner(System.in);
        operation = op.next();
        while (!operation.equals("-") && !operation.equals("+") && !operation.equals("/") && !operation.equals("*")){
            System.out.println("Can not parse the entered operation, please try again!");
            operation = op.next();
        }
        switch (operation){
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("Your answer is: " + result);
                break;
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("Your answer is: " + result);
                break;

            case "/":
                result = firstNumber / secondNumber;
                System.out.println("Your answer is: " + result);
                break;

            default:
                result = firstNumber * secondNumber;
                System.out.println("Your answer is: " + result);

        }


    }

    private static Double TryParseDouble(){
        Scanner sc = new Scanner(System.in);
        Double number;
        while (!sc.hasNextDouble()) {
            System.out.println("Can not parse, please enter real number!");
            sc.next();
        }
        number = sc.nextDouble();
        return number;

    }
}
