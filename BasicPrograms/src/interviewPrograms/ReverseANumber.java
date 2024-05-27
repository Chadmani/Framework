package interviewPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int Actual = sc.nextInt();
		
	
	int Reverse = 0;
	
	while(Actual!=0) {
	Reverse = Reverse*10;
	Reverse = Reverse+Actual%10;
	Actual = Actual/10;
	}
	System.out.println(Reverse);
	sc.close();
	}
	
}
