import java.util.Scanner;

public class RaithuBazar {

	public static void main(String[] args) {

		printSymbol("+");
		System.out.println("RAITHU BAZAR");
		printSymbol("*");

		Scanner readValues = new Scanner(System.in);

		System.out.println("Enter potato price");
		double potatoPrice = readValues.nextDouble();

		System.out.println("NO.of kgs potatoes purchased");
		double noOfKgsPotatoes = readValues.nextDouble();

		System.out.println("Enter tomato price");
		double tomatoPrice = readValues.nextDouble();

		System.out.println("No.of kgs tomatoes purchased");
		double noOfKgsTomatoes = readValues.nextDouble();

		double totalBill = tomatoPrice * noOfKgsPotatoes + tomatoPrice
				* noOfKgsTomatoes;

		printSymbol("&");
		System.out.println("Total bill : " + totalBill);

		printSymbol("%");

	}

	public static void printSymbol(String symbolName) {
		for (int first = 1; first <= 30; first++) {
			System.out.print(symbolName);
		}
		System.out.println(" ");
	}

}
