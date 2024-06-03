package kosa.video;

public class SpecialMember extends GeneralMember{

	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}
	
	public void show() {
		super.show();
		System.out.println("보너스 포인트"+bonusPoint);
	}

	public void specialPrint() {
		System.out.println();
	}
	
	@Override
	public void rental(Video video) {
		super.setRentalVideo(video);
		bonusPoint++;
		
	}
	
	
	
	
}
