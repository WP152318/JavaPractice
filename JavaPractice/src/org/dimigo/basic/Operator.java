/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |__ Operator
 * 
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author : os731
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long money = 1700000;
		long people = 3;
		long store = 1500;
		long re = money * 12 * people * store;
		System.out.println("<< 디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d원 \n", money);
		System.out.printf("점포 내 직원 수 : %,d명 \n", people);
		System.out.printf("점포 수 : %,d개\n\n", store);
		System.out.printf("연간 인건비 : %,d원 \n", re);
	}

}
