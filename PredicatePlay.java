import java.util.*;
import java.util.stream.*;

/**
Java 8 Stream interface introduces filter() method which can be used to filter out some elements from object collection based on a particular condition. 
This condition should be specified as a predicate which the filter() method accepts as an argument.

The java.util.function.Predicate interface defines an abstract method named test() that accepts an object of generic type T and returns a boolean.

@author Ashwin Chandrasekaran
*/
public class PredicatePlay {
    public static void main(String[] args) {
        //Creating some new cars
        Car evCar1 = new Car("AA001", Car.Type.EV);
        Car petrolCar1 = new Car("AA002", Car.Type.PETROL);
        Car dieselCar1 = new Car("AA003", Car.Type.DIESEL);
        Car evCar2 = new Car("AA004", Car.Type.EV);

        //Creating a list of cars
        List<Car> myCarList = new ArrayList<Car>();
        myCarList.add(evCar1);
        myCarList.add(petrolCar1);
        myCarList.add(dieselCar1);
        myCarList.add(evCar2);

        //Filtering for only EV cars
        List<Car> onlyEVCars = myCarList.stream()
                                        .filter(c -> c.getCarType() == Car.Type.EV)
                                        .collect(Collectors.toList());

        //Printing the list
        onlyEVCars.forEach(System.out::println);
    }
}

class Car {
    private String plateNum;
    private Type carType;

    public Car(String plateNum, Type carType) {
        this.plateNum = plateNum;
        this.carType = carType;
    }

    public String getPlateNum() {
        return this.plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public Type getCarType() {
        return this.carType;
    }

    public void setCarType(Type carType) {
        this.carType = carType;
    }

    public String toString() {
        return this.plateNum + " " + this.carType;
    }

    public enum Type { PETROL, DIESEL, EV }
}