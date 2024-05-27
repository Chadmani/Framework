package letsBegin;

import java.util.Scanner;

public class TwoIntegerTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
				
		for (int ctr1=1; N1<=N2; ctr1++)
		{
			for (int j=1; j<=N2; j++)
			{
			System.out.print(j+" ");
			}
			System.out.println();
			N2--;
		}
	}

}
