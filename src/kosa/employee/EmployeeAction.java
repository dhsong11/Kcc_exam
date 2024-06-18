package kosa.employee;

import kosa.api.CarInfo;
import kosa.customer.Customer;
import kosa.customer.CustomerAction;
import kosa.repository.CarRepository;
import kosa.repository.CustomerRepository;
import kosa.repository.EmployeeRepository;
import kosa.repository.ReservationRepository;
import kosa.reservation.Reservation;
import kosa.reservation.ReservationAction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmployeeAction {
    private static Scanner sc = new Scanner(System.in);
    private static final EmployeeRepository employeeRepository = new EmployeeRepository();
    private static final ReservationRepository reservationRepository = new ReservationRepository();
    private static Employee employee = null;

    public static void testcreate(Employee employee){
        employeeRepository.save(employee);
    }

    //직원을 생성
    public boolean createEmployee(Role role){
        System.out.print(">이름 : ");
        String name = sc.nextLine();

        System.out.print(">아이디 : ");
        String loginId = sc.nextLine();
        if(!isValidLoginId(loginId)){
            System.out.println("(알파벳과 숫자로 이루어진 5자 이상)");
            return false;
        }

        System.out.print(">비밀번호 : ");
        String password = sc.nextLine();
        if(!isValidPassword(password)){
            System.out.println("(영문 숫자 특수기호 조합 8자리 이상)");
            return false;
        }

        System.out.print(">직급 : ");
        String rank = sc.nextLine();
        if (!isValidRank(rank)){
            System.out.println("(한글로만 이루어진 패턴)");
            return false;
        }

        Employee createEmployee = new Employee(name, loginId, password, role, rank); //자동으로 Role이 EMPLOYEE로 설정되서 생성

        employeeRepository.save(createEmployee);
        return true;
    }

    public Employee login() {
        System.out.print(">아이디 : ");
        String loginId = sc.nextLine();

        System.out.print(">비밀번호 : ");
        String password = sc.nextLine();

        List<Employee> employees = employeeRepository.findAll();
        for (Employee employee : employees) {
            if(employee.getLoginId().equals(loginId) && employee.getPassword().equals(password)){
                this.employee = employee;
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployee(){
        System.out.print(">삭제할 직원 이름 : ");
        String deleteName = sc.nextLine();
        List<Employee> employees = employeeRepository.findByName(deleteName);
        for (Employee findEmployee : employees) {
            findEmployee.showEmployee();
        }
        System.out.print(">삭제할 직원 고유 ID : ");
        Long deleteId = Long.valueOf(sc.nextLine());

        employeeRepository.deleteEmployee(employeeRepository.findById(deleteId));
    }

    public Employee logout(){
        employee = null;
        return null;
    }


    public boolean reserve() {
        CustomerAction customerAction = new CustomerAction();
        Customer createCustomer = customerAction.createCustomer();

//        String datePattern = "^(\\d{4})/(0[1-9]|1[0-2])/(0[1-9]|1[0-9]|2[0-9]|3[01])$";
//        String timePattern = "^([01][0-9]|2[0-3]):([0-5][0-9])$";
//
//        Pattern datePa = Pattern.compile(datePattern);
//        Pattern timePa = Pattern.compile(timePattern);
//
//        System.out.println(">예약일자 ↓ ");
//        String yearmonthday = sc.nextLine();
//
//        Matcher dateMat = datePa.matcher(yearmonthday);
//        if (!dateMat.matches()) {
//            System.out.println("날짜 형식이 잘못되었습니다. 올바른 형식 = yyyy/MM/dd");
//            return false;
//        }
//
//        // 시간 입력
//        String hourmin = sc.nextLine();
//        Matcher timeMat = timePa.matcher(hourmin);
//        if (!timeMat.matches()) {
//            System.out.println("시간 형식이 잘못되었습니다. 올바른 형식 = HH:mm");
//            return false;
//        }
//
//        String[] split = yearmonthday.split("/");
//
//        String[] split1 = hourmin.split(":");
//
//        LocalDateTime when = LocalDateTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]),
//                Integer.parseInt(split[2]), Integer.parseInt(split1[0]), Integer.parseInt(split1[1]));
//
//
//        System.out.println(">예약내용 ↓ ");
//        String what = sc.nextLine();

        ReservationAction reservationAction = new ReservationAction();
        reservationAction.createReservation(createCustomer,employee);

       // reservationRepository.save(employee.reserve(createCustomer, when, what));
        return true;
    }


    // 아이디 유효성 검사 (알파벳과 숫자로 이루어진 5자 이상)
    private boolean isValidLoginId(String loginId) {
        String loginIdRegex = "^[a-zA-Z0-9]{5,}$";
        return Pattern.matches(loginIdRegex, loginId);
    }

    // 비밀번호 유효성 검사 (영문 숫자 특수기호 조합 8자리 이상)
    private boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,15}$";
        return Pattern.matches(passwordRegex, password);
    }

    // 직급 유효성 검사 (한글로만 이루어진 패턴)
    private boolean isValidRank(String rank) {
        String rankRegex = "^[가-힣]+$";
        return Pattern.matches(rankRegex, rank);
    }

    public void getEmployees(int menu) {
        List<Employee> employees = employeeRepository.findAll();

        if(menu == 1){
            printMenu();
            for (Employee e : employees) {
                e.showEmployee();
            }
        } else if (menu == 2){ // 이름별 조회
            printMenu();
            System.out.println("> 이름 : ");
            String searchName = sc.nextLine();
            List<Employee> filterByNameEmployee = employees.stream().
                    filter(e -> e.getName().equals(searchName)).
                    collect(Collectors.toList());
            for (Employee e : filterByNameEmployee) {
                e.showEmployee();
            }
        } else { //직급별 조회
            printMenu();
            System.out.println("> 직급 : ");
            String serachRank = sc.nextLine();
            List<Employee> filterByNameEmployee = employees.stream().
                    filter(e -> e.getRank().equals(serachRank)).
                    collect(Collectors.toList());
            for (Employee e : filterByNameEmployee) {
                e.showEmployee();
            }
        }
    }

    private void printMenu() {
        System.out.println("employeeId" + "\t\t" + "name" + "\t\t\t" + "role" + "\t\t " + "rank");
        System.out.println("------------------------------------------------------");
    }


//    public void registerCustomer(){
//        System.out.println(">고객명 : ");
//        String name = sc.nextLine();
//
//        System.out.println(">고객번호 : ");
//        String phoneNum = sc.nextLine();
//
//        System.out.println(">고객주소 : ");
//        String address = sc.nextLine();
//
//        System.out.println(">챠랑번호 : ");
//        String carNum = sc.nextLine();
//
//
//        customerRepository.save(new Customer(name,phoneNum,address, CarInfo.getCarInfo(carNum)));
//

}
