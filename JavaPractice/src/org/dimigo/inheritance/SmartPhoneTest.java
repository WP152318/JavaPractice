/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |__ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author : os731
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone s = new IPhone("iPhone7", "애플", 900000);
		System.out.println(s);
		s.turnOn();
		s.pay();
		s.useSpecialFuntion(s);
		s.turnOff();
		System.out.println();
		
		SmartPhone s2 = new Galaxy("갤럭시S8", "삼성", 800000);
		System.out.println(s2);
		s2.turnOn();
		s2.pay();
		s2.useSpecialFuntion(s2);
		s2.turnOff();
		System.out.println();
		

	}

}
