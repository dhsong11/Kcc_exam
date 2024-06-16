package javabasic_ex_final;

public class PayMain0 {

	public static void main(String[] args) {
		
		PayService payservice = new PayService();
		
		//kakao 결제
		String payOption1 = "kakao";
		int amount1 = 5000;
		payservice.processPay(payOption1, amount1);
		
		//naver 결제
		String payOption2 = "naver";
		int amount2 = 10000;
		payservice.processPay(payOption2, amount2);
		
		//잘못된 결제 수단 선택
		String payOption3 = "bad";
		int amount3 = 15000;
		payservice.processPay(payOption3, amount3);
		

	}

}
