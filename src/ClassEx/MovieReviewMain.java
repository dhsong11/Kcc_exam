package ClassEx;

public class MovieReviewMain {

	public static void main(String[] args) {
	
		//영화 리뷰 정보 출력
		MovieReview mo = new MovieReview();
		mo.title = "인셉션";
		mo.review = "인생은 무한 루프";
		
		MovieReview mo2 = new MovieReview();
		mo2.title = "어바웃 타임";
		mo2.review = "인생 시간 영화!";
		
		System.out.println("영화 제목: " + mo.title+", 리뷰: "+ mo.review);
		System.out.println("영화 제목: " + mo2.title+", 리뷰: "+ mo2.review);
		

	}

}
