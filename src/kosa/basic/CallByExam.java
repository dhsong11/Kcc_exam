package kosa.basic;

public class CallByExam {

	
	public static int change(int num) {
		num+=10;
		
		return num;
	}
	
	public static void change2(int brr[]) {
		brr[0] = 200;//�������϶��� ������ �ʿ䰡 ����. 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		num = change(num);
		System.out.println(num);
	
		
		int arr[] = {100};
		change2(arr);
		System.out.println(arr[0]);
		
	}
	

}
