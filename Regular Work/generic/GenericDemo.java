package com.cts.regularWork.generic;

public class GenericDemo {

	public static void main(String[] args) {

		Test<Integer> t = new Test<>();
		t.setObject(5);
		int i = t.getObject();
		System.out.println(i);
		Test<String> t2 = new Test<>();
		t2.setObject("hello");
		String s = (String) t2.getObject();
		System.out.println(s);

	}

}

class Test<T> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
