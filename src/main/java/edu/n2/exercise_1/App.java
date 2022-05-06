package edu.n2.exercise_1;

public class App {

	public static void main(String[] args) {
		System.out.println(Input.readByte("Introdueix un valor byte: "));
		System.out.println(Input.readInt("Introdueix un valor int: "));	
		System.out.println(Input.readFloat("Introdueix un valor float: "));
		System.out.println(Input.readDouble("Introdueix un valor double: "));
		System.out.println(Input.readChar("Introdueix un caràcter char: "));
		System.out.println(Input.readString("Introdueix una cadena string: "));
		System.out.println(Input.readYesNo("Introdueix si o no (s, n): "));		
		Input.scanner.close();		 
	}
}
