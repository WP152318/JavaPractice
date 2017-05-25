/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *    |__ DBTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : os731
 * @version : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDBManager o = IDBManager.getDBobject(IDBManager.ORACLE_DATABASE);
		IDBManager s = IDBManager.getDBobject(IDBManager.SYBASE_DATABASE);
		System.out.println("< 변경 전 >");
		crud(s);
		System.out.println("");
		System.out.println("< 변경 후 >");
		crud(o);
	}

	/**
	 * @param d
	 */
	private static void crud(IDBManager db) {
		// TODO Auto-generated method stub
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
