package kosa.satisfaction;

import java.util.List;
import java.util.Scanner;

public class SatisfactionAction {

    private Satisfaction satisfaction;
    private static Scanner sc = new Scanner(System.in);


    public SatisfactionAction() {
        satisfaction = new Satisfaction();
    }

    // 만족도 항목 등록
    public void create() {
        while (true) {
            System.out.println("만족도 항목 등록(종료:q) : ");
            System.out.print(">> ");
            String input = sc.nextLine();
            if (input.equals("q")) {
                System.out.println("만족도 항목 입력 종료.");
                break;
            }
            satisfaction.add(input);
            System.out.println("만족도 항목이 등록되었습니다.");
        }
    }

    // 만족도 항목 수정
    public void update() {
        showList();
        if (satisfaction.getList().isEmpty()) return;

        System.out.println("수정할 만족도 번호를 입력하세요: ");
        System.out.print(">> ");
        int num = sc.nextInt();

        sc.nextLine();
        System.out.println("수정할 내용을 입력하세요: ");
        System.out.print(">> ");
        String input = sc.nextLine();

        try {
            satisfaction.getList().set(num - 1, input);
            System.out.println("만족도 항목이 수정되었습니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("선택한 만족도 항목이 존재하지 않습니다.");
        }
    }

    // 만족도 항목 삭제
    public void delete() {
        showList();
        if (satisfaction.getList().isEmpty()) return;

        System.out.println("삭제할 만족도 번호를 입력하세요: ");
        System.out.print(">> ");
        int num = sc.nextInt();
        sc.nextLine();

        try {
            satisfaction.getList().remove(num - 1);
            System.out.println("만족도 항목 삭제되었습니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("선택한 만족도 항목이 존재하지 않습니다.");
        }
    }

    // 만족도 항목 조회
    public void showList() {
        int count = 1;

        List<String> satisfactionList = satisfaction.getList();

        for (String question : satisfactionList) {
            System.out.println(count + ". " + question);
            count++;
        }

        if (count == 1) {
            System.out.println("만족도 항목이 존재하지 않습니다.");
        }
    }
}
