package cheolwon;

public class Test {

	public static void main(String[] args) {
		PhoneInfo phoneInfo = new PhoneInfo("¤·", "¤·", "¤·");
		phoneInfo.printPhoneInfo();

		CompanyInfo companyInfo = new CompanyInfo("123", "123", "123", "123", "123");
		companyInfo.getBirth();
		companyInfo.setBirth("1");
	}
}
