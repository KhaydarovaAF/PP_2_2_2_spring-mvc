package web.service;

import org.springframework.stereotype.Component;
import web.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("LADA", "White", 1));
        carList.add(new Car("LADA", "Black", 2));
        carList.add(new Car("LADA", "Red", 3));
        carList.add(new Car("LADA", "Blue", 4));
        carList.add(new Car("LADA", "Silver", 5));


    }

  public List<Car> getCars(){
        return carList;
  }

    public List<Car> getCountCars(int count){
        return carList.stream().limit(count).collect(Collectors.toList());
    }


}


