package ClassEx;

public class MovieReviewMain {

	public static void main(String[] args) {
	
		//��ȭ ���� ���� ���
		MovieReview mo = new MovieReview();
		mo.title = "�μ���";
		mo.review = "�λ��� ���� ����";
		
		MovieReview mo2 = new MovieReview();
		mo2.title = "��ٿ� Ÿ��";
		mo2.review = "�λ� �ð� ��ȭ!";
		
		System.out.println("��ȭ ����: " + mo.title+", ����: "+ mo.review);
		System.out.println("��ȭ ����: " + mo2.title+", ����: "+ mo2.review);
		

	}

}
