package kosa.video;

import kosa.oop.Account;
import kosa.oop.CheckingAccount;
import kosa.oop.MinusAccount;

public class Main {

	public static void main(String[] args) {
//		Video v1 = new Video("1", "�Ĺ�", "�ֹν�");
//		Video v2 = new Video("2", "�����Ǻ�", "Ȳ����");
//		
//		GeneralMember gm = new GeneralMember("a1", "ȫ�浿", "�����");
//		gm.rental(v2);
//		gm.show();
		
		//GeneralMember�� SpecialMember�� �Բ� �迭�� �ְ� ������ rental(), show() ȣ�� ���
		//Ư��, SpecialMember�� specialPrint()�� ȣ��ǵ��� �Ͽ���.
		
		Video videos[] = {
				new Video("111-111","ȫ�浿","sdsd"),
				new Video("111-111","ȫ�浿","sdssd"),
				new Video("333-333","��浿","dsdsd")
		};
//		int arr[] = {1,2,3};
		GeneralMember arr[] = {
				new GeneralMember("a1","ȫ�浿","�����"),
				new SpecialMember("123","����","��������",10),
				
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



