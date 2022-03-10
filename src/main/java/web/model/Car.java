package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private int yearOfProduction;
    private  int power;

    public Car(String model, int yearOfProduction, int power) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car { " +
                "model = " + model +
                ", year of production = " + yearOfProduction +
                ", power = " + power +
                " }";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && power == car.power && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, yearOfProduction, power);
    }

}
