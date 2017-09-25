//shows the use of the short cut assignment operators which just save a few keystrokes for certain aritmetic operations.

public class ShortcutOperatorsDemo {

	public static void main(String[] args) {

		int num1 = 5;
		System.out.println("Starting value of num1 is "+num1);
		
		//add 6 to num1 w/o shortcut
		num1 = num1 + 6;
		System.out.println("New value of num1 after adding 6 is "+num1);
		
		//add 7 to num1 w/ shortcut
		num1 += 7;
		System.out.println("New value of num1 after adding 7 is "+num1);
		
		//subtract 3 w/ shortcut
		num1 -= 3;
		System.out.println("New value of num1 after subtracting 3 is "+num1);
		
		//multiply by 4
		num1 *= 4;
		System.out.println("New value of num1 after multuplying by 4 is "+num1);
		
		num1 /= 3;
		System.out.println("New value of num1 after diving by 3 is "+num1);
		
		num1 %= 3;
		System.out.println("New value of num1 after mod 3 is "+num1);
		
	}

}
