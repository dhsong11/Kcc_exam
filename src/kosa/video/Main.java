package kosa.video;

import kosa.oop.Account;
import kosa.oop.CheckingAccount;
import kosa.oop.MinusAccount;

public class Main {

	public static void main(String[] args) {
//		Video v1 = new Video("1", "파묘", "최민식");
//		Video v2 = new Video("2", "서울의봄", "황정민");
//		
//		GeneralMember gm = new GeneralMember("a1", "홍길동", "명륜동");
//		gm.rental(v2);
//		gm.show();
		
		//GeneralMember와 SpecialMember를 함께 배열에 넣고 각각의 rental(), show() 호출 출력
		//특히, SpecialMember는 specialPrint()를 호출되도록 하여라.
		
		Video videos[] = {
				new Video("111-111","홍길동","sdsd"),
				new Video("111-111","홍길동","sdssd"),
				new Video("333-333","김길동","dsdsd")
		};
//		int arr[] = {1,2,3};
		GeneralMember arr[] = {
				new GeneralMember("a1","홍길동","명륜동"),
				new SpecialMember("123","ㅇㄴ","ㄴㅇㄴㅇ",10),
				
			};
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rental(videos[i]);
			arr[i].show();
		
			if(arr[i] instanceof SpecialMember) {
		
					((SpecialMember)arr[i]).specialPrint();
//				}
//				catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		System.out.println(arr[0].rental());
//		System.out.println(arr[1].show());
			
		

			}
		}
	}
	
}



