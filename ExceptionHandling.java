//keywords to handle Exception
//try - represents/contains code that we think has probability to generate/throw Error at Runtime exception.
//catch - executes only if any error/exception occurs in try Block.if there is no Exception it will not executed. 
//finally - it executes irrespective of if any exception is occurring in try block or not.
//throw
//throws

package CipherSchoolCourse2;

import java.util.Scanner;

public class ExceptionHandling {
	int num1,num2,result;
	Scanner sc = new Scanner(System.in);
	
	void calculate() {
	try {


		System.out.println("Enter First Number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number :");
		num2=sc.nextInt();
		
		result = num1/num2;
	}
	catch(ArithmeticException e) {
		System.out.println("Exception detected");
	}

		System.out.println("The division is "+result);
	}
	
	public static void main(String[] args) {
		
		ExceptionHandling obj = new ExceptionHandling();
		obj.calculate();
	}
}
