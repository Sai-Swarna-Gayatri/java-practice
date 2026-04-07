package org.ssg.personal;

import java.util.Scanner;

public class PrimeNth {
 public static void main(String[] args) {
        System.out.println("Enter which Nth prime number do you want ");
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int counter=1;
        int limit =(int)( N * (Math.log(N)+Math.log(Math.log(N))))+3;
        //int limit=25;
       // StringBuilder sb = new StringBuilder();
       /*
       2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229 */
if(N == 1)
{
    System.out.println("1st prime number is 2");
    return;
}

        for(int i=3;i<=limit;i+=2)
        {
                boolean isPrime=true;
                for(int j=3;j*j<=i;j+=2)
                {
                    if(i%j==0)
                    {
                       isPrime=false;
                       break;
                    }
                }
                if(isPrime)
                {
                    counter++;
                    if(counter==N)
                    {
                         System.out.println(N+"th prime number is " + i);
                        break;
                        
                    }
                  // sb.append(","+i);
                }
        }
       
    }
}