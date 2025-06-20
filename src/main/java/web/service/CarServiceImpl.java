package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDaoImpl carDaoImpl = new CarDaoImpl();
    @Override
    public List<Car> getCarsService(Integer count) {
        return carDaoImpl.getCars(count);
    }
}
