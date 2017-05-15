/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |__ SmartPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author : os731
 * @version : 1.0
 */
public class SmartPhone {
		
		private String model;
		private String company;
		private int price;
		
		public SmartPhone(){
			
		}
		
		public SmartPhone(String model, String company, int price){
			this.model = model;
			this.company = company;
			this.price = price;
		}

		public void turnOn(){
			System.out.println(model + "의 전원을 켭니다.");
		}
		
		public void turnOff(){
			System.out.println(model + "의 전원을 끕니다.");
		}
		
		public void pay(){
			System.out.println(company + "페이로 결제합니다.");
		}
		
		public String toString(){
			return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + price + "원";
		}
		
		public void useSpecialFuntion(SmartPhone phone){
			if(phone instanceof IPhone){
				((IPhone)phone).useAirDrop();
			}
			else if(phone instanceof Galaxy){
				((Galaxy)phone).useWirelessCharging();
			}
		}
}
