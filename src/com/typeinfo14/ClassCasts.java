//: typeinfo/ClassCasts.java

package com.typeinfo14;

class Building {}

class House extends Building {}

public class ClassCasts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building b = new Building();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House) b;
	}

}
