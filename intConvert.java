// Program to convert an int variable to String using an inbuilt function of String class

public class intConvert{
	// intilized variable
	static int a;
	static String b;
	// Main Function
	public static void main(String[] args){
		// asking for inputs to user
		System.out.print("Enter any Integer: ");
		// reading value and assigned the value in variable a
		a = Integer.parseInt(System.console().readLine());
		// converting the integer value with String.valueOf() method
		b = String.valueOf(a);
		// output the value of b;
		System.out.print("You have Entered: "+ b + " (now it's a String)");
	}
}