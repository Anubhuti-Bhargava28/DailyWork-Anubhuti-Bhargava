package com.cts;

class F {
	int x = 10;

	public void display() {
		int r = 20;
		System.out.println("Class A");
	}
}

	class Y extends F {

		public void displays() {
			System.out.println("class B");
		}
	}

public class PolymorphisOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   F o= new Y();
   o.display();
	}

}
