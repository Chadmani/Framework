package interviewPrograms;

import java.util.Scanner;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(str);
		
		if(args.length>0)
		{
			System.out.println("The command line"+ "arguments are:");
			for(String val:args)
			System.out.println(val);
			}
			else
			{
				System.out.println("No command line arguments found");
			}
		sc.close();
		}

	}

