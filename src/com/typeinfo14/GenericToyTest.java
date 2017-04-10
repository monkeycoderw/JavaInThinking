//: typeinfo/toys/GenericToyTest.java
// Testing class Class

package com.typeinfo14;

public class GenericToyTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<FancyToy> ftClass = FancyToy.class;
		
		// Produces exact type
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		// This won't compile
		// Class<Toy> up2 = ftClass.getSuperclass();
		
		// only produces Object
		Object obj = up.newInstance();
		
	}

}
