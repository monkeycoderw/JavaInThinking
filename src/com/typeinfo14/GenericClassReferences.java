//: typeinfo/GenericClassReferences

package com.typeinfo14;

public class GenericClassReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class; // same thing
		intClass = double.class;
		//genericIntClass = double.class;
	}

}
