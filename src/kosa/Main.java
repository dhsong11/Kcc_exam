package kosa;

import kosa.car.Car;
import kosa.car.CarAction;
import kosa.car.CarStatus;
import kosa.cost.*;
import kosa.customer.CustomerAction;
import kosa.employee.Employee;
import kosa.employee.EmployeeAction;
import kosa.employee.Role;
import kosa.reservation.ReservationAction;
import kosa.satisfaction.SatisfactionAction;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static EmployeeAction employeeAction = new EmployeeAction();
    private static ReservationAction reservationAction = new ReservationAction();
    private static SatisfactionAction satisfactionAction = new SatisfactionAction();
    private static CustomerAction customerAction = new CustomerAction();
    private static CostAction costAction = new CostAction();
    private static CarAction carAction = new CarAction();
    private static Employee employee = new Employee("kimyeonho", "kimyeonho", "kimyeonho12!", Role.EMPLOYEE, "대리");

    private static CostPolicy costPolicy = new CostPolicy(new DistanceCondition(), new YearCondition());


    public static void main(String[] args) {
        EmployeeAction.testcreate(employee);
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("============ 차량정비시스템 ============");
        System.out.println("[1] 관리자\t[2] 직원\t\t[3] 사용자\t[4] 종료");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                displayAdminMenu(); //관리자 메뉴
                break;
            case 2:
                displayEmployeeMenu(); //직원 메뉴
                break;
            case 3:
                displayCustomerMenu();
                break;
            case 4:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                displayMainMenu();
        }
    }

    private static void displayCustomerMenu() {
        System.out.println("[1] 예약하기\t[2] 예약현황보기\t[3] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice){
            case 1:
                customerAction.reserve();
                displayCustomerMenu();
                break;
            case 2:
                customerAction.getAllReservations();
                displayCustomerMenu();
                break;
            case 3:
                displayMainMenu();
                break;
        }

    }

    //관리자 메뉴
    public static void displayAdminMenu() {
        System.out.println("[1] 로그인\t[2] 로그아웃\t[3] 회원가입\t[4] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                Employee loginEmployee = employeeAction.login();
                if (loginEmployee != null) {
                    displayAdminLoggedInMenu();
                } else {
                    displayAdminMenu();
                }
                break;
            case 2:
                // 로그아웃 기능 구현
                employee = employeeAction.logout();
                displayMainMenu();
                break;
            case 3:
                // 회원가입 기능 구현
                employeeAction.createEmployee(Role.MANAGER);
                displayAdminMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                displayAdminMenu();
        }
    }
    
    //관리자 로그인 후 메뉴 (1.직원등록 2.직원수정 3.직원삭제 4.직원조회 5.처음으로)
    public static void displayAdminLoggedInMenu() {
        System.out.println("[1] 직원등록\t[2] 직원수정\t[3] 직원삭제\t[4] 직원조회\t[5] 처음으로");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                // 직원 등록 기능 구현
                employeeAction.createEmployee(Role.EMPLOYEE);
                displayAdminLoggedInMenu();
                break;
            case 2:
                // 직원 수정 기능 구현
                displayAdminLoggedInMenu();
                break;
            case 3:
                //직원 삭제 기능 구현
                employeeAction.deleteEmployee();
                displayAdminLoggedInMenu();
                break;
            case 4:
                // 직원 조회 기능 구현
                System.out.println("[1] 전체조회 [2] 이름별 조회 [3] 직급별 조회");
                System.out.println(">입력 : ");
                int menu = Integer.parseInt(sc.nextLine());
                employeeAction.getEmployees(menu);
                displayAdminLoggedInMenu();
                break;
            case 5:
                displayMainMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                displayAdminLoggedInMenu();
        }
    }
    
    //직원 메뉴 (1.로그인 2.로그아웃)
    public static void displayEmployeeMenu() {
        System.out.println("[1] 로그인\t[2] 로그아웃");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                // 직원 로그인 기능 구현
                Employee loginEmployee = employeeAction.login();
                if (loginEmployee != null) {
                    employee = loginEmployee;
                    displayEmployeeLoggedInMenu();
                } else {
                    displayEmployeeMenu();
                }
                break;
            case 2:
                employee = employeeAction.logout();
                displayMainMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                displayEmployeeMenu();
        }
    }

    //직원 로그인 후 메뉴 (1.고객관리 2.예약관리 3.차량관리 4.사후관리 5.뒤로가기
    public static void displayEmployeeLoggedInMenu() {
        System.out.println("[1] 고객관리\t[2] 예약관리\t[3] 차량관리\t[4] 영수증관리\t[5] 사후관리\t[6] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                displayCustomerManagementMenu();
                break;
            case 2:
                displayReservationManagementMenu();
                break;
            case 3:
                displayCarManagementMenu();
                break;
            case 4:
                displayCostManagementMenu();
                break;
            case 5:
                displayHappyCallManagementMenu();
                break;
            case 6:
                displayEmployeeMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                displayEmployeeLoggedInMenu();
        }
    }

    private static void displayCostManagementMenu() {
        System.out.println("[1] 영수증 조회\t[2] 영수증 처리\t[3] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());


        switch (choice) {
            case 1:
                costAction.rotateAllRepairedCar(costPolicy);
                costAction.showCostByStatus(CostStatus.처리);
                displayCostManagementMenu();
                break;
            case 2:
                costAction.rotateAllRepairedCar(costPolicy);
                if(costAction.getCostsByStatus(CostStatus.미처리).isEmpty()){
                    System.out.println("미처리 내역이 없습니다");
                    displayCostManagementMenu();
                    break;
                }
                costAction.showCostByStatus(CostStatus.미처리);
                System.out.print(">처리할 항목 :");
                Long costId = Long.parseLong(sc.nextLine());
                System.out.println("> 금액 등록 : ");
                int amount = Integer.parseInt(sc.nextLine());
                costAction.changeStatus(costId, amount);
                displayCostManagementMenu();
                break;
            case 3:
                displayEmployeeLoggedInMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;

        }
    }


    //직원 로그인 후 고객관리 메뉴 (1.고객조회 2.고객수정)
    public static void displayCustomerManagementMenu() {
        System.out.println("[1] 고객 조회\t[2] 고객 수정\t[3] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int customerChoice = Integer.parseInt(sc.nextLine());

        switch (customerChoice) {
            case 1:
                customerAction.getAllCustomers();
                displayCustomerManagementMenu();
                break;
            case 2:
                break;
            case 3:
                displayEmployeeLoggedInMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;

        }
    }
    
    //직원 로그인 후 예약관리 메뉴
    public static void displayReservationManagementMenu() {
        System.out.println("[1] 예약등록\t[2] 예약조회\t[3] 예약취소\t[4] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int reservationChoice = Integer.parseInt(sc.nextLine());

        switch (reservationChoice) {
            case 1:
                //예약등록
                if (employeeAction.reserve()) {
                    System.out.println("예약 성공");
                } else {
                    System.out.println("예약 실패");
                }
                displayReservationManagementMenu();
                break;
            case 2:
                //예약조회
                System.out.println("[1] 본인 예약 내역 [2] 타담당자 예약 내역 [3]미지정 예약 내역 [4] 전체 예약 내역");
                System.out.print(">입력 : ");
                int menu = Integer.parseInt(sc.nextLine());

                switch (menu){
                    case 1:
                        reservationAction.filterManagerNameReservation(employee.getName());
                        break;
                    case 2:
                        System.out.print(">담당자 : " );
                        String managerName = sc.nextLine();
                        reservationAction.filterManagerNameReservation(managerName);
                        break;
                    case 3:
                        reservationAction.setReadyReservationToComplete(employee);
                        break;
                    case 4:
                        reservationAction.getAllReservations();
                        break;
                }
                displayReservationManagementMenu();
                break;
            case 3:
                // 예약 취소
                reservationAction.cancelReservation();
                displayReservationManagementMenu();
                break;
            case 4:
                //뒤로가기
                displayEmployeeLoggedInMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;

        }
    }

    //직원 로그인 후 차량관리 메뉴
    private static void displayCarManagementMenu() {
        System.out.println("[1] 차량조회\t[2] 차량상태변경\t[3] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice){
            case 1:
                showCar();
                displayCarManagementMenu();
                break;
            case 2:
                showCar();
                System.out.print(">변경을 원하는 차량 선택 : ");
                Long carId = Long.parseLong(sc.nextLine());
                System.out.print(">상태 : ");
                String status = sc.nextLine();
                carAction.changeStatus(carId,CarStatus.valueOf(status));
                displayCarManagementMenu();
                break;
            case 3:
                displayEmployeeLoggedInMenu();
                break;
        }
    }

    private static void showCar(){
        System.out.println("[1] 대기차량 [2] 입고차량 [3] 출고차량");
        System.out.print("입력(대기 | 입고 | 출고) > ");
        String status = sc.nextLine();
        CarStatus carStatus = CarStatus.valueOf(status);
        carAction.getCarsByStatus(carStatus)
                .forEach(Car::showCarInfo);
    }
    
    
    //직원 로그인 후 사후관리 메뉴
    private static void displayHappyCallManagementMenu() {
        System.out.println("[1] 만족도 결과 조회\t[2] 만족도 대상 조회\t[3] 만족도 항목 등록\t[4] 만족도 항목 수정\t[5] 만족도 항목 삭제\t[6] 만족도 항목 조회\t[7] 뒤로가기");
        Scanner sc = new Scanner(System.in);
        int happyCallChoice = Integer.parseInt(sc.nextLine());

        switch (happyCallChoice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                satisfactionAction.create();
                displayHappyCallManagementMenu();
                break;
            case 4:
                satisfactionAction.update();
                displayHappyCallManagementMenu();
                break;
            case 5:
                satisfactionAction.delete();
                displayHappyCallManagementMenu();
                break;
            case 6:
                satisfactionAction.showList();
                displayHappyCallManagementMenu();
                break;
            case 7:
                displayEmployeeLoggedInMenu();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;

        }
    }


}


