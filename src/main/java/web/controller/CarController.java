package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCar(@RequestParam(required = false) Integer count, ModelMap model) {
        List<String> messages = new ArrayList<>();
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        if (count == null) {
            messages.add(carServiceImpl.getCarsService(5).toString());
        } else {
            messages.add(carServiceImpl.getCarsService(count).toString());
        }
        model.addAttribute("messages", messages);
        return "cars";
    }
}
