package letsBegin;

public class Constructor {

	String Mani;
	Constructor()
	{
		System.out.println("No arguments provided now");
	}
	
	Constructor(String Hello)
	{
		Mani=Hello;
		System.out.println("Arugumens passed-Hence it is an parameterized constructor, So lets say "+Hello);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor Test = new Constructor(); //No parameters Passed
		Constructor Test1 = new Constructor("we learned now"); // Arguments (Parameters) Passed
		
	}

}
