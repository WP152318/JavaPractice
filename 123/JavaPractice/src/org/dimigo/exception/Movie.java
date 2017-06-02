package org.dimigo.exception;


public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getLimitAge(){
		return limitAge;		
	}
	
	public void buyTicket(int age){
		if (age < limitAge) {
			try {
				throw new Exception(getTitle()+"은/는 "+getLimitAge()	+"세 이상 관람가입니다.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else System.out.println(getTitle()+" 즐감하세요.");
	}
}
