import java.util.Scanner;


public class Student {

	public static void main(String[] args) {
		
		Scanner readInput = new Scanner(System.in);
		
		String name = "RAM";
		System.out.println("Enter Java marks");
		int java = readInput.nextInt();
		
		System.out.println("Enter C marks");
		int c = readInput.nextInt();
		
		System.out.println("Enter cpp marks");
		int cpp =  readInput.nextInt();
		
		System.out.println("Enter facebook marks");
		int facebook = readInput.nextInt();
		
		int total = java + c + cpp + facebook ; 
		
		System.out.println("====================================================");
		System.out.println("                       STUDENT                       ");
		System.out.println("====================================================");
		System.out.println("Java : " + java);
		System.out.println("c : " + c);
		System.out.println("cpp : " + cpp);
		System.out.println("facebook : " + facebook);
		System.out.println("Total : "+ total);
		System.out.println("====================================================");
		}

}
