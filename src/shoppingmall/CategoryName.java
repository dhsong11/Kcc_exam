package shoppingmall;

public enum CategoryName {
	ELECTRONICS("가전제품"), FASHION_ACCESSORIES("패션/잡화"), BOOKS("����"), FOODS("��ǰ");

	private String displayName;

	CategoryName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
