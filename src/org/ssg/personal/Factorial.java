package org.ssg.personal;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int N=1;
        System.out.println("Enter a number to calculate factorial ");
        try(Scanner scanner = new Scanner(System.in)){
            N= scanner.nextInt();
            if(N<0){
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }          
        }
        catch(Exception e){
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        Factorial fact = new Factorial();
        BigInteger factorial=fact.factorial(N);
        System.out.println("Factorial of " + N + " is: " + factorial +" with " + fact.trailingZeros(N) + " trailing zeros.");

    }

    public BigInteger factorial(int n) {
        BigInteger factorial=BigInteger.ONE;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public int trailingZeros(int n)
    {
        int trailingZero=0;
         for(int j=5;j<=n;j*=5)
        {
            /* n/5 + n/25 + n/125 */
            trailingZero += n/j;
        }
        return trailingZero;
    }

    boolean isFactorial(int num) {
    int i = 1;
    while (num > 1) {
        i++;
        if (num % i != 0) return false;
        num /= i;
    }
    return true;
}

}
