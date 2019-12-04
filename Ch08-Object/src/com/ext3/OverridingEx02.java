package com.ext3;

class Parent{
	String msg="parent class";
	
	public String getMessage() {
		return msg;
	}
}

class Child extends Parent{
	String msg="child class";


	
	public String getMessage() {
		return msg;

	}
	
	@Override
	public String getMessagee() {
//		overriding
		return msg;
	}
}

public class OverridingEx02 {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.getMessage());
		System.out.println(child.getMessagee());
		
		Parent parent = new Child();
//		parent is reference variable and child object is belongs to Child and belongs to Parent as well at the same time
//		parent is an object of Child
		System.out.println(parent.getMessage());
		System.out.println(parent.getMessagee());
		
		Child child_again = (Child)parent;
//		change the parent to child again
	}

}
