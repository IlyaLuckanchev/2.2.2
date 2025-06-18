package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCar(@RequestParam(required = false) Integer count, Model model) {
        List<Car> res = new ArrayList<>();
        CarServiceImpl carService = new CarServiceImpl();
        if (count == null) {
            res = carService.getCarsService(5);
        } else {
            res = carService.getCarsService(count);
        }
        model.addAttribute("cars", res);
        return "cars";
    }
}
