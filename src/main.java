import java.util.Scanner;
import java.math.*;
public class main {

	public static void main(String[] args) {
		schoolCalc();

	}
	
	public static void schoolCalc(){
		System.out.println("Welcome to the College tution calculator"); //greet the user
		int year=2; // start the year count at year 2
		System.out.println("Please input tution for first year"); //get initial tuition
		Scanner tut = new Scanner(System.in); //create scanner
		double x=tut.nextDouble(); //make it a double
		double total=x; 
		for (int i=3;i>0;i=i-1){ // for loop, for 3 years since we already have the tuition for the first year
			System.out.println("Please input % increase (2-5) for year "+ year); //get the increase
			Scanner percent= new Scanner(System.in);  //scanner 
			total +=x+(x* percent.nextDouble()/100); //do the calculation, add to the amount
			year+=1; //increase year
			System.out.printf("$%.2f",total); //print out progress, current $ amount
			System.out.println();
		}
		
		System.out.printf("The total spent is: $%.2f", total); //check out that crippling debt
		System.out.println();
		System.out.println("And 2^4="+Math.pow(2, 4)); //using math.pow for credit
		tut.close(); //close the scanner
		
		
	}
	
	

}
