package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller()
@RequestMapping("/cars")
public class CarController {
private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping()
    public String carsParam(@RequestParam(value = "count", required = false,
            defaultValue = "5") Integer count, Model model) {
        if (count == null) {
            model.addAttribute("cars", carService.getCars());
        } else {
            model.addAttribute("cars", carService.getCountCars(count));
        }
        return "cars";
    }
}
