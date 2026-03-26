package org.ssg.personal;

public class Fibonacci {
     public static void main(String[] args) {
       int N=20;
        StringBuilder sb = new StringBuilder();
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
