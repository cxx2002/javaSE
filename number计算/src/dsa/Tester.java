package dsa;

import java.util.Scanner;

public class Tester{
	public static class Employee{
		int id;
		String name; 
		public String toString(){
		return id +":jh" + name;
		}}
		public static void main(String[] args){
		Employee employee = new Employee();
		employee.id = 1001; 
		employee.name = "zhangsan"; 
		System.out.println(employee);
		}
} 