package com.cts.regularWork.nestedClasses;

interface Age {
	int x = 21;

	void getAge();
}

public class AnonymousNestedClass {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		obj.getAge();
	}
}

class MyClass implements Age {
	@Override
	public void getAge() {

		System.out.print("Age is " + x);
	}
}
