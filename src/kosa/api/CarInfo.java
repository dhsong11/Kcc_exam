package kosa.api;

import kosa.car.Car;
import kosa.car.Engine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CarInfo {

    private static String[] testVin = {"KMHDL41BP9A000001", "KMHDL41BP9A000002", "KMHDL41BP9A000003", "KMHDL41BP9A000004", "KMHDL41BP9A000005",
            "KMHDL41BP9A000006","KMHDL41BP9A000007","KMHDL41BP9A000008","KMHDL41BP9A000009","KMHDL41BP9A000010"};
    private static int[] testModelYear = { 2009,2010,2011,2012,2013,2014,2015,2016,2017};

    private static int[] testRegisterYear = {20200129, 20210129,20220129, 20230129,20240129};
    private static Engine[] testEngine = {Engine.GASOLINE, Engine.DIESEL, Engine.ELECTRICITY};
    private static int[] testDistance = {10000,12000,15000,20000,25000,30000,35000,40000,50000,60000,70000,80000,90000};
    private static String[] testModelName = {"EQE-SEDAN", "A-CLASS", "S-CLASS", "C-CLASS"};


    public static Car getCarInfo(String carNumber){
        Random random = new Random();

        LocalDateTime date = LocalDateTime.parse(testRegisterYear[random.nextInt(testRegisterYear.length)] + "T00:00:00",
                DateTimeFormatter.ofPattern("yyyyMMdd'T'HH:mm:ss"));

        return new Car(testVin[random.nextInt(testVin.length)], "BENZ", testModelYear[random.nextInt(testModelYear.length)],
                testEngine[random.nextInt(testEngine.length)], testDistance[random.nextInt(testDistance.length)],
                date,
                testModelName[random.nextInt(testModelName.length)], carNumber);

    }
}

