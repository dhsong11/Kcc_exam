package shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
	private List<Member> members = new ArrayList<Member>();
	private Scanner sc = new Scanner(System.in);

	public void createMember() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("주소 : ");
		String address = sc.nextLine();

		members.add(new Member(name, age, address));
		System.out.println("멤버 등록 완료");
	}

//    public Member login(String username) {
//        for(Member member : members) {
//            if(username.equals(member.getName())) {
//                return member;
//            }
//        }
//        return null;
//    }
	public Member login(String username) {
		return members.stream()
				.filter(member -> username.equals(member.getName()))
				.findFirst()
				.orElse(null);
	}

	public List<Member> getMembers() {
		return members;
	}

}
