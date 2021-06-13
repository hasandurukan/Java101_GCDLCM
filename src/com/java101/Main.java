package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber;
        int gcd = 0, lcm = 0;
        System.out.print("Please type first number :");
        firstNumber = input.nextInt();

        System.out.print("Please type second number :");
        secondNumber = input.nextInt();

        int lowestNumber = Math.min(firstNumber, secondNumber);
        int greatestNumber = Math.max(firstNumber, secondNumber);

        int gcdCounter = lowestNumber;
        while (gcdCounter > 0) {
            if ((firstNumber % gcdCounter == 0) && (secondNumber % gcdCounter == 0)) {
                gcd = gcdCounter;
                break;
            }
            gcdCounter--;
        }

        int lcmCounter = greatestNumber;
        while (true) {
            if (lcmCounter % firstNumber == 0 && lcmCounter % secondNumber == 0) {
                lcm = lcmCounter;
                break;
            }
            lcmCounter++;
        }

        System.out.println("GCD of two number :" + gcd);
        System.out.println("LCM of two number :" + lcm);
    }
}
