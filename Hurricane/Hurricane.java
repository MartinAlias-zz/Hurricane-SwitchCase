/*
 *Programmed By: Martin Horciak
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Friday, December 9, 2016.
 *Program Description:	Create an application that prompts user for the
 *						category of the hurrican they would like to search.
 */

 import java.util.Scanner;

 class Hurricane {
 	public static void main (String [] args){

 		Scanner input = new Scanner (System.in);
 		int category;

 		System.out.print ("What hurricane category would you like to know about? (Between 1-5): ");
 		category = input.nextInt();
 		input.close();

 		switch (category) {
 			case 1: System.out.println ("Category 1:74-95mph or 64-82kt or 119-153km/hr"); break;
 			case 2: System.out.println ("Category 2:96-110mph or 83-95kt or 154-177km/hr"); break;
 			case 3: System.out.println ("Category 3:111-130mph or 96-113kt or 178-209km/hr"); break;
 			case 4: System.out.println ("Category 4:131-155mph or 114-135kt or 210-249km/hr"); break;
 			case 5: System.out.println ("Category 5:Greater than 155mph or 135kt or 249km/hr"); break;
 		}

 		}

 	}