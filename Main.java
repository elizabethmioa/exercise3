package exercise3;
// FINAL ANSWER

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Enter coefficients (c3,c2,c1,c0) of polynomial: ");
		Scanner sc = new Scanner (System.in);
		int c3 = sc.nextInt();s
		int c2 = sc.nextInt();
		int c1 = sc.nextInt();
		int c0 = sc.nextInt();
		
		System.out.print("Enter endpoints a and b: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double fa = polynomial(a,c3,c2,c1,c0);
		double fb = polynomial(b,c3,c2,c1,c0);
		
		
			
		while (Math.abs (a-b)> 0.0001 ) {
			double m = 0.5*(a+b); 
			double fm = polynomial (m,c3,c2,c1,c0);
			
			if (fa*fm <0){
				b = m ;
				fb = fm;
			}
			else {
				a = m ;
				fa = fm; 
			}
		}
		
			double root = 0.5*(a+b);
			double functionOfRoot = polynomial (root,c3,c2,c1,c0);
			
		System.out.println("root = ");
		System.out.printf("%6f",0.5*(a+b));
		
		
		System.out.println("\np(root) = ");
		System.out.printf("%6f",functionOfRoot);

		
			
		
				
		sc.close();
	} 
	
	public static double polynomial (double coordinate, int c3, int c2, int c1, int c0){
		double functionValue = c3 * Math.pow(coordinate, 3) + c2 *Math.pow(coordinate, 2) + c1 * coordinate + c0;
		return functionValue;
		
	} 
}





