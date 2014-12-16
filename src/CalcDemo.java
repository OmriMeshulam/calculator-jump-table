//Coded by Omri Meshulam
//This is a calculator app designed through an interface class with the methods available through a change of a sub in an array.
import java.util.*;
public class CalcDemo{
	public void doIt(){
		boolean goAgain=true;
		int num1,num2,choose;
		String myString;
		ICalc[] myArray = new ICalc[256];
		myArray[(int)'+'] = new Add();
		myArray[(int)'-'] = new Sub();
		myArray[(int)'*'] = new Mul();
		myArray[(int)'/'] = new Div();
		Scanner deviceInput= new Scanner(System.in);
		while(goAgain){
			System.out.println("Enter first and second number:");
			num1 = deviceInput.nextInt();
			num2 = deviceInput.nextInt();
			System.out.println("Enter your selection: + for Addition, - for substraction * for Multiplication and / for division:");
			myString = deviceInput.next();
			choose = (int) myString.charAt(0);
			System.out.println(myArray[choose].compute(num1, num2));
			System.out.println("Would you like to go again 1 for yes 2 for no.");
			choose = deviceInput.nextInt();
			if(choose!=1){
				goAgain=false;
			}
		}	
		deviceInput.close();
		System.out.println("Goodbye!");
	}
	public static void main(String[]args){
		CalcDemo user = new CalcDemo();
		user.doIt();
	}
}