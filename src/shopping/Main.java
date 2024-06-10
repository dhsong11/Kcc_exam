package shopping;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ShoppingMall mall = new ShoppingMall();
        MemberService memberService = new MemberService();
        Member member = null;

        while(true) {
            showMenu();
            System.out.print(">>");
            int menu = Integer.parseInt(sc.nextLine());
            switch(menu) {
                case 1:
                    //고객 등록
                    memberService.createMember();
                    break;
                case 2:
                    //상품 등록
                    mall.addItem();
                    break;
                case 3:
                    //카테고리별 상품 목록 보기
                    mall.getCategoryProducts();
                    break;
                case 4:
                    //상품 주문하기
                    mall.createOrder(member);
                    break;
                case 5:
                    //해당하는 멤버의 주문 정보 보기
                    mall.print(member);
                    break;
                case 6:
                    //로그인
                    System.out.print(">이름 : ");
                    String loginUserName = sc.nextLine();
                    member = memberService.login(loginUserName);
                    if(member == null)
                        System.out.println("로그인 실패!");
                    break;
                case 7:
                    //로그아웃
                    member = null;
                    System.out.println("로그아웃 되었습니다");
                    break;
            }
        }

    }


    private static void showMenu() {
        System.out.println("1.고객 등록 2.상품 등록 3.카테고리별 상품 목록 보기 4.상품 주문하기 5.개별 주문 목록 보기 6.로그인 7.로그아웃");
    }
}
