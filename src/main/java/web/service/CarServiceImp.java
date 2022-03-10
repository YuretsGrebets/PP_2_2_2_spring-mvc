package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(String numOfCar) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("1", 1, 1));
        cars.add(new Car("2", 2, 2));
        cars.add(new Car("3", 3, 3));
        cars.add(new Car("4", 4, 4));
        cars.add(new Car("5", 5, 5));
    return cars.subList(0, Integer.parseInt((numOfCar == null || Integer.parseInt(numOfCar) > 5) ?
            "5" :
            numOfCar));
    }

}
