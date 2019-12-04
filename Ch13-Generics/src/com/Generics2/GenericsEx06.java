package com.Generics2;

class StudentInfo{
	public int grade;
	
	StudentInfo(int grade){
		this.grade=grade;
//		create the constructor and initialized int at the same time
	}
}

class Person<T>{
	
	public T info;
	Person(T info){
		this.info=info;
	}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){
		this.position=position;
	}
	
}

class EmployeePerson<T>{
	
	public T info;
	EmployeePerson(T info){
		this.info=info;
	}


public class GenericsEx06 {

	public static void main(String[] args) {
		EmployeePerson<EmployeeInfo> person=new EmployeePerson<EmployeeInfo>(new EmployeeInfo(10));
		
		EmployeeInfo employeeinfo=person.info;
		

	}

}
