package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    public List<Car> addCar() {
        return new ArrayList<>(List.of(
                new Car("BMW", "black", 5000),
                new Car("Mercedes", "white", 8000),
                new Car("Audi", "silver", 9000),
                new Car("Mazda", "green", 4000),
                new Car("Nissan", "pink", 2000)));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            return new ArrayList<>(addCar());
        } else {
            return addCar().stream().limit(count).collect(Collectors.toList());
        }
    }
}
