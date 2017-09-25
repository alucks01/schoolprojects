//purpose: user will enter a temp in f and we will convert it to c 
import java.util.Scanner;
import java.text.DecimalFormat;
public class TemperatureConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Enter a temperature to be converted from F to C : "); //get user input for number to convert
		double userIn = input.nextDouble();	//store input in userIn double
		
		
		//this is considered poor programming style because it relies on using a MAGIC NUMBER
		//	
		//double degC = (userIn - 32.0)*(5.0/9.0); //convert from F to C
		
		//here we use explicit casting in the formula to avoid integer devision logic error
		//and to avoid the magic number solution.
		
		double degC = (double)5/9 * (userIn - 32);

		System.out.println(""+userIn+" degrees F is "+df.format(degC)+" degrees C"); //print output.
	}

}
