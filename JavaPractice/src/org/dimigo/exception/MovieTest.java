
package org.dimigo.exception;

public class MovieTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args){
		Movie[] movies = {
				new Movie("���̸���:Ŀ����Ʈ", 15),
				new Movie("������� ���� ������", 12)
		};
		int age = 13;
		for(Movie movie : movies){
			movie.buyTicket(age);
		}
	}

}
