package test;
import java.util.Scanner;
public class assignq2 
{
     public static void main(String[] args) {
	 
     Scanner sc = new Scanner(System.in);
     
	 System.out.println("40");
	 int a = sc.nextInt();
	 
	 System.out.println("255");
	 int b = sc.nextInt();
	 
	 System.out.println("10");
	 int c = sc.nextInt();
	  
	 if (a >= b && a >= c){
	    System.out.println("gratest number is: " + a);
    
	 } else if (b >=a && b>=c) {
		 System.out.println("gratest number is: " + b);
	
	 }else {
		 System.out.println("gratest number is: " + c);
	   }
    }
}
