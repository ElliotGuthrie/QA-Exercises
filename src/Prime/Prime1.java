package Prime;

import java.util.Scanner;

 public class Prime1
 {
 	 public static void main(String[] argv) 
 	 {
 	 	 Scanner keyboard=new Scanner(System.in);
 	 	 
 	 	 System.out.println("Enter the number of prime numbers to calculate:\n");

 	 	 int n=keyboard.nextInt();
 	 	 
 	 	 System.out.println("Calculating the first "+n+" prime numbers:");

 	 	 // loop over numbers
 	 	 int nprime, num;
 	 	 final long startTime = System.currentTimeMillis();
 	 	 for (num=2, nprime=0; nprime<n; num++)
 	 	 {
 	 	 	 boolean isPrime=true;

 	 	 	 // Check if number is prime by looking for factors.
 	 	 	 for (int ifact=3; ifact <= Math.sqrt(num) ; ifact+=2)
 	 	 	 {
 	 	 	 	 if (num % ifact == 0 ) {isPrime=false;}
 	 	 	 }
 	 	 	 if (isPrime) // A prime number has been found, so print it.
 	 	 	 {
 	 	 	 	 nprime++;

 	 	 	 	 //System.out.println(num);
 	 	 	 }
 	 	 }
 	 	 final long endTime = System.currentTimeMillis();
 	 	 System.out.print("\n The first " +nprime+ " prime numbers have been calculated!/n");
 	 	 double runTime = (double) (endTime - startTime);
 	 	 System.out.println("Run time: " + (runTime / 1000.0));
 	 }
 }
