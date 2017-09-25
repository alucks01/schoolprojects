//show how to use super hard incremators :o :o :o :o

public class IncrementOperatorDemo {

	public static void main(String[] args) {
		
		int taco = 6;
		
		//get anotha taco slow
		taco = taco + 1;
		System.out.println("Current value of taco is "+taco);
		
		//get anotha taco supa fast (post fix)
		System.out.println("New value of taco is "+ taco++);
		
		//didnt print out new taco because increment was after variable was used.
		//get anotha taco supa fast (pre fix)
		System.out.println("New value of taco is "+ ++taco);
		
		System.out.println("You have 9 taco");
		

	}

}
