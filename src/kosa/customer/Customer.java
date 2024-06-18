package kosa.customer;

import kosa.car.Car;

public class Customer {
    private Long customerId;
    private String name;
    private String phoneNumber;
    private String address;
    private Car car;

    public Customer(String name, String phoneNumber, String address, Car car) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.car = car;
        //car.addMember(this);
    }

    public void printCustomer() {
        String str = (address.length() > 10) ? "\t\t\t" : "\t\t\t\t";
        System.out.println(name + "\t\t\t" + phoneNumber + 	" \t\t" + address + str + car.getCarNum());
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
