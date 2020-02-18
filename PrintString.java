package com.cts;

public  class PrintString {
	public static boolean isTitleCase(String s) {
		boolean result=false;
		String arr[]= s.split("\\s+");
		for (int i = 0;i<arr.length;i++) {
			char ch=arr[i].charAt(0);
			if(ch>=65 && ch<=90)
			{
				result=true;
			}
			else
			{
				result=false;
			}
		}
		 return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "Global Warming";
int len= str.length();
System.out.println("1 " +str.substring(str.length() - 4));
System.out.println("2 " +str.substring(4, 9));
System.out.println("3 "+str.matches("[a-zA-Z0-9]+"));
String tr= str.substring(0,11);
System.out.println("4 " +tr);
System.out.println("5 "+str.substring(4));
System.out.println("6 "+str.indexOf('W'));
System.out.println("7 "+str.toUpperCase());
boolean y= isTitleCase(str);
System.out.println("8 "+y);
String rplace = str.replace('a','*');
System.out.println("9 "+ rplace);

}
}
