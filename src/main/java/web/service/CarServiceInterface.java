package web.service;

import web.car.Car;

import java.util.List;

public interface CarServiceInterface {

    public List<Car> getCars();
    public List<Car> getCountCars(Integer count);

}
