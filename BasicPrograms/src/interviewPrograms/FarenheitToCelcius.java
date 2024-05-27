package interviewPrograms;

import java.util.Scanner;

public class FarenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float F = sc.nextFloat();
		float Calc;
		
		Calc = (F-32) * 5/9;
		
		System.out.println(Calc);
		sc.close();
		 
	}

}
