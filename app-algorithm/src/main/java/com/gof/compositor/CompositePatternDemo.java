package com.gof.compositor;

/**
 * 组合模式
 * <br>
 * 适用性
 * 1. 想表示对象的部分－整体层次结构。
 * 2. 希望用户忽略组合对象与单个对象的不同。用户将统一地使用组合结构中的所有对象。
 * @author gaoquan on 2018/8/17
 */
public class CompositePatternDemo {
	
	public static void main(String[] args) {
		
		Employee CEO = new Employee("John", "CEO", 30000);
		
		
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		
		
		CEO.add(headSales);
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		CEO.add(headMarketing);
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		//打印该组织的所有员工
		System.out.println(CEO);
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
		
	}
	
}
