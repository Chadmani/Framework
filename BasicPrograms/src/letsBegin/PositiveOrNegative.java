package letsBegin;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = 48;
		int ctr, value;
		if (num>0)
		{
			value = num%10;
			for (ctr=1; ctr<=5; ctr++)
			{
				System.out.print(value*ctr+" ");
			}
		}
		else
		{
			value = num%10 * (-1);
			for (ctr=1; ctr<=10; ctr++)
			{
				System.out.print(value*ctr+" ");
			}
		}
sc.close();
	}

}
