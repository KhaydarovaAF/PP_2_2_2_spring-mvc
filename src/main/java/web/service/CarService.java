package web.service;

import org.springframework.stereotype.Component;
import web.car.Car;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService implements CarServiceInterface {
    private final static List<Car> carList = List.of(

            new Car("LADA", "White", 1),
            new Car("Nissan", "Black", 2),
            new Car("Deo", "Red", 3),
            new Car("Ford", "Blue", 4),
            new Car("Opel", "Silver", 5));


    @Override
    public List<Car> getCars() {
        return carList;
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        if (count > 0 && count < carList.size()) {
            return carList.subList(0, count);

        }
        return carList;
        //  return carList.stream().limit(count).collect(Collectors.toList());
    }
}


