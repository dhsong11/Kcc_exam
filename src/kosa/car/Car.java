package kosa.car;


import kosa.customer.Customer;

import java.time.LocalDateTime;

public class Car {
    private Long carId;
    private String vin; //차대번호
    private String manufactureCompany; //제조사
    private String modelName; //모델명
    private int modelYear; //연식
    private LocalDateTime registerYear; //최초등록일
    private int distance; //주행거리
    private Engine engineType; //엔진종류
    private CarStatus carStatus;
    private String carNum;

    public Car(String vin, String manufactureCompany, int modelYear, Engine engineType, int distance, LocalDateTime registerYear,
               String modelName, String carNum) {
        this.vin = vin;
        this.manufactureCompany = manufactureCompany;
        this.modelYear = modelYear;
        this.engineType = engineType;
        this.distance = distance;
        this.modelName = modelName;
        this.carNum = carNum;
        this.registerYear = registerYear;
        this.carStatus = CarStatus.대기;
    }


    public void showCarInfo(){
        System.out.println(carId);
        System.out.println("차랑번호 : " + carNum);
        System.out.println("모델명 : " + modelName);
        System.out.println("연식 : " + modelYear);
        System.out.println("상태 : " + carStatus);
    }


    public String getCarNum() {
        return carNum;
    }


    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCarId() {
        return carId;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public int getDistance() {
        return distance;
    }

    public LocalDateTime getRegisterYear() {
        return registerYear;
    }
}
