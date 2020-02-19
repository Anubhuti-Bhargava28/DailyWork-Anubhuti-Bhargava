package com.cts;
// in java 8 default and static methods in interface which has definitions
interface Add {
	public static final int  a=576 ;
	int add(int a, int b);
default int multi(int a, int b) {
	return a*b;
}
static int modulus(int a, int b) {
	return a%b;
}
}


interface Sub extends Add{
	int sub(int a, int b);
}


class Imp  implements Sub{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int sub(int a, int b) {
		return a - b;
	}
}

public class InterfaceTest {

	 public  static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Add i= new Imp();
	 System.out.println(i.multi(5, 6));
		
		//Imp hj = new Imp();
		//System.out.println(hj.add(2, 3));
		//System.out.println(hj.sub(18, 10));
	}

}
