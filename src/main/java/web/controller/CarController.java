package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(ModelMap model) {
        Car car1 = new Car("BMW", "black", 5000);
        Car car2 = new Car("Mercedes", "white", 8000);
        Car car3 = new Car("Audi", "silver", 9000);
        Car car4 = new Car("Mazda", "green", 4000);
        Car car5 = new Car("Nissan", "pink", 2000);

        List<String> messages = new ArrayList<>();
        messages.add(car1.getModel() + car1.getColor() + " " + car1.getPrice());
        model.addAttribute("messages", messages);
        return "cars";
    }
}
