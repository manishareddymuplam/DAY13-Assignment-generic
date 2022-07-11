package com.bridgelabz.gereric;

public class Main {
	public static void main(String[] args) {
	 System.out.println("Welcome to generics");
     //UC2 find maximum of three Integers
     //UC3 find maximum of three Integers,float and String
     GenericClass genericClass = new GenericClass();{
     System.out.println("The Maximum Integer is : "+genericClass.testMaxium(1,7,4));
     System.out.println("The Maximum Float is : "+genericClass.testMaxium(1.3f,4.5f,7.7f));
     System.out.println("The Maximum String is : "+genericClass.testMaxium("apple","banana","peach"));
 }
	}
}