package ObjectsAndClasses;

import java.util.Scanner;

public class OblongTester{
	public static void main(String[] ards){
		Scanner keyboard = new Scanner(System.in);
		
		double oblongLength, oblongHeight;

		//declare reference to oblong object
		Oblong myOblong;

		System.out.println("Enter lenght of your oblong");
		oblongLength=keyboard.nextDouble();
		System.out.println("Enter height of your oblong: ");
		oblongHeight=keyboard.nextDouble();

		myOblong=new Oblong(oblongLength,oblongHeight);
		System.out.println("Oblong length= "+myOblong.getLength());
		System.out.println("Oblong height= "+myOblong.getHeight());
		System.out.println("Oblong area is " + myOblong.calculateArea());
		System.out.println("Oblong perimeter is " + myOblong.calculatePerimeter());
		
	}
}