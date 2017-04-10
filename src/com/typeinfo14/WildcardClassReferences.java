//: typeinfo/WildcardClassReferences

package com.typeinfo14;

public class WildcardClassReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> intClass = int.class;
		intClass = double.class;
		System.out.println(intClass);
		
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		
		System.out.println(bounded);
	}

}
