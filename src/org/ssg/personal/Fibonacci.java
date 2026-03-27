package org.ssg.personal;

import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {
       int N;
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter the number of Fibonacci terms to generate: ");
        try (Scanner scanner = new Scanner(System.in)) {
            N = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }
        long prev=0;
        long curr=1;
        long next;
        
        sb.append(prev).append(",");
        sb.append(curr);
        
        for(int n=0;n<N;n++){
          next= prev+curr;
          sb.append(",").append(next);
          prev=curr;
          curr=next;
        }
        
        System.out.println("Fibonacci series is ..... " + sb);
    }

}
