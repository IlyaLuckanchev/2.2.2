package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCar(@RequestParam(required = false) Integer count, Model model) {
        model.addAttribute("cars", carService.getCarsService(count));
        return "cars";
    }
}
