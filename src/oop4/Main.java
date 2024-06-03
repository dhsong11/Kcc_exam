package oop4;

public class Main {

	public static void main(String[] args) {

		// MyType => �͸���Ŭ������ ����

		MyType myType = new MyType() {
			@Override
			public void hello() {
				System.out.println("������������");
			}
		};

		myType.hello();
		System.out.println("----------------------------------");
		// ���ٽ����� ����
		// �߻�޼��尡 1���϶��� ���ٽ����� ���� ����
		MyType my2 = () -> {
			System.out.println("���ٽ� �����Դϴ�.");
		};
		my2.hello();

		// ���ٽĿ��� ������ 1���̸� �߰�ȣ�� ���� ����
		MyType my3 = () -> System.out.println("���ٽ� ����2 �Դϴ�.");
		my3.hello();

		System.out.println("-----------------------------------");
		// �ִ밪 ���
		YourType you = (num1, num2) -> {
			System.out.println("����: " + num1 + ", " + num2);
			return num1 > num2 ? num1 : num2;
		};

		int result = you.getMax(10, 20);
		System.out.println("�ִ밪: " + result);
		System.out.println("-----------------------------------");
		
//		Runnable r = () -> {
//			for(int i=1; i<=10; i++) {
//				try {
//					Thread.sleep(100);
//				}catch(Exception e) {}
//				System.out.println(i);
//			}
//		};
//		
//		Thread t = new Thread(r);
//		t.start();
		System.out.println("-----------------------------------");
		
		
		
		
	}

}
