package kosa.employee;

import kosa.customer.Customer;
import kosa.reservation.Reservation;

import java.time.LocalDateTime;

public class Employee {
    private Long employeeId;
    private String name; //이름
    private String loginId; //로그인아이디
    private String password; // 비밀번호
    private Role role; //역할
    private String rank; //직급


    public Employee(String name, String loginId, String password, Role role, String rank) {
        this.name = name;
        this.loginId = loginId;
        this.password = password;
        this.role = role;
        this.rank = rank;
    }

//    public Reservation reserve(Customer customer, LocalDateTime when, String what){
//        return new Reservation(customer, when, this, what);
//    }

    public void showEmployee(){
        String space = "";
        if (name.length() > 5) {
            space = "\t\t\t";
        } else if (name.length() > 3) {
            space = "\t\t\t";
        } else {
            space = "\t\t\t\t";
        }
        System.out.println(employeeId + "\t\t\t   " + name + space + role + " \t\t  " + rank);
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public String getRank() {
        return rank;
    }
}
