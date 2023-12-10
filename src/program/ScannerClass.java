package program;

import java.util.Scanner;

public class ScannerClass {
	Scanner sgk=new Scanner(System.in);
	void scannerNumber()
	{
	// we will create scanner object class // int variable =sgk.nextInt();

		
		System.out.println("your age :");
		// we will scan the number from user and store it into integer variable
		
		int age =sgk.nextInt();
		
		System.out.println("my age is "+age);
	}
		
	void scannerWord()
	{
		
		System.out.println("enter your name:");
		
		String name=sgk.next();//String variable =sgk.next();
		
		System.out.println("my name is " +name);
		
		
	}
		
	
	
		public static void main(String[] args) {
			
			ScannerClass obj=new ScannerClass();
		obj.scannerNumber();
		obj.scannerWord();	
		}
		
		
		
		
		
	
	
	
	
	
	
}
