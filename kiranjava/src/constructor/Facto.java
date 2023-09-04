package constructor;
import java.util.*;

public class Facto {
	Facto(){
		Scanner sc= new Scanner(System.in);
		//System.out.print(" enter the value of i :  ");
		//int i = 1;
		//System.out.print(" enter the  value of fact :  ");
		int fact = 1;
		System.out.print(" enter the value of num :  ");
		int num = sc.nextInt();
		for(int i=1;i<num; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
			
		
			
	}

	public static void main(String[] args) {
		Facto obj = new Facto();
		/*Scanner sc= new Scanner(System.in);
		System.out.print("enter the value:");
		int a= sc.nextInt(); 
		System.out.print(" enter the value of b :");
		int b = sc.nextInt();
		int c =a+b;
		System.out.println(" addition of a and b is :  "+ c);*/
		
		

	}

}
