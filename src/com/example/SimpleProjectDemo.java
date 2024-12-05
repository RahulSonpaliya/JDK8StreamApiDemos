package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * SimpleProjectDemo demonstrates a sample Employee Management project which contains examples
 * of various operations that can be performed using JDK8 stream API 
 */
public class SimpleProjectDemo {

	public static void main(String[] args) {
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1, "John", 10000));
		emps.add(new Emp(4, "Rick", 7000));
		emps.add(new Emp(2, "Jackson", 13000));
		emps.add(new Emp(3, "Adam", 5000));
		
		// Display emp names whose salary is greater than 7000
		emps.stream().filter((e) -> e.getSalary() > 7000).forEach(System.out::println);
		
		// Display total numbers of emps whose salary is greater than 7000
		System.out.println(emps.stream().filter((e) -> e.getSalary() > 7000).count());
		
		// Find emp name who is having high salary
		System.out.println(emps.stream().max(Comparator.comparing(Emp :: getSalary)).get().geteName());
		
		// Display employee names in ascending order based on their salary
		emps.stream().sorted(Comparator.comparingLong(Emp :: getSalary)).map(Emp::geteName).forEach(System.out::println);
		
		// Display employee names in descending order based on their salary
		emps.stream().sorted(Comparator.comparingLong(Emp :: getSalary).reversed()).map(Emp::geteName).forEach(System.out::println);
	}
	
}

class Emp {
	private long eNo;
	private String eName;
	private long salary;
	public Emp(long eNo, String eName, long salary) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.salary = salary;
	}
	public long geteNo() {
		return eNo;
	}
	public void seteNo(long eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [eNo=" + eNo + ", eName=" + eName + ", salary=" + salary + "]";
	}
}
