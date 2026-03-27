package org.ssg.personal;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int N=1;
        System.out.println("Enter a number to calculate factorial ");
        try(Scanner scanner = new Scanner(System.in)){
            N= scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        Factorial fact = new Factorial();
        BigInteger factorial=fact.factorial(N);
        System.out.println("Factorial of " + N + " is: " + factorial);

    }

    public BigInteger factorial(int n) {
        BigInteger factorial=BigInteger.ONE;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
