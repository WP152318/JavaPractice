/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |__ Person
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 * 
 * @author : os731
 * @version : 1.0
 */
public class Person {
	
	public String name;
	
	public Person(){
		
	}
	
	public Person(String name){
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hello");
	}
	
	public void sayBye(){
		System.out.println("Bye");
	}
	
	public String toString(){
		return "저는 " + name + "입니다.";
	}
}
