package web.model;

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

}
