/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |__ PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 * 
 * @author : os731
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FamilyMember[] members = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생"),
		};
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(members[0], 10000);
		PiggyBank.putMoney(members[1], 5000);
		PiggyBank.putMoney(members[2], 2000);
		PiggyBank.putMoney(members[3], 1000);
		
		PiggyBank.printBanlance();
	}

}
