/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *    |__ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : os731
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "};
		String[] answers = {"악동뮤지션", "공유", "응용프로그래밍"};
		for(int i=1; i<=3; i++){
			System.out.println(i + ". " + questions[i-1]);
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i-1]))
				System.out.println("정답입니다!");
			else
				System.out.println("틀렸습니다!");
		}
		
		System.out.println("<< 결과 출력 >>");
		StringBuilder sb = new StringBuilder("가장 좋아하는 가수는? ");
		sb.append("악동뮤지션입니다. \n").append("가장 좋아하는 배우는? ").append("공유입니다. \n").append("가장 좋아하는 과목은? ").append("응용프로그래밍입니다. \n");
		
		System.out.println(sb);	

	}

}
