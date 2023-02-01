package CipherSchoolCourse2;

import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hey buddy how old are you ? ");
		int age = sc.nextInt();
		
		System.out.println("Woha! you have really grown up! you are "+age+" years old");
	}
}
// checked exception are checked at compile time. eg- IO exception
// Unchecked exception are checked at runtime errors. eg- InputMismatchException