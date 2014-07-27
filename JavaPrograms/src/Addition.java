//Method overloading : same name different no.of arguments

public class Addition {

	public static void main(String[] args) {
		add(1, 3, 4);		
		add(21, 63, 48, 59);		
		add(2, 6);
		
	}

	private static void add(int number1, int number2, int number3, int number4) {
		int sum = number1 + number2 + number3 + number4;		
		System.out.println("Sum :  " + sum);				
	}
	
	private static void add(int number1, int number2) {
		int sum = number1 + number2;		
		System.out.println("Sum :  " + sum);				
	}
	
	private static void add(int number1, int number2, int number3) {
		int sum = number1 + number2 + number3;		
		System.out.println("Sum :  " + sum);				
	}

}
